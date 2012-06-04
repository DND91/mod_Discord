package net.minecraft.src;

import java.io.PrintStream;
import java.lang.reflect.*;
import java.util.*;
import java.util.logging.Logger;
import net.minecraft.client.Minecraft;

public class ModLoaderMp
{
    public static final String NAME = "ModLoaderMP";
    public static final String VERSION = "1.2.5v1";
    private static boolean hasInit = false;
    private static boolean packet230Received = false;
    private static Map netClientHandlerEntityMap = new HashMap();
    private static Map guiModMap = new HashMap();

    public static void initialize()
    {
        if (!hasInit)
        {
            initializePrivate();
        }
    }

    public static void handleAllPackets(Packet230ModLoader packet230modloader)
    {
        if (!hasInit)
        {
            initializePrivate();
        }

        packet230Received = true;

        if (packet230modloader.modId == "ModLoaderMP".hashCode())
        {
            switch (packet230modloader.packetType)
            {
                case 0:
                    handleModCheck(packet230modloader);
                    break;

                case 1:
                    handleTileEntityPacket(packet230modloader);
                    break;
            }
        }
        else if (packet230modloader.modId == "Spawn".hashCode())
        {
            NetClientHandlerEntity netclienthandlerentity = handleNetClientHandlerEntities(packet230modloader.packetType);

            if (netclienthandlerentity != null && (net.minecraft.src.ISpawnable.class).isAssignableFrom(netclienthandlerentity.entityClass))
            {
                try
                {
                    Entity entity = (Entity)netclienthandlerentity.entityClass.getConstructor(new Class[]
                            {
                                net.minecraft.src.World.class
                            }).newInstance(new Object[]
                                    {
                                        ModLoader.getMinecraftInstance().theWorld
                                    });
                    ((ISpawnable)entity).spawn(packet230modloader);
                    ((WorldClient)ModLoader.getMinecraftInstance().theWorld).addEntityToWorld(entity.entityId, entity);
                }
                catch (Exception exception)
                {
                    ModLoader.getLogger().throwing("ModLoader", "handleCustomSpawn", exception);
                    ModLoader.throwException(String.format("Error initializing entity of type %s.", new Object[]
                            {
                                Integer.valueOf(packet230modloader.packetType)
                            }), exception);
                    return;
                }
            }
        }
        else
        {
            for (int i = 0; i < ModLoader.getLoadedMods().size(); i++)
            {
                BaseMod basemod = (BaseMod)ModLoader.getLoadedMods().get(i);

                if (!(basemod instanceof BaseModMp))
                {
                    continue;
                }

                BaseModMp basemodmp = (BaseModMp)basemod;

                if (basemodmp.getId() != packet230modloader.modId)
                {
                    continue;
                }

                basemodmp.handlePacket(packet230modloader);
                break;
            }
        }
    }

    public static NetClientHandlerEntity handleNetClientHandlerEntities(int i)
    {
        if (!hasInit)
        {
            initializePrivate();
        }

        if (netClientHandlerEntityMap.containsKey(Integer.valueOf(i)))
        {
            return (NetClientHandlerEntity)netClientHandlerEntityMap.get(Integer.valueOf(i));
        }
        else
        {
            return null;
        }
    }

    public static void sendPacket(BaseModMp basemodmp, Packet230ModLoader packet230modloader)
    {
        if (!hasInit)
        {
            initializePrivate();
        }

        if (basemodmp == null)
        {
            IllegalArgumentException illegalargumentexception = new IllegalArgumentException("baseModMp cannot be null.");
            ModLoader.getLogger().throwing("ModLoaderMp", "SendPacket", illegalargumentexception);
            ModLoader.throwException("baseModMp cannot be null.", illegalargumentexception);
        }
        else
        {
            packet230modloader.modId = basemodmp.getId();
            sendPacket(packet230modloader);
        }
    }

    public static void registerGUI(BaseModMp basemodmp, int i)
    {
        if (!hasInit)
        {
            initializePrivate();
        }

        if (guiModMap.containsKey(Integer.valueOf(i)))
        {
            log("RegisterGUI error: inventoryType already registered.");
        }
        else
        {
            guiModMap.put(Integer.valueOf(i), basemodmp);
        }
    }

    public static void handleGUI(Packet100OpenWindow packet100openwindow)
    {
        if (!hasInit)
        {
            initializePrivate();
        }

        BaseModMp basemodmp = (BaseModMp)guiModMap.get(Integer.valueOf(packet100openwindow.inventoryType));
        GuiScreen guiscreen = basemodmp.handleGUI(packet100openwindow.inventoryType);

        if (guiscreen != null)
        {
            ModLoader.openGUI(ModLoader.getMinecraftInstance().thePlayer, guiscreen);
            ModLoader.getMinecraftInstance().thePlayer.craftingInventory.windowId = packet100openwindow.windowId;
        }
    }

    public static void registerNetClientHandlerEntity(Class class1, int i)
    {
        registerNetClientHandlerEntity(class1, false, i);
    }

    public static void registerNetClientHandlerEntity(Class class1, boolean flag, int i)
    {
        if (!hasInit)
        {
            initializePrivate();
        }

        if (i > 255)
        {
            log("RegisterNetClientHandlerEntity error: entityId cannot be greater than 255.");
        }
        else if (netClientHandlerEntityMap.containsKey(Integer.valueOf(i)))
        {
            log("RegisterNetClientHandlerEntity error: entityId already registered.");
        }
        else
        {
            if (i > 127)
            {
                i -= 256;
            }

            netClientHandlerEntityMap.put(Integer.valueOf(i), new NetClientHandlerEntity(class1, flag));
        }
    }

    public static void sendKey(BaseModMp basemodmp, int i)
    {
        if (!hasInit)
        {
            initializePrivate();
        }

        if (basemodmp == null)
        {
            IllegalArgumentException illegalargumentexception = new IllegalArgumentException("baseModMp cannot be null.");
            ModLoader.getLogger().throwing("ModLoaderMp", "SendKey", illegalargumentexception);
            ModLoader.throwException("baseModMp cannot be null.", illegalargumentexception);
        }
        else
        {
            Packet230ModLoader packet230modloader = new Packet230ModLoader();
            packet230modloader.modId = "ModLoaderMP".hashCode();
            packet230modloader.packetType = 1;
            packet230modloader.dataInt = (new int[]
                    {
                        basemodmp.getId(), i
                    });
            sendPacket(packet230modloader);
        }
    }

    public static void log(String s)
    {
        System.out.println(s);
        ModLoader.getLogger().fine(s);
    }

    private static void initializePrivate()
    {
        hasInit = true;

        try
        {
            Method method;

            try
            {
                method = (net.minecraft.src.Packet.class).getDeclaredMethod("a", new Class[]
                        {
                            Integer.TYPE, Boolean.TYPE, Boolean.TYPE, java.lang.Class.class
                        });
            }
            catch (NoSuchMethodException nosuchmethodexception1)
            {
                method = (net.minecraft.src.Packet.class).getDeclaredMethod("addIdClassMapping", new Class[]
                        {
                            Integer.TYPE, Boolean.TYPE, Boolean.TYPE, java.lang.Class.class
                        });
            }

            method.setAccessible(true);
            method.invoke(null, new Object[]
                    {
                        Integer.valueOf(230), Boolean.valueOf(true), Boolean.valueOf(true), net.minecraft.src.Packet230ModLoader.class
                    });
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            ModLoader.getLogger().throwing("ModLoaderMp", "init", illegalaccessexception);
            ModLoader.throwException("An impossible error has occurred!", illegalaccessexception);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            ModLoader.getLogger().throwing("ModLoaderMp", "init", illegalargumentexception);
            ModLoader.throwException("An impossible error has occurred!", illegalargumentexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            ModLoader.getLogger().throwing("ModLoaderMp", "init", invocationtargetexception);
            ModLoader.throwException("An impossible error has occurred!", invocationtargetexception);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            ModLoader.getLogger().throwing("ModLoaderMp", "init", nosuchmethodexception);
            ModLoader.throwException("An impossible error has occurred!", nosuchmethodexception);
        }
        catch (SecurityException securityexception)
        {
            ModLoader.getLogger().throwing("ModLoaderMp", "init", securityexception);
            ModLoader.throwException("An impossible error has occurred!", securityexception);
        }

        log("ModLoaderMP 1.0.0 Initialized");
    }

    private static void handleModCheck(Packet230ModLoader packet230modloader)
    {
        Packet230ModLoader packet230modloader1 = new Packet230ModLoader();
        packet230modloader1.modId = "ModLoaderMP".hashCode();
        packet230modloader1.packetType = 0;
        packet230modloader1.dataString = new String[ModLoader.getLoadedMods().size()];

        for (int i = 0; i < ModLoader.getLoadedMods().size(); i++)
        {
            packet230modloader1.dataString[i] = ((BaseMod)ModLoader.getLoadedMods().get(i)).toString();
        }

        sendPacket(packet230modloader1);
    }

    private static void handleTileEntityPacket(Packet230ModLoader packet230modloader)
    {
        if (packet230modloader.dataInt == null || packet230modloader.dataInt.length < 5)
        {
            log("Bad TileEntityPacket received.");
        }
        else
        {
            int i = packet230modloader.dataInt[0];
            int j = packet230modloader.dataInt[1];
            int k = packet230modloader.dataInt[2];
            int l = packet230modloader.dataInt[3];
            int i1 = packet230modloader.dataInt[4];
            int ai[] = new int[packet230modloader.dataInt.length - 5];
            System.arraycopy(packet230modloader.dataInt, 5, ai, 0, packet230modloader.dataInt.length - 5);
            float af[] = packet230modloader.dataFloat;
            String as[] = packet230modloader.dataString;

            for (int j1 = 0; j1 < ModLoader.getLoadedMods().size(); j1++)
            {
                BaseMod basemod = (BaseMod)ModLoader.getLoadedMods().get(j1);

                if (!(basemod instanceof BaseModMp))
                {
                    continue;
                }

                BaseModMp basemodmp = (BaseModMp)basemod;

                if (basemodmp.getId() != i)
                {
                    continue;
                }

                basemodmp.handleTileEntityPacket(j, k, l, i1, ai, af, as);
                break;
            }
        }
    }

    private static void sendPacket(Packet230ModLoader packet230modloader)
    {
        if (packet230Received && ModLoader.getMinecraftInstance().theWorld != null && ModLoader.getMinecraftInstance().theWorld.isRemote)
        {
            ModLoader.getMinecraftInstance().getSendQueue().addToSendQueue(packet230modloader);
        }
    }

    public static BaseModMp getModInstance(Class class1)
    {
        for (int i = 0; i < ModLoader.getLoadedMods().size(); i++)
        {
            BaseMod basemod = (BaseMod)ModLoader.getLoadedMods().get(i);

            if (!(basemod instanceof BaseModMp))
            {
                continue;
            }

            BaseModMp basemodmp = (BaseModMp)basemod;

            if (class1.isInstance(basemodmp))
            {
                return (BaseModMp)ModLoader.getLoadedMods().get(i);
            }
        }

        return null;
    }

    private ModLoaderMp()
    {
    }
}
