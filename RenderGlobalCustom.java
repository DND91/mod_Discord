package net.minecraft.src;

import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class RenderGlobalCustom extends RenderGlobal
{
    public RenderEngine renderEngine;
    public Minecraft mc;
    public World theWorld;
    public int starGLCallList;
    public int glSkyList;
    public int glSkyList2;

    public RenderGlobalCustom(Minecraft minecraft, RenderEngine renderengine)
    {
        super(minecraft, renderengine);
        renderEngine = renderengine;
        mc = minecraft;
        theWorld = mc.theWorld;
        starGLCallList = GLAllocation.generateDisplayLists(3);
        GL11.glPushMatrix();
        GL11.glNewList(starGLCallList, GL11.GL_COMPILE);
        renderStars();
        GL11.glEndList();
        GL11.glPopMatrix();
        Tessellator tessellator = Tessellator.instance;
        glSkyList = starGLCallList + 1;
        GL11.glNewList(glSkyList, GL11.GL_COMPILE);
        byte byte0 = 64;
        int i = 256 / byte0 + 2;
        float f = 16F;

        for (int j = -byte0 * i; j <= byte0 * i; j += byte0)
        {
            for (int l = -byte0 * i; l <= byte0 * i; l += byte0)
            {
                tessellator.startDrawingQuads();
                tessellator.addVertex(j + 0, f, l + 0);
                tessellator.addVertex(j + byte0, f, l + 0);
                tessellator.addVertex(j + byte0, f, l + byte0);
                tessellator.addVertex(j + 0, f, l + byte0);
                tessellator.draw();
            }
        }

        GL11.glEndList();
        glSkyList2 = starGLCallList + 2;
        GL11.glNewList(glSkyList2, GL11.GL_COMPILE);
        f = -16F;
        tessellator.startDrawingQuads();

        for (int k = -byte0 * i; k <= byte0 * i; k += byte0)
        {
            for (int i1 = -byte0 * i; i1 <= byte0 * i; i1 += byte0)
            {
                tessellator.addVertex(k + byte0, f, i1 + 0);
                tessellator.addVertex(k + 0, f, i1 + 0);
                tessellator.addVertex(k + 0, f, i1 + byte0);
                tessellator.addVertex(k + byte0, f, i1 + byte0);
            }
        }

        tessellator.draw();
        GL11.glEndList();
    }

    /**
     * Renders the sky with the partial tick time. Args: partialTickTime
     */
    public void renderSky(float f)
    {
        World world = mc.theWorld;

        if (!(world.worldProvider instanceof WorldProviderBase))
        {
            super.renderSky(f);
            return;
        }

        WorldProviderBase worldproviderbase = (WorldProviderBase)world.worldProvider;

        if (worldproviderbase.renderEndSky())
        {
            GL11.glDisable(GL11.GL_FOG);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            RenderHelper.disableStandardItemLighting();
            GL11.glDepthMask(false);
            renderEngine.bindTexture(renderEngine.getTexture("/misc/tunnel.png"));
            Tessellator tessellator = Tessellator.instance;

            for (int i = 0; i < 6; i++)
            {
                GL11.glPushMatrix();

                if (i == 1)
                {
                    GL11.glRotatef(90F, 1.0F, 0.0F, 0.0F);
                }

                if (i == 2)
                {
                    GL11.glRotatef(-90F, 1.0F, 0.0F, 0.0F);
                }

                if (i == 3)
                {
                    GL11.glRotatef(180F, 1.0F, 0.0F, 0.0F);
                }

                if (i == 4)
                {
                    GL11.glRotatef(90F, 0.0F, 0.0F, 1.0F);
                }

                if (i == 5)
                {
                    GL11.glRotatef(-90F, 0.0F, 0.0F, 1.0F);
                }

                tessellator.startDrawingQuads();
                tessellator.setColorOpaque_I(0x181818);
                tessellator.addVertexWithUV(-100D, -100D, -100D, 0.0D, 0.0D);
                tessellator.addVertexWithUV(-100D, -100D, 100D, 0.0D, 16D);
                tessellator.addVertexWithUV(100D, -100D, 100D, 16D, 16D);
                tessellator.addVertexWithUV(100D, -100D, -100D, 16D, 0.0D);
                tessellator.draw();
                GL11.glPopMatrix();
            }

            GL11.glDepthMask(true);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glEnable(GL11.GL_ALPHA_TEST);
            return;
        }

        if (!worldproviderbase.func_48217_e())
        {
            return;
        }

        GL11.glDisable(GL11.GL_TEXTURE_2D);
        Vec3D vec3d = worldproviderbase.getSkyColor(world, mc.renderViewEntity, f);
        float f1 = (float)vec3d.xCoord;
        float f2 = (float)vec3d.yCoord;
        float f3 = (float)vec3d.zCoord;

        if (mc.gameSettings.anaglyph)
        {
            float f4 = (f1 * 30F + f2 * 59F + f3 * 11F) / 100F;
            float f5 = (f1 * 30F + f2 * 70F) / 100F;
            float f6 = (f1 * 30F + f3 * 70F) / 100F;
            f1 = f4;
            f2 = f5;
            f3 = f6;
        }

        GL11.glColor3f(f1, f2, f3);
        Tessellator tessellator1 = Tessellator.instance;
        GL11.glDepthMask(false);
        GL11.glEnable(GL11.GL_FOG);
        GL11.glColor3f(f1, f2, f3);
        GL11.glCallList(glSkyList);
        GL11.glDisable(GL11.GL_FOG);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        RenderHelper.disableStandardItemLighting();
        float af[] = worldproviderbase.calcSunriseSunsetColors(world.getCelestialAngle(f), f);

        if (af != null)
        {
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glShadeModel(GL11.GL_SMOOTH);
            GL11.glPushMatrix();
            GL11.glRotatef(90F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(MathHelper.sin(world.getCelestialAngleRadians(f)) < 0.0F ? 180F : 0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(90F, 0.0F, 0.0F, 1.0F);
            float f7 = af[0];
            float f8 = af[1];
            float f9 = af[2];

            if (mc.gameSettings.anaglyph)
            {
                float f11 = (f7 * 30F + f8 * 59F + f9 * 11F) / 100F;
                float f13 = (f7 * 30F + f8 * 70F) / 100F;
                float f15 = (f7 * 30F + f9 * 70F) / 100F;
                f7 = f11;
                f8 = f13;
                f9 = f15;
            }

            tessellator1.startDrawing(6);
            tessellator1.setColorRGBA_F(f7, f8, f9, af[3]);
            tessellator1.addVertex(0.0D, 100D, 0.0D);
            int j = 16;
            tessellator1.setColorRGBA_F(af[0], af[1], af[2], 0.0F);

            for (int k = 0; k <= j; k++)
            {
                float f16 = ((float)k * (float)Math.PI * 2.0F) / (float)j;
                float f18 = MathHelper.sin(f16);
                float f19 = MathHelper.cos(f16);
                tessellator1.addVertex(f18 * 120F, f19 * 120F, -f19 * 40F * af[3]);
            }

            tessellator1.draw();
            GL11.glPopMatrix();
            GL11.glShadeModel(GL11.GL_FLAT);
        }

        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
        GL11.glPushMatrix();
        double d = 1.0F - world.getRainStrength(f);

        if (!worldproviderbase.darkenSkyDuringRain())
        {
            d = 1.0D;
        }

        float f10 = 0.0F;
        float f12 = 0.0F;
        float f14 = 0.0F;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, (float)d);
        GL11.glTranslatef(f10, f12, f14);
        GL11.glRotatef(-90F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(world.getCelestialAngle(f) * 360F, 1.0F, 0.0F, 0.0F);
        float f17 = 30F * worldproviderbase.setSunSize();
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, renderEngine.getTexture(worldproviderbase.getSunTexture()));
        tessellator1.startDrawingQuads();
        tessellator1.addVertexWithUV(-f17, 100D, -f17, 0.0D, 0.0D);
        tessellator1.addVertexWithUV(f17, 100D, -f17, 1.0D, 0.0D);
        tessellator1.addVertexWithUV(f17, 100D, f17, 1.0D, 1.0D);
        tessellator1.addVertexWithUV(-f17, 100D, f17, 0.0D, 1.0D);
        tessellator1.draw();
        f17 = 20F * worldproviderbase.setMoonSize();
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, renderEngine.getTexture(worldproviderbase.getMoonTexture()));
        int l = world.getMoonPhase(f);
        int i1 = l % 4;
        int j1 = (l / 4) % 2;
        float f20 = (float)(i1 + 0) / 4F;
        float f21 = (float)(j1 + 0) / 2.0F;
        float f22 = (float)(i1 + 1) / 4F;
        float f23 = (float)(j1 + 1) / 2.0F;
        tessellator1.startDrawingQuads();
        tessellator1.addVertexWithUV(-f17, -100D, f17, f22, f23);
        tessellator1.addVertexWithUV(f17, -100D, f17, f20, f23);
        tessellator1.addVertexWithUV(f17, -100D, -f17, f20, f21);
        tessellator1.addVertexWithUV(-f17, -100D, -f17, f22, f21);
        tessellator1.draw();
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        float f24 = (float)((double)worldproviderbase.getStarBrightness(world, f) * d);

        if (f24 > 0.0F)
        {
            GL11.glColor4f(f24, f24, f24, f24);
            GL11.glCallList(starGLCallList);
        }

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glEnable(GL11.GL_FOG);
        GL11.glPopMatrix();
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glColor3f(0.0F, 0.0F, 0.0F);
        d = mc.thePlayer.getPosition(f).yCoord - world.getSeaLevel();

        if (worldproviderbase.renderVoidFog() && d < 0.0D)
        {
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 12F, 0.0F);
            GL11.glCallList(glSkyList2);
            GL11.glPopMatrix();
            float f25 = 1.0F;
            float f26 = -(float)(d + 65D);
            float f27 = -f25;
            float f28 = f26;
            tessellator1.startDrawingQuads();
            tessellator1.setColorRGBA_I(0, 255);
            tessellator1.addVertex(-f25, f28, f25);
            tessellator1.addVertex(f25, f28, f25);
            tessellator1.addVertex(f25, f27, f25);
            tessellator1.addVertex(-f25, f27, f25);
            tessellator1.addVertex(-f25, f27, -f25);
            tessellator1.addVertex(f25, f27, -f25);
            tessellator1.addVertex(f25, f28, -f25);
            tessellator1.addVertex(-f25, f28, -f25);
            tessellator1.addVertex(f25, f27, -f25);
            tessellator1.addVertex(f25, f27, f25);
            tessellator1.addVertex(f25, f28, f25);
            tessellator1.addVertex(f25, f28, -f25);
            tessellator1.addVertex(-f25, f28, -f25);
            tessellator1.addVertex(-f25, f28, f25);
            tessellator1.addVertex(-f25, f27, f25);
            tessellator1.addVertex(-f25, f27, -f25);
            tessellator1.addVertex(-f25, f27, -f25);
            tessellator1.addVertex(-f25, f27, f25);
            tessellator1.addVertex(f25, f27, f25);
            tessellator1.addVertex(f25, f27, -f25);
            tessellator1.draw();
        }

        if (worldproviderbase.isSkyColored())
        {
            GL11.glColor3f(f1 * 0.2F + 0.04F, f2 * 0.2F + 0.04F, f3 * 0.6F + 0.1F);
        }
        else
        {
            GL11.glColor3f(f1, f2, f3);
        }

        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, -(float)(d - 16D), 0.0F);
        GL11.glCallList(glSkyList2);
        GL11.glPopMatrix();
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glDepthMask(true);
        worldproviderbase.renderCelestialObjects(f);
    }

    public void renderClouds(float f)
    {
        World world = mc.theWorld;

        if (!(world.worldProvider instanceof WorldProviderBase) || ((WorldProviderBase)world.worldProvider).renderClouds())
        {
            super.renderClouds(f);
        }
    }

    public void renderStars()
    {
        Random random = new Random(10842L);
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();

        for (int i = 0; i < 1500; i++)
        {
            double d = random.nextFloat() * 2.0F - 1.0F;
            double d1 = random.nextFloat() * 2.0F - 1.0F;
            double d2 = random.nextFloat() * 2.0F - 1.0F;
            double d3 = 0.25F + random.nextFloat() * 0.25F;
            double d4 = d * d + d1 * d1 + d2 * d2;

            if (d4 >= 1.0D || d4 <= 0.01D)
            {
                continue;
            }

            d4 = 1.0D / Math.sqrt(d4);
            d *= d4;
            d1 *= d4;
            d2 *= d4;
            double d5 = d * 100D;
            double d6 = d1 * 100D;
            double d7 = d2 * 100D;
            double d8 = Math.atan2(d, d2);
            double d9 = Math.sin(d8);
            double d10 = Math.cos(d8);
            double d11 = Math.atan2(Math.sqrt(d * d + d2 * d2), d1);
            double d12 = Math.sin(d11);
            double d13 = Math.cos(d11);
            double d14 = random.nextDouble() * Math.PI * 2D;
            double d15 = Math.sin(d14);
            double d16 = Math.cos(d14);

            for (int j = 0; j < 4; j++)
            {
                double d17 = 0.0D;
                double d18 = (double)((j & 2) - 1) * d3;
                double d19 = (double)((j + 1 & 2) - 1) * d3;
                double d20 = d17;
                double d21 = d18 * d16 - d19 * d15;
                double d22 = d19 * d16 + d18 * d15;
                double d23 = d22;
                double d24 = d21 * d12 + d20 * d13;
                double d25 = d20 * d12 - d21 * d13;
                double d26 = d25 * d9 - d23 * d10;
                double d27 = d24;
                double d28 = d23 * d9 + d25 * d10;
                tessellator.addVertex(d5 + d26, d6 + d27, d7 + d28);
            }
        }

        tessellator.draw();
    }
}
