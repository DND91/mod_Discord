package net.minecraft.src;

import java.util.Random;

public class EntityCustomPortalFX extends EntityFX
{
    private float portalParticleScale;
    private double portalPosX;
    private double portalPosY;
    private double portalPosZ;

    public EntityCustomPortalFX(World world, float f, float f1, float f2, double d, double d1, double d2, double d3, double d4, double d5)
    {
        super(world, d, d1, d2, d3, d4, d5);
        motionX = d3;
        motionY = d4;
        motionZ = d5;
        portalPosX = posX = d;
        portalPosY = posY = d1;
        portalPosZ = posZ = d2;
        float f3 = rand.nextFloat() * 0.6F + 0.4F;
        portalParticleScale = particleScale = rand.nextFloat() * 0.2F + 0.5F;
        particleRed = f;
        particleGreen = f1;
        particleBlue = f2;
        particleMaxAge = (int)(Math.random() * 10D) + 40;
        noClip = true;
        setParticleTextureIndex((int)(Math.random() * 8D));
    }

    public void renderParticle(Tessellator tessellator, float f, float f1, float f2, float f3, float f4, float f5)
    {
        float f6 = ((float)particleAge + f) / (float)particleMaxAge;
        f6 = 1.0F - f6;
        f6 *= f6;
        f6 = 1.0F - f6;
        particleScale = portalParticleScale * f6;
        super.renderParticle(tessellator, f, f1, f2, f3, f4, f5);
    }

    public int getBrightnessForRender(float f)
    {
        int i = super.getBrightnessForRender(f);
        float f1 = (float)particleAge / (float)particleMaxAge;
        f1 *= f1;
        f1 *= f1;
        int j = i & 0xff;
        int k = i >> 16 & 0xff;
        k += (int)(f1 * 15F * 16F);

        if (k > 240)
        {
            k = 240;
        }

        return j | k << 16;
    }

    /**
     * Gets how bright this entity is.
     */
    public float getBrightness(float f)
    {
        float f1 = super.getBrightness(f);
        float f2 = (float)particleAge / (float)particleMaxAge;
        f2 *= f2;
        f2 *= f2;
        return f1 * (1.0F - f2) + f2;
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;
        float f = (float)particleAge / (float)particleMaxAge;
        float f1 = f;
        f = -f + f * f * 2.0F;
        f = 1.0F - f;
        posX = portalPosX + motionX * (double)f;
        posY = portalPosY + motionY * (double)f + (double)(1.0F - f1);
        posZ = portalPosZ + motionZ * (double)f;

        if (particleAge++ >= particleMaxAge)
        {
            setDead();
        }
    }
}
