package net.minecraft.src;

import java.util.*;
import net.minecraft.client.Minecraft;

public class EntityPlayerSP extends EntityPlayer
{
    public MovementInput movementInput;
    protected Minecraft mc;

    /**
     * Used to tell if the player pressed forward twice. If this is at 0 and it's pressed (And they are allowed to
     * sprint, aka enough food on the ground etc) it sets this to 7. If it's pressed and it's greater than 0 enable
     * sprinting.
     */
    protected int sprintToggleTimer;

    /** Ticks left before sprinting is disabled. */
    public int sprintingTicksLeft;
    public float renderArmYaw;
    public float renderArmPitch;
    public float prevRenderArmYaw;
    public float prevRenderArmPitch;
    private MouseFilter field_21903_bJ;
    private MouseFilter field_21904_bK;
    private MouseFilter field_21902_bL;
    protected final PlayerAPI playerAPI = PlayerAPI.create(this);

    public EntityPlayerSP(Minecraft par1Minecraft, World par2World, Session par3Session, int par4)
    {
        super(par2World);
        PlayerAPI.beforeLocalConstructing(this, par1Minecraft, par2World, par3Session, par4);
        sprintToggleTimer = 0;
        sprintingTicksLeft = 0;
        field_21903_bJ = new MouseFilter();
        field_21904_bK = new MouseFilter();
        field_21902_bL = new MouseFilter();
        mc = par1Minecraft;
        dimension = par4;

        if (par3Session != null && par3Session.username != null && par3Session.username.length() > 0)
        {
            skinUrl = (new StringBuilder()).append("http://s3.amazonaws.com/MinecraftSkins/").append(par3Session.username).append(".png").toString();
        }

        username = par3Session.username;
        PlayerAPI.afterLocalConstructing(this, par1Minecraft, par2World, par3Session, par4);
    }

    public final PlayerBase getPlayerBase(String s)
    {
        if (playerAPI != null)
        {
            return playerAPI.getPlayerBase(s);
        }
        else
        {
            return null;
        }
    }

    public final Set getPlayerBaseIds(String s)
    {
        if (playerAPI != null)
        {
            return playerAPI.getPlayerBaseIds();
        }
        else
        {
            return Collections.emptySet();
        }
    }

    /**
     * increases exhaustion level by supplied amount
     */
    public void addExhaustion(float f)
    {
        if (playerAPI != null && playerAPI.isAddExhaustionModded)
        {
            PlayerAPI.addExhaustion(this, f);
        }
        else
        {
            super.addExhaustion(f);
        }
    }

    public final void superAddExhaustion(float f)
    {
        super.addExhaustion(f);
    }

    public final void localAddExhaustion(float f)
    {
        super.addExhaustion(f);
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource damagesource, int i)
    {
        boolean flag;

        if (playerAPI != null && playerAPI.isAttackEntityFromModded)
        {
            flag = PlayerAPI.attackEntityFrom(this, damagesource, i);
        }
        else
        {
            flag = super.attackEntityFrom(damagesource, i);
        }

        return flag;
    }

    public final boolean superAttackEntityFrom(DamageSource damagesource, int i)
    {
        return super.attackEntityFrom(damagesource, i);
    }

    public final boolean localAttackEntityFrom(DamageSource damagesource, int i)
    {
        return super.attackEntityFrom(damagesource, i);
    }

    /**
     * Attacks for the player the targeted entity with the currently equipped item.  The equipped item has hitEntity
     * called on it. Args: targetEntity
     */
    public void attackTargetEntityWithCurrentItem(Entity entity)
    {
        if (playerAPI != null && playerAPI.isAttackTargetEntityWithCurrentItemModded)
        {
            PlayerAPI.attackTargetEntityWithCurrentItem(this, entity);
        }
        else
        {
            super.attackTargetEntityWithCurrentItem(entity);
        }
    }

    public final void superAttackTargetEntityWithCurrentItem(Entity entity)
    {
        super.attackTargetEntityWithCurrentItem(entity);
    }

    public final void localAttackTargetEntityWithCurrentItem(Entity entity)
    {
        super.attackTargetEntityWithCurrentItem(entity);
    }

    public boolean canBreatheUnderwater()
    {
        boolean flag;

        if (playerAPI != null && playerAPI.isCanBreatheUnderwaterModded)
        {
            flag = PlayerAPI.canBreatheUnderwater(this);
        }
        else
        {
            flag = super.canBreatheUnderwater();
        }

        return flag;
    }

    public final boolean superCanBreatheUnderwater()
    {
        return super.canBreatheUnderwater();
    }

    public final boolean localCanBreatheUnderwater()
    {
        return super.canBreatheUnderwater();
    }

    /**
     * Checks if the player has the ability to harvest a block (checks current inventory item for a tool if necessary)
     */
    public boolean canHarvestBlock(Block block)
    {
        boolean flag;

        if (playerAPI != null && playerAPI.isCanHarvestBlockModded)
        {
            flag = PlayerAPI.canHarvestBlock(this, block);
        }
        else
        {
            flag = super.canHarvestBlock(block);
        }

        return flag;
    }

    public final boolean superCanHarvestBlock(Block block)
    {
        return super.canHarvestBlock(block);
    }

    public final boolean localCanHarvestBlock(Block block)
    {
        return super.canHarvestBlock(block);
    }

    public boolean canPlayerEdit(int i, int j, int k)
    {
        boolean flag;

        if (playerAPI != null && playerAPI.isCanPlayerEditModded)
        {
            flag = PlayerAPI.canPlayerEdit(this, i, j, k);
        }
        else
        {
            flag = super.canPlayerEdit(i, j, k);
        }

        return flag;
    }

    public final boolean superCanPlayerEdit(int i, int j, int k)
    {
        return super.canPlayerEdit(i, j, k);
    }

    public final boolean localCanPlayerEdit(int i, int j, int k)
    {
        return super.canPlayerEdit(i, j, k);
    }

    /**
     * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
     * prevent them from trampling crops
     */
    protected boolean canTriggerWalking()
    {
        boolean flag;

        if (playerAPI != null && playerAPI.isCanTriggerWalkingModded)
        {
            flag = PlayerAPI.canTriggerWalking(this);
        }
        else
        {
            flag = super.canTriggerWalking();
        }

        return flag;
    }

    public final boolean realCanTriggerWalking()
    {
        return canTriggerWalking();
    }

    public final boolean superCanTriggerWalking()
    {
        return super.canTriggerWalking();
    }

    public final boolean localCanTriggerWalking()
    {
        return super.canTriggerWalking();
    }

    /**
     * sets current screen to null (used on escape buttons of GUIs)
     */
    public void closeScreen()
    {
        if (playerAPI != null && playerAPI.isCloseScreenModded)
        {
            PlayerAPI.closeScreen(this);
        }
        else
        {
            localCloseScreen();
        }
    }

    public final void superCloseScreen()
    {
        super.closeScreen();
    }

    public final void localCloseScreen()
    {
        super.closeScreen();
        mc.displayGuiScreen((GuiScreen)null);
    }

    /**
     * Deals damage to the entity. If its a EntityPlayer then will take damage from the armor first and then health
     * second with the reduced value. Args: damageAmount
     */
    protected void damageEntity(DamageSource damagesource, int i)
    {
        if (playerAPI != null && playerAPI.isDamageEntityModded)
        {
            PlayerAPI.damageEntity(this, damagesource, i);
        }
        else
        {
            super.damageEntity(damagesource, i);
        }
    }

    public final void realDamageEntity(DamageSource damagesource, int i)
    {
        damageEntity(damagesource, i);
    }

    public final void superDamageEntity(DamageSource damagesource, int i)
    {
        super.damageEntity(damagesource, i);
    }

    public final void localDamageEntity(DamageSource damagesource, int i)
    {
        super.damageEntity(damagesource, i);
    }

    /**
     * Displays the GUI for interacting with a brewing stand.
     */
    public void displayGUIBrewingStand(TileEntityBrewingStand par1TileEntityBrewingStand)
    {
        if (playerAPI != null && playerAPI.isDisplayGUIBrewingStandModded)
        {
            PlayerAPI.displayGUIBrewingStand(this, par1TileEntityBrewingStand);
        }
        else
        {
            localDisplayGUIBrewingStand(par1TileEntityBrewingStand);
        }
    }

    public final void superDisplayGUIBrewingStand(TileEntityBrewingStand tileentitybrewingstand)
    {
        super.displayGUIBrewingStand(tileentitybrewingstand);
    }

    public final void localDisplayGUIBrewingStand(TileEntityBrewingStand tileentitybrewingstand)
    {
        mc.displayGuiScreen(new GuiBrewingStand(inventory, tileentitybrewingstand));
    }

    /**
     * Displays the GUI for interacting with a chest inventory. Args: chestInventory
     */
    public void displayGUIChest(IInventory par1IInventory)
    {
        if (playerAPI != null && playerAPI.isDisplayGUIChestModded)
        {
            PlayerAPI.displayGUIChest(this, par1IInventory);
        }
        else
        {
            localDisplayGUIChest(par1IInventory);
        }
    }

    public final void superDisplayGUIChest(IInventory iinventory)
    {
        super.displayGUIChest(iinventory);
    }

    public final void localDisplayGUIChest(IInventory iinventory)
    {
        mc.displayGuiScreen(new GuiChest(inventory, iinventory));
    }

    /**
     * Displays the dipsenser GUI for the passed in dispenser entity. Args: TileEntityDispenser
     */
    public void displayGUIDispenser(TileEntityDispenser par1TileEntityDispenser)
    {
        if (playerAPI != null && playerAPI.isDisplayGUIDispenserModded)
        {
            PlayerAPI.displayGUIDispenser(this, par1TileEntityDispenser);
        }
        else
        {
            localDisplayGUIDispenser(par1TileEntityDispenser);
        }
    }

    public final void superDisplayGUIDispenser(TileEntityDispenser tileentitydispenser)
    {
        super.displayGUIDispenser(tileentitydispenser);
    }

    public final void localDisplayGUIDispenser(TileEntityDispenser tileentitydispenser)
    {
        mc.displayGuiScreen(new GuiDispenser(inventory, tileentitydispenser));
    }

    /**
     * Displays the GUI for editing a sign. Args: tileEntitySign
     */
    public void displayGUIEditSign(TileEntitySign par1TileEntitySign)
    {
        if (playerAPI != null && playerAPI.isDisplayGUIEditSignModded)
        {
            PlayerAPI.displayGUIEditSign(this, par1TileEntitySign);
        }
        else
        {
            localDisplayGUIEditSign(par1TileEntitySign);
        }
    }

    public final void superDisplayGUIEditSign(TileEntitySign tileentitysign)
    {
        super.displayGUIEditSign(tileentitysign);
    }

    public final void localDisplayGUIEditSign(TileEntitySign tileentitysign)
    {
        mc.displayGuiScreen(new GuiEditSign(tileentitysign));
    }

    public void displayGUIEnchantment(int par1, int par2, int par3)
    {
        if (playerAPI != null && playerAPI.isDisplayGUIEnchantmentModded)
        {
            PlayerAPI.displayGUIEnchantment(this, par1, par2, par3);
        }
        else
        {
            localDisplayGUIEnchantment(par1, par2, par3);
        }
    }

    public final void superDisplayGUIEnchantment(int i, int j, int k)
    {
        super.displayGUIEnchantment(i, j, k);
    }

    public final void localDisplayGUIEnchantment(int i, int j, int k)
    {
        mc.displayGuiScreen(new GuiEnchantment(inventory, worldObj, i, j, k));
    }

    /**
     * Displays the furnace GUI for the passed in furnace entity. Args: tileEntityFurnace
     */
    public void displayGUIFurnace(TileEntityFurnace par1TileEntityFurnace)
    {
        if (playerAPI != null && playerAPI.isDisplayGUIFurnaceModded)
        {
            PlayerAPI.displayGUIFurnace(this, par1TileEntityFurnace);
        }
        else
        {
            localDisplayGUIFurnace(par1TileEntityFurnace);
        }
    }

    public final void superDisplayGUIFurnace(TileEntityFurnace tileentityfurnace)
    {
        super.displayGUIFurnace(tileentityfurnace);
    }

    public final void localDisplayGUIFurnace(TileEntityFurnace tileentityfurnace)
    {
        mc.displayGuiScreen(new GuiFurnace(inventory, tileentityfurnace));
    }

    /**
     * Displays the crafting GUI for a workbench.
     */
    public void displayWorkbenchGUI(int par1, int par2, int par3)
    {
        if (playerAPI != null && playerAPI.isDisplayWorkbenchGUIModded)
        {
            PlayerAPI.displayWorkbenchGUI(this, par1, par2, par3);
        }
        else
        {
            localDisplayWorkbenchGUI(par1, par2, par3);
        }
    }

    public final void superDisplayWorkbenchGUI(int i, int j, int k)
    {
        super.displayWorkbenchGUI(i, j, k);
    }

    public final void localDisplayWorkbenchGUI(int i, int j, int k)
    {
        mc.displayGuiScreen(new GuiCrafting(inventory, worldObj, i, j, k));
    }

    /**
     * Called when player presses the drop item key
     */
    public EntityItem dropOneItem()
    {
        EntityItem entityitem;

        if (playerAPI != null && playerAPI.isDropOneItemModded)
        {
            entityitem = PlayerAPI.dropOneItem(this);
        }
        else
        {
            entityitem = super.dropOneItem();
        }

        return entityitem;
    }

    public final EntityItem superDropOneItem()
    {
        return super.dropOneItem();
    }

    public final EntityItem localDropOneItem()
    {
        return super.dropOneItem();
    }

    /**
     * Args: itemstack - called when player drops an item stack that's not in his inventory (like items still placed in
     * a workbench while the workbench'es GUI gets closed)
     */
    public EntityItem dropPlayerItem(ItemStack itemstack)
    {
        EntityItem entityitem;

        if (playerAPI != null && playerAPI.isDropPlayerItemModded)
        {
            entityitem = PlayerAPI.dropPlayerItem(this, itemstack);
        }
        else
        {
            entityitem = super.dropPlayerItem(itemstack);
        }

        return entityitem;
    }

    public final EntityItem superDropPlayerItem(ItemStack itemstack)
    {
        return super.dropPlayerItem(itemstack);
    }

    public final EntityItem localDropPlayerItem(ItemStack itemstack)
    {
        return super.dropPlayerItem(itemstack);
    }

    /**
     * Args: itemstack, flag
     */
    public EntityItem dropPlayerItemWithRandomChoice(ItemStack itemstack, boolean flag)
    {
        EntityItem entityitem;

        if (playerAPI != null && playerAPI.isDropPlayerItemWithRandomChoiceModded)
        {
            entityitem = PlayerAPI.dropPlayerItemWithRandomChoice(this, itemstack, flag);
        }
        else
        {
            entityitem = super.dropPlayerItemWithRandomChoice(itemstack, flag);
        }

        return entityitem;
    }

    public final EntityItem superDropPlayerItemWithRandomChoice(ItemStack itemstack, boolean flag)
    {
        return super.dropPlayerItemWithRandomChoice(itemstack, flag);
    }

    public final EntityItem localDropPlayerItemWithRandomChoice(ItemStack itemstack, boolean flag)
    {
        return super.dropPlayerItemWithRandomChoice(itemstack, flag);
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float f)
    {
        if (playerAPI != null && playerAPI.isFallModded)
        {
            PlayerAPI.fall(this, f);
        }
        else
        {
            super.fall(f);
        }
    }

    public final void realFall(float f)
    {
        fall(f);
    }

    public final void superFall(float f)
    {
        super.fall(f);
    }

    public final void localFall(float f)
    {
        super.fall(f);
    }

    /**
     * Gets how bright this entity is.
     */
    public float getBrightness(float f)
    {
        float f1;

        if (playerAPI != null && playerAPI.isGetBrightnessModded)
        {
            f1 = PlayerAPI.getBrightness(this, f);
        }
        else
        {
            f1 = super.getBrightness(f);
        }

        return f1;
    }

    public final float superGetBrightness(float f)
    {
        return super.getBrightness(f);
    }

    public final float localGetBrightness(float f)
    {
        return super.getBrightness(f);
    }

    public int getBrightnessForRender(float f)
    {
        int i;

        if (playerAPI != null && playerAPI.isGetBrightnessForRenderModded)
        {
            i = PlayerAPI.getBrightnessForRender(this, f);
        }
        else
        {
            i = super.getBrightnessForRender(f);
        }

        return i;
    }

    public final int superGetBrightnessForRender(float f)
    {
        return super.getBrightnessForRender(f);
    }

    public final int localGetBrightnessForRender(float f)
    {
        return super.getBrightnessForRender(f);
    }

    /**
     * Returns how strong the player is against the specified block at this moment
     */
    public float getCurrentPlayerStrVsBlock(Block block)
    {
        float f;

        if (playerAPI != null && playerAPI.isGetCurrentPlayerStrVsBlockModded)
        {
            f = PlayerAPI.getCurrentPlayerStrVsBlock(this, block);
        }
        else
        {
            f = super.getCurrentPlayerStrVsBlock(block);
        }

        return f;
    }

    public final float superGetCurrentPlayerStrVsBlock(Block block)
    {
        return super.getCurrentPlayerStrVsBlock(block);
    }

    public final float localGetCurrentPlayerStrVsBlock(Block block)
    {
        return super.getCurrentPlayerStrVsBlock(block);
    }

    /**
     * Gets the squared distance to the position. Args: x, y, z
     */
    public double getDistanceSq(double d, double d1, double d2)
    {
        double d3;

        if (playerAPI != null && playerAPI.isGetDistanceSqModded)
        {
            d3 = PlayerAPI.getDistanceSq(this, d, d1, d2);
        }
        else
        {
            d3 = super.getDistanceSq(d, d1, d2);
        }

        return d3;
    }

    public final double superGetDistanceSq(double d, double d1, double d2)
    {
        return super.getDistanceSq(d, d1, d2);
    }

    public final double localGetDistanceSq(double d, double d1, double d2)
    {
        return super.getDistanceSq(d, d1, d2);
    }

    /**
     * Returns the squared distance to the entity. Args: entity
     */
    public double getDistanceSqToEntity(Entity entity)
    {
        double d;

        if (playerAPI != null && playerAPI.isGetDistanceSqToEntityModded)
        {
            d = PlayerAPI.getDistanceSqToEntity(this, entity);
        }
        else
        {
            d = super.getDistanceSqToEntity(entity);
        }

        return d;
    }

    public final double superGetDistanceSqToEntity(Entity entity)
    {
        return super.getDistanceSqToEntity(entity);
    }

    public final double localGetDistanceSqToEntity(Entity entity)
    {
        return super.getDistanceSqToEntity(entity);
    }

    /**
     * Gets the player's field of view multiplier. (ex. when flying)
     */
    public float getFOVMultiplier()
    {
        float f;

        if (playerAPI != null && playerAPI.isGetFOVMultiplierModded)
        {
            f = PlayerAPI.getFOVMultiplier(this);
        }
        else
        {
            f = localGetFOVMultiplier();
        }

        return f;
    }

    public final float localGetFOVMultiplier()
    {
        float f = 1.0F;

        if (capabilities.isFlying)
        {
            f *= 1.1F;
        }

        f *= ((landMovementFactor * getSpeedModifier()) / speedOnGround + 1.0F) / 2.0F;

        if (isUsingItem() && getItemInUse().itemID == Item.bow.shiftedIndex)
        {
            int i = getItemInUseDuration();
            float f1 = (float)i / 20F;

            if (f1 > 1.0F)
            {
                f1 = 1.0F;
            }
            else
            {
                f1 *= f1;
            }

            f *= 1.0F - f1 * 0.15F;
        }

        return f;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        String s;

        if (playerAPI != null && playerAPI.isGetHurtSoundModded)
        {
            s = PlayerAPI.getHurtSound(this);
        }
        else
        {
            s = super.getHurtSound();
        }

        return s;
    }

    public final String realGetHurtSound()
    {
        return getHurtSound();
    }

    public final String superGetHurtSound()
    {
        return super.getHurtSound();
    }

    public final String localGetHurtSound()
    {
        return super.getHurtSound();
    }

    /**
     * Gets the Icon Index of the item currently held
     */
    public int getItemIcon(ItemStack itemstack, int i)
    {
        int j;

        if (playerAPI != null && playerAPI.isGetItemIconModded)
        {
            j = PlayerAPI.getItemIcon(this, itemstack, i);
        }
        else
        {
            j = super.getItemIcon(itemstack, i);
        }

        return j;
    }

    public final int superGetItemIcon(ItemStack itemstack, int i)
    {
        return super.getItemIcon(itemstack, i);
    }

    public final int localGetItemIcon(ItemStack itemstack, int i)
    {
        return super.getItemIcon(itemstack, i);
    }

    public int getSleepTimer()
    {
        int i;

        if (playerAPI != null && playerAPI.isGetSleepTimerModded)
        {
            i = PlayerAPI.getSleepTimer(this);
        }
        else
        {
            i = super.getSleepTimer();
        }

        return i;
    }

    public final int superGetSleepTimer()
    {
        return super.getSleepTimer();
    }

    public final int localGetSleepTimer()
    {
        return super.getSleepTimer();
    }

    /**
     * This method returns a value to be applied directly to entity speed, this factor is less than 1 when a slowdown
     * potion effect is applied, more than 1 when a haste potion effect is applied and 2 for fleeing entities.
     */
    protected float getSpeedModifier()
    {
        float f;

        if (playerAPI != null && playerAPI.isGetSpeedModifierModded)
        {
            f = PlayerAPI.getSpeedModifier(this);
        }
        else
        {
            f = super.getSpeedModifier();
        }

        return f;
    }

    public final float realGetSpeedModifier()
    {
        return getSpeedModifier();
    }

    public final float superGetSpeedModifier()
    {
        return super.getSpeedModifier();
    }

    public final float localGetSpeedModifier()
    {
        return super.getSpeedModifier();
    }

    /**
     * Whether or not the current entity is in lava
     */
    public boolean handleLavaMovement()
    {
        boolean flag;

        if (playerAPI != null && playerAPI.isHandleLavaMovementModded)
        {
            flag = PlayerAPI.handleLavaMovement(this);
        }
        else
        {
            flag = super.handleLavaMovement();
        }

        return flag;
    }

    public final boolean superHandleLavaMovement()
    {
        return super.handleLavaMovement();
    }

    public final boolean localHandleLavaMovement()
    {
        return super.handleLavaMovement();
    }

    /**
     * Returns if this entity is in water and will end up adding the waters velocity to the entity
     */
    public boolean handleWaterMovement()
    {
        boolean flag;

        if (playerAPI != null && playerAPI.isHandleWaterMovementModded)
        {
            flag = PlayerAPI.handleWaterMovement(this);
        }
        else
        {
            flag = super.handleWaterMovement();
        }

        return flag;
    }

    public final boolean superHandleWaterMovement()
    {
        return super.handleWaterMovement();
    }

    public final boolean localHandleWaterMovement()
    {
        return super.handleWaterMovement();
    }

    /**
     * Heal living entity (param: amount of half-hearts)
     */
    public void heal(int i)
    {
        if (playerAPI != null && playerAPI.isHealModded)
        {
            PlayerAPI.heal(this, i);
        }
        else
        {
            super.heal(i);
        }
    }

    public final void superHeal(int i)
    {
        super.heal(i);
    }

    public final void localHeal(int i)
    {
        super.heal(i);
    }

    /**
     * Checks if this entity is inside of an opaque block
     */
    public boolean isEntityInsideOpaqueBlock()
    {
        boolean flag;

        if (playerAPI != null && playerAPI.isIsEntityInsideOpaqueBlockModded)
        {
            flag = PlayerAPI.isEntityInsideOpaqueBlock(this);
        }
        else
        {
            flag = super.isEntityInsideOpaqueBlock();
        }

        return flag;
    }

    public final boolean superIsEntityInsideOpaqueBlock()
    {
        return super.isEntityInsideOpaqueBlock();
    }

    public final boolean localIsEntityInsideOpaqueBlock()
    {
        return super.isEntityInsideOpaqueBlock();
    }

    /**
     * Checks if this entity is inside water (if inWater field is true as a result of handleWaterMovement() returning
     * true)
     */
    public boolean isInWater()
    {
        boolean flag;

        if (playerAPI != null && playerAPI.isIsInWaterModded)
        {
            flag = PlayerAPI.isInWater(this);
        }
        else
        {
            flag = super.isInWater();
        }

        return flag;
    }

    public final boolean superIsInWater()
    {
        return super.isInWater();
    }

    public final boolean localIsInWater()
    {
        return super.isInWater();
    }

    /**
     * Checks if the current block the entity is within of the specified material type
     */
    public boolean isInsideOfMaterial(Material material)
    {
        boolean flag;

        if (playerAPI != null && playerAPI.isIsInsideOfMaterialModded)
        {
            flag = PlayerAPI.isInsideOfMaterial(this, material);
        }
        else
        {
            flag = super.isInsideOfMaterial(material);
        }

        return flag;
    }

    public final boolean superIsInsideOfMaterial(Material material)
    {
        return super.isInsideOfMaterial(material);
    }

    public final boolean localIsInsideOfMaterial(Material material)
    {
        return super.isInsideOfMaterial(material);
    }

    /**
     * returns true if this entity is by a ladder, false otherwise
     */
    public boolean isOnLadder()
    {
        boolean flag;

        if (playerAPI != null && playerAPI.isIsOnLadderModded)
        {
            flag = PlayerAPI.isOnLadder(this);
        }
        else
        {
            flag = super.isOnLadder();
        }

        return flag;
    }

    public final boolean superIsOnLadder()
    {
        return super.isOnLadder();
    }

    public final boolean localIsOnLadder()
    {
        return super.isOnLadder();
    }

    /**
     * Returns if this entity is sneaking.
     */
    public boolean isSneaking()
    {
        boolean flag;

        if (playerAPI != null && playerAPI.isIsSneakingModded)
        {
            flag = PlayerAPI.isSneaking(this);
        }
        else
        {
            flag = localIsSneaking();
        }

        return flag;
    }

    public final boolean superIsSneaking()
    {
        return super.isSneaking();
    }

    public final boolean localIsSneaking()
    {
        return movementInput.sneak && !sleeping;
    }

    /**
     * Get if the Entity is sprinting.
     */
    public boolean isSprinting()
    {
        boolean flag;

        if (playerAPI != null && playerAPI.isIsSprintingModded)
        {
            flag = PlayerAPI.isSprinting(this);
        }
        else
        {
            flag = super.isSprinting();
        }

        return flag;
    }

    public final boolean superIsSprinting()
    {
        return super.isSprinting();
    }

    public final boolean localIsSprinting()
    {
        return super.isSprinting();
    }

    /**
     * Causes this entity to do an upwards motion (jumping).
     */
    protected void jump()
    {
        if (playerAPI != null && playerAPI.isJumpModded)
        {
            PlayerAPI.jump(this);
        }
        else
        {
            super.jump();
        }
    }

    public final void realJump()
    {
        jump();
    }

    public final void superJump()
    {
        super.jump();
    }

    public final void localJump()
    {
        super.jump();
    }

    /**
     * knocks back this entity
     */
    public void knockBack(Entity entity, int i, double d, double d1)
    {
        if (playerAPI != null && playerAPI.isKnockBackModded)
        {
            PlayerAPI.knockBack(this, entity, i, d, d1);
        }
        else
        {
            super.knockBack(entity, i, d, d1);
        }
    }

    public final void superKnockBack(Entity entity, int i, double d, double d1)
    {
        super.knockBack(entity, i, d, d1);
    }

    public final void localKnockBack(Entity entity, int i, double d, double d1)
    {
        super.knockBack(entity, i, d, d1);
    }

    /**
     * Tries to moves the entity by the passed in displacement. Args: x, y, z
     */
    public void moveEntity(double par1, double par3, double par5)
    {
        if (playerAPI != null && playerAPI.isMoveEntityModded)
        {
            PlayerAPI.moveEntity(this, par1, par3, par5);
        }
        else
        {
            localMoveEntity(par1, par3, par5);
        }
    }

    public final void superMoveEntity(double d, double d1, double d2)
    {
        super.moveEntity(d, d1, d2);
    }

    public final void localMoveEntity(double d, double d1, double d2)
    {
        super.moveEntity(d, d1, d2);
    }

    /**
     * Moves the entity based on the specified heading.  Args: strafe, forward
     */
    public void moveEntityWithHeading(float f, float f1)
    {
        if (playerAPI != null && playerAPI.isMoveEntityWithHeadingModded)
        {
            PlayerAPI.moveEntityWithHeading(this, f, f1);
        }
        else
        {
            super.moveEntityWithHeading(f, f1);
        }
    }

    public final void superMoveEntityWithHeading(float f, float f1)
    {
        super.moveEntityWithHeading(f, f1);
    }

    public final void localMoveEntityWithHeading(float f, float f1)
    {
        super.moveEntityWithHeading(f, f1);
    }

    /**
     * Used in both water and by flying objects
     */
    public void moveFlying(float f, float f1, float f2)
    {
        if (playerAPI != null && playerAPI.isMoveFlyingModded)
        {
            PlayerAPI.moveFlying(this, f, f1, f2);
        }
        else
        {
            super.moveFlying(f, f1, f2);
        }
    }

    public final void superMoveFlying(float f, float f1, float f2)
    {
        super.moveFlying(f, f1, f2);
    }

    public final void localMoveFlying(float f, float f1, float f2)
    {
        super.moveFlying(f, f1, f2);
    }

    /**
     * Called when the mob's health reaches 0.
     */
    public void onDeath(DamageSource damagesource)
    {
        if (playerAPI != null && playerAPI.isOnDeathModded)
        {
            PlayerAPI.onDeath(this, damagesource);
        }
        else
        {
            super.onDeath(damagesource);
        }
    }

    public final void superOnDeath(DamageSource damagesource)
    {
        super.onDeath(damagesource);
    }

    public final void localOnDeath(DamageSource damagesource)
    {
        super.onDeath(damagesource);
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        if (playerAPI != null && playerAPI.isOnLivingUpdateModded)
        {
            PlayerAPI.onLivingUpdate(this);
        }
        else
        {
            localOnLivingUpdate();
        }
    }

    public final void superOnLivingUpdate()
    {
        super.onLivingUpdate();
    }

    public final void localOnLivingUpdate()
    {
        if (sprintingTicksLeft > 0)
        {
            sprintingTicksLeft--;

            if (sprintingTicksLeft == 0)
            {
                setSprinting(false);
            }
        }

        if (sprintToggleTimer > 0)
        {
            sprintToggleTimer--;
        }

        if (mc.playerController.func_35643_e())
        {
            posX = posZ = 0.5D;
            posX = 0.0D;
            posZ = 0.0D;
            rotationYaw = (float)ticksExisted / 12F;
            rotationPitch = 10F;
            posY = 68.5D;
            return;
        }

        if (!mc.statFileWriter.hasAchievementUnlocked(AchievementList.openInventory))
        {
            mc.guiAchievement.queueAchievementInformation(AchievementList.openInventory);
        }

        prevTimeInPortal = timeInPortal;

        if (inPortal)
        {
            if (!worldObj.isRemote && ridingEntity != null)
            {
                mountEntity(null);
            }

            if (mc.currentScreen != null)
            {
                mc.displayGuiScreen((GuiScreen)null);
            }

            if (timeInPortal == 0.0F)
            {
                mc.sndManager.playSoundFX("portal.trigger", 1.0F, rand.nextFloat() * 0.4F + 0.8F);
            }

            timeInPortal += 0.0125F;

            if (timeInPortal >= 1.0F)
            {
                timeInPortal = 1.0F;

                if (!worldObj.isRemote)
                {
                    timeUntilPortal = 10;
                    mc.sndManager.playSoundFX("portal.travel", 1.0F, rand.nextFloat() * 0.4F + 0.8F);
                    byte byte0 = 0;

                    if (dimension == -1)
                    {
                        byte0 = 0;
                    }
                    else
                    {
                        byte0 = -1;
                    }

                    mc.usePortal(byte0);
                    triggerAchievement(AchievementList.portal);
                }
            }

            inPortal = false;
        }
        else if (isPotionActive(Potion.confusion) && getActivePotionEffect(Potion.confusion).getDuration() > 60)
        {
            timeInPortal += 0.006666667F;

            if (timeInPortal > 1.0F)
            {
                timeInPortal = 1.0F;
            }
        }
        else
        {
            if (timeInPortal > 0.0F)
            {
                timeInPortal -= 0.05F;
            }

            if (timeInPortal < 0.0F)
            {
                timeInPortal = 0.0F;
            }
        }

        if (timeUntilPortal > 0)
        {
            timeUntilPortal--;
        }

        boolean flag = movementInput.jump;
        float f = 0.8F;
        boolean flag1 = movementInput.moveForward >= f;
        movementInput.updatePlayerMoveState();

        if (isUsingItem())
        {
            movementInput.moveStrafe *= 0.2F;
            movementInput.moveForward *= 0.2F;
            sprintToggleTimer = 0;
        }

        if (movementInput.sneak && ySize < 0.2F)
        {
            ySize = 0.2F;
        }

        pushOutOfBlocks(posX - (double)width * 0.34999999999999998D, boundingBox.minY + 0.5D, posZ + (double)width * 0.34999999999999998D);
        pushOutOfBlocks(posX - (double)width * 0.34999999999999998D, boundingBox.minY + 0.5D, posZ - (double)width * 0.34999999999999998D);
        pushOutOfBlocks(posX + (double)width * 0.34999999999999998D, boundingBox.minY + 0.5D, posZ - (double)width * 0.34999999999999998D);
        pushOutOfBlocks(posX + (double)width * 0.34999999999999998D, boundingBox.minY + 0.5D, posZ + (double)width * 0.34999999999999998D);
        boolean flag2 = (float)getFoodStats().getFoodLevel() > 6F;

        if (onGround && !flag1 && movementInput.moveForward >= f && !isSprinting() && flag2 && !isUsingItem() && !isPotionActive(Potion.blindness))
        {
            if (sprintToggleTimer == 0)
            {
                sprintToggleTimer = 7;
            }
            else
            {
                setSprinting(true);
                sprintToggleTimer = 0;
            }
        }

        if (isSneaking())
        {
            sprintToggleTimer = 0;
        }

        if (isSprinting() && (movementInput.moveForward < f || isCollidedHorizontally || !flag2))
        {
            setSprinting(false);
        }

        if (capabilities.allowFlying && !flag && movementInput.jump)
        {
            if (flyToggleTimer == 0)
            {
                flyToggleTimer = 7;
            }
            else
            {
                capabilities.isFlying = !capabilities.isFlying;
                func_50009_aI();
                flyToggleTimer = 0;
            }
        }

        if (capabilities.isFlying)
        {
            if (movementInput.sneak)
            {
                motionY -= 0.14999999999999999D;
            }

            if (movementInput.jump)
            {
                motionY += 0.14999999999999999D;
            }
        }

        super.onLivingUpdate();

        if (onGround && capabilities.isFlying)
        {
            capabilities.isFlying = false;
            func_50009_aI();
        }
    }

    /**
     * This method gets called when the entity kills another one.
     */
    public void onKillEntity(EntityLiving entityliving)
    {
        if (playerAPI != null && playerAPI.isOnKillEntityModded)
        {
            PlayerAPI.onKillEntity(this, entityliving);
        }
        else
        {
            super.onKillEntity(entityliving);
        }
    }

    public final void superOnKillEntity(EntityLiving entityliving)
    {
        super.onKillEntity(entityliving);
    }

    public final void localOnKillEntity(EntityLiving entityliving)
    {
        super.onKillEntity(entityliving);
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        if (playerAPI != null && playerAPI.isOnUpdateModded)
        {
            PlayerAPI.onUpdate(this);
        }
        else
        {
            super.onUpdate();
        }
    }

    public final void superOnUpdate()
    {
        super.onUpdate();
    }

    public final void localOnUpdate()
    {
        super.onUpdate();
    }

    /**
     * Adds velocity to push the entity out of blocks at the specified x, y, z position Args: x, y, z
     */
    protected boolean pushOutOfBlocks(double par1, double par3, double par5)
    {
        boolean flag;

        if (playerAPI != null && playerAPI.isPushOutOfBlocksModded)
        {
            flag = PlayerAPI.pushOutOfBlocks(this, par1, par3, par5);
        }
        else
        {
            flag = localPushOutOfBlocks(par1, par3, par5);
        }

        return flag;
    }

    public final boolean realPushOutOfBlocks(double d, double d1, double d2)
    {
        return pushOutOfBlocks(d, d1, d2);
    }

    public final boolean superPushOutOfBlocks(double d, double d1, double d2)
    {
        return super.pushOutOfBlocks(d, d1, d2);
    }

    public final boolean localPushOutOfBlocks(double d, double d1, double d2)
    {
        int i = MathHelper.floor_double(d);
        int j = MathHelper.floor_double(d1);
        int k = MathHelper.floor_double(d2);
        double d3 = d - (double)i;
        double d4 = d2 - (double)k;

        if (isBlockTranslucent(i, j, k) || isBlockTranslucent(i, j + 1, k))
        {
            boolean flag = !isBlockTranslucent(i - 1, j, k) && !isBlockTranslucent(i - 1, j + 1, k);
            boolean flag1 = !isBlockTranslucent(i + 1, j, k) && !isBlockTranslucent(i + 1, j + 1, k);
            boolean flag2 = !isBlockTranslucent(i, j, k - 1) && !isBlockTranslucent(i, j + 1, k - 1);
            boolean flag3 = !isBlockTranslucent(i, j, k + 1) && !isBlockTranslucent(i, j + 1, k + 1);
            byte byte0 = -1;
            double d5 = 9999D;

            if (flag && d3 < d5)
            {
                d5 = d3;
                byte0 = 0;
            }

            if (flag1 && 1.0D - d3 < d5)
            {
                d5 = 1.0D - d3;
                byte0 = 1;
            }

            if (flag2 && d4 < d5)
            {
                d5 = d4;
                byte0 = 4;
            }

            if (flag3 && 1.0D - d4 < d5)
            {
                double d6 = 1.0D - d4;
                byte0 = 5;
            }

            float f = 0.1F;

            if (byte0 == 0)
            {
                motionX = -f;
            }

            if (byte0 == 1)
            {
                motionX = f;
            }

            if (byte0 == 4)
            {
                motionZ = -f;
            }

            if (byte0 == 5)
            {
                motionZ = f;
            }
        }

        return false;
    }

    /**
     * Performs a ray trace for the distance specified and using the partial tick time. Args: distance, partialTickTime
     */
    public MovingObjectPosition rayTrace(double d, float f)
    {
        MovingObjectPosition movingobjectposition;

        if (playerAPI != null && playerAPI.isRayTraceModded)
        {
            movingobjectposition = PlayerAPI.rayTrace(this, d, f);
        }
        else
        {
            movingobjectposition = super.rayTrace(d, f);
        }

        return movingobjectposition;
    }

    public final MovingObjectPosition superRayTrace(double d, float f)
    {
        return super.rayTrace(d, f);
    }

    public final MovingObjectPosition localRayTrace(double d, float f)
    {
        return super.rayTrace(d, f);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        if (playerAPI != null && playerAPI.isReadEntityFromNBTModded)
        {
            PlayerAPI.readEntityFromNBT(this, par1NBTTagCompound);
        }
        else
        {
            localReadEntityFromNBT(par1NBTTagCompound);
        }
    }

    public final void superReadEntityFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readEntityFromNBT(nbttagcompound);
    }

    public final void localReadEntityFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readEntityFromNBT(nbttagcompound);
        score = nbttagcompound.getInteger("Score");
    }

    public void respawnPlayer()
    {
        if (playerAPI != null && playerAPI.isRespawnPlayerModded)
        {
            PlayerAPI.respawnPlayer(this);
        }
        else
        {
            localRespawnPlayer();
        }
    }

    public final void superRespawnPlayer()
    {
        super.respawnPlayer();
    }

    public final void localRespawnPlayer()
    {
        mc.respawn(false, 0, false);
    }

    /**
     * Sends a chat message from the player. Args: chatMessage
     */
    public void sendChatMessage(String par1Str)
    {
        if (playerAPI != null && playerAPI.isSendChatMessageModded)
        {
            PlayerAPI.sendChatMessage(this, par1Str);
        }
        else
        {
            localSendChatMessage(par1Str);
        }
    }

    public final void localSendChatMessage(String s)
    {
    }

    /**
     * Will get destroyed next tick.
     */
    public void setDead()
    {
        if (playerAPI != null && playerAPI.isSetDeadModded)
        {
            PlayerAPI.setDead(this);
        }
        else
        {
            super.setDead();
        }
    }

    public final void superSetDead()
    {
        super.setDead();
    }

    public final void localSetDead()
    {
        super.setDead();
    }

    /**
     * Sets the entity's position and rotation. Args: posX, posY, posZ, yaw, pitch
     */
    public void setPositionAndRotation(double d, double d1, double d2, float f, float f1)
    {
        if (playerAPI != null && playerAPI.isSetPositionAndRotationModded)
        {
            PlayerAPI.setPositionAndRotation(this, d, d1, d2, f, f1);
        }
        else
        {
            super.setPositionAndRotation(d, d1, d2, f, f1);
        }
    }

    public final void superSetPositionAndRotation(double d, double d1, double d2, float f, float f1)
    {
        super.setPositionAndRotation(d, d1, d2, f, f1);
    }

    public final void localSetPositionAndRotation(double d, double d1, double d2, float f, float f1)
    {
        super.setPositionAndRotation(d, d1, d2, f, f1);
    }

    /**
     * Attempts to have the player sleep in a bed at the specified location.
     */
    public EnumStatus sleepInBedAt(int i, int j, int k)
    {
        EnumStatus enumstatus;

        if (playerAPI != null && playerAPI.isSleepInBedAtModded)
        {
            enumstatus = PlayerAPI.sleepInBedAt(this, i, j, k);
        }
        else
        {
            enumstatus = super.sleepInBedAt(i, j, k);
        }

        return enumstatus;
    }

    public final EnumStatus superSleepInBedAt(int i, int j, int k)
    {
        return super.sleepInBedAt(i, j, k);
    }

    public final EnumStatus localSleepInBedAt(int i, int j, int k)
    {
        return super.sleepInBedAt(i, j, k);
    }

    /**
     * Swings the item the player is holding.
     */
    public void swingItem()
    {
        if (playerAPI != null && playerAPI.isSwingItemModded)
        {
            PlayerAPI.swingItem(this);
        }
        else
        {
            super.swingItem();
        }
    }

    public final void superSwingItem()
    {
        super.swingItem();
    }

    public final void localSwingItem()
    {
        super.swingItem();
    }

    public void updateEntityActionState()
    {
        if (playerAPI != null && playerAPI.isUpdateEntityActionStateModded)
        {
            PlayerAPI.updateEntityActionState(this);
        }
        else
        {
            localUpdateEntityActionState();
        }
    }

    public final void superUpdateEntityActionState()
    {
        super.updateEntityActionState();
    }

    public final void localUpdateEntityActionState()
    {
        super.updateEntityActionState();
        moveStrafing = movementInput.moveStrafe;
        moveForward = movementInput.moveForward;
        isJumping = movementInput.jump;
        prevRenderArmYaw = renderArmYaw;
        prevRenderArmPitch = renderArmPitch;
        renderArmPitch = (float)((double)renderArmPitch + (double)(rotationPitch - renderArmPitch) * 0.5D);
        renderArmYaw = (float)((double)renderArmYaw + (double)(rotationYaw - renderArmYaw) * 0.5D);
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        if (playerAPI != null && playerAPI.isWriteEntityToNBTModded)
        {
            PlayerAPI.writeEntityToNBT(this, par1NBTTagCompound);
        }
        else
        {
            localWriteEntityToNBT(par1NBTTagCompound);
        }
    }

    public final void superWriteEntityToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeEntityToNBT(nbttagcompound);
    }

    public final void localWriteEntityToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeEntityToNBT(nbttagcompound);
        nbttagcompound.setInteger("Score", score);
    }

    /**
     * Add a chat message to the player
     */
    public void addChatMessage(String par1Str)
    {
        mc.ingameGUI.addChatMessageTranslate(par1Str);
    }

    public final void superAddChatMessage(String s)
    {
        super.addChatMessage(s);
    }

    public final boolean superAddEntityID(NBTTagCompound nbttagcompound)
    {
        return super.addEntityID(nbttagcompound);
    }

    public final void superAddExperience(int i)
    {
        super.addExperience(i);
    }

    public final void superAddMovementStat(double d, double d1, double d2)
    {
        super.addMovementStat(d, d1, d2);
    }

    public final void superAddPotionEffect(PotionEffect potioneffect)
    {
        super.addPotionEffect(potioneffect);
    }

    /**
     * Adds a value to a statistic field.
     */
    public void addStat(StatBase par1StatBase, int par2)
    {
        if (par1StatBase == null)
        {
            return;
        }

        if (par1StatBase.isAchievement())
        {
            Achievement achievement = (Achievement)par1StatBase;

            if (achievement.parentAchievement == null || mc.statFileWriter.hasAchievementUnlocked(achievement.parentAchievement))
            {
                if (!mc.statFileWriter.hasAchievementUnlocked(achievement))
                {
                    mc.guiAchievement.queueTakenAchievement(achievement);
                }

                mc.statFileWriter.readStat(par1StatBase, par2);
            }
        }
        else
        {
            mc.statFileWriter.readStat(par1StatBase, par2);
        }
    }

    public final void superAddStat(StatBase statbase, int i)
    {
        super.addStat(statbase, i);
    }

    public final void superAddToPlayerScore(Entity entity, int i)
    {
        super.addToPlayerScore(entity, i);
    }

    public final void superAddVelocity(double d, double d1, double d2)
    {
        super.addVelocity(d, d1, d2);
    }

    public final void realAlertWolves(EntityLiving entityliving, boolean flag)
    {
        alertWolves(entityliving, flag);
    }

    public final void superAlertWolves(EntityLiving entityliving, boolean flag)
    {
        super.alertWolves(entityliving, flag);
    }

    public final int realApplyArmorCalculations(DamageSource damagesource, int i)
    {
        return applyArmorCalculations(damagesource, i);
    }

    public final int superApplyArmorCalculations(DamageSource damagesource, int i)
    {
        return super.applyArmorCalculations(damagesource, i);
    }

    public final void superApplyEntityCollision(Entity entity)
    {
        super.applyEntityCollision(entity);
    }

    public final int realApplyPotionDamageCalculations(DamageSource damagesource, int i)
    {
        return applyPotionDamageCalculations(damagesource, i);
    }

    public final int superApplyPotionDamageCalculations(DamageSource damagesource, int i)
    {
        return super.applyPotionDamageCalculations(damagesource, i);
    }

    public final boolean superAttackEntityAsMob(Entity entity)
    {
        return super.attackEntityAsMob(entity);
    }

    public final boolean superCanAttackWithItem()
    {
        return super.canAttackWithItem();
    }

    public final boolean superCanBeCollidedWith()
    {
        return super.canBeCollidedWith();
    }

    public final boolean superCanBePushed()
    {
        return super.canBePushed();
    }

    public final boolean realCanDespawn()
    {
        return canDespawn();
    }

    public final boolean superCanDespawn()
    {
        return super.canDespawn();
    }

    public final boolean superCanEat(boolean flag)
    {
        return super.canEat(flag);
    }

    public final boolean superCanEntityBeSeen(Entity entity)
    {
        return super.canEntityBeSeen(entity);
    }

    public final void superClearActivePotions()
    {
        super.clearActivePotions();
    }

    public final void superClearItemInUse()
    {
        super.clearItemInUse();
    }

    public final void superCopyPlayer(EntityPlayer entityplayer)
    {
        super.copyPlayer(entityplayer);
    }

    public final void realDamageArmor(int i)
    {
        damageArmor(i);
    }

    public final void superDamageArmor(int i)
    {
        super.damageArmor(i);
    }

    public final void realDealFireDamage(int i)
    {
        dealFireDamage(i);
    }

    public final void superDealFireDamage(int i)
    {
        super.dealFireDamage(i);
    }

    public final int realDecreaseAirSupply(int i)
    {
        return decreaseAirSupply(i);
    }

    public final int superDecreaseAirSupply(int i)
    {
        return super.decreaseAirSupply(i);
    }

    public final void realDespawnEntity()
    {
        despawnEntity();
    }

    public final void superDespawnEntity()
    {
        super.despawnEntity();
    }

    public final void superDestroyCurrentEquippedItem()
    {
        super.destroyCurrentEquippedItem();
    }

    public final void superDetachHome()
    {
        super.detachHome();
    }

    public final void realDropFewItems(boolean flag, int i)
    {
        dropFewItems(flag, i);
    }

    public final void superDropFewItems(boolean flag, int i)
    {
        super.dropFewItems(flag, i);
    }

    public final EntityItem superDropItem(int i, int j)
    {
        return super.dropItem(i, j);
    }

    public final EntityItem superDropItemWithOffset(int i, int j, float f)
    {
        return super.dropItemWithOffset(i, j, f);
    }

    public final void realDropRareDrop(int i)
    {
        dropRareDrop(i);
    }

    public final void superDropRareDrop(int i)
    {
        super.dropRareDrop(i);
    }

    public final void superEatGrassBonus()
    {
        super.eatGrassBonus();
    }

    public final EntityItem superEntityDropItem(ItemStack itemstack, float f)
    {
        return super.entityDropItem(itemstack, f);
    }

    public final void realEntityInit()
    {
        entityInit();
    }

    public final void superEntityInit()
    {
        super.entityInit();
    }

    public final boolean superEquals(Object obj)
    {
        return super.equals(obj);
    }

    public final void superExtinguish()
    {
        super.extinguish();
    }

    public final void superFaceEntity(Entity entity, float f, float f1)
    {
        super.faceEntity(entity, f, f1);
    }

    public final void superFunc_48079_f(float f)
    {
        super.func_48079_f(f);
    }

    public final EntitySenses superFunc_48090_aM()
    {
        return super.getEntitySenses();
    }

    public final void superFunc_48098_g(float f)
    {
        super.setAIMoveSpeed(f);
    }

    public final boolean superFunc_48100_a(Class class1)
    {
        return super.func_48100_a(class1);
    }

    public final float superFunc_48101_aR()
    {
        return super.getAIMoveSpeed();
    }

    public final void superFunc_50009_aI()
    {
        super.func_50009_aI();
    }

    public void func_6420_o()
    {
    }

    public final EntityLiving superGetAITarget()
    {
        return super.getAITarget();
    }

    public final PotionEffect superGetActivePotionEffect(Potion potion)
    {
        return super.getActivePotionEffect(potion);
    }

    public final Collection superGetActivePotionEffects()
    {
        return super.getActivePotionEffects();
    }

    public final int superGetAge()
    {
        return super.getAge();
    }

    public final int superGetAir()
    {
        return super.getAir();
    }

    public final EntityLiving superGetAttackTarget()
    {
        return super.getAttackTarget();
    }

    public final float superGetBedOrientationInDegrees()
    {
        return super.getBedOrientationInDegrees();
    }

    public final AxisAlignedBB superGetBoundingBox()
    {
        return super.getBoundingBox();
    }

    public final boolean superGetCanSpawnHere()
    {
        return super.getCanSpawnHere();
    }

    public final float superGetCollisionBorderSize()
    {
        return super.getCollisionBorderSize();
    }

    public final AxisAlignedBB superGetCollisionBox(Entity entity)
    {
        return super.getCollisionBox(entity);
    }

    public final EnumCreatureAttribute superGetCreatureAttribute()
    {
        return super.getCreatureAttribute();
    }

    public final ItemStack superGetCurrentEquippedItem()
    {
        return super.getCurrentEquippedItem();
    }

    public final DataWatcher superGetDataWatcher()
    {
        return super.getDataWatcher();
    }

    public final String realGetDeathSound()
    {
        return getDeathSound();
    }

    public final String superGetDeathSound()
    {
        return super.getDeathSound();
    }

    public final double superGetDistance(double d, double d1, double d2)
    {
        return super.getDistance(d, d1, d2);
    }

    public final float superGetDistanceToEntity(Entity entity)
    {
        return super.getDistanceToEntity(entity);
    }

    public final int realGetDropItemId()
    {
        return getDropItemId();
    }

    public final int superGetDropItemId()
    {
        return super.getDropItemId();
    }

    public final int realGetExperiencePoints(EntityPlayer entityplayer)
    {
        return getExperiencePoints(entityplayer);
    }

    public final int superGetExperiencePoints(EntityPlayer entityplayer)
    {
        return super.getExperiencePoints(entityplayer);
    }

    public final float superGetEyeHeight()
    {
        return super.getEyeHeight();
    }

    public final boolean realGetFlag(int i)
    {
        return getFlag(i);
    }

    public final boolean superGetFlag(int i)
    {
        return super.getFlag(i);
    }

    public final FoodStats superGetFoodStats()
    {
        return super.getFoodStats();
    }

    public final int superGetHealth()
    {
        return super.getHealth();
    }

    public final ItemStack superGetHeldItem()
    {
        return super.getHeldItem();
    }

    public final ChunkCoordinates superGetHomePosition()
    {
        return super.getHomePosition();
    }

    public final ItemStack superGetItemInUse()
    {
        return super.getItemInUse();
    }

    public final int superGetItemInUseCount()
    {
        return super.getItemInUseCount();
    }

    public final int superGetItemInUseDuration()
    {
        return super.getItemInUseDuration();
    }

    public final EntityJumpHelper superGetJumpHelper()
    {
        return super.getJumpHelper();
    }

    public final EntityLiving superGetLastAttackingEntity()
    {
        return super.getLastAttackingEntity();
    }

    public final String realGetLivingSound()
    {
        return getLivingSound();
    }

    public final String superGetLivingSound()
    {
        return super.getLivingSound();
    }

    public final Vec3D superGetLook(float f)
    {
        return super.getLook(f);
    }

    public final EntityLookHelper superGetLookHelper()
    {
        return super.getLookHelper();
    }

    public final Vec3D superGetLookVec()
    {
        return super.getLookVec();
    }

    public final int superGetMaxHealth()
    {
        return super.getMaxHealth();
    }

    public final int superGetMaxSpawnedInChunk()
    {
        return super.getMaxSpawnedInChunk();
    }

    public final float superGetMaximumHomeDistance()
    {
        return super.getMaximumHomeDistance();
    }

    public final double superGetMountedYOffset()
    {
        return super.getMountedYOffset();
    }

    public final EntityMoveHelper superGetMoveHelper()
    {
        return super.getMoveHelper();
    }

    public final PathNavigate superGetNavigator()
    {
        return super.getNavigator();
    }

    public final Entity[] superGetParts()
    {
        return super.getParts();
    }

    public final Vec3D superGetPosition(float f)
    {
        return super.getPosition(f);
    }

    public final Random superGetRNG()
    {
        return super.getRNG();
    }

    public final float superGetRenderSizeModifier()
    {
        return super.getRenderSizeModifier();
    }

    public final int superGetScore()
    {
        return super.getScore();
    }

    public final float superGetShadowSize()
    {
        return super.getShadowSize();
    }

    public final float realGetSoundVolume()
    {
        return getSoundVolume();
    }

    public final float superGetSoundVolume()
    {
        return super.getSoundVolume();
    }

    public final ChunkCoordinates superGetSpawnChunk()
    {
        return super.getSpawnChunk();
    }

    public final float superGetSwingProgress(float f)
    {
        return super.getSwingProgress(f);
    }

    public final int superGetTalkInterval()
    {
        return super.getTalkInterval();
    }

    public final String superGetTexture()
    {
        return super.getTexture();
    }

    public final int superGetTotalArmorValue()
    {
        return super.getTotalArmorValue();
    }

    public final int superGetVerticalFaceSpeed()
    {
        return super.getVerticalFaceSpeed();
    }

    public final double superGetYOffset()
    {
        return super.getYOffset();
    }

    public final void superHandleHealthUpdate(byte byte0)
    {
        super.handleHealthUpdate(byte0);
    }

    public final boolean superHasHome()
    {
        return super.hasHome();
    }

    public final int superHashCode()
    {
        return super.hashCode();
    }

    public final boolean superInteract(EntityPlayer entityplayer)
    {
        return super.interact(entityplayer);
    }

    public final boolean realIsAIEnabled()
    {
        return isAIEnabled();
    }

    public final boolean superIsAIEnabled()
    {
        return super.isAIEnabled();
    }

    private boolean isBlockTranslucent(int par1, int par2, int par3)
    {
        return worldObj.isBlockNormalCube(par1, par2, par3);
    }

    public final boolean realIsBlockTranslucent(int i, int j, int k)
    {
        return isBlockTranslucent(i, j, k);
    }

    public final boolean superIsBlocking()
    {
        return super.isBlocking();
    }

    public final boolean superIsBurning()
    {
        return super.isBurning();
    }

    public final boolean superIsChild()
    {
        return super.isChild();
    }

    /**
     * Returns whether the entity is in a local (client) world
     */
    protected boolean isClientWorld()
    {
        return true;
    }

    public final boolean realIsClientWorld()
    {
        return isClientWorld();
    }

    public final boolean superIsClientWorld()
    {
        return super.isClientWorld();
    }

    public final boolean superIsEating()
    {
        return super.isEating();
    }

    public final boolean superIsEntityAlive()
    {
        return super.isEntityAlive();
    }

    public final boolean superIsEntityEqual(Entity entity)
    {
        return super.isEntityEqual(entity);
    }

    public final boolean superIsEntityUndead()
    {
        return super.isEntityUndead();
    }

    public final boolean superIsInRangeToRenderDist(double d)
    {
        return super.isInRangeToRenderDist(d);
    }

    public final boolean superIsInRangeToRenderVec3D(Vec3D vec3d)
    {
        return super.isInRangeToRenderVec3D(vec3d);
    }

    public final boolean realIsMovementBlocked()
    {
        return isMovementBlocked();
    }

    public final boolean superIsMovementBlocked()
    {
        return super.isMovementBlocked();
    }

    public final boolean superIsOffsetPositionInLiquid(double d, double d1, double d2)
    {
        return super.isOffsetPositionInLiquid(d, d1, d2);
    }

    public final boolean realIsPVPEnabled()
    {
        return isPVPEnabled();
    }

    public final boolean superIsPVPEnabled()
    {
        return super.isPVPEnabled();
    }

    public final boolean realIsPlayer()
    {
        return isPlayer();
    }

    public final boolean superIsPlayer()
    {
        return super.isPlayer();
    }

    public final boolean superIsPlayerFullyAsleep()
    {
        return super.isPlayerFullyAsleep();
    }

    public final boolean superIsPlayerSleeping()
    {
        return super.isPlayerSleeping();
    }

    public final boolean superIsPotionActive(Potion potion)
    {
        return super.isPotionActive(potion);
    }

    public final boolean superIsPotionApplicable(PotionEffect potioneffect)
    {
        return super.isPotionApplicable(potioneffect);
    }

    public final boolean superIsRiding()
    {
        return super.isRiding();
    }

    public final boolean superIsUsingItem()
    {
        return super.isUsingItem();
    }

    public final boolean superIsWet()
    {
        return super.isWet();
    }

    public final boolean superIsWithinHomeDistance(int i, int j, int k)
    {
        return super.isWithinHomeDistance(i, j, k);
    }

    public final boolean superIsWithinHomeDistanceCurrentPosition()
    {
        return super.isWithinHomeDistanceCurrentPosition();
    }

    public final void realJoinEntityItemWithWorld(EntityItem entityitem)
    {
        joinEntityItemWithWorld(entityitem);
    }

    public final void superJoinEntityItemWithWorld(EntityItem entityitem)
    {
        super.joinEntityItemWithWorld(entityitem);
    }

    public final void realKill()
    {
        kill();
    }

    public final void superKill()
    {
        super.kill();
    }

    public final void superMountEntity(Entity entity)
    {
        super.mountEntity(entity);
    }

    public final NBTTagList realNewDoubleNBTList(double ad[])
    {
        return newDoubleNBTList(ad);
    }

    public final NBTTagList superNewDoubleNBTList(double ad[])
    {
        return super.newDoubleNBTList(ad);
    }

    public final NBTTagList realNewFloatNBTList(float af[])
    {
        return newFloatNBTList(af);
    }

    public final NBTTagList superNewFloatNBTList(float af[])
    {
        return super.newFloatNBTList(af);
    }

    public final void realOnChangedPotionEffect(PotionEffect potioneffect)
    {
        onChangedPotionEffect(potioneffect);
    }

    public final void superOnChangedPotionEffect(PotionEffect potioneffect)
    {
        super.onChangedPotionEffect(potioneffect);
    }

    public final void superOnCollideWithPlayer(EntityPlayer entityplayer)
    {
        super.onCollideWithPlayer(entityplayer);
    }

    /**
     * Called when the player performs a critical hit on the Entity. Args: entity that was hit critically
     */
    public void onCriticalHit(Entity par1Entity)
    {
        mc.effectRenderer.addEffect(new EntityCrit2FX(mc.theWorld, par1Entity));
    }

    public final void superOnCriticalHit(Entity entity)
    {
        super.onCriticalHit(entity);
    }

    public final void realOnDeathUpdate()
    {
        onDeathUpdate();
    }

    public final void superOnDeathUpdate()
    {
        super.onDeathUpdate();
    }

    public void onEnchantmentCritical(Entity par1Entity)
    {
        EntityCrit2FX entitycrit2fx = new EntityCrit2FX(mc.theWorld, par1Entity, "magicCrit");
        mc.effectRenderer.addEffect(entitycrit2fx);
    }

    public final void superOnEnchantmentCritical(Entity entity)
    {
        super.onEnchantmentCritical(entity);
    }

    public final void superOnEntityDeath()
    {
        super.onEntityDeath();
    }

    public final void superOnEntityUpdate()
    {
        super.onEntityUpdate();
    }

    public final void realOnFinishedPotionEffect(PotionEffect potioneffect)
    {
        onFinishedPotionEffect(potioneffect);
    }

    public final void superOnFinishedPotionEffect(PotionEffect potioneffect)
    {
        super.onFinishedPotionEffect(potioneffect);
    }

    /**
     * Called whenever an item is picked up from walking over it. Args: pickedUpEntity, stackSize
     */
    public void onItemPickup(Entity par1Entity, int par2)
    {
        mc.effectRenderer.addEffect(new EntityPickupFX(mc.theWorld, par1Entity, this, -0.5F));
    }

    public final void superOnItemPickup(Entity entity, int i)
    {
        super.onItemPickup(entity, i);
    }

    public final void superOnItemStackChanged(ItemStack itemstack)
    {
        super.onItemStackChanged(itemstack);
    }

    public final void realOnItemUseFinish()
    {
        onItemUseFinish();
    }

    public final void superOnItemUseFinish()
    {
        super.onItemUseFinish();
    }

    public final void realOnNewPotionEffect(PotionEffect potioneffect)
    {
        onNewPotionEffect(potioneffect);
    }

    public final void superOnNewPotionEffect(PotionEffect potioneffect)
    {
        super.onNewPotionEffect(potioneffect);
    }

    public final void superOnStruckByLightning(EntityLightningBolt entitylightningbolt)
    {
        super.onStruckByLightning(entitylightningbolt);
    }

    public final void superOutfitWithItem(int i, int j, int k)
    {
        super.outfitWithItem(i, j, k);
    }

    public final void superPerformHurtAnimation()
    {
        super.performHurtAnimation();
    }

    public final void superPlayLivingSound()
    {
        super.playLivingSound();
    }

    public final void realPlayStepSound(int i, int j, int k, int l)
    {
        playStepSound(i, j, k, l);
    }

    public final void superPlayStepSound(int i, int j, int k, int l)
    {
        super.playStepSound(i, j, k, l);
    }

    public final void superPreparePlayerToSpawn()
    {
        super.preparePlayerToSpawn();
    }

    public final void superReadFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readFromNBT(nbttagcompound);
    }

    public final void superRemoveExperience(int i)
    {
        super.removeExperience(i);
    }

    public final void superRemovePotionEffect(int i)
    {
        super.removePotionEffect(i);
    }

    public final void superRenderBrokenItemStack(ItemStack itemstack)
    {
        super.renderBrokenItemStack(itemstack);
    }

    public final void realResetHeight()
    {
        resetHeight();
    }

    public final void superResetHeight()
    {
        super.resetHeight();
    }

    public final void superSetAir(int i)
    {
        super.setAir(i);
    }

    public final void superSetAngles(float f, float f1)
    {
        super.setAngles(f, f1);
    }

    public final void superSetAttackTarget(EntityLiving entityliving)
    {
        super.setAttackTarget(entityliving);
    }

    public final void realSetBeenAttacked()
    {
        setBeenAttacked();
    }

    public final void superSetBeenAttacked()
    {
        super.setBeenAttacked();
    }

    public final void superSetEating(boolean flag)
    {
        super.setEating(flag);
    }

    public final void superSetEntityHealth(int i)
    {
        super.setEntityHealth(i);
    }

    public final void superSetFire(int i)
    {
        super.setFire(i);
    }

    public final void realSetFlag(int i, boolean flag)
    {
        setFlag(i, flag);
    }

    public final void superSetFlag(int i, boolean flag)
    {
        super.setFlag(i, flag);
    }

    /**
     * Updates health locally.
     */
    public void setHealth(int par1)
    {
        int i = getHealth() - par1;

        if (i <= 0)
        {
            setEntityHealth(par1);

            if (i < 0)
            {
                heartsLife = heartsHalvesLife / 2;
            }
        }
        else
        {
            naturalArmorRating = i;
            setEntityHealth(getHealth());
            heartsLife = heartsHalvesLife;
            damageEntity(DamageSource.generic, i);
            hurtTime = maxHurtTime = 10;
        }
    }

    public final void superSetHomeArea(int i, int j, int k, int l)
    {
        super.setHomeArea(i, j, k, l);
    }

    public final void superSetInPortal()
    {
        super.setInPortal();
    }

    public final void superSetInWeb()
    {
        super.setInWeb();
    }

    public final void superSetItemInUse(ItemStack itemstack, int i)
    {
        super.setItemInUse(itemstack, i);
    }

    public final void superSetJumping(boolean flag)
    {
        super.setJumping(flag);
    }

    public final void superSetLastAttackingEntity(Entity entity)
    {
        super.setLastAttackingEntity(entity);
    }

    public final void superSetLocationAndAngles(double d, double d1, double d2, float f, float f1)
    {
        super.setLocationAndAngles(d, d1, d2, f, f1);
    }

    public final void superSetMoveForward(float f)
    {
        super.setMoveForward(f);
    }

    public final void realSetOnFireFromLava()
    {
        setOnFireFromLava();
    }

    public final void superSetOnFireFromLava()
    {
        super.setOnFireFromLava();
    }

    public final void superSetPosition(double d, double d1, double d2)
    {
        super.setPosition(d, d1, d2);
    }

    public final void superSetPositionAndRotation2(double d, double d1, double d2, float f, float f1, int i)
    {
        super.setPositionAndRotation2(d, d1, d2, f, f1, i);
    }

    public final void superSetPositionAndUpdate(double d, double d1, double d2)
    {
        super.setPositionAndUpdate(d, d1, d2);
    }

    public final void superSetRevengeTarget(EntityLiving entityliving)
    {
        super.setRevengeTarget(entityliving);
    }

    public final void realSetRotation(float f, float f1)
    {
        setRotation(f, f1);
    }

    public final void superSetRotation(float f, float f1)
    {
        super.setRotation(f, f1);
    }

    public final void realSetSize(float f, float f1)
    {
        setSize(f, f1);
    }

    public final void superSetSize(float f, float f1)
    {
        super.setSize(f, f1);
    }

    public final void superSetSneaking(boolean flag)
    {
        super.setSneaking(flag);
    }

    public final void superSetSpawnChunk(ChunkCoordinates chunkcoordinates)
    {
        super.setSpawnChunk(chunkcoordinates);
    }

    /**
     * Set sprinting switch for Entity.
     */
    public void setSprinting(boolean par1)
    {
        super.setSprinting(par1);
        sprintingTicksLeft = par1 ? 600 : 0;
    }

    public final void superSetSprinting(boolean flag)
    {
        super.setSprinting(flag);
    }

    public final void superSetVelocity(double d, double d1, double d2)
    {
        super.setVelocity(d, d1, d2);
    }

    public final void superSetWorld(World world)
    {
        super.setWorld(world);
    }

    /**
     * Sets the current XP, total XP, and level number.
     */
    public void setXPStats(float par1, int par2, int par3)
    {
        experience = par1;
        experienceTotal = par2;
        experienceLevel = par3;
    }

    public final boolean superShouldHeal()
    {
        return super.shouldHeal();
    }

    public final void superSpawnExplosionParticle()
    {
        super.spawnExplosionParticle();
    }

    public final void superStopUsingItem()
    {
        super.stopUsingItem();
    }

    public void travelToTheEnd(int par1)
    {
        if (worldObj.isRemote)
        {
            return;
        }

        if (dimension == 1 && par1 == 1)
        {
            triggerAchievement(AchievementList.theEnd2);
            mc.displayGuiScreen(new GuiWinGame());
        }
        else
        {
            triggerAchievement(AchievementList.theEnd);
            mc.sndManager.playSoundFX("portal.travel", 1.0F, rand.nextFloat() * 0.4F + 0.8F);
            mc.usePortal(1);
        }
    }

    public final void superTravelToTheEnd(int i)
    {
        super.travelToTheEnd(i);
    }

    public final void superTriggerAchievement(StatBase statbase)
    {
        super.triggerAchievement(statbase);
    }

    public final void realUpdateAITasks()
    {
        updateAITasks();
    }

    public final void superUpdateAITasks()
    {
        super.updateAITasks();
    }

    public final void realUpdateAITick()
    {
        updateAITick();
    }

    public final void superUpdateAITick()
    {
        super.updateAITick();
    }

    public final void superUpdateCloak()
    {
        super.updateCloak();
    }

    public final void realUpdateFallState(double d, boolean flag)
    {
        updateFallState(d, flag);
    }

    public final void superUpdateFallState(double d, boolean flag)
    {
        super.updateFallState(d, flag);
    }

    public final void realUpdateItemUse(ItemStack itemstack, int i)
    {
        updateItemUse(itemstack, i);
    }

    public final void superUpdateItemUse(ItemStack itemstack, int i)
    {
        super.updateItemUse(itemstack, i);
    }

    public final void realUpdatePotionEffects()
    {
        updatePotionEffects();
    }

    public final void superUpdatePotionEffects()
    {
        super.updatePotionEffects();
    }

    public final void superUpdateRidden()
    {
        super.updateRidden();
    }

    public final void superUpdateRiderPosition()
    {
        super.updateRiderPosition();
    }

    public final void superUseCurrentItemOnEntity(Entity entity)
    {
        super.useCurrentItemOnEntity(entity);
    }

    public final void superWakeUpPlayer(boolean flag, boolean flag1, boolean flag2)
    {
        super.wakeUpPlayer(flag, flag1, flag2);
    }

    public final void superWriteToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeToNBT(nbttagcompound);
    }

    public final int superXpBarCap()
    {
        return super.xpBarCap();
    }

    public final HashMap getActivePotionsMapField()
    {
        return activePotionsMap;
    }

    public final void setActivePotionsMapField(HashMap hashmap)
    {
        activePotionsMap = hashmap;
    }

    public final EntityPlayer getAttackingPlayerField()
    {
        return attackingPlayer;
    }

    public final void setAttackingPlayerField(EntityPlayer entityplayer)
    {
        attackingPlayer = entityplayer;
    }

    public final int getCarryoverDamageField()
    {
        return carryoverDamage;
    }

    public final void setCarryoverDamageField(int i)
    {
        carryoverDamage = i;
    }

    public final DataWatcher getDataWatcherField()
    {
        return dataWatcher;
    }

    public final void setDataWatcherField(DataWatcher datawatcher)
    {
        dataWatcher = datawatcher;
    }

    public final boolean getDeadField()
    {
        return dead;
    }

    public final void setDeadField(boolean flag)
    {
        dead = flag;
    }

    public final float getDefaultPitchField()
    {
        return defaultPitch;
    }

    public final void setDefaultPitchField(float f)
    {
        defaultPitch = f;
    }

    public final int getEntityAgeField()
    {
        return entityAge;
    }

    public final void setEntityAgeField(int i)
    {
        entityAge = i;
    }

    public final String getEntityTypeField()
    {
        return entityType;
    }

    public final void setEntityTypeField(String s)
    {
        entityType = s;
    }

    public final int getExperienceValueField()
    {
        return experienceValue;
    }

    public final void setExperienceValueField(int i)
    {
        experienceValue = i;
    }

    public final MouseFilter getField_21902_bLField()
    {
        return field_21902_bL;
    }

    public final void setField_21902_bLField(MouseFilter mousefilter)
    {
        field_21902_bL = mousefilter;
    }

    public final MouseFilter getField_21903_bJField()
    {
        return field_21903_bJ;
    }

    public final void setField_21903_bJField(MouseFilter mousefilter)
    {
        field_21903_bJ = mousefilter;
    }

    public final MouseFilter getField_21904_bKField()
    {
        return field_21904_bK;
    }

    public final void setField_21904_bKField(MouseFilter mousefilter)
    {
        field_21904_bK = mousefilter;
    }

    public final float getField_9345_FField()
    {
        return field_9345_F;
    }

    public final void setField_9345_FField(float f)
    {
        field_9345_F = f;
    }

    public final float getField_9348_aeField()
    {
        return field_9348_ae;
    }

    public final void setField_9348_aeField(float f)
    {
        field_9348_ae = f;
    }

    public final float getField_9349_DField()
    {
        return field_9349_D;
    }

    public final void setField_9349_DField(float f)
    {
        field_9349_D = f;
    }

    public final float getField_9353_BField()
    {
        return field_9353_B;
    }

    public final void setField_9353_BField(float f)
    {
        field_9353_B = f;
    }

    public final boolean getField_9355_AField()
    {
        return field_9355_A;
    }

    public final void setField_9355_AField(boolean flag)
    {
        field_9355_A = flag;
    }

    public final boolean getField_9358_yField()
    {
        return field_9358_y;
    }

    public final void setField_9358_yField(boolean flag)
    {
        field_9358_y = flag;
    }

    public final float getField_9359_xField()
    {
        return field_9359_x;
    }

    public final void setField_9359_xField(float f)
    {
        field_9359_x = f;
    }

    public final float getField_9360_wField()
    {
        return field_9360_w;
    }

    public final void setField_9360_wField(float f)
    {
        field_9360_w = f;
    }

    public final float getField_9361_vField()
    {
        return field_9361_v;
    }

    public final void setField_9361_vField(float f)
    {
        field_9361_v = f;
    }

    public final float getField_9362_uField()
    {
        return field_9362_u;
    }

    public final void setField_9362_uField(float f)
    {
        field_9362_u = f;
    }

    public final int getFlyToggleTimerField()
    {
        return flyToggleTimer;
    }

    public final void setFlyToggleTimerField(int i)
    {
        flyToggleTimer = i;
    }

    public final FoodStats getFoodStatsField()
    {
        return foodStats;
    }

    public final void setFoodStatsField(FoodStats foodstats)
    {
        foodStats = foodstats;
    }

    public final int getHealthField()
    {
        return health;
    }

    public final void setHealthField(int i)
    {
        health = i;
    }

    public final boolean getInPortalField()
    {
        return inPortal;
    }

    public final void setInPortalField(boolean flag)
    {
        inPortal = flag;
    }

    public final boolean getInWaterField()
    {
        return inWater;
    }

    public final void setInWaterField(boolean flag)
    {
        inWater = flag;
    }

    public final boolean getIsImmuneToFireField()
    {
        return isImmuneToFire;
    }

    public final void setIsImmuneToFireField(boolean flag)
    {
        isImmuneToFire = flag;
    }

    public final boolean getIsInWebField()
    {
        return isInWeb;
    }

    public final void setIsInWebField(boolean flag)
    {
        isInWeb = flag;
    }

    public final boolean getIsJumpingField()
    {
        return isJumping;
    }

    public final void setIsJumpingField(boolean flag)
    {
        isJumping = flag;
    }

    public final Minecraft getMcField()
    {
        return mc;
    }

    public final void setMcField(Minecraft minecraft)
    {
        mc = minecraft;
    }

    public final float getMoveForwardField()
    {
        return moveForward;
    }

    public final void setMoveForwardField(float f)
    {
        moveForward = f;
    }

    public final float getMoveSpeedField()
    {
        return moveSpeed;
    }

    public final void setMoveSpeedField(float f)
    {
        moveSpeed = f;
    }

    public final float getMoveStrafingField()
    {
        return moveStrafing;
    }

    public final void setMoveStrafingField(float f)
    {
        moveStrafing = f;
    }

    public final int getNaturalArmorRatingField()
    {
        return naturalArmorRating;
    }

    public final void setNaturalArmorRatingField(int i)
    {
        naturalArmorRating = i;
    }

    public final int getNewPosRotationIncrementsField()
    {
        return newPosRotationIncrements;
    }

    public final void setNewPosRotationIncrementsField(int i)
    {
        newPosRotationIncrements = i;
    }

    public final double getNewPosXField()
    {
        return newPosX;
    }

    public final void setNewPosXField(double d)
    {
        newPosX = d;
    }

    public final double getNewPosYField()
    {
        return newPosY;
    }

    public final void setNewPosYField(double d)
    {
        newPosY = d;
    }

    public final double getNewPosZField()
    {
        return newPosZ;
    }

    public final void setNewPosZField(double d)
    {
        newPosZ = d;
    }

    public final double getNewRotationPitchField()
    {
        return newRotationPitch;
    }

    public final void setNewRotationPitchField(double d)
    {
        newRotationPitch = d;
    }

    public final double getNewRotationYawField()
    {
        return newRotationYaw;
    }

    public final void setNewRotationYawField(double d)
    {
        newRotationYaw = d;
    }

    public final int getNumTicksToChaseTargetField()
    {
        return numTicksToChaseTarget;
    }

    public final void setNumTicksToChaseTargetField(int i)
    {
        numTicksToChaseTarget = i;
    }

    public final Random getRandField()
    {
        return rand;
    }

    public final void setRandField(Random random)
    {
        rand = random;
    }

    public final float getRandomYawVelocityField()
    {
        return randomYawVelocity;
    }

    public final void setRandomYawVelocityField(float f)
    {
        randomYawVelocity = f;
    }

    public final int getRecentlyHitField()
    {
        return recentlyHit;
    }

    public final void setRecentlyHitField(int i)
    {
        recentlyHit = i;
    }

    public final int getScoreValueField()
    {
        return scoreValue;
    }

    public final void setScoreValueField(int i)
    {
        scoreValue = i;
    }

    public final boolean getSleepingField()
    {
        return sleeping;
    }

    public final void setSleepingField(boolean flag)
    {
        sleeping = flag;
    }

    public final float getSpeedInAirField()
    {
        return speedInAir;
    }

    public final void setSpeedInAirField(float f)
    {
        speedInAir = f;
    }

    public final float getSpeedOnGroundField()
    {
        return speedOnGround;
    }

    public final void setSpeedOnGroundField(float f)
    {
        speedOnGround = f;
    }

    public final int getSprintToggleTimerField()
    {
        return sprintToggleTimer;
    }

    public final void setSprintToggleTimerField(int i)
    {
        sprintToggleTimer = i;
    }

    public final EntityAITasks getTargetTasksField()
    {
        return targetTasks;
    }

    public final void setTargetTasksField(EntityAITasks entityaitasks)
    {
        targetTasks = entityaitasks;
    }

    public final EntityAITasks getTasksField()
    {
        return tasks;
    }

    public final void setTasksField(EntityAITasks entityaitasks)
    {
        tasks = entityaitasks;
    }

    public final String getTextureField()
    {
        return texture;
    }

    public final void setTextureField(String s)
    {
        texture = s;
    }
}
