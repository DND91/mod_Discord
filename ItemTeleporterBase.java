package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;

public abstract class ItemTeleporterBase extends Item implements ISpecialTeleportation
{
    public ItemTeleporterBase(int i)
    {
        super(i);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        GuiIngame.currentPortal = null;

        if (!world.isRemote)
        {
            DimensionAPI.setInPortal(getDimension(), ModLoader.getMinecraftInstance(), (EntityPlayerSP)entityplayer, this, null);
        }

        if (displayPortalOverlay())
        {
            GuiIngame.currentPortal = this;
            entityplayer.setInPortal();

            if (entityplayer.timeInPortal >= 0.9F)
            {
                entityplayer.timeInPortal = 0.0F;
            }
        }

        return itemstack;
    }

    public abstract WorldProviderBase getDimension();

    public abstract Teleporter getTeleporter();

    public abstract String getEnteringMessage();

    public abstract String getLeavingMessage();

    public Teleporter getTeleporter(int i, int j)
    {
        return getTeleporter();
    }

    public boolean isPortalImmediate()
    {
        return true;
    }

    public boolean displayPortalOverlay()
    {
        return false;
    }

    public int getOverlayTexture()
    {
        return Block.portal.blockIndexInTexture;
    }

    public String getOverlayTextureOverride()
    {
        return "/terrain.png";
    }

    public List canTeleportFromDimension()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(Integer.valueOf(0));
        return arraylist;
    }

    public int returnsPlayerToDimension()
    {
        return 0;
    }

    public double getDistanceRatio()
    {
        return 1.0D;
    }

    public int getPortalDelay()
    {
        return 0;
    }

    public Achievement triggerAchievement()
    {
        return null;
    }

    public void beforeTeleportToDimension(Minecraft minecraft, EntityPlayerSP entityplayersp)
    {
    }

    public void afterTeleportToDimension(Minecraft minecraft, EntityPlayerSP entityplayersp)
    {
    }

    public void beforeTeleportFromDimension(Minecraft minecraft, EntityPlayerSP entityplayersp)
    {
    }

    public void afterTeleportFromDimension(Minecraft minecraft, EntityPlayerSP entityplayersp)
    {
    }
}
