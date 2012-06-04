package net.minecraft.src;

import java.lang.reflect.Method;
import java.net.URI;
import java.util.*;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class GuiChat extends GuiScreen
{
    private String field_50062_b;

    /**
     * keeps position of which chat message you will select when you press up, (does not increase for duplicated
     * messages sent immediately after each other)
     */
    private int sentHistoryCursor;
    private boolean field_50060_d;
    private String field_50061_e;
    private String field_50059_f;
    private int field_50067_h;
    private List field_50068_i;

    /** used to pass around the URI to various dialogues and to the host os */
    private URI clickedURI;

    /** Chat entry field */
    protected GuiTextField inputField;

    /**
     * is the text that appears when you press the chat key and the input box appears pre-filled
     */
    private String defaultInputFieldText;

    public GuiChat()
    {
        field_50062_b = "";
        sentHistoryCursor = -1;
        field_50060_d = false;
        field_50061_e = "";
        field_50059_f = "";
        field_50067_h = 0;
        field_50068_i = new ArrayList();
        clickedURI = null;
        defaultInputFieldText = "";
    }

    public GuiChat(String par1Str)
    {
        field_50062_b = "";
        sentHistoryCursor = -1;
        field_50060_d = false;
        field_50061_e = "";
        field_50059_f = "";
        field_50067_h = 0;
        field_50068_i = new ArrayList();
        clickedURI = null;
        defaultInputFieldText = "";
        defaultInputFieldText = par1Str;
    }

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    public void initGui()
    {
        Keyboard.enableRepeatEvents(true);
        sentHistoryCursor = mc.ingameGUI.getSentMessageList().size();
        inputField = new GuiTextField(fontRenderer, 4, height - 12, width - 4, 12);
        inputField.setMaxStringLength(100);
        inputField.setEnableBackgroundDrawing(false);
        inputField.setFocused(true);
        inputField.setText(defaultInputFieldText);
        inputField.setCanLoseFocus(false);
    }

    /**
     * Called when the screen is unloaded. Used to disable keyboard repeat events
     */
    public void onGuiClosed()
    {
        Keyboard.enableRepeatEvents(false);
        mc.ingameGUI.func_50014_d();
    }

    /**
     * Called from the main game loop to update the screen.
     */
    public void updateScreen()
    {
        inputField.updateCursorCounter();
    }

    /**
     * Fired when a key is typed. This is the equivalent of KeyListener.keyTyped(KeyEvent e).
     */
    protected void keyTyped(char par1, int par2)
    {
        if (par2 == 15)
        {
            completePlayerName();
        }
        else
        {
            field_50060_d = false;
        }

        if (par2 == 1)
        {
            mc.displayGuiScreen(null);
        }
        else if (par2 == 28)
        {
            String s = inputField.getText().trim();

            if (s.length() > 0 && !mc.lineIsCommand(s))
            {
                mc.thePlayer.sendChatMessage(s);
            }

            mc.displayGuiScreen(null);
        }
        else if (par2 == 200)
        {
            getSentHistory(-1);
        }
        else if (par2 == 208)
        {
            getSentHistory(1);
        }
        else if (par2 == 201)
        {
            mc.ingameGUI.adjustHistoryOffset(19);
        }
        else if (par2 == 209)
        {
            mc.ingameGUI.adjustHistoryOffset(-19);
        }
        else
        {
            inputField.textboxKeyTyped(par1, par2);
        }
    }

    /**
     * Handles mouse input.
     */
    public void handleMouseInput()
    {
        super.handleMouseInput();
        int i = Mouse.getEventDWheel();

        if (i != 0)
        {
            if (i > 1)
            {
                i = 1;
            }

            if (i < -1)
            {
                i = -1;
            }

            if (!isShiftKeyDown())
            {
                i *= 7;
            }

            mc.ingameGUI.adjustHistoryOffset(i);
        }
    }

    /**
     * Called when the mouse is clicked.
     */
    protected void mouseClicked(int par1, int par2, int par3)
    {
        if (par3 == 0)
        {
            ChatClickData chatclickdata = mc.ingameGUI.getChatClickDataFromMouse(Mouse.getX(), Mouse.getY());

            if (chatclickdata != null)
            {
                URI uri = chatclickdata.getURI();

                if (uri != null)
                {
                    clickedURI = uri;
                    mc.displayGuiScreen(new GuiChatConfirmLink(this, this, chatclickdata.func_50088_a(), 0, chatclickdata));
                    return;
                }
            }
        }

        inputField.mouseClicked(par1, par2, par3);
        super.mouseClicked(par1, par2, par3);
    }

    public void confirmClicked(boolean par1, int par2)
    {
        if (par2 == 0)
        {
            if (par1)
            {
                try
                {
                    Class class1 = Class.forName("java.awt.Desktop");
                    Object obj = class1.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    class1.getMethod("browse", new Class[]
                            {
                                java.net.URI.class
                            }).invoke(obj, new Object[]
                                    {
                                        clickedURI
                                    });
                }
                catch (Throwable throwable)
                {
                    throwable.printStackTrace();
                }
            }

            clickedURI = null;
            mc.displayGuiScreen(this);
        }
    }

    /**
     * Autocompletes player name
     */
    public void completePlayerName()
    {
        if (field_50060_d)
        {
            inputField.func_50021_a(-1);

            if (field_50067_h >= field_50068_i.size())
            {
                field_50067_h = 0;
            }
        }
        else
        {
            int i = inputField.func_50028_c(-1);

            if (inputField.func_50035_h() - i < 1)
            {
                return;
            }

            field_50068_i.clear();
            field_50061_e = inputField.getText().substring(i);
            field_50059_f = field_50061_e.toLowerCase();
            Iterator iterator = ((EntityClientPlayerMP)mc.thePlayer).sendQueue.playerInfoList.iterator();

            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }

                GuiPlayerInfo guiplayerinfo = (GuiPlayerInfo)iterator.next();

                if (guiplayerinfo.nameStartsWith(field_50059_f))
                {
                    field_50068_i.add(guiplayerinfo);
                }
            }
            while (true);

            if (field_50068_i.size() == 0)
            {
                return;
            }

            field_50060_d = true;
            field_50067_h = 0;
            inputField.func_50020_b(i - inputField.func_50035_h());
        }

        if (field_50068_i.size() > 1)
        {
            StringBuilder stringbuilder = new StringBuilder();
            GuiPlayerInfo guiplayerinfo1;

            for (Iterator iterator1 = field_50068_i.iterator(); iterator1.hasNext(); stringbuilder.append(guiplayerinfo1.name))
            {
                guiplayerinfo1 = (GuiPlayerInfo)iterator1.next();

                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(", ");
                }
            }

            mc.ingameGUI.addChatMessage(stringbuilder.toString());
        }

        inputField.func_50031_b(((GuiPlayerInfo)field_50068_i.get(field_50067_h++)).name);
    }

    /**
     * input is relative and is applied directly to the sentHistoryCursor so -1 is the previous message, 1 is the next
     * message from the current cursor position
     */
    public void getSentHistory(int par1)
    {
        int i = sentHistoryCursor + par1;
        int j = mc.ingameGUI.getSentMessageList().size();

        if (i < 0)
        {
            i = 0;
        }

        if (i > j)
        {
            i = j;
        }

        if (i == sentHistoryCursor)
        {
            return;
        }

        if (i == j)
        {
            sentHistoryCursor = j;
            inputField.setText(field_50062_b);
            return;
        }

        if (sentHistoryCursor == j)
        {
            field_50062_b = inputField.getText();
        }

        inputField.setText((String)mc.ingameGUI.getSentMessageList().get(i));
        sentHistoryCursor = i;
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int par1, int par2, float par3)
    {
        drawRect(2, height - 14, width - 2, height - 2, 0x80000000);
        inputField.drawTextBox();
        super.drawScreen(par1, par2, par3);
    }
}
