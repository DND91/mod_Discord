package net.minecraft.src;

public abstract class GenLayerDimension extends GenLayer
{
    public GenLayerDimension(long l)
    {
        super(l);
    }

    public static GenLayer[] getGenLayers(long l, WorldProviderBase worldproviderbase)
    {
        Object obj = new GenLayerIsland(1L);
        obj = new GenLayerFuzzyZoom(2000L, ((GenLayer)(obj)));
        obj = new GenLayerDimensionOcean1(1L, ((GenLayer)(obj)), worldproviderbase);
        obj = new GenLayerZoom(2001L, ((GenLayer)(obj)));
        obj = new GenLayerDimensionOcean1(2L, ((GenLayer)(obj)), worldproviderbase);
        obj = new GenLayerZoom(2002L, ((GenLayer)(obj)));
        obj = new GenLayerDimensionOcean1(3L, ((GenLayer)(obj)), worldproviderbase);
        obj = new GenLayerZoom(2003L, ((GenLayer)(obj)));
        obj = new GenLayerDimensionOcean1(4L, ((GenLayer)(obj)), worldproviderbase);
        byte byte0 = 4;
        Object obj1 = obj;
        obj1 = GenLayerZoom.func_35515_a(1000L, ((GenLayer)(obj1)), 0);
        obj1 = new GenLayerDimensionOcean2(100L, ((GenLayer)(obj1)), worldproviderbase);
        obj1 = GenLayerZoom.func_35515_a(1000L, ((GenLayer)(obj1)), byte0 + 2);
        obj1 = new GenLayerDimensionRiver(1L, ((GenLayer)(obj1)), worldproviderbase);
        obj1 = new GenLayerSmooth(1000L, ((GenLayer)(obj1)));
        Object obj2 = obj;
        obj2 = GenLayerZoom.func_35515_a(1000L, ((GenLayer)(obj2)), 0);
        obj2 = new GenLayerDimensionMajorBiome(200L, ((GenLayer)(obj2)), worldproviderbase);
        obj2 = GenLayerZoom.func_35515_a(1000L, ((GenLayer)(obj2)), 2);
        obj2 = new GenLayerDimensionMinorBiome(1000L, ((GenLayer)(obj2)), worldproviderbase);
        obj2 = new GenLayerDimensionMiscBiome(5L, ((GenLayer)(obj2)), worldproviderbase);

        for (int i = 0; i < byte0; i++)
        {
            obj2 = new GenLayerZoom(1000 + i, ((GenLayer)(obj2)));

            if (i == 0)
            {
                obj2 = new GenLayerDimensionOcean1(3L, ((GenLayer)(obj2)), worldproviderbase);
            }

            if (i == 1)
            {
                obj2 = new GenLayerDimensionBorderBiome(1000L, ((GenLayer)(obj2)), worldproviderbase);
            }
        }

        obj2 = new GenLayerSmooth(1000L, ((GenLayer)(obj2)));
        obj2 = new GenLayerDimensionWater(100L, ((GenLayer)(obj2)), ((GenLayer)(obj1)), worldproviderbase);
        GenLayerDimensionWater genlayerdimensionwater = (GenLayerDimensionWater)obj2;
        GenLayerVoronoiZoom genlayervoronoizoom = new GenLayerVoronoiZoom(10L, ((GenLayer)(obj2)));
        ((GenLayer)(obj2)).initWorldGenSeed(l);
        genlayervoronoizoom.initWorldGenSeed(l);
        return (new GenLayer[]
                {
                    (GenLayer)obj2, genlayervoronoizoom, genlayerdimensionwater
                });
    }
}
