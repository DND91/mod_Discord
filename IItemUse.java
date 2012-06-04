package net.minecraft.src;

public interface IItemUse
{
    public abstract void onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l);
}
