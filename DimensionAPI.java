package net.minecraft.src;

import java.util.*;
import net.minecraft.client.Minecraft;

public class DimensionAPI
{
    public static int timeInPortal = 0;
    public static HashMap dimensionMap = new HashMap();
    public static HashMap itemUseMap = new HashMap();
    public static HashMap itemRightClickMap = new HashMap();
    public static HashMap blockAddedMap = new HashMap();
    public static HashMap blockRemovalMap = new HashMap();
    public static ArrayList overlayList = new ArrayList();

    public DimensionAPI()
    {
    }

    public static void registerDimension(WorldProviderBase worldproviderbase)
    {
        int i = worldproviderbase.getDimensionID();
        dimensionMap.put(worldproviderbase, Integer.valueOf(i));
    }

    public static void setInPortal(WorldProviderBase worldproviderbase, Minecraft minecraft, Entity entity, ISpecialTeleportation ispecialteleportation, BlockPortalBase blockportalbase)
    {
        EntityPlayerSP entityplayersp = (EntityPlayerSP)entity;
        int i = entityplayersp.dimension;

        if (blockportalbase != null && !isInPortal(entityplayersp, blockportalbase.blockID))
        {
            timeInPortal = 0;
            return;
        }

        if (ispecialteleportation.canTeleportFromDimension().contains(Integer.valueOf(i)) || i == worldproviderbase.getDimensionID())
        {
            if (ispecialteleportation.isPortalImmediate())
            {
                usePortal(worldproviderbase, minecraft, entityplayersp, ispecialteleportation);
            }
            else
            {
                timeInPortal++;

                if (timeInPortal == ispecialteleportation.getPortalDelay() && entityplayersp.timeUntilPortal <= 0)
                {
                    timeInPortal = 0;
                    entityplayersp.timeUntilPortal = 10;
                    usePortal(worldproviderbase, minecraft, entityplayersp, ispecialteleportation);
                }
            }
        }
    }

    public static boolean isInPortal(EntityPlayerSP entityplayersp, int i)
    {
        int j = (int)Math.floor(entityplayersp.posX);
        int k = (int)Math.floor(entityplayersp.posY);
        int l = (int)Math.floor(entityplayersp.posZ);
        return entityplayersp.worldObj.getBlockId(j, k, l) == i || entityplayersp.worldObj.getBlockId(j, k - 1, l) == i;
    }

    public static void usePortal(WorldProviderBase worldproviderbase, Minecraft minecraft, EntityPlayerSP entityplayersp, ISpecialTeleportation ispecialteleportation)
    {
        int i = entityplayersp.dimension;

        if (entityplayersp.dimension != worldproviderbase.getDimensionID())
        {
            teleportToDimension(worldproviderbase, minecraft, entityplayersp, ispecialteleportation);
        }
        else if (entityplayersp.dimension == worldproviderbase.getDimensionID())
        {
            teleportFromDimension(worldproviderbase, minecraft, entityplayersp, ispecialteleportation, false, 0);
        }
    }

    public static void teleportToDimension(WorldProviderBase worldproviderbase, Minecraft minecraft, EntityPlayerSP entityplayersp, ISpecialTeleportation ispecialteleportation)
    {
        ispecialteleportation.beforeTeleportToDimension(minecraft, entityplayersp);
        int i = entityplayersp.dimension;
        minecraft.theWorld.setEntityDead(entityplayersp);
        entityplayersp.isDead = false;
        double d = 1.0D / ispecialteleportation.getDistanceRatio();
        double d1 = entityplayersp.posX;
        double d2 = entityplayersp.posZ;
        d1 *= d;
        d2 *= d;
        entityplayersp.setLocationAndAngles(d1, entityplayersp.posY, d2, entityplayersp.rotationYaw, entityplayersp.rotationPitch);

        if (entityplayersp.isEntityAlive())
        {
            minecraft.theWorld.updateEntityWithOptionalForce(entityplayersp, false);
        }

        minecraft.renderGlobal = worldproviderbase.getGlobalRenderer(minecraft, minecraft.renderEngine);
        World world = null;
        world = new World(minecraft.theWorld, worldproviderbase);
        String s = ispecialteleportation.getEnteringMessage();
        minecraft.changeWorld(world, s, entityplayersp);
        entityplayersp.dimension = worldproviderbase.getDimensionID();
        entityplayersp.worldObj = minecraft.theWorld;

        if (entityplayersp.isEntityAlive())
        {
            entityplayersp.setLocationAndAngles(entityplayersp.posX, entityplayersp.posY, entityplayersp.posZ, entityplayersp.rotationYaw, entityplayersp.rotationPitch);
            minecraft.theWorld.updateEntityWithOptionalForce(entityplayersp, false);
            ispecialteleportation.getTeleporter(i, entityplayersp.dimension).placeInPortal(minecraft.theWorld, entityplayersp);
        }

        if (ispecialteleportation.triggerAchievement() != null)
        {
            entityplayersp.addStat(ispecialteleportation.triggerAchievement(), 1);
        }

        ispecialteleportation.afterTeleportToDimension(minecraft, entityplayersp);
    }

    public static void teleportFromDimension(WorldProviderBase worldproviderbase, Minecraft minecraft, EntityPlayerSP entityplayersp, ISpecialTeleportation ispecialteleportation, boolean flag, int i)
    {
        int j = entityplayersp.dimension;

        if (!flag)
        {
            ispecialteleportation.beforeTeleportFromDimension(minecraft, entityplayersp);
            i = ispecialteleportation.returnsPlayerToDimension();
        }

        minecraft.theWorld.setEntityDead(entityplayersp);
        entityplayersp.isDead = false;
        double d = 1.0D;

        if (!flag)
        {
            d = ispecialteleportation.getDistanceRatio();
        }

        double d1 = entityplayersp.posX;
        double d2 = entityplayersp.posZ;
        d1 *= d;
        d2 *= d;
        entityplayersp.setLocationAndAngles(d1, entityplayersp.posY, d2, entityplayersp.rotationYaw, entityplayersp.rotationPitch);

        if (entityplayersp.isEntityAlive())
        {
            minecraft.theWorld.updateEntityWithOptionalForce(entityplayersp, false);
        }

        minecraft.renderGlobal = new RenderGlobal(minecraft, minecraft.renderEngine);
        World world = null;
        world = new World(minecraft.theWorld, minecraft.theWorld.worldProvider.getProviderForDimension(i));
        String s = "Respawning";

        if (!flag)
        {
            s = ispecialteleportation.getLeavingMessage();
        }
        else
        {
            s = worldproviderbase.getRespawnMessage();
        }

        minecraft.changeWorld(world, s, entityplayersp);
        entityplayersp.dimension = i;
        entityplayersp.worldObj = minecraft.theWorld;

        if (entityplayersp.isEntityAlive() && !flag)
        {
            entityplayersp.setLocationAndAngles(entityplayersp.posX, entityplayersp.posY, entityplayersp.posZ, entityplayersp.rotationYaw, entityplayersp.rotationPitch);
            minecraft.theWorld.updateEntityWithOptionalForce(entityplayersp, false);
            ispecialteleportation.getTeleporter(j, entityplayersp.dimension).placeInPortal(minecraft.theWorld, entityplayersp);
        }

        if (!flag)
        {
            ispecialteleportation.afterTeleportFromDimension(minecraft, entityplayersp);
        }
    }

    public static Object getKeyFromValue(Map map, Object obj)
    {
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            Object obj1 = iterator.next();

            if (map.get(obj1).equals(obj))
            {
                return obj1;
            }
        }

        return null;
    }

    public static WorldProvider getProviderByDimension(int i)
    {
        WorldProvider worldprovider = (WorldProvider)getKeyFromValue(dimensionMap, new Integer(i));
        return worldprovider;
    }

    public static void respawnPlayer(Minecraft minecraft)
    {
        WorldProviderBase worldproviderbase = (WorldProviderBase)minecraft.theWorld.worldProvider;
        int i = worldproviderbase.respawnInDimension();
        worldproviderbase.beforeRespawnTeleportation(minecraft);
        teleportFromDimension(worldproviderbase, minecraft, minecraft.thePlayer, null, true, i);
        worldproviderbase.afterRespawnTeleportation(minecraft);
        minecraft.respawn(false, i, false);
    }

    public static void registerPortalTexture(Block block, float f, float f1, float f2, float f3)
    {
        ModLoader.getMinecraftInstance().renderEngine.registerTextureFX(new TextureCustomPortalFX(block.blockIndexInTexture, f, f1, f2, f3));
    }

    public static void addItemUseIntercept(int i, IItemUse iitemuse)
    {
        itemUseMap.put(Integer.valueOf(i), iitemuse);
    }

    public static void addItemRightClickIntercept(int i, IItemRightClick iitemrightclick)
    {
        itemRightClickMap.put(Integer.valueOf(i), iitemrightclick);
    }

    public static void addBlockAddedIntercept(int i, IBlockAdded iblockadded)
    {
        blockAddedMap.put(Integer.valueOf(i), iblockadded);
    }

    public static void addBlockRemovalIntercept(int i, IBlockRemoval iblockremoval)
    {
        blockRemovalMap.put(Integer.valueOf(i), iblockremoval);
    }

    public static void spawnPortalParticle(World world, float f, float f1, float f2, double d, double d1, double d2, double d3, double d4, double d5)
    {
        ModLoader.getMinecraftInstance().effectRenderer.addEffect(new EntityCustomPortalFX(world, f, f1, f2, d, d1, d2, d5, d4, d5));
    }

    public static void registerOverlay(IRenderOverlay irenderoverlay)
    {
        overlayList.add(irenderoverlay);
    }
}
