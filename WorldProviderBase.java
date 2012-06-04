package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;

public abstract class WorldProviderBase extends WorldProvider
{
    public WorldProviderBase()
    {
        worldType = getDimensionID();
    }

    public abstract int getDimensionID();

    public boolean renderClouds()
    {
        return true;
    }

    public boolean renderVoidFog()
    {
        return true;
    }

    public void renderCelestialObjects(float f)
    {
    }

    public float setSunSize()
    {
        return 1.0F;
    }

    public float setMoonSize()
    {
        return 1.0F;
    }

    public String getSunTexture()
    {
        return "/terrain/sun.png";
    }

    public String getMoonTexture()
    {
        return "/terrain/moon_phases.png";
    }

    public boolean renderStars()
    {
        return true;
    }

    public float getStarBrightness(World world, float f)
    {
        return world.getStarBrightness(f);
    }

    public Vec3D getSkyColor(World world, Entity entity, float f)
    {
        return world.getSkyColor(entity, f);
    }

    public boolean darkenSkyDuringRain()
    {
        return true;
    }

    public String getRespawnMessage()
    {
        return "Respawning";
    }

    public int respawnInDimension()
    {
        return 0;
    }

    public boolean renderEndSky()
    {
        return false;
    }

    /**
     * returns true if there should be no sky, false otherwise
     */
    public boolean getWorldHasNoSky()
    {
        return renderVoidFog();
    }

    public String getSaveFolderName()
    {
        return (new StringBuilder()).append("DIM").append(getDimensionID()).toString();
    }

    public RenderGlobal getGlobalRenderer(Minecraft minecraft, RenderEngine renderengine)
    {
        return new RenderGlobalCustom(minecraft, renderengine);
    }

    public boolean hasMultipleBiomes()
    {
        return false;
    }

    public BiomeGenBase[] setMajorBiomes()
    {
        return null;
    }

    public BiomeGenBase setMinorBiomes(BiomeGenBase biomegenbase, GenLayer genlayer)
    {
        return null;
    }

    public BiomeGenBase setOceanBiomes(BiomeGenBase biomegenbase, GenLayer genlayer)
    {
        return null;
    }

    public BiomeGenBase setRiverBiomes(BiomeGenBase biomegenbase, GenLayer genlayer)
    {
        return null;
    }

    public BiomeGenBase setBorderBiomes(BiomeGenBase biomegenbase, BiomeGenBase biomegenbase1, GenLayer genlayer)
    {
        return null;
    }

    public BiomeGenBase setMiscellaneousBiomes(GenLayer genlayer)
    {
        return null;
    }

    public List getBiomesToSpawnIn()
    {
        return null;
    }

    /**
     * creates a new world chunk manager for WorldProvider
     */
    public void registerWorldChunkManager()
    {
        if (hasMultipleBiomes())
        {
            worldChunkMgr = new WorldChunkManagerCustom(worldObj, this);
        }
    }

    public void beforeRespawnTeleportation(Minecraft minecraft)
    {
    }

    public void afterRespawnTeleportation(Minecraft minecraft)
    {
    }
}
