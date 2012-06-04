package net.minecraft.src;

import java.util.*;

public class WorldChunkManagerCustom extends WorldChunkManager
{
    private GenLayer genBiomes;
    private GenLayer biomeIndexLayer;
    private BiomeCache biomeCache;
    private List biomesToSpawnIn;

    protected WorldChunkManagerCustom(WorldProviderBase worldproviderbase)
    {
        biomeCache = new BiomeCache(this);
        biomesToSpawnIn = new ArrayList();

        if (worldproviderbase.getBiomesToSpawnIn() != null)
        {
            biomesToSpawnIn = worldproviderbase.getBiomesToSpawnIn();
        }
    }

    public WorldChunkManagerCustom(long l, WorldType worldtype, WorldProviderBase worldproviderbase)
    {
        this(worldproviderbase);
        GenLayer agenlayer[] = GenLayerDimension.getGenLayers(l, worldproviderbase);
        genBiomes = agenlayer[0];
        biomeIndexLayer = agenlayer[1];
    }

    public WorldChunkManagerCustom(World world, WorldProviderBase worldproviderbase)
    {
        this(world.getSeed(), world.getWorldInfo().getTerrainType(), worldproviderbase);
    }

    /**
     * Gets the list of valid biomes for the player to spawn in.
     */
    public List getBiomesToSpawnIn()
    {
        return biomesToSpawnIn;
    }

    /**
     * Returns the BiomeGenBase related to the x, z position on the world.
     */
    public BiomeGenBase getBiomeGenAt(int i, int j)
    {
        return biomeCache.getBiomeGenAt(i, j);
    }

    /**
     * Returns a list of rainfall values for the specified blocks. Args: listToReuse, x, z, width, length.
     */
    public float[] getRainfall(float af[], int i, int j, int k, int l)
    {
        IntCache.resetIntCache();

        if (af == null || af.length < k * l)
        {
            af = new float[k * l];
        }

        int ai[] = biomeIndexLayer.getInts(i, j, k, l);

        for (int i1 = 0; i1 < k * l; i1++)
        {
            float f = (float)BiomeGenBase.biomeList[ai[i1]].getIntRainfall() / 65536F;

            if (f > 1.0F)
            {
                f = 1.0F;
            }

            af[i1] = f;
        }

        return af;
    }

    /**
     * Return an adjusted version of a given temperature based on the y height
     */
    public float getTemperatureAtHeight(float f, int i)
    {
        return f;
    }

    /**
     * Returns a list of temperatures to use for the specified blocks.  Args: listToReuse, x, y, width, length
     */
    public float[] getTemperatures(float af[], int i, int j, int k, int l)
    {
        IntCache.resetIntCache();

        if (af == null || af.length < k * l)
        {
            af = new float[k * l];
        }

        int ai[] = biomeIndexLayer.getInts(i, j, k, l);

        for (int i1 = 0; i1 < k * l; i1++)
        {
            float f = (float)BiomeGenBase.biomeList[ai[i1]].getIntTemperature() / 65536F;

            if (f > 1.0F)
            {
                f = 1.0F;
            }

            af[i1] = f;
        }

        return af;
    }

    /**
     * Returns an array of biomes for the location input.
     */
    public BiomeGenBase[] getBiomesForGeneration(BiomeGenBase abiomegenbase[], int i, int j, int k, int l)
    {
        IntCache.resetIntCache();

        if (abiomegenbase == null || abiomegenbase.length < k * l)
        {
            abiomegenbase = new BiomeGenBase[k * l];
        }

        int ai[] = genBiomes.getInts(i, j, k, l);

        for (int i1 = 0; i1 < k * l; i1++)
        {
            abiomegenbase[i1] = BiomeGenBase.biomeList[ai[i1]];
        }

        return abiomegenbase;
    }

    /**
     * Returns biomes to use for the blocks and loads the other data like temperature and humidity onto the
     * WorldChunkManager Args: oldBiomeList, x, z, width, depth
     */
    public BiomeGenBase[] loadBlockGeneratorData(BiomeGenBase abiomegenbase[], int i, int j, int k, int l)
    {
        return getBiomeGenAt(abiomegenbase, i, j, k, l, true);
    }

    /**
     * Return a list of biomes for the specified blocks. Args: listToReuse, x, y, width, length, cacheFlag (if false,
     * don't check biomeCache to avoid infinite loop in BiomeCacheBlock)
     */
    public BiomeGenBase[] getBiomeGenAt(BiomeGenBase abiomegenbase[], int i, int j, int k, int l, boolean flag)
    {
        IntCache.resetIntCache();

        if (abiomegenbase == null || abiomegenbase.length < k * l)
        {
            abiomegenbase = new BiomeGenBase[k * l];
        }

        if (flag && k == 16 && l == 16 && (i & 0xf) == 0 && (j & 0xf) == 0)
        {
            BiomeGenBase abiomegenbase1[] = biomeCache.getCachedBiomes(i, j);
            System.arraycopy(abiomegenbase1, 0, abiomegenbase, 0, k * l);
            return abiomegenbase;
        }

        int ai[] = biomeIndexLayer.getInts(i, j, k, l);

        for (int i1 = 0; i1 < k * l; i1++)
        {
            abiomegenbase[i1] = BiomeGenBase.biomeList[ai[i1]];
        }

        return abiomegenbase;
    }

    /**
     * checks given Chunk's Biomes against List of allowed ones
     */
    public boolean areBiomesViable(int i, int j, int k, List list)
    {
        int l = i - k >> 2;
        int i1 = j - k >> 2;
        int j1 = i + k >> 2;
        int k1 = j + k >> 2;
        int l1 = (j1 - l) + 1;
        int i2 = (k1 - i1) + 1;
        int ai[] = genBiomes.getInts(l, i1, l1, i2);

        for (int j2 = 0; j2 < l1 * i2; j2++)
        {
            BiomeGenBase biomegenbase = BiomeGenBase.biomeList[ai[j2]];

            if (!list.contains(biomegenbase))
            {
                return false;
            }
        }

        return true;
    }

    /**
     * Finds a valid position within a range, that is once of the listed biomes.
     */
    public ChunkPosition findBiomePosition(int i, int j, int k, List list, Random random)
    {
        int l = i - k >> 2;
        int i1 = j - k >> 2;
        int j1 = i + k >> 2;
        int k1 = j + k >> 2;
        int l1 = (j1 - l) + 1;
        int i2 = (k1 - i1) + 1;
        int ai[] = genBiomes.getInts(l, i1, l1, i2);
        ChunkPosition chunkposition = null;
        int j2 = 0;

        for (int k2 = 0; k2 < ai.length; k2++)
        {
            int l2 = l + k2 % l1 << 2;
            int i3 = i1 + k2 / l1 << 2;
            BiomeGenBase biomegenbase = BiomeGenBase.biomeList[ai[k2]];

            if (list.contains(biomegenbase) && (chunkposition == null || random.nextInt(j2 + 1) == 0))
            {
                chunkposition = new ChunkPosition(l2, 0, i3);
                j2++;
            }
        }

        return chunkposition;
    }

    /**
     * Calls the WorldChunkManager's biomeCache.cleanupCache()
     */
    public void cleanupCache()
    {
        biomeCache.cleanupCache();
    }
}
