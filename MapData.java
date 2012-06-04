package net.minecraft.src;

import java.util.*;

public class MapData extends WorldSavedData
{
    public int xCenter;
    public int zCenter;
    public byte dimension;
    public byte scale;
    public byte colors[];

    /**
     * Incremented each update of the map item, used for the patchy updating map effect and the spinning player icons
     * while in the End and Nether.
     */
    public int randomEffect;

    /**
     * Holds a reference to the MapInfo of the players who own a copy of the map
     */
    public List playersArrayList;

    /**
     * Holds a reference to the players who own a copy of the map and a reference to their MapInfo
     */
    private Map playersHashMap;
    public List playersVisibleOnMap;

    public MapData(String par1Str)
    {
        super(par1Str);
        colors = new byte[16384];
        playersArrayList = new ArrayList();
        playersHashMap = new HashMap();
        playersVisibleOnMap = new ArrayList();
    }

    /**
     * reads in data from the NBTTagCompound into this MapDataBase
     */
    public void readFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        dimension = par1NBTTagCompound.getByte("dimension");
        xCenter = par1NBTTagCompound.getInteger("xCenter");
        zCenter = par1NBTTagCompound.getInteger("zCenter");
        scale = par1NBTTagCompound.getByte("scale");

        if (scale < 0)
        {
            scale = 0;
        }

        if (scale > 4)
        {
            scale = 4;
        }

        short word0 = par1NBTTagCompound.getShort("width");
        short word1 = par1NBTTagCompound.getShort("height");

        if (word0 == 128 && word1 == 128)
        {
            colors = par1NBTTagCompound.getByteArray("colors");
        }
        else
        {
            byte abyte0[] = par1NBTTagCompound.getByteArray("colors");
            colors = new byte[16384];
            int i = (128 - word0) / 2;
            int j = (128 - word1) / 2;

            for (int k = 0; k < word1; k++)
            {
                int l = k + j;

                if (l < 0 && l >= 128)
                {
                    continue;
                }

                for (int i1 = 0; i1 < word0; i1++)
                {
                    int j1 = i1 + i;

                    if (j1 >= 0 || j1 < 128)
                    {
                        colors[j1 + l * 128] = abyte0[i1 + k * word0];
                    }
                }
            }
        }
    }

    /**
     * write data to NBTTagCompound from this MapDataBase, similar to Entities and TileEntities
     */
    public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    {
        par1NBTTagCompound.setByte("dimension", dimension);
        par1NBTTagCompound.setInteger("xCenter", xCenter);
        par1NBTTagCompound.setInteger("zCenter", zCenter);
        par1NBTTagCompound.setByte("scale", scale);
        par1NBTTagCompound.setShort("width", (short)128);
        par1NBTTagCompound.setShort("height", (short)128);
        par1NBTTagCompound.setByteArray("colors", colors);
    }

    /**
     * Adds the player passed to the list of visible players and checks to see which players are visible
     */
    public void updateVisiblePlayers(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack)
    {
        if (!playersHashMap.containsKey(par1EntityPlayer))
        {
            MapInfo mapinfo = new MapInfo(this, par1EntityPlayer);
            playersHashMap.put(par1EntityPlayer, mapinfo);
            playersArrayList.add(mapinfo);
        }

        playersVisibleOnMap.clear();

        for (int i = 0; i < playersArrayList.size(); i++)
        {
            MapInfo mapinfo1 = (MapInfo)playersArrayList.get(i);

            if (mapinfo1.entityplayerObj.isDead || !mapinfo1.entityplayerObj.inventory.hasItemStack(par2ItemStack))
            {
                playersHashMap.remove(mapinfo1.entityplayerObj);
                playersArrayList.remove(mapinfo1);
                continue;
            }

            float f = (float)(mapinfo1.entityplayerObj.posX - (double)xCenter) / (float)(1 << scale);
            float f1 = (float)(mapinfo1.entityplayerObj.posZ - (double)zCenter) / (float)(1 << scale);
            int j = 64;
            int k = 64;

            if (f < (float)(-j) || f1 < (float)(-k) || f > (float)j || f1 > (float)k)
            {
                continue;
            }

            byte byte0 = 0;
            byte byte1 = (byte)(int)((double)(f * 2.0F) + 0.5D);
            byte byte2 = (byte)(int)((double)(f1 * 2.0F) + 0.5D);
            byte byte3 = (byte)(int)((double)((par1EntityPlayer.rotationYaw * 16F) / 360F) + 0.5D);

            if (dimension < 0)
            {
                int l = randomEffect / 10;
                byte3 = (byte)(l * l * 0x209a771 + l * 121 >> 15 & 0xf);
            }

            if (mapinfo1.entityplayerObj.dimension == dimension)
            {
                playersVisibleOnMap.add(new MapCoord(this, byte0, byte1, byte2, byte3));
            }
        }
    }

    public void func_28170_a(int par1, int par2, int par3)
    {
        super.markDirty();

        for (int i = 0; i < playersArrayList.size(); i++)
        {
            MapInfo mapinfo = (MapInfo)playersArrayList.get(i);

            if (mapinfo.field_28119_b[par1] < 0 || mapinfo.field_28119_b[par1] > par2)
            {
                mapinfo.field_28119_b[par1] = par2;
            }

            if (mapinfo.field_28124_c[par1] < 0 || mapinfo.field_28124_c[par1] < par3)
            {
                mapinfo.field_28124_c[par1] = par3;
            }
        }
    }

    /**
     * Updates the client's map with information from other players in MP
     */
    public void updateMPMapData(byte par1ArrayOfByte[])
    {
        if (par1ArrayOfByte[0] == 0)
        {
            int i = par1ArrayOfByte[1] & 0xff;
            int k = par1ArrayOfByte[2] & 0xff;

            for (int l = 0; l < par1ArrayOfByte.length - 3; l++)
            {
                colors[(l + k) * 128 + i] = par1ArrayOfByte[l + 3];
            }

            markDirty();
        }
        else if (par1ArrayOfByte[0] == 1)
        {
            playersVisibleOnMap.clear();

            for (int j = 0; j < (par1ArrayOfByte.length - 1) / 3; j++)
            {
                byte byte0 = (byte)(par1ArrayOfByte[j * 3 + 1] % 16);
                byte byte1 = par1ArrayOfByte[j * 3 + 2];
                byte byte2 = par1ArrayOfByte[j * 3 + 3];
                byte byte3 = (byte)(par1ArrayOfByte[j * 3 + 1] / 16);
                playersVisibleOnMap.add(new MapCoord(this, byte0, byte1, byte2, byte3));
            }
        }
    }
}
