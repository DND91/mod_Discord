package net.minecraft.src;

import java.util.Random;
import org.lwjgl.opengl.GL11;

public class TextureCustomPortalFX extends TextureFX
{
    private int portalTickCounter;
    private byte portalTextureData[][];
    public String textureOverride;

    public TextureCustomPortalFX(int i, float f, float f1, float f2, float f3)
    {
        this(i, f, f1, f2, f3, "/terrain.png");
    }

    public TextureCustomPortalFX(int i, float f, float f1, float f2, float f3, String s)
    {
        super(i);
        textureOverride = s;
        portalTickCounter = 0;
        portalTextureData = new byte[32][1024];
        Random random = new Random(100L);

        for (int j = 0; j < 32; j++)
        {
            for (int k = 0; k < 16; k++)
            {
                for (int l = 0; l < 16; l++)
                {
                    float f4 = 0.0F;

                    for (int i1 = 0; i1 < 2; i1++)
                    {
                        float f5 = (float)(i1 * 16) * 0.5F;
                        float f6 = (float)(i1 * 16) * 0.5F;
                        float f7 = (((float)k - f5) / 16F) * 2.0F;
                        float f8 = (((float)l - f6) / 16F) * 2.0F;

                        if (f7 < -1F)
                        {
                            f7 += 2.0F;
                        }

                        if (f7 >= 1.0F)
                        {
                            f7 -= 2.0F;
                        }

                        if (f8 < -1F)
                        {
                            f8 += 2.0F;
                        }

                        if (f8 >= 1.0F)
                        {
                            f8 -= 2.0F;
                        }

                        float f9 = f7 * f7 + f8 * f8;
                        float f10 = (float)Math.atan2(f8, f7) + ((((float)j / 32F) * (float)Math.PI * 2.0F - f9 * 10F) + (float)(i1 * 2)) * (float)(i1 * 2 - 1);
                        f10 = (MathHelper.sin(f10) + 1.0F) / 2.0F;
                        f10 /= f9 + 1.0F;
                        f4 += f10 * 0.5F;
                    }

                    f4 += random.nextFloat() * 0.1F;
                    int j1 = (int)(f4 * f2);
                    int k1 = (int)(f4 * f);
                    int l1 = (int)(f4 * f1);
                    int i2 = (int)(f4 * f3);
                    int j2 = l * 16 + k;
                    portalTextureData[j][j2 * 4 + 0] = (byte)k1;
                    portalTextureData[j][j2 * 4 + 1] = (byte)l1;
                    portalTextureData[j][j2 * 4 + 2] = (byte)j1;
                    portalTextureData[j][j2 * 4 + 3] = (byte)i2;
                }
            }
        }
    }

    public void onTick()
    {
        portalTickCounter++;
        byte abyte0[] = portalTextureData[portalTickCounter & 0x1f];

        for (int i = 0; i < 256; i++)
        {
            int j = abyte0[i * 4 + 0] & 0xff;
            int k = abyte0[i * 4 + 1] & 0xff;
            int l = abyte0[i * 4 + 2] & 0xff;
            int i1 = abyte0[i * 4 + 3] & 0xff;

            if (anaglyphEnabled)
            {
                int j1 = (j * 30 + k * 59 + l * 11) / 100;
                int k1 = (j * 30 + k * 70) / 100;
                int l1 = (j * 30 + l * 70) / 100;
                j = j1;
                k = k1;
                l = l1;
            }

            imageData[i * 4 + 0] = (byte)j;
            imageData[i * 4 + 1] = (byte)k;
            imageData[i * 4 + 2] = (byte)l;
            imageData[i * 4 + 3] = (byte)i1;
        }
    }

    public void bindImage(RenderEngine renderengine)
    {
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, renderengine.getTexture(textureOverride));
    }
}
