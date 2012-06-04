package net.minecraft.src;

public abstract class BaseModMp extends BaseMod
{
    public BaseModMp()
    {
    }

    public final int getId()
    {
        return toString().hashCode();
    }

    public void modsLoaded()
    {
        ModLoaderMp.initialize();
        super.modsLoaded();
    }

    public void handlePacket(Packet230ModLoader packet230modloader)
    {
    }

    public void handleTileEntityPacket(int i, int j, int k, int l, int ai[], float af[], String as[])
    {
    }

    public GuiScreen handleGUI(int i)
    {
        return null;
    }
}
