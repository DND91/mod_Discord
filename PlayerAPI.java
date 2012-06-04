package net.minecraft.src;

import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;
import java.util.logging.Logger;
import net.minecraft.client.Minecraft;

public final class PlayerAPI
{
    private static final Class Class[];
    private static final Class Classes[];
    private static boolean isCreated;
    private static final Logger logger = Logger.getLogger("PlayerAPI");
    private static final List beforeAddExhaustionHookTypes = new LinkedList();
    private static final List overrideAddExhaustionHookTypes = new LinkedList();
    private static final List afterAddExhaustionHookTypes = new LinkedList();
    private final PlayerBase beforeAddExhaustionHooks[];
    private final PlayerBase overrideAddExhaustionHooks[];
    private final PlayerBase afterAddExhaustionHooks[];
    protected final boolean isAddExhaustionModded;
    private static final List beforeAttackEntityFromHookTypes = new LinkedList();
    private static final List overrideAttackEntityFromHookTypes = new LinkedList();
    private static final List afterAttackEntityFromHookTypes = new LinkedList();
    private final PlayerBase beforeAttackEntityFromHooks[];
    private final PlayerBase overrideAttackEntityFromHooks[];
    private final PlayerBase afterAttackEntityFromHooks[];
    protected final boolean isAttackEntityFromModded;
    private static final List beforeAttackTargetEntityWithCurrentItemHookTypes = new LinkedList();
    private static final List overrideAttackTargetEntityWithCurrentItemHookTypes = new LinkedList();
    private static final List afterAttackTargetEntityWithCurrentItemHookTypes = new LinkedList();
    private final PlayerBase beforeAttackTargetEntityWithCurrentItemHooks[];
    private final PlayerBase overrideAttackTargetEntityWithCurrentItemHooks[];
    private final PlayerBase afterAttackTargetEntityWithCurrentItemHooks[];
    protected final boolean isAttackTargetEntityWithCurrentItemModded;
    private static final List beforeCanBreatheUnderwaterHookTypes = new LinkedList();
    private static final List overrideCanBreatheUnderwaterHookTypes = new LinkedList();
    private static final List afterCanBreatheUnderwaterHookTypes = new LinkedList();
    private final PlayerBase beforeCanBreatheUnderwaterHooks[];
    private final PlayerBase overrideCanBreatheUnderwaterHooks[];
    private final PlayerBase afterCanBreatheUnderwaterHooks[];
    protected final boolean isCanBreatheUnderwaterModded;
    private static final List beforeCanHarvestBlockHookTypes = new LinkedList();
    private static final List overrideCanHarvestBlockHookTypes = new LinkedList();
    private static final List afterCanHarvestBlockHookTypes = new LinkedList();
    private final PlayerBase beforeCanHarvestBlockHooks[];
    private final PlayerBase overrideCanHarvestBlockHooks[];
    private final PlayerBase afterCanHarvestBlockHooks[];
    protected final boolean isCanHarvestBlockModded;
    private static final List beforeCanPlayerEditHookTypes = new LinkedList();
    private static final List overrideCanPlayerEditHookTypes = new LinkedList();
    private static final List afterCanPlayerEditHookTypes = new LinkedList();
    private final PlayerBase beforeCanPlayerEditHooks[];
    private final PlayerBase overrideCanPlayerEditHooks[];
    private final PlayerBase afterCanPlayerEditHooks[];
    protected final boolean isCanPlayerEditModded;
    private static final List beforeCanTriggerWalkingHookTypes = new LinkedList();
    private static final List overrideCanTriggerWalkingHookTypes = new LinkedList();
    private static final List afterCanTriggerWalkingHookTypes = new LinkedList();
    private final PlayerBase beforeCanTriggerWalkingHooks[];
    private final PlayerBase overrideCanTriggerWalkingHooks[];
    private final PlayerBase afterCanTriggerWalkingHooks[];
    protected final boolean isCanTriggerWalkingModded;
    private static final List beforeCloseScreenHookTypes = new LinkedList();
    private static final List overrideCloseScreenHookTypes = new LinkedList();
    private static final List afterCloseScreenHookTypes = new LinkedList();
    private final PlayerBase beforeCloseScreenHooks[];
    private final PlayerBase overrideCloseScreenHooks[];
    private final PlayerBase afterCloseScreenHooks[];
    protected final boolean isCloseScreenModded;
    private static final List beforeDamageEntityHookTypes = new LinkedList();
    private static final List overrideDamageEntityHookTypes = new LinkedList();
    private static final List afterDamageEntityHookTypes = new LinkedList();
    private final PlayerBase beforeDamageEntityHooks[];
    private final PlayerBase overrideDamageEntityHooks[];
    private final PlayerBase afterDamageEntityHooks[];
    protected final boolean isDamageEntityModded;
    private static final List beforeDisplayGUIBrewingStandHookTypes = new LinkedList();
    private static final List overrideDisplayGUIBrewingStandHookTypes = new LinkedList();
    private static final List afterDisplayGUIBrewingStandHookTypes = new LinkedList();
    private final PlayerBase beforeDisplayGUIBrewingStandHooks[];
    private final PlayerBase overrideDisplayGUIBrewingStandHooks[];
    private final PlayerBase afterDisplayGUIBrewingStandHooks[];
    protected final boolean isDisplayGUIBrewingStandModded;
    private static final List beforeDisplayGUIChestHookTypes = new LinkedList();
    private static final List overrideDisplayGUIChestHookTypes = new LinkedList();
    private static final List afterDisplayGUIChestHookTypes = new LinkedList();
    private final PlayerBase beforeDisplayGUIChestHooks[];
    private final PlayerBase overrideDisplayGUIChestHooks[];
    private final PlayerBase afterDisplayGUIChestHooks[];
    protected final boolean isDisplayGUIChestModded;
    private static final List beforeDisplayGUIDispenserHookTypes = new LinkedList();
    private static final List overrideDisplayGUIDispenserHookTypes = new LinkedList();
    private static final List afterDisplayGUIDispenserHookTypes = new LinkedList();
    private final PlayerBase beforeDisplayGUIDispenserHooks[];
    private final PlayerBase overrideDisplayGUIDispenserHooks[];
    private final PlayerBase afterDisplayGUIDispenserHooks[];
    protected final boolean isDisplayGUIDispenserModded;
    private static final List beforeDisplayGUIEditSignHookTypes = new LinkedList();
    private static final List overrideDisplayGUIEditSignHookTypes = new LinkedList();
    private static final List afterDisplayGUIEditSignHookTypes = new LinkedList();
    private final PlayerBase beforeDisplayGUIEditSignHooks[];
    private final PlayerBase overrideDisplayGUIEditSignHooks[];
    private final PlayerBase afterDisplayGUIEditSignHooks[];
    protected final boolean isDisplayGUIEditSignModded;
    private static final List beforeDisplayGUIEnchantmentHookTypes = new LinkedList();
    private static final List overrideDisplayGUIEnchantmentHookTypes = new LinkedList();
    private static final List afterDisplayGUIEnchantmentHookTypes = new LinkedList();
    private final PlayerBase beforeDisplayGUIEnchantmentHooks[];
    private final PlayerBase overrideDisplayGUIEnchantmentHooks[];
    private final PlayerBase afterDisplayGUIEnchantmentHooks[];
    protected final boolean isDisplayGUIEnchantmentModded;
    private static final List beforeDisplayGUIFurnaceHookTypes = new LinkedList();
    private static final List overrideDisplayGUIFurnaceHookTypes = new LinkedList();
    private static final List afterDisplayGUIFurnaceHookTypes = new LinkedList();
    private final PlayerBase beforeDisplayGUIFurnaceHooks[];
    private final PlayerBase overrideDisplayGUIFurnaceHooks[];
    private final PlayerBase afterDisplayGUIFurnaceHooks[];
    protected final boolean isDisplayGUIFurnaceModded;
    private static final List beforeDisplayWorkbenchGUIHookTypes = new LinkedList();
    private static final List overrideDisplayWorkbenchGUIHookTypes = new LinkedList();
    private static final List afterDisplayWorkbenchGUIHookTypes = new LinkedList();
    private final PlayerBase beforeDisplayWorkbenchGUIHooks[];
    private final PlayerBase overrideDisplayWorkbenchGUIHooks[];
    private final PlayerBase afterDisplayWorkbenchGUIHooks[];
    protected final boolean isDisplayWorkbenchGUIModded;
    private static final List beforeDropOneItemHookTypes = new LinkedList();
    private static final List overrideDropOneItemHookTypes = new LinkedList();
    private static final List afterDropOneItemHookTypes = new LinkedList();
    private final PlayerBase beforeDropOneItemHooks[];
    private final PlayerBase overrideDropOneItemHooks[];
    private final PlayerBase afterDropOneItemHooks[];
    protected final boolean isDropOneItemModded;
    private static final List beforeDropPlayerItemHookTypes = new LinkedList();
    private static final List overrideDropPlayerItemHookTypes = new LinkedList();
    private static final List afterDropPlayerItemHookTypes = new LinkedList();
    private final PlayerBase beforeDropPlayerItemHooks[];
    private final PlayerBase overrideDropPlayerItemHooks[];
    private final PlayerBase afterDropPlayerItemHooks[];
    protected final boolean isDropPlayerItemModded;
    private static final List beforeDropPlayerItemWithRandomChoiceHookTypes = new LinkedList();
    private static final List overrideDropPlayerItemWithRandomChoiceHookTypes = new LinkedList();
    private static final List afterDropPlayerItemWithRandomChoiceHookTypes = new LinkedList();
    private final PlayerBase beforeDropPlayerItemWithRandomChoiceHooks[];
    private final PlayerBase overrideDropPlayerItemWithRandomChoiceHooks[];
    private final PlayerBase afterDropPlayerItemWithRandomChoiceHooks[];
    protected final boolean isDropPlayerItemWithRandomChoiceModded;
    private static final List beforeFallHookTypes = new LinkedList();
    private static final List overrideFallHookTypes = new LinkedList();
    private static final List afterFallHookTypes = new LinkedList();
    private final PlayerBase beforeFallHooks[];
    private final PlayerBase overrideFallHooks[];
    private final PlayerBase afterFallHooks[];
    protected final boolean isFallModded;
    private static final List beforeGetBrightnessHookTypes = new LinkedList();
    private static final List overrideGetBrightnessHookTypes = new LinkedList();
    private static final List afterGetBrightnessHookTypes = new LinkedList();
    private final PlayerBase beforeGetBrightnessHooks[];
    private final PlayerBase overrideGetBrightnessHooks[];
    private final PlayerBase afterGetBrightnessHooks[];
    protected final boolean isGetBrightnessModded;
    private static final List beforeGetBrightnessForRenderHookTypes = new LinkedList();
    private static final List overrideGetBrightnessForRenderHookTypes = new LinkedList();
    private static final List afterGetBrightnessForRenderHookTypes = new LinkedList();
    private final PlayerBase beforeGetBrightnessForRenderHooks[];
    private final PlayerBase overrideGetBrightnessForRenderHooks[];
    private final PlayerBase afterGetBrightnessForRenderHooks[];
    protected final boolean isGetBrightnessForRenderModded;
    private static final List beforeGetCurrentPlayerStrVsBlockHookTypes = new LinkedList();
    private static final List overrideGetCurrentPlayerStrVsBlockHookTypes = new LinkedList();
    private static final List afterGetCurrentPlayerStrVsBlockHookTypes = new LinkedList();
    private final PlayerBase beforeGetCurrentPlayerStrVsBlockHooks[];
    private final PlayerBase overrideGetCurrentPlayerStrVsBlockHooks[];
    private final PlayerBase afterGetCurrentPlayerStrVsBlockHooks[];
    protected final boolean isGetCurrentPlayerStrVsBlockModded;
    private static final List beforeGetDistanceSqHookTypes = new LinkedList();
    private static final List overrideGetDistanceSqHookTypes = new LinkedList();
    private static final List afterGetDistanceSqHookTypes = new LinkedList();
    private final PlayerBase beforeGetDistanceSqHooks[];
    private final PlayerBase overrideGetDistanceSqHooks[];
    private final PlayerBase afterGetDistanceSqHooks[];
    protected final boolean isGetDistanceSqModded;
    private static final List beforeGetDistanceSqToEntityHookTypes = new LinkedList();
    private static final List overrideGetDistanceSqToEntityHookTypes = new LinkedList();
    private static final List afterGetDistanceSqToEntityHookTypes = new LinkedList();
    private final PlayerBase beforeGetDistanceSqToEntityHooks[];
    private final PlayerBase overrideGetDistanceSqToEntityHooks[];
    private final PlayerBase afterGetDistanceSqToEntityHooks[];
    protected final boolean isGetDistanceSqToEntityModded;
    private static final List beforeGetFOVMultiplierHookTypes = new LinkedList();
    private static final List overrideGetFOVMultiplierHookTypes = new LinkedList();
    private static final List afterGetFOVMultiplierHookTypes = new LinkedList();
    private final PlayerBase beforeGetFOVMultiplierHooks[];
    private final PlayerBase overrideGetFOVMultiplierHooks[];
    private final PlayerBase afterGetFOVMultiplierHooks[];
    protected final boolean isGetFOVMultiplierModded;
    private static final List beforeGetHurtSoundHookTypes = new LinkedList();
    private static final List overrideGetHurtSoundHookTypes = new LinkedList();
    private static final List afterGetHurtSoundHookTypes = new LinkedList();
    private final PlayerBase beforeGetHurtSoundHooks[];
    private final PlayerBase overrideGetHurtSoundHooks[];
    private final PlayerBase afterGetHurtSoundHooks[];
    protected final boolean isGetHurtSoundModded;
    private static final List beforeGetItemIconHookTypes = new LinkedList();
    private static final List overrideGetItemIconHookTypes = new LinkedList();
    private static final List afterGetItemIconHookTypes = new LinkedList();
    private final PlayerBase beforeGetItemIconHooks[];
    private final PlayerBase overrideGetItemIconHooks[];
    private final PlayerBase afterGetItemIconHooks[];
    protected final boolean isGetItemIconModded;
    private static final List beforeGetSleepTimerHookTypes = new LinkedList();
    private static final List overrideGetSleepTimerHookTypes = new LinkedList();
    private static final List afterGetSleepTimerHookTypes = new LinkedList();
    private final PlayerBase beforeGetSleepTimerHooks[];
    private final PlayerBase overrideGetSleepTimerHooks[];
    private final PlayerBase afterGetSleepTimerHooks[];
    protected final boolean isGetSleepTimerModded;
    private static final List beforeGetSpeedModifierHookTypes = new LinkedList();
    private static final List overrideGetSpeedModifierHookTypes = new LinkedList();
    private static final List afterGetSpeedModifierHookTypes = new LinkedList();
    private final PlayerBase beforeGetSpeedModifierHooks[];
    private final PlayerBase overrideGetSpeedModifierHooks[];
    private final PlayerBase afterGetSpeedModifierHooks[];
    protected final boolean isGetSpeedModifierModded;
    private static final List beforeHandleLavaMovementHookTypes = new LinkedList();
    private static final List overrideHandleLavaMovementHookTypes = new LinkedList();
    private static final List afterHandleLavaMovementHookTypes = new LinkedList();
    private final PlayerBase beforeHandleLavaMovementHooks[];
    private final PlayerBase overrideHandleLavaMovementHooks[];
    private final PlayerBase afterHandleLavaMovementHooks[];
    protected final boolean isHandleLavaMovementModded;
    private static final List beforeHandleWaterMovementHookTypes = new LinkedList();
    private static final List overrideHandleWaterMovementHookTypes = new LinkedList();
    private static final List afterHandleWaterMovementHookTypes = new LinkedList();
    private final PlayerBase beforeHandleWaterMovementHooks[];
    private final PlayerBase overrideHandleWaterMovementHooks[];
    private final PlayerBase afterHandleWaterMovementHooks[];
    protected final boolean isHandleWaterMovementModded;
    private static final List beforeHealHookTypes = new LinkedList();
    private static final List overrideHealHookTypes = new LinkedList();
    private static final List afterHealHookTypes = new LinkedList();
    private final PlayerBase beforeHealHooks[];
    private final PlayerBase overrideHealHooks[];
    private final PlayerBase afterHealHooks[];
    protected final boolean isHealModded;
    private static final List beforeIsEntityInsideOpaqueBlockHookTypes = new LinkedList();
    private static final List overrideIsEntityInsideOpaqueBlockHookTypes = new LinkedList();
    private static final List afterIsEntityInsideOpaqueBlockHookTypes = new LinkedList();
    private final PlayerBase beforeIsEntityInsideOpaqueBlockHooks[];
    private final PlayerBase overrideIsEntityInsideOpaqueBlockHooks[];
    private final PlayerBase afterIsEntityInsideOpaqueBlockHooks[];
    protected final boolean isIsEntityInsideOpaqueBlockModded;
    private static final List beforeIsInWaterHookTypes = new LinkedList();
    private static final List overrideIsInWaterHookTypes = new LinkedList();
    private static final List afterIsInWaterHookTypes = new LinkedList();
    private final PlayerBase beforeIsInWaterHooks[];
    private final PlayerBase overrideIsInWaterHooks[];
    private final PlayerBase afterIsInWaterHooks[];
    protected final boolean isIsInWaterModded;
    private static final List beforeIsInsideOfMaterialHookTypes = new LinkedList();
    private static final List overrideIsInsideOfMaterialHookTypes = new LinkedList();
    private static final List afterIsInsideOfMaterialHookTypes = new LinkedList();
    private final PlayerBase beforeIsInsideOfMaterialHooks[];
    private final PlayerBase overrideIsInsideOfMaterialHooks[];
    private final PlayerBase afterIsInsideOfMaterialHooks[];
    protected final boolean isIsInsideOfMaterialModded;
    private static final List beforeIsOnLadderHookTypes = new LinkedList();
    private static final List overrideIsOnLadderHookTypes = new LinkedList();
    private static final List afterIsOnLadderHookTypes = new LinkedList();
    private final PlayerBase beforeIsOnLadderHooks[];
    private final PlayerBase overrideIsOnLadderHooks[];
    private final PlayerBase afterIsOnLadderHooks[];
    protected final boolean isIsOnLadderModded;
    private static final List beforeIsSneakingHookTypes = new LinkedList();
    private static final List overrideIsSneakingHookTypes = new LinkedList();
    private static final List afterIsSneakingHookTypes = new LinkedList();
    private final PlayerBase beforeIsSneakingHooks[];
    private final PlayerBase overrideIsSneakingHooks[];
    private final PlayerBase afterIsSneakingHooks[];
    protected final boolean isIsSneakingModded;
    private static final List beforeIsSprintingHookTypes = new LinkedList();
    private static final List overrideIsSprintingHookTypes = new LinkedList();
    private static final List afterIsSprintingHookTypes = new LinkedList();
    private final PlayerBase beforeIsSprintingHooks[];
    private final PlayerBase overrideIsSprintingHooks[];
    private final PlayerBase afterIsSprintingHooks[];
    protected final boolean isIsSprintingModded;
    private static final List beforeJumpHookTypes = new LinkedList();
    private static final List overrideJumpHookTypes = new LinkedList();
    private static final List afterJumpHookTypes = new LinkedList();
    private final PlayerBase beforeJumpHooks[];
    private final PlayerBase overrideJumpHooks[];
    private final PlayerBase afterJumpHooks[];
    protected final boolean isJumpModded;
    private static final List beforeKnockBackHookTypes = new LinkedList();
    private static final List overrideKnockBackHookTypes = new LinkedList();
    private static final List afterKnockBackHookTypes = new LinkedList();
    private final PlayerBase beforeKnockBackHooks[];
    private final PlayerBase overrideKnockBackHooks[];
    private final PlayerBase afterKnockBackHooks[];
    protected final boolean isKnockBackModded;
    private static final List beforeMoveEntityHookTypes = new LinkedList();
    private static final List overrideMoveEntityHookTypes = new LinkedList();
    private static final List afterMoveEntityHookTypes = new LinkedList();
    private final PlayerBase beforeMoveEntityHooks[];
    private final PlayerBase overrideMoveEntityHooks[];
    private final PlayerBase afterMoveEntityHooks[];
    protected final boolean isMoveEntityModded;
    private static final List beforeMoveEntityWithHeadingHookTypes = new LinkedList();
    private static final List overrideMoveEntityWithHeadingHookTypes = new LinkedList();
    private static final List afterMoveEntityWithHeadingHookTypes = new LinkedList();
    private final PlayerBase beforeMoveEntityWithHeadingHooks[];
    private final PlayerBase overrideMoveEntityWithHeadingHooks[];
    private final PlayerBase afterMoveEntityWithHeadingHooks[];
    protected final boolean isMoveEntityWithHeadingModded;
    private static final List beforeMoveFlyingHookTypes = new LinkedList();
    private static final List overrideMoveFlyingHookTypes = new LinkedList();
    private static final List afterMoveFlyingHookTypes = new LinkedList();
    private final PlayerBase beforeMoveFlyingHooks[];
    private final PlayerBase overrideMoveFlyingHooks[];
    private final PlayerBase afterMoveFlyingHooks[];
    protected final boolean isMoveFlyingModded;
    private static final List beforeOnDeathHookTypes = new LinkedList();
    private static final List overrideOnDeathHookTypes = new LinkedList();
    private static final List afterOnDeathHookTypes = new LinkedList();
    private final PlayerBase beforeOnDeathHooks[];
    private final PlayerBase overrideOnDeathHooks[];
    private final PlayerBase afterOnDeathHooks[];
    protected final boolean isOnDeathModded;
    private static final List beforeOnLivingUpdateHookTypes = new LinkedList();
    private static final List overrideOnLivingUpdateHookTypes = new LinkedList();
    private static final List afterOnLivingUpdateHookTypes = new LinkedList();
    private final PlayerBase beforeOnLivingUpdateHooks[];
    private final PlayerBase overrideOnLivingUpdateHooks[];
    private final PlayerBase afterOnLivingUpdateHooks[];
    protected final boolean isOnLivingUpdateModded;
    private static final List beforeOnKillEntityHookTypes = new LinkedList();
    private static final List overrideOnKillEntityHookTypes = new LinkedList();
    private static final List afterOnKillEntityHookTypes = new LinkedList();
    private final PlayerBase beforeOnKillEntityHooks[];
    private final PlayerBase overrideOnKillEntityHooks[];
    private final PlayerBase afterOnKillEntityHooks[];
    protected final boolean isOnKillEntityModded;
    private static final List beforeOnUpdateHookTypes = new LinkedList();
    private static final List overrideOnUpdateHookTypes = new LinkedList();
    private static final List afterOnUpdateHookTypes = new LinkedList();
    private final PlayerBase beforeOnUpdateHooks[];
    private final PlayerBase overrideOnUpdateHooks[];
    private final PlayerBase afterOnUpdateHooks[];
    protected final boolean isOnUpdateModded;
    private static final List beforePushOutOfBlocksHookTypes = new LinkedList();
    private static final List overridePushOutOfBlocksHookTypes = new LinkedList();
    private static final List afterPushOutOfBlocksHookTypes = new LinkedList();
    private final PlayerBase beforePushOutOfBlocksHooks[];
    private final PlayerBase overridePushOutOfBlocksHooks[];
    private final PlayerBase afterPushOutOfBlocksHooks[];
    protected final boolean isPushOutOfBlocksModded;
    private static final List beforeRayTraceHookTypes = new LinkedList();
    private static final List overrideRayTraceHookTypes = new LinkedList();
    private static final List afterRayTraceHookTypes = new LinkedList();
    private final PlayerBase beforeRayTraceHooks[];
    private final PlayerBase overrideRayTraceHooks[];
    private final PlayerBase afterRayTraceHooks[];
    protected final boolean isRayTraceModded;
    private static final List beforeReadEntityFromNBTHookTypes = new LinkedList();
    private static final List overrideReadEntityFromNBTHookTypes = new LinkedList();
    private static final List afterReadEntityFromNBTHookTypes = new LinkedList();
    private final PlayerBase beforeReadEntityFromNBTHooks[];
    private final PlayerBase overrideReadEntityFromNBTHooks[];
    private final PlayerBase afterReadEntityFromNBTHooks[];
    protected final boolean isReadEntityFromNBTModded;
    private static final List beforeRespawnPlayerHookTypes = new LinkedList();
    private static final List overrideRespawnPlayerHookTypes = new LinkedList();
    private static final List afterRespawnPlayerHookTypes = new LinkedList();
    private final PlayerBase beforeRespawnPlayerHooks[];
    private final PlayerBase overrideRespawnPlayerHooks[];
    private final PlayerBase afterRespawnPlayerHooks[];
    protected final boolean isRespawnPlayerModded;
    private static final List beforeSendChatMessageHookTypes = new LinkedList();
    private static final List overrideSendChatMessageHookTypes = new LinkedList();
    private static final List afterSendChatMessageHookTypes = new LinkedList();
    private final PlayerBase beforeSendChatMessageHooks[];
    private final PlayerBase overrideSendChatMessageHooks[];
    private final PlayerBase afterSendChatMessageHooks[];
    protected final boolean isSendChatMessageModded;
    private static final List beforeSetDeadHookTypes = new LinkedList();
    private static final List overrideSetDeadHookTypes = new LinkedList();
    private static final List afterSetDeadHookTypes = new LinkedList();
    private final PlayerBase beforeSetDeadHooks[];
    private final PlayerBase overrideSetDeadHooks[];
    private final PlayerBase afterSetDeadHooks[];
    protected final boolean isSetDeadModded;
    private static final List beforeSetPositionAndRotationHookTypes = new LinkedList();
    private static final List overrideSetPositionAndRotationHookTypes = new LinkedList();
    private static final List afterSetPositionAndRotationHookTypes = new LinkedList();
    private final PlayerBase beforeSetPositionAndRotationHooks[];
    private final PlayerBase overrideSetPositionAndRotationHooks[];
    private final PlayerBase afterSetPositionAndRotationHooks[];
    protected final boolean isSetPositionAndRotationModded;
    private static final List beforeSleepInBedAtHookTypes = new LinkedList();
    private static final List overrideSleepInBedAtHookTypes = new LinkedList();
    private static final List afterSleepInBedAtHookTypes = new LinkedList();
    private final PlayerBase beforeSleepInBedAtHooks[];
    private final PlayerBase overrideSleepInBedAtHooks[];
    private final PlayerBase afterSleepInBedAtHooks[];
    protected final boolean isSleepInBedAtModded;
    private static final List beforeSwingItemHookTypes = new LinkedList();
    private static final List overrideSwingItemHookTypes = new LinkedList();
    private static final List afterSwingItemHookTypes = new LinkedList();
    private final PlayerBase beforeSwingItemHooks[];
    private final PlayerBase overrideSwingItemHooks[];
    private final PlayerBase afterSwingItemHooks[];
    protected final boolean isSwingItemModded;
    private static final List beforeUpdateEntityActionStateHookTypes = new LinkedList();
    private static final List overrideUpdateEntityActionStateHookTypes = new LinkedList();
    private static final List afterUpdateEntityActionStateHookTypes = new LinkedList();
    private final PlayerBase beforeUpdateEntityActionStateHooks[];
    private final PlayerBase overrideUpdateEntityActionStateHooks[];
    private final PlayerBase afterUpdateEntityActionStateHooks[];
    protected final boolean isUpdateEntityActionStateModded;
    private static final List beforeWriteEntityToNBTHookTypes = new LinkedList();
    private static final List overrideWriteEntityToNBTHookTypes = new LinkedList();
    private static final List afterWriteEntityToNBTHookTypes = new LinkedList();
    private final PlayerBase beforeWriteEntityToNBTHooks[];
    private final PlayerBase overrideWriteEntityToNBTHooks[];
    private final PlayerBase afterWriteEntityToNBTHooks[];
    protected final boolean isWriteEntityToNBTModded;
    protected final EntityPlayerSP player;
    private static final List beforeLocalConstructingHookTypes = new LinkedList();
    private static final List afterLocalConstructingHookTypes = new LinkedList();
    private final PlayerBase beforeLocalConstructingHooks[];
    private final PlayerBase afterLocalConstructingHooks[];
    private final Map allBaseObjects = new Hashtable();
    private final Set unmodifiableAllBaseIds;
    private static final Map allBaseConstructors;
    private static final Set unmodifiableAllIds;
    private static final Map allBaseBeforeSuperiors = new Hashtable();
    private static final Map allBaseBeforeInferiors = new Hashtable();
    private static final Map allBaseOverrideSuperiors = new Hashtable();
    private static final Map allBaseOverrideInferiors = new Hashtable();
    private static final Map allBaseAfterSuperiors = new Hashtable();
    private static final Map allBaseAfterInferiors = new Hashtable();
    private static boolean initialized = false;

    private static void log(String s)
    {
        System.out.println(s);
        logger.fine(s);
    }

    public static void register(String s, Class class1)
    {
        register(s, class1, null);
    }

    public static void register(String s, Class class1, PlayerBaseSorting playerbasesorting)
    {
        try
        {
            register(class1, s, playerbasesorting);
        }
        catch (RuntimeException runtimeexception)
        {
            if (s != null)
            {
                log((new StringBuilder()).append("PlayerAPI: failed to register id '").append(s).append("'").toString());
            }
            else
            {
                log("PlayerAPI: failed to register PlayerBase");
            }

            throw runtimeexception;
        }
    }

    private static void register(Class class1, String s, PlayerBaseSorting playerbasesorting)
    {
        if (!isCreated)
        {
            log("PlayerAPI 1.1 Created");
            isCreated = true;
        }

        if (s == null)
        {
            throw new NullPointerException("Argument 'id' can not be null");
        }

        if (class1 == null)
        {
            throw new NullPointerException("Argument 'baseClass' can not be null");
        }

        Constructor constructor = (Constructor)allBaseConstructors.get(s);

        if (constructor != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("The class '").append(class1.getName()).append("' can not be registered with the id '").append(s).append("' because the class '").append(constructor.getDeclaringClass().getName()).append("' has allready been registered with the same id").toString());
        }

        Constructor constructor1;

        try
        {
            constructor1 = class1.getDeclaredConstructor(Classes);
        }
        catch (Exception exception)
        {
            try
            {
                constructor1 = class1.getDeclaredConstructor(Class);
            }
            catch (Exception exception1)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Can not find necessary constructor with one argument of type '").append((net.minecraft.src.PlayerAPI.class).getName()).append("' and eventually a second argument of type 'String' in the class '").append(class1.getName()).append("'").toString(), exception);
            }
        }

        allBaseConstructors.put(s, constructor1);

        if (playerbasesorting != null)
        {
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeLocalConstructingSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeLocalConstructingInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterLocalConstructingSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterLocalConstructingInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeAddExhaustionSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeAddExhaustionInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideAddExhaustionSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideAddExhaustionInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterAddExhaustionSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterAddExhaustionInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeAttackEntityFromSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeAttackEntityFromInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideAttackEntityFromSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideAttackEntityFromInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterAttackEntityFromSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterAttackEntityFromInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeAttackTargetEntityWithCurrentItemSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeAttackTargetEntityWithCurrentItemInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideAttackTargetEntityWithCurrentItemSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideAttackTargetEntityWithCurrentItemInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterAttackTargetEntityWithCurrentItemSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterAttackTargetEntityWithCurrentItemInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeCanBreatheUnderwaterSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeCanBreatheUnderwaterInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideCanBreatheUnderwaterSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideCanBreatheUnderwaterInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterCanBreatheUnderwaterSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterCanBreatheUnderwaterInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeCanHarvestBlockSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeCanHarvestBlockInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideCanHarvestBlockSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideCanHarvestBlockInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterCanHarvestBlockSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterCanHarvestBlockInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeCanPlayerEditSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeCanPlayerEditInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideCanPlayerEditSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideCanPlayerEditInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterCanPlayerEditSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterCanPlayerEditInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeCanTriggerWalkingSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeCanTriggerWalkingInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideCanTriggerWalkingSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideCanTriggerWalkingInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterCanTriggerWalkingSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterCanTriggerWalkingInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeCloseScreenSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeCloseScreenInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideCloseScreenSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideCloseScreenInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterCloseScreenSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterCloseScreenInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeDamageEntitySuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeDamageEntityInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideDamageEntitySuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideDamageEntityInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterDamageEntitySuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterDamageEntityInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeDisplayGUIBrewingStandSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeDisplayGUIBrewingStandInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideDisplayGUIBrewingStandSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideDisplayGUIBrewingStandInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterDisplayGUIBrewingStandSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterDisplayGUIBrewingStandInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeDisplayGUIChestSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeDisplayGUIChestInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideDisplayGUIChestSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideDisplayGUIChestInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterDisplayGUIChestSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterDisplayGUIChestInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeDisplayGUIDispenserSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeDisplayGUIDispenserInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideDisplayGUIDispenserSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideDisplayGUIDispenserInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterDisplayGUIDispenserSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterDisplayGUIDispenserInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeDisplayGUIEditSignSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeDisplayGUIEditSignInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideDisplayGUIEditSignSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideDisplayGUIEditSignInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterDisplayGUIEditSignSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterDisplayGUIEditSignInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeDisplayGUIEnchantmentSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeDisplayGUIEnchantmentInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideDisplayGUIEnchantmentSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideDisplayGUIEnchantmentInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterDisplayGUIEnchantmentSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterDisplayGUIEnchantmentInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeDisplayGUIFurnaceSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeDisplayGUIFurnaceInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideDisplayGUIFurnaceSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideDisplayGUIFurnaceInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterDisplayGUIFurnaceSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterDisplayGUIFurnaceInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeDisplayWorkbenchGUISuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeDisplayWorkbenchGUIInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideDisplayWorkbenchGUISuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideDisplayWorkbenchGUIInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterDisplayWorkbenchGUISuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterDisplayWorkbenchGUIInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeDropOneItemSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeDropOneItemInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideDropOneItemSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideDropOneItemInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterDropOneItemSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterDropOneItemInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeDropPlayerItemSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeDropPlayerItemInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideDropPlayerItemSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideDropPlayerItemInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterDropPlayerItemSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterDropPlayerItemInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeDropPlayerItemWithRandomChoiceSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeDropPlayerItemWithRandomChoiceInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideDropPlayerItemWithRandomChoiceSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideDropPlayerItemWithRandomChoiceInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterDropPlayerItemWithRandomChoiceSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterDropPlayerItemWithRandomChoiceInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeFallSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeFallInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideFallSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideFallInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterFallSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterFallInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeGetBrightnessSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeGetBrightnessInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideGetBrightnessSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideGetBrightnessInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterGetBrightnessSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterGetBrightnessInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeGetBrightnessForRenderSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeGetBrightnessForRenderInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideGetBrightnessForRenderSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideGetBrightnessForRenderInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterGetBrightnessForRenderSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterGetBrightnessForRenderInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeGetCurrentPlayerStrVsBlockSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeGetCurrentPlayerStrVsBlockInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideGetCurrentPlayerStrVsBlockSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideGetCurrentPlayerStrVsBlockInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterGetCurrentPlayerStrVsBlockSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterGetCurrentPlayerStrVsBlockInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeGetDistanceSqSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeGetDistanceSqInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideGetDistanceSqSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideGetDistanceSqInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterGetDistanceSqSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterGetDistanceSqInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeGetDistanceSqToEntitySuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeGetDistanceSqToEntityInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideGetDistanceSqToEntitySuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideGetDistanceSqToEntityInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterGetDistanceSqToEntitySuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterGetDistanceSqToEntityInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeGetFOVMultiplierSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeGetFOVMultiplierInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideGetFOVMultiplierSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideGetFOVMultiplierInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterGetFOVMultiplierSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterGetFOVMultiplierInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeGetHurtSoundSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeGetHurtSoundInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideGetHurtSoundSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideGetHurtSoundInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterGetHurtSoundSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterGetHurtSoundInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeGetItemIconSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeGetItemIconInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideGetItemIconSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideGetItemIconInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterGetItemIconSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterGetItemIconInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeGetSleepTimerSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeGetSleepTimerInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideGetSleepTimerSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideGetSleepTimerInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterGetSleepTimerSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterGetSleepTimerInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeGetSpeedModifierSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeGetSpeedModifierInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideGetSpeedModifierSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideGetSpeedModifierInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterGetSpeedModifierSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterGetSpeedModifierInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeHandleLavaMovementSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeHandleLavaMovementInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideHandleLavaMovementSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideHandleLavaMovementInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterHandleLavaMovementSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterHandleLavaMovementInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeHandleWaterMovementSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeHandleWaterMovementInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideHandleWaterMovementSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideHandleWaterMovementInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterHandleWaterMovementSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterHandleWaterMovementInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeHealSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeHealInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideHealSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideHealInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterHealSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterHealInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeIsEntityInsideOpaqueBlockSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeIsEntityInsideOpaqueBlockInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideIsEntityInsideOpaqueBlockSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideIsEntityInsideOpaqueBlockInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterIsEntityInsideOpaqueBlockSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterIsEntityInsideOpaqueBlockInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeIsInWaterSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeIsInWaterInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideIsInWaterSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideIsInWaterInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterIsInWaterSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterIsInWaterInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeIsInsideOfMaterialSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeIsInsideOfMaterialInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideIsInsideOfMaterialSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideIsInsideOfMaterialInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterIsInsideOfMaterialSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterIsInsideOfMaterialInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeIsOnLadderSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeIsOnLadderInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideIsOnLadderSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideIsOnLadderInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterIsOnLadderSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterIsOnLadderInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeIsSneakingSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeIsSneakingInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideIsSneakingSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideIsSneakingInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterIsSneakingSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterIsSneakingInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeIsSprintingSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeIsSprintingInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideIsSprintingSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideIsSprintingInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterIsSprintingSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterIsSprintingInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeJumpSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeJumpInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideJumpSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideJumpInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterJumpSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterJumpInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeKnockBackSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeKnockBackInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideKnockBackSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideKnockBackInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterKnockBackSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterKnockBackInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeMoveEntitySuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeMoveEntityInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideMoveEntitySuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideMoveEntityInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterMoveEntitySuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterMoveEntityInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeMoveEntityWithHeadingSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeMoveEntityWithHeadingInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideMoveEntityWithHeadingSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideMoveEntityWithHeadingInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterMoveEntityWithHeadingSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterMoveEntityWithHeadingInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeMoveFlyingSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeMoveFlyingInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideMoveFlyingSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideMoveFlyingInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterMoveFlyingSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterMoveFlyingInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeOnDeathSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeOnDeathInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideOnDeathSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideOnDeathInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterOnDeathSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterOnDeathInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeOnLivingUpdateSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeOnLivingUpdateInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideOnLivingUpdateSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideOnLivingUpdateInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterOnLivingUpdateSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterOnLivingUpdateInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeOnKillEntitySuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeOnKillEntityInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideOnKillEntitySuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideOnKillEntityInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterOnKillEntitySuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterOnKillEntityInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeOnUpdateSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeOnUpdateInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideOnUpdateSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideOnUpdateInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterOnUpdateSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterOnUpdateInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforePushOutOfBlocksSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforePushOutOfBlocksInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverridePushOutOfBlocksSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverridePushOutOfBlocksInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterPushOutOfBlocksSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterPushOutOfBlocksInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeRayTraceSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeRayTraceInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideRayTraceSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideRayTraceInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterRayTraceSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterRayTraceInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeReadEntityFromNBTSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeReadEntityFromNBTInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideReadEntityFromNBTSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideReadEntityFromNBTInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterReadEntityFromNBTSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterReadEntityFromNBTInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeRespawnPlayerSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeRespawnPlayerInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideRespawnPlayerSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideRespawnPlayerInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterRespawnPlayerSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterRespawnPlayerInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeSendChatMessageSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeSendChatMessageInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideSendChatMessageSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideSendChatMessageInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterSendChatMessageSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterSendChatMessageInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeSetDeadSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeSetDeadInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideSetDeadSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideSetDeadInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterSetDeadSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterSetDeadInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeSetPositionAndRotationSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeSetPositionAndRotationInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideSetPositionAndRotationSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideSetPositionAndRotationInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterSetPositionAndRotationSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterSetPositionAndRotationInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeSleepInBedAtSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeSleepInBedAtInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideSleepInBedAtSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideSleepInBedAtInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterSleepInBedAtSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterSleepInBedAtInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeSwingItemSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeSwingItemInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideSwingItemSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideSwingItemInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterSwingItemSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterSwingItemInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeUpdateEntityActionStateSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeUpdateEntityActionStateInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideUpdateEntityActionStateSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideUpdateEntityActionStateInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterUpdateEntityActionStateSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterUpdateEntityActionStateInferiors());
            addSorting(s, allBaseBeforeSuperiors, playerbasesorting.getBeforeWriteEntityToNBTSuperiors());
            addSorting(s, allBaseBeforeInferiors, playerbasesorting.getBeforeWriteEntityToNBTInferiors());
            addSorting(s, allBaseOverrideSuperiors, playerbasesorting.getOverrideWriteEntityToNBTSuperiors());
            addSorting(s, allBaseOverrideInferiors, playerbasesorting.getOverrideWriteEntityToNBTInferiors());
            addSorting(s, allBaseAfterSuperiors, playerbasesorting.getAfterWriteEntityToNBTSuperiors());
            addSorting(s, allBaseAfterInferiors, playerbasesorting.getAfterWriteEntityToNBTInferiors());
        }

        addMethod(s, class1, beforeLocalConstructingHookTypes, "beforeLocalConstructing", new Class[]
                {
                    net.minecraft.client.Minecraft.class, net.minecraft.src.World.class, net.minecraft.src.Session.class, Integer.TYPE
                });
        addMethod(s, class1, afterLocalConstructingHookTypes, "afterLocalConstructing", new Class[]
                {
                    net.minecraft.client.Minecraft.class, net.minecraft.src.World.class, net.minecraft.src.Session.class, Integer.TYPE
                });
        addMethod(s, class1, beforeAddExhaustionHookTypes, "beforeAddExhaustion", new Class[]
                {
                    Float.TYPE
                });
        addMethod(s, class1, overrideAddExhaustionHookTypes, "addExhaustion", new Class[]
                {
                    Float.TYPE
                });
        addMethod(s, class1, afterAddExhaustionHookTypes, "afterAddExhaustion", new Class[]
                {
                    Float.TYPE
                });
        addMethod(s, class1, beforeAttackEntityFromHookTypes, "beforeAttackEntityFrom", new Class[]
                {
                    net.minecraft.src.DamageSource.class, Integer.TYPE
                });
        addMethod(s, class1, overrideAttackEntityFromHookTypes, "attackEntityFrom", new Class[]
                {
                    net.minecraft.src.DamageSource.class, Integer.TYPE
                });
        addMethod(s, class1, afterAttackEntityFromHookTypes, "afterAttackEntityFrom", new Class[]
                {
                    net.minecraft.src.DamageSource.class, Integer.TYPE
                });
        addMethod(s, class1, beforeAttackTargetEntityWithCurrentItemHookTypes, "beforeAttackTargetEntityWithCurrentItem", new Class[]
                {
                    net.minecraft.src.Entity.class
                });
        addMethod(s, class1, overrideAttackTargetEntityWithCurrentItemHookTypes, "attackTargetEntityWithCurrentItem", new Class[]
                {
                    net.minecraft.src.Entity.class
                });
        addMethod(s, class1, afterAttackTargetEntityWithCurrentItemHookTypes, "afterAttackTargetEntityWithCurrentItem", new Class[]
                {
                    net.minecraft.src.Entity.class
                });
        addMethod(s, class1, beforeCanBreatheUnderwaterHookTypes, "beforeCanBreatheUnderwater", new Class[0]);
        addMethod(s, class1, overrideCanBreatheUnderwaterHookTypes, "canBreatheUnderwater", new Class[0]);
        addMethod(s, class1, afterCanBreatheUnderwaterHookTypes, "afterCanBreatheUnderwater", new Class[0]);
        addMethod(s, class1, beforeCanHarvestBlockHookTypes, "beforeCanHarvestBlock", new Class[]
                {
                    net.minecraft.src.Block.class
                });
        addMethod(s, class1, overrideCanHarvestBlockHookTypes, "canHarvestBlock", new Class[]
                {
                    net.minecraft.src.Block.class
                });
        addMethod(s, class1, afterCanHarvestBlockHookTypes, "afterCanHarvestBlock", new Class[]
                {
                    net.minecraft.src.Block.class
                });
        addMethod(s, class1, beforeCanPlayerEditHookTypes, "beforeCanPlayerEdit", new Class[]
                {
                    Integer.TYPE, Integer.TYPE, Integer.TYPE
                });
        addMethod(s, class1, overrideCanPlayerEditHookTypes, "canPlayerEdit", new Class[]
                {
                    Integer.TYPE, Integer.TYPE, Integer.TYPE
                });
        addMethod(s, class1, afterCanPlayerEditHookTypes, "afterCanPlayerEdit", new Class[]
                {
                    Integer.TYPE, Integer.TYPE, Integer.TYPE
                });
        addMethod(s, class1, beforeCanTriggerWalkingHookTypes, "beforeCanTriggerWalking", new Class[0]);
        addMethod(s, class1, overrideCanTriggerWalkingHookTypes, "canTriggerWalking", new Class[0]);
        addMethod(s, class1, afterCanTriggerWalkingHookTypes, "afterCanTriggerWalking", new Class[0]);
        addMethod(s, class1, beforeCloseScreenHookTypes, "beforeCloseScreen", new Class[0]);
        addMethod(s, class1, overrideCloseScreenHookTypes, "closeScreen", new Class[0]);
        addMethod(s, class1, afterCloseScreenHookTypes, "afterCloseScreen", new Class[0]);
        addMethod(s, class1, beforeDamageEntityHookTypes, "beforeDamageEntity", new Class[]
                {
                    net.minecraft.src.DamageSource.class, Integer.TYPE
                });
        addMethod(s, class1, overrideDamageEntityHookTypes, "damageEntity", new Class[]
                {
                    net.minecraft.src.DamageSource.class, Integer.TYPE
                });
        addMethod(s, class1, afterDamageEntityHookTypes, "afterDamageEntity", new Class[]
                {
                    net.minecraft.src.DamageSource.class, Integer.TYPE
                });
        addMethod(s, class1, beforeDisplayGUIBrewingStandHookTypes, "beforeDisplayGUIBrewingStand", new Class[]
                {
                    net.minecraft.src.TileEntityBrewingStand.class
                });
        addMethod(s, class1, overrideDisplayGUIBrewingStandHookTypes, "displayGUIBrewingStand", new Class[]
                {
                    net.minecraft.src.TileEntityBrewingStand.class
                });
        addMethod(s, class1, afterDisplayGUIBrewingStandHookTypes, "afterDisplayGUIBrewingStand", new Class[]
                {
                    net.minecraft.src.TileEntityBrewingStand.class
                });
        addMethod(s, class1, beforeDisplayGUIChestHookTypes, "beforeDisplayGUIChest", new Class[]
                {
                    net.minecraft.src.IInventory.class
                });
        addMethod(s, class1, overrideDisplayGUIChestHookTypes, "displayGUIChest", new Class[]
                {
                    net.minecraft.src.IInventory.class
                });
        addMethod(s, class1, afterDisplayGUIChestHookTypes, "afterDisplayGUIChest", new Class[]
                {
                    net.minecraft.src.IInventory.class
                });
        addMethod(s, class1, beforeDisplayGUIDispenserHookTypes, "beforeDisplayGUIDispenser", new Class[]
                {
                    net.minecraft.src.TileEntityDispenser.class
                });
        addMethod(s, class1, overrideDisplayGUIDispenserHookTypes, "displayGUIDispenser", new Class[]
                {
                    net.minecraft.src.TileEntityDispenser.class
                });
        addMethod(s, class1, afterDisplayGUIDispenserHookTypes, "afterDisplayGUIDispenser", new Class[]
                {
                    net.minecraft.src.TileEntityDispenser.class
                });
        addMethod(s, class1, beforeDisplayGUIEditSignHookTypes, "beforeDisplayGUIEditSign", new Class[]
                {
                    net.minecraft.src.TileEntitySign.class
                });
        addMethod(s, class1, overrideDisplayGUIEditSignHookTypes, "displayGUIEditSign", new Class[]
                {
                    net.minecraft.src.TileEntitySign.class
                });
        addMethod(s, class1, afterDisplayGUIEditSignHookTypes, "afterDisplayGUIEditSign", new Class[]
                {
                    net.minecraft.src.TileEntitySign.class
                });
        addMethod(s, class1, beforeDisplayGUIEnchantmentHookTypes, "beforeDisplayGUIEnchantment", new Class[]
                {
                    Integer.TYPE, Integer.TYPE, Integer.TYPE
                });
        addMethod(s, class1, overrideDisplayGUIEnchantmentHookTypes, "displayGUIEnchantment", new Class[]
                {
                    Integer.TYPE, Integer.TYPE, Integer.TYPE
                });
        addMethod(s, class1, afterDisplayGUIEnchantmentHookTypes, "afterDisplayGUIEnchantment", new Class[]
                {
                    Integer.TYPE, Integer.TYPE, Integer.TYPE
                });
        addMethod(s, class1, beforeDisplayGUIFurnaceHookTypes, "beforeDisplayGUIFurnace", new Class[]
                {
                    net.minecraft.src.TileEntityFurnace.class
                });
        addMethod(s, class1, overrideDisplayGUIFurnaceHookTypes, "displayGUIFurnace", new Class[]
                {
                    net.minecraft.src.TileEntityFurnace.class
                });
        addMethod(s, class1, afterDisplayGUIFurnaceHookTypes, "afterDisplayGUIFurnace", new Class[]
                {
                    net.minecraft.src.TileEntityFurnace.class
                });
        addMethod(s, class1, beforeDisplayWorkbenchGUIHookTypes, "beforeDisplayWorkbenchGUI", new Class[]
                {
                    Integer.TYPE, Integer.TYPE, Integer.TYPE
                });
        addMethod(s, class1, overrideDisplayWorkbenchGUIHookTypes, "displayWorkbenchGUI", new Class[]
                {
                    Integer.TYPE, Integer.TYPE, Integer.TYPE
                });
        addMethod(s, class1, afterDisplayWorkbenchGUIHookTypes, "afterDisplayWorkbenchGUI", new Class[]
                {
                    Integer.TYPE, Integer.TYPE, Integer.TYPE
                });
        addMethod(s, class1, beforeDropOneItemHookTypes, "beforeDropOneItem", new Class[0]);
        addMethod(s, class1, overrideDropOneItemHookTypes, "dropOneItem", new Class[0]);
        addMethod(s, class1, afterDropOneItemHookTypes, "afterDropOneItem", new Class[0]);
        addMethod(s, class1, beforeDropPlayerItemHookTypes, "beforeDropPlayerItem", new Class[]
                {
                    net.minecraft.src.ItemStack.class
                });
        addMethod(s, class1, overrideDropPlayerItemHookTypes, "dropPlayerItem", new Class[]
                {
                    net.minecraft.src.ItemStack.class
                });
        addMethod(s, class1, afterDropPlayerItemHookTypes, "afterDropPlayerItem", new Class[]
                {
                    net.minecraft.src.ItemStack.class
                });
        addMethod(s, class1, beforeDropPlayerItemWithRandomChoiceHookTypes, "beforeDropPlayerItemWithRandomChoice", new Class[]
                {
                    net.minecraft.src.ItemStack.class, Boolean.TYPE
                });
        addMethod(s, class1, overrideDropPlayerItemWithRandomChoiceHookTypes, "dropPlayerItemWithRandomChoice", new Class[]
                {
                    net.minecraft.src.ItemStack.class, Boolean.TYPE
                });
        addMethod(s, class1, afterDropPlayerItemWithRandomChoiceHookTypes, "afterDropPlayerItemWithRandomChoice", new Class[]
                {
                    net.minecraft.src.ItemStack.class, Boolean.TYPE
                });
        addMethod(s, class1, beforeFallHookTypes, "beforeFall", new Class[]
                {
                    Float.TYPE
                });
        addMethod(s, class1, overrideFallHookTypes, "fall", new Class[]
                {
                    Float.TYPE
                });
        addMethod(s, class1, afterFallHookTypes, "afterFall", new Class[]
                {
                    Float.TYPE
                });
        addMethod(s, class1, beforeGetBrightnessHookTypes, "beforeGetBrightness", new Class[]
                {
                    Float.TYPE
                });
        addMethod(s, class1, overrideGetBrightnessHookTypes, "getBrightness", new Class[]
                {
                    Float.TYPE
                });
        addMethod(s, class1, afterGetBrightnessHookTypes, "afterGetBrightness", new Class[]
                {
                    Float.TYPE
                });
        addMethod(s, class1, beforeGetBrightnessForRenderHookTypes, "beforeGetBrightnessForRender", new Class[]
                {
                    Float.TYPE
                });
        addMethod(s, class1, overrideGetBrightnessForRenderHookTypes, "getBrightnessForRender", new Class[]
                {
                    Float.TYPE
                });
        addMethod(s, class1, afterGetBrightnessForRenderHookTypes, "afterGetBrightnessForRender", new Class[]
                {
                    Float.TYPE
                });
        addMethod(s, class1, beforeGetCurrentPlayerStrVsBlockHookTypes, "beforeGetCurrentPlayerStrVsBlock", new Class[]
                {
                    net.minecraft.src.Block.class
                });
        addMethod(s, class1, overrideGetCurrentPlayerStrVsBlockHookTypes, "getCurrentPlayerStrVsBlock", new Class[]
                {
                    net.minecraft.src.Block.class
                });
        addMethod(s, class1, afterGetCurrentPlayerStrVsBlockHookTypes, "afterGetCurrentPlayerStrVsBlock", new Class[]
                {
                    net.minecraft.src.Block.class
                });
        addMethod(s, class1, beforeGetDistanceSqHookTypes, "beforeGetDistanceSq", new Class[]
                {
                    Double.TYPE, Double.TYPE, Double.TYPE
                });
        addMethod(s, class1, overrideGetDistanceSqHookTypes, "getDistanceSq", new Class[]
                {
                    Double.TYPE, Double.TYPE, Double.TYPE
                });
        addMethod(s, class1, afterGetDistanceSqHookTypes, "afterGetDistanceSq", new Class[]
                {
                    Double.TYPE, Double.TYPE, Double.TYPE
                });
        addMethod(s, class1, beforeGetDistanceSqToEntityHookTypes, "beforeGetDistanceSqToEntity", new Class[]
                {
                    net.minecraft.src.Entity.class
                });
        addMethod(s, class1, overrideGetDistanceSqToEntityHookTypes, "getDistanceSqToEntity", new Class[]
                {
                    net.minecraft.src.Entity.class
                });
        addMethod(s, class1, afterGetDistanceSqToEntityHookTypes, "afterGetDistanceSqToEntity", new Class[]
                {
                    net.minecraft.src.Entity.class
                });
        addMethod(s, class1, beforeGetFOVMultiplierHookTypes, "beforeGetFOVMultiplier", new Class[0]);
        addMethod(s, class1, overrideGetFOVMultiplierHookTypes, "getFOVMultiplier", new Class[0]);
        addMethod(s, class1, afterGetFOVMultiplierHookTypes, "afterGetFOVMultiplier", new Class[0]);
        addMethod(s, class1, beforeGetHurtSoundHookTypes, "beforeGetHurtSound", new Class[0]);
        addMethod(s, class1, overrideGetHurtSoundHookTypes, "getHurtSound", new Class[0]);
        addMethod(s, class1, afterGetHurtSoundHookTypes, "afterGetHurtSound", new Class[0]);
        addMethod(s, class1, beforeGetItemIconHookTypes, "beforeGetItemIcon", new Class[]
                {
                    net.minecraft.src.ItemStack.class, Integer.TYPE
                });
        addMethod(s, class1, overrideGetItemIconHookTypes, "getItemIcon", new Class[]
                {
                    net.minecraft.src.ItemStack.class, Integer.TYPE
                });
        addMethod(s, class1, afterGetItemIconHookTypes, "afterGetItemIcon", new Class[]
                {
                    net.minecraft.src.ItemStack.class, Integer.TYPE
                });
        addMethod(s, class1, beforeGetSleepTimerHookTypes, "beforeGetSleepTimer", new Class[0]);
        addMethod(s, class1, overrideGetSleepTimerHookTypes, "getSleepTimer", new Class[0]);
        addMethod(s, class1, afterGetSleepTimerHookTypes, "afterGetSleepTimer", new Class[0]);
        addMethod(s, class1, beforeGetSpeedModifierHookTypes, "beforeGetSpeedModifier", new Class[0]);
        addMethod(s, class1, overrideGetSpeedModifierHookTypes, "getSpeedModifier", new Class[0]);
        addMethod(s, class1, afterGetSpeedModifierHookTypes, "afterGetSpeedModifier", new Class[0]);
        addMethod(s, class1, beforeHandleLavaMovementHookTypes, "beforeHandleLavaMovement", new Class[0]);
        addMethod(s, class1, overrideHandleLavaMovementHookTypes, "handleLavaMovement", new Class[0]);
        addMethod(s, class1, afterHandleLavaMovementHookTypes, "afterHandleLavaMovement", new Class[0]);
        addMethod(s, class1, beforeHandleWaterMovementHookTypes, "beforeHandleWaterMovement", new Class[0]);
        addMethod(s, class1, overrideHandleWaterMovementHookTypes, "handleWaterMovement", new Class[0]);
        addMethod(s, class1, afterHandleWaterMovementHookTypes, "afterHandleWaterMovement", new Class[0]);
        addMethod(s, class1, beforeHealHookTypes, "beforeHeal", new Class[]
                {
                    Integer.TYPE
                });
        addMethod(s, class1, overrideHealHookTypes, "heal", new Class[]
                {
                    Integer.TYPE
                });
        addMethod(s, class1, afterHealHookTypes, "afterHeal", new Class[]
                {
                    Integer.TYPE
                });
        addMethod(s, class1, beforeIsEntityInsideOpaqueBlockHookTypes, "beforeIsEntityInsideOpaqueBlock", new Class[0]);
        addMethod(s, class1, overrideIsEntityInsideOpaqueBlockHookTypes, "isEntityInsideOpaqueBlock", new Class[0]);
        addMethod(s, class1, afterIsEntityInsideOpaqueBlockHookTypes, "afterIsEntityInsideOpaqueBlock", new Class[0]);
        addMethod(s, class1, beforeIsInWaterHookTypes, "beforeIsInWater", new Class[0]);
        addMethod(s, class1, overrideIsInWaterHookTypes, "isInWater", new Class[0]);
        addMethod(s, class1, afterIsInWaterHookTypes, "afterIsInWater", new Class[0]);
        addMethod(s, class1, beforeIsInsideOfMaterialHookTypes, "beforeIsInsideOfMaterial", new Class[]
                {
                    net.minecraft.src.Material.class
                });
        addMethod(s, class1, overrideIsInsideOfMaterialHookTypes, "isInsideOfMaterial", new Class[]
                {
                    net.minecraft.src.Material.class
                });
        addMethod(s, class1, afterIsInsideOfMaterialHookTypes, "afterIsInsideOfMaterial", new Class[]
                {
                    net.minecraft.src.Material.class
                });
        addMethod(s, class1, beforeIsOnLadderHookTypes, "beforeIsOnLadder", new Class[0]);
        addMethod(s, class1, overrideIsOnLadderHookTypes, "isOnLadder", new Class[0]);
        addMethod(s, class1, afterIsOnLadderHookTypes, "afterIsOnLadder", new Class[0]);
        addMethod(s, class1, beforeIsSneakingHookTypes, "beforeIsSneaking", new Class[0]);
        addMethod(s, class1, overrideIsSneakingHookTypes, "isSneaking", new Class[0]);
        addMethod(s, class1, afterIsSneakingHookTypes, "afterIsSneaking", new Class[0]);
        addMethod(s, class1, beforeIsSprintingHookTypes, "beforeIsSprinting", new Class[0]);
        addMethod(s, class1, overrideIsSprintingHookTypes, "isSprinting", new Class[0]);
        addMethod(s, class1, afterIsSprintingHookTypes, "afterIsSprinting", new Class[0]);
        addMethod(s, class1, beforeJumpHookTypes, "beforeJump", new Class[0]);
        addMethod(s, class1, overrideJumpHookTypes, "jump", new Class[0]);
        addMethod(s, class1, afterJumpHookTypes, "afterJump", new Class[0]);
        addMethod(s, class1, beforeKnockBackHookTypes, "beforeKnockBack", new Class[]
                {
                    net.minecraft.src.Entity.class, Integer.TYPE, Double.TYPE, Double.TYPE
                });
        addMethod(s, class1, overrideKnockBackHookTypes, "knockBack", new Class[]
                {
                    net.minecraft.src.Entity.class, Integer.TYPE, Double.TYPE, Double.TYPE
                });
        addMethod(s, class1, afterKnockBackHookTypes, "afterKnockBack", new Class[]
                {
                    net.minecraft.src.Entity.class, Integer.TYPE, Double.TYPE, Double.TYPE
                });
        addMethod(s, class1, beforeMoveEntityHookTypes, "beforeMoveEntity", new Class[]
                {
                    Double.TYPE, Double.TYPE, Double.TYPE
                });
        addMethod(s, class1, overrideMoveEntityHookTypes, "moveEntity", new Class[]
                {
                    Double.TYPE, Double.TYPE, Double.TYPE
                });
        addMethod(s, class1, afterMoveEntityHookTypes, "afterMoveEntity", new Class[]
                {
                    Double.TYPE, Double.TYPE, Double.TYPE
                });
        addMethod(s, class1, beforeMoveEntityWithHeadingHookTypes, "beforeMoveEntityWithHeading", new Class[]
                {
                    Float.TYPE, Float.TYPE
                });
        addMethod(s, class1, overrideMoveEntityWithHeadingHookTypes, "moveEntityWithHeading", new Class[]
                {
                    Float.TYPE, Float.TYPE
                });
        addMethod(s, class1, afterMoveEntityWithHeadingHookTypes, "afterMoveEntityWithHeading", new Class[]
                {
                    Float.TYPE, Float.TYPE
                });
        addMethod(s, class1, beforeMoveFlyingHookTypes, "beforeMoveFlying", new Class[]
                {
                    Float.TYPE, Float.TYPE, Float.TYPE
                });
        addMethod(s, class1, overrideMoveFlyingHookTypes, "moveFlying", new Class[]
                {
                    Float.TYPE, Float.TYPE, Float.TYPE
                });
        addMethod(s, class1, afterMoveFlyingHookTypes, "afterMoveFlying", new Class[]
                {
                    Float.TYPE, Float.TYPE, Float.TYPE
                });
        addMethod(s, class1, beforeOnDeathHookTypes, "beforeOnDeath", new Class[]
                {
                    net.minecraft.src.DamageSource.class
                });
        addMethod(s, class1, overrideOnDeathHookTypes, "onDeath", new Class[]
                {
                    net.minecraft.src.DamageSource.class
                });
        addMethod(s, class1, afterOnDeathHookTypes, "afterOnDeath", new Class[]
                {
                    net.minecraft.src.DamageSource.class
                });
        addMethod(s, class1, beforeOnLivingUpdateHookTypes, "beforeOnLivingUpdate", new Class[0]);
        addMethod(s, class1, overrideOnLivingUpdateHookTypes, "onLivingUpdate", new Class[0]);
        addMethod(s, class1, afterOnLivingUpdateHookTypes, "afterOnLivingUpdate", new Class[0]);
        addMethod(s, class1, beforeOnKillEntityHookTypes, "beforeOnKillEntity", new Class[]
                {
                    net.minecraft.src.EntityLiving.class
                });
        addMethod(s, class1, overrideOnKillEntityHookTypes, "onKillEntity", new Class[]
                {
                    net.minecraft.src.EntityLiving.class
                });
        addMethod(s, class1, afterOnKillEntityHookTypes, "afterOnKillEntity", new Class[]
                {
                    net.minecraft.src.EntityLiving.class
                });
        addMethod(s, class1, beforeOnUpdateHookTypes, "beforeOnUpdate", new Class[0]);
        addMethod(s, class1, overrideOnUpdateHookTypes, "onUpdate", new Class[0]);
        addMethod(s, class1, afterOnUpdateHookTypes, "afterOnUpdate", new Class[0]);
        addMethod(s, class1, beforePushOutOfBlocksHookTypes, "beforePushOutOfBlocks", new Class[]
                {
                    Double.TYPE, Double.TYPE, Double.TYPE
                });
        addMethod(s, class1, overridePushOutOfBlocksHookTypes, "pushOutOfBlocks", new Class[]
                {
                    Double.TYPE, Double.TYPE, Double.TYPE
                });
        addMethod(s, class1, afterPushOutOfBlocksHookTypes, "afterPushOutOfBlocks", new Class[]
                {
                    Double.TYPE, Double.TYPE, Double.TYPE
                });
        addMethod(s, class1, beforeRayTraceHookTypes, "beforeRayTrace", new Class[]
                {
                    Double.TYPE, Float.TYPE
                });
        addMethod(s, class1, overrideRayTraceHookTypes, "rayTrace", new Class[]
                {
                    Double.TYPE, Float.TYPE
                });
        addMethod(s, class1, afterRayTraceHookTypes, "afterRayTrace", new Class[]
                {
                    Double.TYPE, Float.TYPE
                });
        addMethod(s, class1, beforeReadEntityFromNBTHookTypes, "beforeReadEntityFromNBT", new Class[]
                {
                    net.minecraft.src.NBTTagCompound.class
                });
        addMethod(s, class1, overrideReadEntityFromNBTHookTypes, "readEntityFromNBT", new Class[]
                {
                    net.minecraft.src.NBTTagCompound.class
                });
        addMethod(s, class1, afterReadEntityFromNBTHookTypes, "afterReadEntityFromNBT", new Class[]
                {
                    net.minecraft.src.NBTTagCompound.class
                });
        addMethod(s, class1, beforeRespawnPlayerHookTypes, "beforeRespawnPlayer", new Class[0]);
        addMethod(s, class1, overrideRespawnPlayerHookTypes, "respawnPlayer", new Class[0]);
        addMethod(s, class1, afterRespawnPlayerHookTypes, "afterRespawnPlayer", new Class[0]);
        addMethod(s, class1, beforeSendChatMessageHookTypes, "beforeSendChatMessage", new Class[]
                {
                    java.lang.String.class
                });
        addMethod(s, class1, overrideSendChatMessageHookTypes, "sendChatMessage", new Class[]
                {
                    java.lang.String.class
                });
        addMethod(s, class1, afterSendChatMessageHookTypes, "afterSendChatMessage", new Class[]
                {
                    java.lang.String.class
                });
        addMethod(s, class1, beforeSetDeadHookTypes, "beforeSetDead", new Class[0]);
        addMethod(s, class1, overrideSetDeadHookTypes, "setDead", new Class[0]);
        addMethod(s, class1, afterSetDeadHookTypes, "afterSetDead", new Class[0]);
        addMethod(s, class1, beforeSetPositionAndRotationHookTypes, "beforeSetPositionAndRotation", new Class[]
                {
                    Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE
                });
        addMethod(s, class1, overrideSetPositionAndRotationHookTypes, "setPositionAndRotation", new Class[]
                {
                    Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE
                });
        addMethod(s, class1, afterSetPositionAndRotationHookTypes, "afterSetPositionAndRotation", new Class[]
                {
                    Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE
                });
        addMethod(s, class1, beforeSleepInBedAtHookTypes, "beforeSleepInBedAt", new Class[]
                {
                    Integer.TYPE, Integer.TYPE, Integer.TYPE
                });
        addMethod(s, class1, overrideSleepInBedAtHookTypes, "sleepInBedAt", new Class[]
                {
                    Integer.TYPE, Integer.TYPE, Integer.TYPE
                });
        addMethod(s, class1, afterSleepInBedAtHookTypes, "afterSleepInBedAt", new Class[]
                {
                    Integer.TYPE, Integer.TYPE, Integer.TYPE
                });
        addMethod(s, class1, beforeSwingItemHookTypes, "beforeSwingItem", new Class[0]);
        addMethod(s, class1, overrideSwingItemHookTypes, "swingItem", new Class[0]);
        addMethod(s, class1, afterSwingItemHookTypes, "afterSwingItem", new Class[0]);
        addMethod(s, class1, beforeUpdateEntityActionStateHookTypes, "beforeUpdateEntityActionState", new Class[0]);
        addMethod(s, class1, overrideUpdateEntityActionStateHookTypes, "updateEntityActionState", new Class[0]);
        addMethod(s, class1, afterUpdateEntityActionStateHookTypes, "afterUpdateEntityActionState", new Class[0]);
        addMethod(s, class1, beforeWriteEntityToNBTHookTypes, "beforeWriteEntityToNBT", new Class[]
                {
                    net.minecraft.src.NBTTagCompound.class
                });
        addMethod(s, class1, overrideWriteEntityToNBTHookTypes, "writeEntityToNBT", new Class[]
                {
                    net.minecraft.src.NBTTagCompound.class
                });
        addMethod(s, class1, afterWriteEntityToNBTHookTypes, "afterWriteEntityToNBT", new Class[]
                {
                    net.minecraft.src.NBTTagCompound.class
                });
        System.out.println((new StringBuilder()).append("PlayerAPI: registered ").append(s).toString());
        logger.fine((new StringBuilder()).append("PlayerAPI: registered class '").append(class1.getName()).append("' with id '").append(s).append("'").toString());
        initialized = false;
    }

    public static boolean unregister(String s)
    {
        if (s != null && allBaseConstructors.remove(s) != null)
        {
            allBaseBeforeSuperiors.remove(s);
            allBaseBeforeInferiors.remove(s);
            allBaseOverrideSuperiors.remove(s);
            allBaseOverrideInferiors.remove(s);
            allBaseAfterSuperiors.remove(s);
            allBaseAfterInferiors.remove(s);
            beforeLocalConstructingHookTypes.remove(s);
            afterLocalConstructingHookTypes.remove(s);
            beforeAddExhaustionHookTypes.remove(s);
            overrideAddExhaustionHookTypes.remove(s);
            afterAddExhaustionHookTypes.remove(s);
            beforeAttackEntityFromHookTypes.remove(s);
            overrideAttackEntityFromHookTypes.remove(s);
            afterAttackEntityFromHookTypes.remove(s);
            beforeAttackTargetEntityWithCurrentItemHookTypes.remove(s);
            overrideAttackTargetEntityWithCurrentItemHookTypes.remove(s);
            afterAttackTargetEntityWithCurrentItemHookTypes.remove(s);
            beforeCanBreatheUnderwaterHookTypes.remove(s);
            overrideCanBreatheUnderwaterHookTypes.remove(s);
            afterCanBreatheUnderwaterHookTypes.remove(s);
            beforeCanHarvestBlockHookTypes.remove(s);
            overrideCanHarvestBlockHookTypes.remove(s);
            afterCanHarvestBlockHookTypes.remove(s);
            beforeCanPlayerEditHookTypes.remove(s);
            overrideCanPlayerEditHookTypes.remove(s);
            afterCanPlayerEditHookTypes.remove(s);
            beforeCanTriggerWalkingHookTypes.remove(s);
            overrideCanTriggerWalkingHookTypes.remove(s);
            afterCanTriggerWalkingHookTypes.remove(s);
            beforeCloseScreenHookTypes.remove(s);
            overrideCloseScreenHookTypes.remove(s);
            afterCloseScreenHookTypes.remove(s);
            beforeDamageEntityHookTypes.remove(s);
            overrideDamageEntityHookTypes.remove(s);
            afterDamageEntityHookTypes.remove(s);
            beforeDisplayGUIBrewingStandHookTypes.remove(s);
            overrideDisplayGUIBrewingStandHookTypes.remove(s);
            afterDisplayGUIBrewingStandHookTypes.remove(s);
            beforeDisplayGUIChestHookTypes.remove(s);
            overrideDisplayGUIChestHookTypes.remove(s);
            afterDisplayGUIChestHookTypes.remove(s);
            beforeDisplayGUIDispenserHookTypes.remove(s);
            overrideDisplayGUIDispenserHookTypes.remove(s);
            afterDisplayGUIDispenserHookTypes.remove(s);
            beforeDisplayGUIEditSignHookTypes.remove(s);
            overrideDisplayGUIEditSignHookTypes.remove(s);
            afterDisplayGUIEditSignHookTypes.remove(s);
            beforeDisplayGUIEnchantmentHookTypes.remove(s);
            overrideDisplayGUIEnchantmentHookTypes.remove(s);
            afterDisplayGUIEnchantmentHookTypes.remove(s);
            beforeDisplayGUIFurnaceHookTypes.remove(s);
            overrideDisplayGUIFurnaceHookTypes.remove(s);
            afterDisplayGUIFurnaceHookTypes.remove(s);
            beforeDisplayWorkbenchGUIHookTypes.remove(s);
            overrideDisplayWorkbenchGUIHookTypes.remove(s);
            afterDisplayWorkbenchGUIHookTypes.remove(s);
            beforeDropOneItemHookTypes.remove(s);
            overrideDropOneItemHookTypes.remove(s);
            afterDropOneItemHookTypes.remove(s);
            beforeDropPlayerItemHookTypes.remove(s);
            overrideDropPlayerItemHookTypes.remove(s);
            afterDropPlayerItemHookTypes.remove(s);
            beforeDropPlayerItemWithRandomChoiceHookTypes.remove(s);
            overrideDropPlayerItemWithRandomChoiceHookTypes.remove(s);
            afterDropPlayerItemWithRandomChoiceHookTypes.remove(s);
            beforeFallHookTypes.remove(s);
            overrideFallHookTypes.remove(s);
            afterFallHookTypes.remove(s);
            beforeGetBrightnessHookTypes.remove(s);
            overrideGetBrightnessHookTypes.remove(s);
            afterGetBrightnessHookTypes.remove(s);
            beforeGetBrightnessForRenderHookTypes.remove(s);
            overrideGetBrightnessForRenderHookTypes.remove(s);
            afterGetBrightnessForRenderHookTypes.remove(s);
            beforeGetCurrentPlayerStrVsBlockHookTypes.remove(s);
            overrideGetCurrentPlayerStrVsBlockHookTypes.remove(s);
            afterGetCurrentPlayerStrVsBlockHookTypes.remove(s);
            beforeGetDistanceSqHookTypes.remove(s);
            overrideGetDistanceSqHookTypes.remove(s);
            afterGetDistanceSqHookTypes.remove(s);
            beforeGetDistanceSqToEntityHookTypes.remove(s);
            overrideGetDistanceSqToEntityHookTypes.remove(s);
            afterGetDistanceSqToEntityHookTypes.remove(s);
            beforeGetFOVMultiplierHookTypes.remove(s);
            overrideGetFOVMultiplierHookTypes.remove(s);
            afterGetFOVMultiplierHookTypes.remove(s);
            beforeGetHurtSoundHookTypes.remove(s);
            overrideGetHurtSoundHookTypes.remove(s);
            afterGetHurtSoundHookTypes.remove(s);
            beforeGetItemIconHookTypes.remove(s);
            overrideGetItemIconHookTypes.remove(s);
            afterGetItemIconHookTypes.remove(s);
            beforeGetSleepTimerHookTypes.remove(s);
            overrideGetSleepTimerHookTypes.remove(s);
            afterGetSleepTimerHookTypes.remove(s);
            beforeGetSpeedModifierHookTypes.remove(s);
            overrideGetSpeedModifierHookTypes.remove(s);
            afterGetSpeedModifierHookTypes.remove(s);
            beforeHandleLavaMovementHookTypes.remove(s);
            overrideHandleLavaMovementHookTypes.remove(s);
            afterHandleLavaMovementHookTypes.remove(s);
            beforeHandleWaterMovementHookTypes.remove(s);
            overrideHandleWaterMovementHookTypes.remove(s);
            afterHandleWaterMovementHookTypes.remove(s);
            beforeHealHookTypes.remove(s);
            overrideHealHookTypes.remove(s);
            afterHealHookTypes.remove(s);
            beforeIsEntityInsideOpaqueBlockHookTypes.remove(s);
            overrideIsEntityInsideOpaqueBlockHookTypes.remove(s);
            afterIsEntityInsideOpaqueBlockHookTypes.remove(s);
            beforeIsInWaterHookTypes.remove(s);
            overrideIsInWaterHookTypes.remove(s);
            afterIsInWaterHookTypes.remove(s);
            beforeIsInsideOfMaterialHookTypes.remove(s);
            overrideIsInsideOfMaterialHookTypes.remove(s);
            afterIsInsideOfMaterialHookTypes.remove(s);
            beforeIsOnLadderHookTypes.remove(s);
            overrideIsOnLadderHookTypes.remove(s);
            afterIsOnLadderHookTypes.remove(s);
            beforeIsSneakingHookTypes.remove(s);
            overrideIsSneakingHookTypes.remove(s);
            afterIsSneakingHookTypes.remove(s);
            beforeIsSprintingHookTypes.remove(s);
            overrideIsSprintingHookTypes.remove(s);
            afterIsSprintingHookTypes.remove(s);
            beforeJumpHookTypes.remove(s);
            overrideJumpHookTypes.remove(s);
            afterJumpHookTypes.remove(s);
            beforeKnockBackHookTypes.remove(s);
            overrideKnockBackHookTypes.remove(s);
            afterKnockBackHookTypes.remove(s);
            beforeMoveEntityHookTypes.remove(s);
            overrideMoveEntityHookTypes.remove(s);
            afterMoveEntityHookTypes.remove(s);
            beforeMoveEntityWithHeadingHookTypes.remove(s);
            overrideMoveEntityWithHeadingHookTypes.remove(s);
            afterMoveEntityWithHeadingHookTypes.remove(s);
            beforeMoveFlyingHookTypes.remove(s);
            overrideMoveFlyingHookTypes.remove(s);
            afterMoveFlyingHookTypes.remove(s);
            beforeOnDeathHookTypes.remove(s);
            overrideOnDeathHookTypes.remove(s);
            afterOnDeathHookTypes.remove(s);
            beforeOnLivingUpdateHookTypes.remove(s);
            overrideOnLivingUpdateHookTypes.remove(s);
            afterOnLivingUpdateHookTypes.remove(s);
            beforeOnKillEntityHookTypes.remove(s);
            overrideOnKillEntityHookTypes.remove(s);
            afterOnKillEntityHookTypes.remove(s);
            beforeOnUpdateHookTypes.remove(s);
            overrideOnUpdateHookTypes.remove(s);
            afterOnUpdateHookTypes.remove(s);
            beforePushOutOfBlocksHookTypes.remove(s);
            overridePushOutOfBlocksHookTypes.remove(s);
            afterPushOutOfBlocksHookTypes.remove(s);
            beforeRayTraceHookTypes.remove(s);
            overrideRayTraceHookTypes.remove(s);
            afterRayTraceHookTypes.remove(s);
            beforeReadEntityFromNBTHookTypes.remove(s);
            overrideReadEntityFromNBTHookTypes.remove(s);
            afterReadEntityFromNBTHookTypes.remove(s);
            beforeRespawnPlayerHookTypes.remove(s);
            overrideRespawnPlayerHookTypes.remove(s);
            afterRespawnPlayerHookTypes.remove(s);
            beforeSendChatMessageHookTypes.remove(s);
            overrideSendChatMessageHookTypes.remove(s);
            afterSendChatMessageHookTypes.remove(s);
            beforeSetDeadHookTypes.remove(s);
            overrideSetDeadHookTypes.remove(s);
            afterSetDeadHookTypes.remove(s);
            beforeSetPositionAndRotationHookTypes.remove(s);
            overrideSetPositionAndRotationHookTypes.remove(s);
            afterSetPositionAndRotationHookTypes.remove(s);
            beforeSleepInBedAtHookTypes.remove(s);
            overrideSleepInBedAtHookTypes.remove(s);
            afterSleepInBedAtHookTypes.remove(s);
            beforeSwingItemHookTypes.remove(s);
            overrideSwingItemHookTypes.remove(s);
            afterSwingItemHookTypes.remove(s);
            beforeUpdateEntityActionStateHookTypes.remove(s);
            overrideUpdateEntityActionStateHookTypes.remove(s);
            afterUpdateEntityActionStateHookTypes.remove(s);
            beforeWriteEntityToNBTHookTypes.remove(s);
            overrideWriteEntityToNBTHookTypes.remove(s);
            afterWriteEntityToNBTHookTypes.remove(s);
            log((new StringBuilder()).append("PlayerAPI: unregistered id '").append(s).append("'").toString());
            return true;
        }
        else
        {
            return false;
        }
    }

    public static Set getRegisteredIds()
    {
        return unmodifiableAllIds;
    }

    private static void addSorting(String s, Map map, String as[])
    {
        if (as != null && as.length > 0)
        {
            map.put(s, as);
        }
    }

    private static boolean addMethod(String s, Class class1, List list, String s1, Class aclass[])
    {
        try
        {
            Method method = class1.getMethod(s1, aclass);
            boolean flag = method.getDeclaringClass() != (net.minecraft.src.PlayerBase.class);

            if (flag)
            {
                list.add(s);
            }

            return flag;
        }
        catch (Exception exception)
        {
            throw new RuntimeException((new StringBuilder()).append("Can not reflect method '").append(s1).append("' of class '").append(class1.getName()).append("'").toString(), exception);
        }
    }

    public static PlayerAPI create(EntityPlayerSP entityplayersp)
    {
        if (allBaseConstructors.size() > 0)
        {
            if (!initialized)
            {
                initialize();
            }

            return new PlayerAPI(entityplayersp);
        }
        else
        {
            return null;
        }
    }

    private static void initialize()
    {
        sortBases(beforeLocalConstructingHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeLocalConstructing");
        sortBases(afterLocalConstructingHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterLocalConstructing");
        sortBases(beforeAddExhaustionHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeAddExhaustion");
        sortBases(overrideAddExhaustionHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideAddExhaustion");
        sortBases(afterAddExhaustionHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterAddExhaustion");
        sortBases(beforeAttackEntityFromHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeAttackEntityFrom");
        sortBases(overrideAttackEntityFromHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideAttackEntityFrom");
        sortBases(afterAttackEntityFromHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterAttackEntityFrom");
        sortBases(beforeAttackTargetEntityWithCurrentItemHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeAttackTargetEntityWithCurrentItem");
        sortBases(overrideAttackTargetEntityWithCurrentItemHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideAttackTargetEntityWithCurrentItem");
        sortBases(afterAttackTargetEntityWithCurrentItemHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterAttackTargetEntityWithCurrentItem");
        sortBases(beforeCanBreatheUnderwaterHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeCanBreatheUnderwater");
        sortBases(overrideCanBreatheUnderwaterHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideCanBreatheUnderwater");
        sortBases(afterCanBreatheUnderwaterHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterCanBreatheUnderwater");
        sortBases(beforeCanHarvestBlockHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeCanHarvestBlock");
        sortBases(overrideCanHarvestBlockHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideCanHarvestBlock");
        sortBases(afterCanHarvestBlockHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterCanHarvestBlock");
        sortBases(beforeCanPlayerEditHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeCanPlayerEdit");
        sortBases(overrideCanPlayerEditHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideCanPlayerEdit");
        sortBases(afterCanPlayerEditHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterCanPlayerEdit");
        sortBases(beforeCanTriggerWalkingHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeCanTriggerWalking");
        sortBases(overrideCanTriggerWalkingHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideCanTriggerWalking");
        sortBases(afterCanTriggerWalkingHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterCanTriggerWalking");
        sortBases(beforeCloseScreenHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeCloseScreen");
        sortBases(overrideCloseScreenHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideCloseScreen");
        sortBases(afterCloseScreenHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterCloseScreen");
        sortBases(beforeDamageEntityHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDamageEntity");
        sortBases(overrideDamageEntityHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDamageEntity");
        sortBases(afterDamageEntityHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDamageEntity");
        sortBases(beforeDisplayGUIBrewingStandHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDisplayGUIBrewingStand");
        sortBases(overrideDisplayGUIBrewingStandHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDisplayGUIBrewingStand");
        sortBases(afterDisplayGUIBrewingStandHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDisplayGUIBrewingStand");
        sortBases(beforeDisplayGUIChestHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDisplayGUIChest");
        sortBases(overrideDisplayGUIChestHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDisplayGUIChest");
        sortBases(afterDisplayGUIChestHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDisplayGUIChest");
        sortBases(beforeDisplayGUIDispenserHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDisplayGUIDispenser");
        sortBases(overrideDisplayGUIDispenserHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDisplayGUIDispenser");
        sortBases(afterDisplayGUIDispenserHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDisplayGUIDispenser");
        sortBases(beforeDisplayGUIEditSignHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDisplayGUIEditSign");
        sortBases(overrideDisplayGUIEditSignHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDisplayGUIEditSign");
        sortBases(afterDisplayGUIEditSignHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDisplayGUIEditSign");
        sortBases(beforeDisplayGUIEnchantmentHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDisplayGUIEnchantment");
        sortBases(overrideDisplayGUIEnchantmentHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDisplayGUIEnchantment");
        sortBases(afterDisplayGUIEnchantmentHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDisplayGUIEnchantment");
        sortBases(beforeDisplayGUIFurnaceHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDisplayGUIFurnace");
        sortBases(overrideDisplayGUIFurnaceHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDisplayGUIFurnace");
        sortBases(afterDisplayGUIFurnaceHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDisplayGUIFurnace");
        sortBases(beforeDisplayWorkbenchGUIHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDisplayWorkbenchGUI");
        sortBases(overrideDisplayWorkbenchGUIHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDisplayWorkbenchGUI");
        sortBases(afterDisplayWorkbenchGUIHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDisplayWorkbenchGUI");
        sortBases(beforeDropOneItemHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDropOneItem");
        sortBases(overrideDropOneItemHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDropOneItem");
        sortBases(afterDropOneItemHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDropOneItem");
        sortBases(beforeDropPlayerItemHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDropPlayerItem");
        sortBases(overrideDropPlayerItemHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDropPlayerItem");
        sortBases(afterDropPlayerItemHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDropPlayerItem");
        sortBases(beforeDropPlayerItemWithRandomChoiceHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeDropPlayerItemWithRandomChoice");
        sortBases(overrideDropPlayerItemWithRandomChoiceHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideDropPlayerItemWithRandomChoice");
        sortBases(afterDropPlayerItemWithRandomChoiceHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterDropPlayerItemWithRandomChoice");
        sortBases(beforeFallHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeFall");
        sortBases(overrideFallHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideFall");
        sortBases(afterFallHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterFall");
        sortBases(beforeGetBrightnessHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetBrightness");
        sortBases(overrideGetBrightnessHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetBrightness");
        sortBases(afterGetBrightnessHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetBrightness");
        sortBases(beforeGetBrightnessForRenderHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetBrightnessForRender");
        sortBases(overrideGetBrightnessForRenderHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetBrightnessForRender");
        sortBases(afterGetBrightnessForRenderHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetBrightnessForRender");
        sortBases(beforeGetCurrentPlayerStrVsBlockHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetCurrentPlayerStrVsBlock");
        sortBases(overrideGetCurrentPlayerStrVsBlockHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetCurrentPlayerStrVsBlock");
        sortBases(afterGetCurrentPlayerStrVsBlockHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetCurrentPlayerStrVsBlock");
        sortBases(beforeGetDistanceSqHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetDistanceSq");
        sortBases(overrideGetDistanceSqHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetDistanceSq");
        sortBases(afterGetDistanceSqHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetDistanceSq");
        sortBases(beforeGetDistanceSqToEntityHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetDistanceSqToEntity");
        sortBases(overrideGetDistanceSqToEntityHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetDistanceSqToEntity");
        sortBases(afterGetDistanceSqToEntityHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetDistanceSqToEntity");
        sortBases(beforeGetFOVMultiplierHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetFOVMultiplier");
        sortBases(overrideGetFOVMultiplierHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetFOVMultiplier");
        sortBases(afterGetFOVMultiplierHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetFOVMultiplier");
        sortBases(beforeGetHurtSoundHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetHurtSound");
        sortBases(overrideGetHurtSoundHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetHurtSound");
        sortBases(afterGetHurtSoundHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetHurtSound");
        sortBases(beforeGetItemIconHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetItemIcon");
        sortBases(overrideGetItemIconHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetItemIcon");
        sortBases(afterGetItemIconHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetItemIcon");
        sortBases(beforeGetSleepTimerHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetSleepTimer");
        sortBases(overrideGetSleepTimerHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetSleepTimer");
        sortBases(afterGetSleepTimerHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetSleepTimer");
        sortBases(beforeGetSpeedModifierHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeGetSpeedModifier");
        sortBases(overrideGetSpeedModifierHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideGetSpeedModifier");
        sortBases(afterGetSpeedModifierHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterGetSpeedModifier");
        sortBases(beforeHandleLavaMovementHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeHandleLavaMovement");
        sortBases(overrideHandleLavaMovementHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideHandleLavaMovement");
        sortBases(afterHandleLavaMovementHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterHandleLavaMovement");
        sortBases(beforeHandleWaterMovementHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeHandleWaterMovement");
        sortBases(overrideHandleWaterMovementHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideHandleWaterMovement");
        sortBases(afterHandleWaterMovementHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterHandleWaterMovement");
        sortBases(beforeHealHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeHeal");
        sortBases(overrideHealHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideHeal");
        sortBases(afterHealHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterHeal");
        sortBases(beforeIsEntityInsideOpaqueBlockHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeIsEntityInsideOpaqueBlock");
        sortBases(overrideIsEntityInsideOpaqueBlockHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideIsEntityInsideOpaqueBlock");
        sortBases(afterIsEntityInsideOpaqueBlockHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterIsEntityInsideOpaqueBlock");
        sortBases(beforeIsInWaterHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeIsInWater");
        sortBases(overrideIsInWaterHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideIsInWater");
        sortBases(afterIsInWaterHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterIsInWater");
        sortBases(beforeIsInsideOfMaterialHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeIsInsideOfMaterial");
        sortBases(overrideIsInsideOfMaterialHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideIsInsideOfMaterial");
        sortBases(afterIsInsideOfMaterialHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterIsInsideOfMaterial");
        sortBases(beforeIsOnLadderHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeIsOnLadder");
        sortBases(overrideIsOnLadderHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideIsOnLadder");
        sortBases(afterIsOnLadderHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterIsOnLadder");
        sortBases(beforeIsSneakingHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeIsSneaking");
        sortBases(overrideIsSneakingHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideIsSneaking");
        sortBases(afterIsSneakingHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterIsSneaking");
        sortBases(beforeIsSprintingHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeIsSprinting");
        sortBases(overrideIsSprintingHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideIsSprinting");
        sortBases(afterIsSprintingHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterIsSprinting");
        sortBases(beforeJumpHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeJump");
        sortBases(overrideJumpHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideJump");
        sortBases(afterJumpHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterJump");
        sortBases(beforeKnockBackHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeKnockBack");
        sortBases(overrideKnockBackHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideKnockBack");
        sortBases(afterKnockBackHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterKnockBack");
        sortBases(beforeMoveEntityHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeMoveEntity");
        sortBases(overrideMoveEntityHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideMoveEntity");
        sortBases(afterMoveEntityHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterMoveEntity");
        sortBases(beforeMoveEntityWithHeadingHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeMoveEntityWithHeading");
        sortBases(overrideMoveEntityWithHeadingHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideMoveEntityWithHeading");
        sortBases(afterMoveEntityWithHeadingHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterMoveEntityWithHeading");
        sortBases(beforeMoveFlyingHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeMoveFlying");
        sortBases(overrideMoveFlyingHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideMoveFlying");
        sortBases(afterMoveFlyingHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterMoveFlying");
        sortBases(beforeOnDeathHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeOnDeath");
        sortBases(overrideOnDeathHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideOnDeath");
        sortBases(afterOnDeathHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterOnDeath");
        sortBases(beforeOnLivingUpdateHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeOnLivingUpdate");
        sortBases(overrideOnLivingUpdateHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideOnLivingUpdate");
        sortBases(afterOnLivingUpdateHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterOnLivingUpdate");
        sortBases(beforeOnKillEntityHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeOnKillEntity");
        sortBases(overrideOnKillEntityHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideOnKillEntity");
        sortBases(afterOnKillEntityHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterOnKillEntity");
        sortBases(beforeOnUpdateHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeOnUpdate");
        sortBases(overrideOnUpdateHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideOnUpdate");
        sortBases(afterOnUpdateHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterOnUpdate");
        sortBases(beforePushOutOfBlocksHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforePushOutOfBlocks");
        sortBases(overridePushOutOfBlocksHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overridePushOutOfBlocks");
        sortBases(afterPushOutOfBlocksHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterPushOutOfBlocks");
        sortBases(beforeRayTraceHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeRayTrace");
        sortBases(overrideRayTraceHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideRayTrace");
        sortBases(afterRayTraceHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterRayTrace");
        sortBases(beforeReadEntityFromNBTHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeReadEntityFromNBT");
        sortBases(overrideReadEntityFromNBTHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideReadEntityFromNBT");
        sortBases(afterReadEntityFromNBTHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterReadEntityFromNBT");
        sortBases(beforeRespawnPlayerHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeRespawnPlayer");
        sortBases(overrideRespawnPlayerHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideRespawnPlayer");
        sortBases(afterRespawnPlayerHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterRespawnPlayer");
        sortBases(beforeSendChatMessageHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeSendChatMessage");
        sortBases(overrideSendChatMessageHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideSendChatMessage");
        sortBases(afterSendChatMessageHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterSendChatMessage");
        sortBases(beforeSetDeadHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeSetDead");
        sortBases(overrideSetDeadHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideSetDead");
        sortBases(afterSetDeadHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterSetDead");
        sortBases(beforeSetPositionAndRotationHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeSetPositionAndRotation");
        sortBases(overrideSetPositionAndRotationHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideSetPositionAndRotation");
        sortBases(afterSetPositionAndRotationHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterSetPositionAndRotation");
        sortBases(beforeSleepInBedAtHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeSleepInBedAt");
        sortBases(overrideSleepInBedAtHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideSleepInBedAt");
        sortBases(afterSleepInBedAtHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterSleepInBedAt");
        sortBases(beforeSwingItemHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeSwingItem");
        sortBases(overrideSwingItemHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideSwingItem");
        sortBases(afterSwingItemHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterSwingItem");
        sortBases(beforeUpdateEntityActionStateHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeUpdateEntityActionState");
        sortBases(overrideUpdateEntityActionStateHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideUpdateEntityActionState");
        sortBases(afterUpdateEntityActionStateHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterUpdateEntityActionState");
        sortBases(beforeWriteEntityToNBTHookTypes, allBaseBeforeSuperiors, allBaseBeforeInferiors, "beforeWriteEntityToNBT");
        sortBases(overrideWriteEntityToNBTHookTypes, allBaseOverrideSuperiors, allBaseOverrideInferiors, "overrideWriteEntityToNBT");
        sortBases(afterWriteEntityToNBTHookTypes, allBaseAfterSuperiors, allBaseAfterInferiors, "afterWriteEntityToNBT");
        initialized = true;
    }

    public static void beforeLocalConstructing(EntityPlayerSP entityplayersp, Minecraft minecraft, World world, Session session, int i)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.beforeLocalConstructing(minecraft, world, session, i);
        }
    }

    public static void afterLocalConstructing(EntityPlayerSP entityplayersp, Minecraft minecraft, World world, Session session, int i)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.afterLocalConstructing(minecraft, world, session, i);
        }
    }

    private static void sortBases(List list, Map map, Map map1, String s)
    {
        (new PlayerBaseSorter(list, map, map1, s)).Sort();
    }

    private PlayerAPI(EntityPlayerSP entityplayersp)
    {
        unmodifiableAllBaseIds = Collections.unmodifiableSet(allBaseObjects.keySet());
        player = entityplayersp;
        Object aobj[] =
        {
            this
        };
        Object aobj1[] =
        {
            this, null
        };
        java.util.Map.Entry entry;
        PlayerBase playerbase;

        for (Iterator iterator = allBaseConstructors.entrySet().iterator(); iterator.hasNext(); allBaseObjects.put(entry.getKey(), playerbase))
        {
            entry = (java.util.Map.Entry)iterator.next();
            Constructor constructor = (Constructor)entry.getValue();
            aobj1[1] = entry.getKey();

            try
            {
                if (constructor.getParameterTypes().length == 1)
                {
                    playerbase = (PlayerBase)constructor.newInstance(aobj);
                }
                else
                {
                    playerbase = (PlayerBase)constructor.newInstance(aobj1);
                }
            }
            catch (Exception exception)
            {
                throw new RuntimeException((new StringBuilder()).append("Exception while creating a PlayerBase of type '").append(constructor.getDeclaringClass()).append("'").toString(), exception);
            }
        }

        beforeLocalConstructingHooks = create(beforeLocalConstructingHookTypes);
        afterLocalConstructingHooks = create(afterLocalConstructingHookTypes);
        beforeAddExhaustionHooks = create(beforeAddExhaustionHookTypes);
        overrideAddExhaustionHooks = create(overrideAddExhaustionHookTypes);
        afterAddExhaustionHooks = create(afterAddExhaustionHookTypes);
        isAddExhaustionModded = beforeAddExhaustionHooks != null || overrideAddExhaustionHooks != null || afterAddExhaustionHooks != null;
        beforeAttackEntityFromHooks = create(beforeAttackEntityFromHookTypes);
        overrideAttackEntityFromHooks = create(overrideAttackEntityFromHookTypes);
        afterAttackEntityFromHooks = create(afterAttackEntityFromHookTypes);
        isAttackEntityFromModded = beforeAttackEntityFromHooks != null || overrideAttackEntityFromHooks != null || afterAttackEntityFromHooks != null;
        beforeAttackTargetEntityWithCurrentItemHooks = create(beforeAttackTargetEntityWithCurrentItemHookTypes);
        overrideAttackTargetEntityWithCurrentItemHooks = create(overrideAttackTargetEntityWithCurrentItemHookTypes);
        afterAttackTargetEntityWithCurrentItemHooks = create(afterAttackTargetEntityWithCurrentItemHookTypes);
        isAttackTargetEntityWithCurrentItemModded = beforeAttackTargetEntityWithCurrentItemHooks != null || overrideAttackTargetEntityWithCurrentItemHooks != null || afterAttackTargetEntityWithCurrentItemHooks != null;
        beforeCanBreatheUnderwaterHooks = create(beforeCanBreatheUnderwaterHookTypes);
        overrideCanBreatheUnderwaterHooks = create(overrideCanBreatheUnderwaterHookTypes);
        afterCanBreatheUnderwaterHooks = create(afterCanBreatheUnderwaterHookTypes);
        isCanBreatheUnderwaterModded = beforeCanBreatheUnderwaterHooks != null || overrideCanBreatheUnderwaterHooks != null || afterCanBreatheUnderwaterHooks != null;
        beforeCanHarvestBlockHooks = create(beforeCanHarvestBlockHookTypes);
        overrideCanHarvestBlockHooks = create(overrideCanHarvestBlockHookTypes);
        afterCanHarvestBlockHooks = create(afterCanHarvestBlockHookTypes);
        isCanHarvestBlockModded = beforeCanHarvestBlockHooks != null || overrideCanHarvestBlockHooks != null || afterCanHarvestBlockHooks != null;
        beforeCanPlayerEditHooks = create(beforeCanPlayerEditHookTypes);
        overrideCanPlayerEditHooks = create(overrideCanPlayerEditHookTypes);
        afterCanPlayerEditHooks = create(afterCanPlayerEditHookTypes);
        isCanPlayerEditModded = beforeCanPlayerEditHooks != null || overrideCanPlayerEditHooks != null || afterCanPlayerEditHooks != null;
        beforeCanTriggerWalkingHooks = create(beforeCanTriggerWalkingHookTypes);
        overrideCanTriggerWalkingHooks = create(overrideCanTriggerWalkingHookTypes);
        afterCanTriggerWalkingHooks = create(afterCanTriggerWalkingHookTypes);
        isCanTriggerWalkingModded = beforeCanTriggerWalkingHooks != null || overrideCanTriggerWalkingHooks != null || afterCanTriggerWalkingHooks != null;
        beforeCloseScreenHooks = create(beforeCloseScreenHookTypes);
        overrideCloseScreenHooks = create(overrideCloseScreenHookTypes);
        afterCloseScreenHooks = create(afterCloseScreenHookTypes);
        isCloseScreenModded = beforeCloseScreenHooks != null || overrideCloseScreenHooks != null || afterCloseScreenHooks != null;
        beforeDamageEntityHooks = create(beforeDamageEntityHookTypes);
        overrideDamageEntityHooks = create(overrideDamageEntityHookTypes);
        afterDamageEntityHooks = create(afterDamageEntityHookTypes);
        isDamageEntityModded = beforeDamageEntityHooks != null || overrideDamageEntityHooks != null || afterDamageEntityHooks != null;
        beforeDisplayGUIBrewingStandHooks = create(beforeDisplayGUIBrewingStandHookTypes);
        overrideDisplayGUIBrewingStandHooks = create(overrideDisplayGUIBrewingStandHookTypes);
        afterDisplayGUIBrewingStandHooks = create(afterDisplayGUIBrewingStandHookTypes);
        isDisplayGUIBrewingStandModded = beforeDisplayGUIBrewingStandHooks != null || overrideDisplayGUIBrewingStandHooks != null || afterDisplayGUIBrewingStandHooks != null;
        beforeDisplayGUIChestHooks = create(beforeDisplayGUIChestHookTypes);
        overrideDisplayGUIChestHooks = create(overrideDisplayGUIChestHookTypes);
        afterDisplayGUIChestHooks = create(afterDisplayGUIChestHookTypes);
        isDisplayGUIChestModded = beforeDisplayGUIChestHooks != null || overrideDisplayGUIChestHooks != null || afterDisplayGUIChestHooks != null;
        beforeDisplayGUIDispenserHooks = create(beforeDisplayGUIDispenserHookTypes);
        overrideDisplayGUIDispenserHooks = create(overrideDisplayGUIDispenserHookTypes);
        afterDisplayGUIDispenserHooks = create(afterDisplayGUIDispenserHookTypes);
        isDisplayGUIDispenserModded = beforeDisplayGUIDispenserHooks != null || overrideDisplayGUIDispenserHooks != null || afterDisplayGUIDispenserHooks != null;
        beforeDisplayGUIEditSignHooks = create(beforeDisplayGUIEditSignHookTypes);
        overrideDisplayGUIEditSignHooks = create(overrideDisplayGUIEditSignHookTypes);
        afterDisplayGUIEditSignHooks = create(afterDisplayGUIEditSignHookTypes);
        isDisplayGUIEditSignModded = beforeDisplayGUIEditSignHooks != null || overrideDisplayGUIEditSignHooks != null || afterDisplayGUIEditSignHooks != null;
        beforeDisplayGUIEnchantmentHooks = create(beforeDisplayGUIEnchantmentHookTypes);
        overrideDisplayGUIEnchantmentHooks = create(overrideDisplayGUIEnchantmentHookTypes);
        afterDisplayGUIEnchantmentHooks = create(afterDisplayGUIEnchantmentHookTypes);
        isDisplayGUIEnchantmentModded = beforeDisplayGUIEnchantmentHooks != null || overrideDisplayGUIEnchantmentHooks != null || afterDisplayGUIEnchantmentHooks != null;
        beforeDisplayGUIFurnaceHooks = create(beforeDisplayGUIFurnaceHookTypes);
        overrideDisplayGUIFurnaceHooks = create(overrideDisplayGUIFurnaceHookTypes);
        afterDisplayGUIFurnaceHooks = create(afterDisplayGUIFurnaceHookTypes);
        isDisplayGUIFurnaceModded = beforeDisplayGUIFurnaceHooks != null || overrideDisplayGUIFurnaceHooks != null || afterDisplayGUIFurnaceHooks != null;
        beforeDisplayWorkbenchGUIHooks = create(beforeDisplayWorkbenchGUIHookTypes);
        overrideDisplayWorkbenchGUIHooks = create(overrideDisplayWorkbenchGUIHookTypes);
        afterDisplayWorkbenchGUIHooks = create(afterDisplayWorkbenchGUIHookTypes);
        isDisplayWorkbenchGUIModded = beforeDisplayWorkbenchGUIHooks != null || overrideDisplayWorkbenchGUIHooks != null || afterDisplayWorkbenchGUIHooks != null;
        beforeDropOneItemHooks = create(beforeDropOneItemHookTypes);
        overrideDropOneItemHooks = create(overrideDropOneItemHookTypes);
        afterDropOneItemHooks = create(afterDropOneItemHookTypes);
        isDropOneItemModded = beforeDropOneItemHooks != null || overrideDropOneItemHooks != null || afterDropOneItemHooks != null;
        beforeDropPlayerItemHooks = create(beforeDropPlayerItemHookTypes);
        overrideDropPlayerItemHooks = create(overrideDropPlayerItemHookTypes);
        afterDropPlayerItemHooks = create(afterDropPlayerItemHookTypes);
        isDropPlayerItemModded = beforeDropPlayerItemHooks != null || overrideDropPlayerItemHooks != null || afterDropPlayerItemHooks != null;
        beforeDropPlayerItemWithRandomChoiceHooks = create(beforeDropPlayerItemWithRandomChoiceHookTypes);
        overrideDropPlayerItemWithRandomChoiceHooks = create(overrideDropPlayerItemWithRandomChoiceHookTypes);
        afterDropPlayerItemWithRandomChoiceHooks = create(afterDropPlayerItemWithRandomChoiceHookTypes);
        isDropPlayerItemWithRandomChoiceModded = beforeDropPlayerItemWithRandomChoiceHooks != null || overrideDropPlayerItemWithRandomChoiceHooks != null || afterDropPlayerItemWithRandomChoiceHooks != null;
        beforeFallHooks = create(beforeFallHookTypes);
        overrideFallHooks = create(overrideFallHookTypes);
        afterFallHooks = create(afterFallHookTypes);
        isFallModded = beforeFallHooks != null || overrideFallHooks != null || afterFallHooks != null;
        beforeGetBrightnessHooks = create(beforeGetBrightnessHookTypes);
        overrideGetBrightnessHooks = create(overrideGetBrightnessHookTypes);
        afterGetBrightnessHooks = create(afterGetBrightnessHookTypes);
        isGetBrightnessModded = beforeGetBrightnessHooks != null || overrideGetBrightnessHooks != null || afterGetBrightnessHooks != null;
        beforeGetBrightnessForRenderHooks = create(beforeGetBrightnessForRenderHookTypes);
        overrideGetBrightnessForRenderHooks = create(overrideGetBrightnessForRenderHookTypes);
        afterGetBrightnessForRenderHooks = create(afterGetBrightnessForRenderHookTypes);
        isGetBrightnessForRenderModded = beforeGetBrightnessForRenderHooks != null || overrideGetBrightnessForRenderHooks != null || afterGetBrightnessForRenderHooks != null;
        beforeGetCurrentPlayerStrVsBlockHooks = create(beforeGetCurrentPlayerStrVsBlockHookTypes);
        overrideGetCurrentPlayerStrVsBlockHooks = create(overrideGetCurrentPlayerStrVsBlockHookTypes);
        afterGetCurrentPlayerStrVsBlockHooks = create(afterGetCurrentPlayerStrVsBlockHookTypes);
        isGetCurrentPlayerStrVsBlockModded = beforeGetCurrentPlayerStrVsBlockHooks != null || overrideGetCurrentPlayerStrVsBlockHooks != null || afterGetCurrentPlayerStrVsBlockHooks != null;
        beforeGetDistanceSqHooks = create(beforeGetDistanceSqHookTypes);
        overrideGetDistanceSqHooks = create(overrideGetDistanceSqHookTypes);
        afterGetDistanceSqHooks = create(afterGetDistanceSqHookTypes);
        isGetDistanceSqModded = beforeGetDistanceSqHooks != null || overrideGetDistanceSqHooks != null || afterGetDistanceSqHooks != null;
        beforeGetDistanceSqToEntityHooks = create(beforeGetDistanceSqToEntityHookTypes);
        overrideGetDistanceSqToEntityHooks = create(overrideGetDistanceSqToEntityHookTypes);
        afterGetDistanceSqToEntityHooks = create(afterGetDistanceSqToEntityHookTypes);
        isGetDistanceSqToEntityModded = beforeGetDistanceSqToEntityHooks != null || overrideGetDistanceSqToEntityHooks != null || afterGetDistanceSqToEntityHooks != null;
        beforeGetFOVMultiplierHooks = create(beforeGetFOVMultiplierHookTypes);
        overrideGetFOVMultiplierHooks = create(overrideGetFOVMultiplierHookTypes);
        afterGetFOVMultiplierHooks = create(afterGetFOVMultiplierHookTypes);
        isGetFOVMultiplierModded = beforeGetFOVMultiplierHooks != null || overrideGetFOVMultiplierHooks != null || afterGetFOVMultiplierHooks != null;
        beforeGetHurtSoundHooks = create(beforeGetHurtSoundHookTypes);
        overrideGetHurtSoundHooks = create(overrideGetHurtSoundHookTypes);
        afterGetHurtSoundHooks = create(afterGetHurtSoundHookTypes);
        isGetHurtSoundModded = beforeGetHurtSoundHooks != null || overrideGetHurtSoundHooks != null || afterGetHurtSoundHooks != null;
        beforeGetItemIconHooks = create(beforeGetItemIconHookTypes);
        overrideGetItemIconHooks = create(overrideGetItemIconHookTypes);
        afterGetItemIconHooks = create(afterGetItemIconHookTypes);
        isGetItemIconModded = beforeGetItemIconHooks != null || overrideGetItemIconHooks != null || afterGetItemIconHooks != null;
        beforeGetSleepTimerHooks = create(beforeGetSleepTimerHookTypes);
        overrideGetSleepTimerHooks = create(overrideGetSleepTimerHookTypes);
        afterGetSleepTimerHooks = create(afterGetSleepTimerHookTypes);
        isGetSleepTimerModded = beforeGetSleepTimerHooks != null || overrideGetSleepTimerHooks != null || afterGetSleepTimerHooks != null;
        beforeGetSpeedModifierHooks = create(beforeGetSpeedModifierHookTypes);
        overrideGetSpeedModifierHooks = create(overrideGetSpeedModifierHookTypes);
        afterGetSpeedModifierHooks = create(afterGetSpeedModifierHookTypes);
        isGetSpeedModifierModded = beforeGetSpeedModifierHooks != null || overrideGetSpeedModifierHooks != null || afterGetSpeedModifierHooks != null;
        beforeHandleLavaMovementHooks = create(beforeHandleLavaMovementHookTypes);
        overrideHandleLavaMovementHooks = create(overrideHandleLavaMovementHookTypes);
        afterHandleLavaMovementHooks = create(afterHandleLavaMovementHookTypes);
        isHandleLavaMovementModded = beforeHandleLavaMovementHooks != null || overrideHandleLavaMovementHooks != null || afterHandleLavaMovementHooks != null;
        beforeHandleWaterMovementHooks = create(beforeHandleWaterMovementHookTypes);
        overrideHandleWaterMovementHooks = create(overrideHandleWaterMovementHookTypes);
        afterHandleWaterMovementHooks = create(afterHandleWaterMovementHookTypes);
        isHandleWaterMovementModded = beforeHandleWaterMovementHooks != null || overrideHandleWaterMovementHooks != null || afterHandleWaterMovementHooks != null;
        beforeHealHooks = create(beforeHealHookTypes);
        overrideHealHooks = create(overrideHealHookTypes);
        afterHealHooks = create(afterHealHookTypes);
        isHealModded = beforeHealHooks != null || overrideHealHooks != null || afterHealHooks != null;
        beforeIsEntityInsideOpaqueBlockHooks = create(beforeIsEntityInsideOpaqueBlockHookTypes);
        overrideIsEntityInsideOpaqueBlockHooks = create(overrideIsEntityInsideOpaqueBlockHookTypes);
        afterIsEntityInsideOpaqueBlockHooks = create(afterIsEntityInsideOpaqueBlockHookTypes);
        isIsEntityInsideOpaqueBlockModded = beforeIsEntityInsideOpaqueBlockHooks != null || overrideIsEntityInsideOpaqueBlockHooks != null || afterIsEntityInsideOpaqueBlockHooks != null;
        beforeIsInWaterHooks = create(beforeIsInWaterHookTypes);
        overrideIsInWaterHooks = create(overrideIsInWaterHookTypes);
        afterIsInWaterHooks = create(afterIsInWaterHookTypes);
        isIsInWaterModded = beforeIsInWaterHooks != null || overrideIsInWaterHooks != null || afterIsInWaterHooks != null;
        beforeIsInsideOfMaterialHooks = create(beforeIsInsideOfMaterialHookTypes);
        overrideIsInsideOfMaterialHooks = create(overrideIsInsideOfMaterialHookTypes);
        afterIsInsideOfMaterialHooks = create(afterIsInsideOfMaterialHookTypes);
        isIsInsideOfMaterialModded = beforeIsInsideOfMaterialHooks != null || overrideIsInsideOfMaterialHooks != null || afterIsInsideOfMaterialHooks != null;
        beforeIsOnLadderHooks = create(beforeIsOnLadderHookTypes);
        overrideIsOnLadderHooks = create(overrideIsOnLadderHookTypes);
        afterIsOnLadderHooks = create(afterIsOnLadderHookTypes);
        isIsOnLadderModded = beforeIsOnLadderHooks != null || overrideIsOnLadderHooks != null || afterIsOnLadderHooks != null;
        beforeIsSneakingHooks = create(beforeIsSneakingHookTypes);
        overrideIsSneakingHooks = create(overrideIsSneakingHookTypes);
        afterIsSneakingHooks = create(afterIsSneakingHookTypes);
        isIsSneakingModded = beforeIsSneakingHooks != null || overrideIsSneakingHooks != null || afterIsSneakingHooks != null;
        beforeIsSprintingHooks = create(beforeIsSprintingHookTypes);
        overrideIsSprintingHooks = create(overrideIsSprintingHookTypes);
        afterIsSprintingHooks = create(afterIsSprintingHookTypes);
        isIsSprintingModded = beforeIsSprintingHooks != null || overrideIsSprintingHooks != null || afterIsSprintingHooks != null;
        beforeJumpHooks = create(beforeJumpHookTypes);
        overrideJumpHooks = create(overrideJumpHookTypes);
        afterJumpHooks = create(afterJumpHookTypes);
        isJumpModded = beforeJumpHooks != null || overrideJumpHooks != null || afterJumpHooks != null;
        beforeKnockBackHooks = create(beforeKnockBackHookTypes);
        overrideKnockBackHooks = create(overrideKnockBackHookTypes);
        afterKnockBackHooks = create(afterKnockBackHookTypes);
        isKnockBackModded = beforeKnockBackHooks != null || overrideKnockBackHooks != null || afterKnockBackHooks != null;
        beforeMoveEntityHooks = create(beforeMoveEntityHookTypes);
        overrideMoveEntityHooks = create(overrideMoveEntityHookTypes);
        afterMoveEntityHooks = create(afterMoveEntityHookTypes);
        isMoveEntityModded = beforeMoveEntityHooks != null || overrideMoveEntityHooks != null || afterMoveEntityHooks != null;
        beforeMoveEntityWithHeadingHooks = create(beforeMoveEntityWithHeadingHookTypes);
        overrideMoveEntityWithHeadingHooks = create(overrideMoveEntityWithHeadingHookTypes);
        afterMoveEntityWithHeadingHooks = create(afterMoveEntityWithHeadingHookTypes);
        isMoveEntityWithHeadingModded = beforeMoveEntityWithHeadingHooks != null || overrideMoveEntityWithHeadingHooks != null || afterMoveEntityWithHeadingHooks != null;
        beforeMoveFlyingHooks = create(beforeMoveFlyingHookTypes);
        overrideMoveFlyingHooks = create(overrideMoveFlyingHookTypes);
        afterMoveFlyingHooks = create(afterMoveFlyingHookTypes);
        isMoveFlyingModded = beforeMoveFlyingHooks != null || overrideMoveFlyingHooks != null || afterMoveFlyingHooks != null;
        beforeOnDeathHooks = create(beforeOnDeathHookTypes);
        overrideOnDeathHooks = create(overrideOnDeathHookTypes);
        afterOnDeathHooks = create(afterOnDeathHookTypes);
        isOnDeathModded = beforeOnDeathHooks != null || overrideOnDeathHooks != null || afterOnDeathHooks != null;
        beforeOnLivingUpdateHooks = create(beforeOnLivingUpdateHookTypes);
        overrideOnLivingUpdateHooks = create(overrideOnLivingUpdateHookTypes);
        afterOnLivingUpdateHooks = create(afterOnLivingUpdateHookTypes);
        isOnLivingUpdateModded = beforeOnLivingUpdateHooks != null || overrideOnLivingUpdateHooks != null || afterOnLivingUpdateHooks != null;
        beforeOnKillEntityHooks = create(beforeOnKillEntityHookTypes);
        overrideOnKillEntityHooks = create(overrideOnKillEntityHookTypes);
        afterOnKillEntityHooks = create(afterOnKillEntityHookTypes);
        isOnKillEntityModded = beforeOnKillEntityHooks != null || overrideOnKillEntityHooks != null || afterOnKillEntityHooks != null;
        beforeOnUpdateHooks = create(beforeOnUpdateHookTypes);
        overrideOnUpdateHooks = create(overrideOnUpdateHookTypes);
        afterOnUpdateHooks = create(afterOnUpdateHookTypes);
        isOnUpdateModded = beforeOnUpdateHooks != null || overrideOnUpdateHooks != null || afterOnUpdateHooks != null;
        beforePushOutOfBlocksHooks = create(beforePushOutOfBlocksHookTypes);
        overridePushOutOfBlocksHooks = create(overridePushOutOfBlocksHookTypes);
        afterPushOutOfBlocksHooks = create(afterPushOutOfBlocksHookTypes);
        isPushOutOfBlocksModded = beforePushOutOfBlocksHooks != null || overridePushOutOfBlocksHooks != null || afterPushOutOfBlocksHooks != null;
        beforeRayTraceHooks = create(beforeRayTraceHookTypes);
        overrideRayTraceHooks = create(overrideRayTraceHookTypes);
        afterRayTraceHooks = create(afterRayTraceHookTypes);
        isRayTraceModded = beforeRayTraceHooks != null || overrideRayTraceHooks != null || afterRayTraceHooks != null;
        beforeReadEntityFromNBTHooks = create(beforeReadEntityFromNBTHookTypes);
        overrideReadEntityFromNBTHooks = create(overrideReadEntityFromNBTHookTypes);
        afterReadEntityFromNBTHooks = create(afterReadEntityFromNBTHookTypes);
        isReadEntityFromNBTModded = beforeReadEntityFromNBTHooks != null || overrideReadEntityFromNBTHooks != null || afterReadEntityFromNBTHooks != null;
        beforeRespawnPlayerHooks = create(beforeRespawnPlayerHookTypes);
        overrideRespawnPlayerHooks = create(overrideRespawnPlayerHookTypes);
        afterRespawnPlayerHooks = create(afterRespawnPlayerHookTypes);
        isRespawnPlayerModded = beforeRespawnPlayerHooks != null || overrideRespawnPlayerHooks != null || afterRespawnPlayerHooks != null;
        beforeSendChatMessageHooks = create(beforeSendChatMessageHookTypes);
        overrideSendChatMessageHooks = create(overrideSendChatMessageHookTypes);
        afterSendChatMessageHooks = create(afterSendChatMessageHookTypes);
        isSendChatMessageModded = beforeSendChatMessageHooks != null || overrideSendChatMessageHooks != null || afterSendChatMessageHooks != null;
        beforeSetDeadHooks = create(beforeSetDeadHookTypes);
        overrideSetDeadHooks = create(overrideSetDeadHookTypes);
        afterSetDeadHooks = create(afterSetDeadHookTypes);
        isSetDeadModded = beforeSetDeadHooks != null || overrideSetDeadHooks != null || afterSetDeadHooks != null;
        beforeSetPositionAndRotationHooks = create(beforeSetPositionAndRotationHookTypes);
        overrideSetPositionAndRotationHooks = create(overrideSetPositionAndRotationHookTypes);
        afterSetPositionAndRotationHooks = create(afterSetPositionAndRotationHookTypes);
        isSetPositionAndRotationModded = beforeSetPositionAndRotationHooks != null || overrideSetPositionAndRotationHooks != null || afterSetPositionAndRotationHooks != null;
        beforeSleepInBedAtHooks = create(beforeSleepInBedAtHookTypes);
        overrideSleepInBedAtHooks = create(overrideSleepInBedAtHookTypes);
        afterSleepInBedAtHooks = create(afterSleepInBedAtHookTypes);
        isSleepInBedAtModded = beforeSleepInBedAtHooks != null || overrideSleepInBedAtHooks != null || afterSleepInBedAtHooks != null;
        beforeSwingItemHooks = create(beforeSwingItemHookTypes);
        overrideSwingItemHooks = create(overrideSwingItemHookTypes);
        afterSwingItemHooks = create(afterSwingItemHookTypes);
        isSwingItemModded = beforeSwingItemHooks != null || overrideSwingItemHooks != null || afterSwingItemHooks != null;
        beforeUpdateEntityActionStateHooks = create(beforeUpdateEntityActionStateHookTypes);
        overrideUpdateEntityActionStateHooks = create(overrideUpdateEntityActionStateHookTypes);
        afterUpdateEntityActionStateHooks = create(afterUpdateEntityActionStateHookTypes);
        isUpdateEntityActionStateModded = beforeUpdateEntityActionStateHooks != null || overrideUpdateEntityActionStateHooks != null || afterUpdateEntityActionStateHooks != null;
        beforeWriteEntityToNBTHooks = create(beforeWriteEntityToNBTHookTypes);
        overrideWriteEntityToNBTHooks = create(overrideWriteEntityToNBTHookTypes);
        afterWriteEntityToNBTHooks = create(afterWriteEntityToNBTHookTypes);
        isWriteEntityToNBTModded = beforeWriteEntityToNBTHooks != null || overrideWriteEntityToNBTHooks != null || afterWriteEntityToNBTHooks != null;
    }

    private PlayerBase[] create(List list)
    {
        if (list.isEmpty())
        {
            return null;
        }

        PlayerBase aplayerbase[] = new PlayerBase[list.size()];

        for (int i = 0; i < aplayerbase.length; i++)
        {
            aplayerbase[i] = getPlayerBase((String)list.get(i));
        }

        return aplayerbase;
    }

    private void beforeLocalConstructing(Minecraft minecraft, World world, Session session, int i)
    {
        if (beforeLocalConstructingHooks != null)
        {
            for (int j = beforeLocalConstructingHooks.length - 1; j >= 0; j--)
            {
                beforeLocalConstructingHooks[j].beforeLocalConstructing(minecraft, world, session, i);
            }
        }
    }

    private void afterLocalConstructing(Minecraft minecraft, World world, Session session, int i)
    {
        if (afterLocalConstructingHooks != null)
        {
            for (int j = 0; j < afterLocalConstructingHooks.length; j++)
            {
                afterLocalConstructingHooks[j].afterLocalConstructing(minecraft, world, session, i);
            }
        }
    }

    public PlayerBase getPlayerBase(String s)
    {
        return (PlayerBase)allBaseObjects.get(s);
    }

    public Set getPlayerBaseIds()
    {
        return unmodifiableAllBaseIds;
    }

    protected static void addExhaustion(EntityPlayerSP entityplayersp, float f)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.addExhaustion(f);
        }
        else
        {
            entityplayersp.localAddExhaustion(f);
        }
    }

    protected void addExhaustion(float f)
    {
        if (beforeAddExhaustionHooks != null)
        {
            for (int i = beforeAddExhaustionHooks.length - 1; i >= 0; i--)
            {
                beforeAddExhaustionHooks[i].beforeAddExhaustion(f);
            }
        }

        if (overrideAddExhaustionHooks != null)
        {
            overrideAddExhaustionHooks[overrideAddExhaustionHooks.length - 1].addExhaustion(f);
        }
        else
        {
            player.localAddExhaustion(f);
        }

        if (afterAddExhaustionHooks != null)
        {
            for (int j = 0; j < afterAddExhaustionHooks.length; j++)
            {
                afterAddExhaustionHooks[j].afterAddExhaustion(f);
            }
        }
    }

    protected PlayerBase GetOverwrittenAddExhaustion(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideAddExhaustionHooks.length; i++)
        {
            if (overrideAddExhaustionHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideAddExhaustionHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static boolean attackEntityFrom(EntityPlayerSP entityplayersp, DamageSource damagesource, int i)
    {
        boolean flag;

        if (entityplayersp.playerAPI != null)
        {
            flag = entityplayersp.playerAPI.attackEntityFrom(damagesource, i);
        }
        else
        {
            flag = entityplayersp.localAttackEntityFrom(damagesource, i);
        }

        return flag;
    }

    protected boolean attackEntityFrom(DamageSource damagesource, int i)
    {
        if (beforeAttackEntityFromHooks != null)
        {
            for (int j = beforeAttackEntityFromHooks.length - 1; j >= 0; j--)
            {
                beforeAttackEntityFromHooks[j].beforeAttackEntityFrom(damagesource, i);
            }
        }

        boolean flag;

        if (overrideAttackEntityFromHooks != null)
        {
            flag = overrideAttackEntityFromHooks[overrideAttackEntityFromHooks.length - 1].attackEntityFrom(damagesource, i);
        }
        else
        {
            flag = player.localAttackEntityFrom(damagesource, i);
        }

        if (afterAttackEntityFromHooks != null)
        {
            for (int k = 0; k < afterAttackEntityFromHooks.length; k++)
            {
                afterAttackEntityFromHooks[k].afterAttackEntityFrom(damagesource, i);
            }
        }

        return flag;
    }

    protected PlayerBase GetOverwrittenAttackEntityFrom(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideAttackEntityFromHooks.length; i++)
        {
            if (overrideAttackEntityFromHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideAttackEntityFromHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void attackTargetEntityWithCurrentItem(EntityPlayerSP entityplayersp, Entity entity)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.attackTargetEntityWithCurrentItem(entity);
        }
        else
        {
            entityplayersp.localAttackTargetEntityWithCurrentItem(entity);
        }
    }

    protected void attackTargetEntityWithCurrentItem(Entity entity)
    {
        if (beforeAttackTargetEntityWithCurrentItemHooks != null)
        {
            for (int i = beforeAttackTargetEntityWithCurrentItemHooks.length - 1; i >= 0; i--)
            {
                beforeAttackTargetEntityWithCurrentItemHooks[i].beforeAttackTargetEntityWithCurrentItem(entity);
            }
        }

        if (overrideAttackTargetEntityWithCurrentItemHooks != null)
        {
            overrideAttackTargetEntityWithCurrentItemHooks[overrideAttackTargetEntityWithCurrentItemHooks.length - 1].attackTargetEntityWithCurrentItem(entity);
        }
        else
        {
            player.localAttackTargetEntityWithCurrentItem(entity);
        }

        if (afterAttackTargetEntityWithCurrentItemHooks != null)
        {
            for (int j = 0; j < afterAttackTargetEntityWithCurrentItemHooks.length; j++)
            {
                afterAttackTargetEntityWithCurrentItemHooks[j].afterAttackTargetEntityWithCurrentItem(entity);
            }
        }
    }

    protected PlayerBase GetOverwrittenAttackTargetEntityWithCurrentItem(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideAttackTargetEntityWithCurrentItemHooks.length; i++)
        {
            if (overrideAttackTargetEntityWithCurrentItemHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideAttackTargetEntityWithCurrentItemHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static boolean canBreatheUnderwater(EntityPlayerSP entityplayersp)
    {
        boolean flag;

        if (entityplayersp.playerAPI != null)
        {
            flag = entityplayersp.playerAPI.canBreatheUnderwater();
        }
        else
        {
            flag = entityplayersp.localCanBreatheUnderwater();
        }

        return flag;
    }

    protected boolean canBreatheUnderwater()
    {
        if (beforeCanBreatheUnderwaterHooks != null)
        {
            for (int i = beforeCanBreatheUnderwaterHooks.length - 1; i >= 0; i--)
            {
                beforeCanBreatheUnderwaterHooks[i].beforeCanBreatheUnderwater();
            }
        }

        boolean flag;

        if (overrideCanBreatheUnderwaterHooks != null)
        {
            flag = overrideCanBreatheUnderwaterHooks[overrideCanBreatheUnderwaterHooks.length - 1].canBreatheUnderwater();
        }
        else
        {
            flag = player.localCanBreatheUnderwater();
        }

        if (afterCanBreatheUnderwaterHooks != null)
        {
            for (int j = 0; j < afterCanBreatheUnderwaterHooks.length; j++)
            {
                afterCanBreatheUnderwaterHooks[j].afterCanBreatheUnderwater();
            }
        }

        return flag;
    }

    protected PlayerBase GetOverwrittenCanBreatheUnderwater(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideCanBreatheUnderwaterHooks.length; i++)
        {
            if (overrideCanBreatheUnderwaterHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideCanBreatheUnderwaterHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static boolean canHarvestBlock(EntityPlayerSP entityplayersp, Block block)
    {
        boolean flag;

        if (entityplayersp.playerAPI != null)
        {
            flag = entityplayersp.playerAPI.canHarvestBlock(block);
        }
        else
        {
            flag = entityplayersp.localCanHarvestBlock(block);
        }

        return flag;
    }

    protected boolean canHarvestBlock(Block block)
    {
        if (beforeCanHarvestBlockHooks != null)
        {
            for (int i = beforeCanHarvestBlockHooks.length - 1; i >= 0; i--)
            {
                beforeCanHarvestBlockHooks[i].beforeCanHarvestBlock(block);
            }
        }

        boolean flag;

        if (overrideCanHarvestBlockHooks != null)
        {
            flag = overrideCanHarvestBlockHooks[overrideCanHarvestBlockHooks.length - 1].canHarvestBlock(block);
        }
        else
        {
            flag = player.localCanHarvestBlock(block);
        }

        if (afterCanHarvestBlockHooks != null)
        {
            for (int j = 0; j < afterCanHarvestBlockHooks.length; j++)
            {
                afterCanHarvestBlockHooks[j].afterCanHarvestBlock(block);
            }
        }

        return flag;
    }

    protected PlayerBase GetOverwrittenCanHarvestBlock(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideCanHarvestBlockHooks.length; i++)
        {
            if (overrideCanHarvestBlockHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideCanHarvestBlockHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static boolean canPlayerEdit(EntityPlayerSP entityplayersp, int i, int j, int k)
    {
        boolean flag;

        if (entityplayersp.playerAPI != null)
        {
            flag = entityplayersp.playerAPI.canPlayerEdit(i, j, k);
        }
        else
        {
            flag = entityplayersp.localCanPlayerEdit(i, j, k);
        }

        return flag;
    }

    protected boolean canPlayerEdit(int i, int j, int k)
    {
        if (beforeCanPlayerEditHooks != null)
        {
            for (int l = beforeCanPlayerEditHooks.length - 1; l >= 0; l--)
            {
                beforeCanPlayerEditHooks[l].beforeCanPlayerEdit(i, j, k);
            }
        }

        boolean flag;

        if (overrideCanPlayerEditHooks != null)
        {
            flag = overrideCanPlayerEditHooks[overrideCanPlayerEditHooks.length - 1].canPlayerEdit(i, j, k);
        }
        else
        {
            flag = player.localCanPlayerEdit(i, j, k);
        }

        if (afterCanPlayerEditHooks != null)
        {
            for (int i1 = 0; i1 < afterCanPlayerEditHooks.length; i1++)
            {
                afterCanPlayerEditHooks[i1].afterCanPlayerEdit(i, j, k);
            }
        }

        return flag;
    }

    protected PlayerBase GetOverwrittenCanPlayerEdit(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideCanPlayerEditHooks.length; i++)
        {
            if (overrideCanPlayerEditHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideCanPlayerEditHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static boolean canTriggerWalking(EntityPlayerSP entityplayersp)
    {
        boolean flag;

        if (entityplayersp.playerAPI != null)
        {
            flag = entityplayersp.playerAPI.canTriggerWalking();
        }
        else
        {
            flag = entityplayersp.localCanTriggerWalking();
        }

        return flag;
    }

    protected boolean canTriggerWalking()
    {
        if (beforeCanTriggerWalkingHooks != null)
        {
            for (int i = beforeCanTriggerWalkingHooks.length - 1; i >= 0; i--)
            {
                beforeCanTriggerWalkingHooks[i].beforeCanTriggerWalking();
            }
        }

        boolean flag;

        if (overrideCanTriggerWalkingHooks != null)
        {
            flag = overrideCanTriggerWalkingHooks[overrideCanTriggerWalkingHooks.length - 1].canTriggerWalking();
        }
        else
        {
            flag = player.localCanTriggerWalking();
        }

        if (afterCanTriggerWalkingHooks != null)
        {
            for (int j = 0; j < afterCanTriggerWalkingHooks.length; j++)
            {
                afterCanTriggerWalkingHooks[j].afterCanTriggerWalking();
            }
        }

        return flag;
    }

    protected PlayerBase GetOverwrittenCanTriggerWalking(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideCanTriggerWalkingHooks.length; i++)
        {
            if (overrideCanTriggerWalkingHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideCanTriggerWalkingHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void closeScreen(EntityPlayerSP entityplayersp)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.closeScreen();
        }
        else
        {
            entityplayersp.localCloseScreen();
        }
    }

    protected void closeScreen()
    {
        if (beforeCloseScreenHooks != null)
        {
            for (int i = beforeCloseScreenHooks.length - 1; i >= 0; i--)
            {
                beforeCloseScreenHooks[i].beforeCloseScreen();
            }
        }

        if (overrideCloseScreenHooks != null)
        {
            overrideCloseScreenHooks[overrideCloseScreenHooks.length - 1].closeScreen();
        }
        else
        {
            player.localCloseScreen();
        }

        if (afterCloseScreenHooks != null)
        {
            for (int j = 0; j < afterCloseScreenHooks.length; j++)
            {
                afterCloseScreenHooks[j].afterCloseScreen();
            }
        }
    }

    protected PlayerBase GetOverwrittenCloseScreen(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideCloseScreenHooks.length; i++)
        {
            if (overrideCloseScreenHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideCloseScreenHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void damageEntity(EntityPlayerSP entityplayersp, DamageSource damagesource, int i)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.damageEntity(damagesource, i);
        }
        else
        {
            entityplayersp.localDamageEntity(damagesource, i);
        }
    }

    protected void damageEntity(DamageSource damagesource, int i)
    {
        if (beforeDamageEntityHooks != null)
        {
            for (int j = beforeDamageEntityHooks.length - 1; j >= 0; j--)
            {
                beforeDamageEntityHooks[j].beforeDamageEntity(damagesource, i);
            }
        }

        if (overrideDamageEntityHooks != null)
        {
            overrideDamageEntityHooks[overrideDamageEntityHooks.length - 1].damageEntity(damagesource, i);
        }
        else
        {
            player.localDamageEntity(damagesource, i);
        }

        if (afterDamageEntityHooks != null)
        {
            for (int k = 0; k < afterDamageEntityHooks.length; k++)
            {
                afterDamageEntityHooks[k].afterDamageEntity(damagesource, i);
            }
        }
    }

    protected PlayerBase GetOverwrittenDamageEntity(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideDamageEntityHooks.length; i++)
        {
            if (overrideDamageEntityHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideDamageEntityHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void displayGUIBrewingStand(EntityPlayerSP entityplayersp, TileEntityBrewingStand tileentitybrewingstand)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.displayGUIBrewingStand(tileentitybrewingstand);
        }
        else
        {
            entityplayersp.localDisplayGUIBrewingStand(tileentitybrewingstand);
        }
    }

    protected void displayGUIBrewingStand(TileEntityBrewingStand tileentitybrewingstand)
    {
        if (beforeDisplayGUIBrewingStandHooks != null)
        {
            for (int i = beforeDisplayGUIBrewingStandHooks.length - 1; i >= 0; i--)
            {
                beforeDisplayGUIBrewingStandHooks[i].beforeDisplayGUIBrewingStand(tileentitybrewingstand);
            }
        }

        if (overrideDisplayGUIBrewingStandHooks != null)
        {
            overrideDisplayGUIBrewingStandHooks[overrideDisplayGUIBrewingStandHooks.length - 1].displayGUIBrewingStand(tileentitybrewingstand);
        }
        else
        {
            player.localDisplayGUIBrewingStand(tileentitybrewingstand);
        }

        if (afterDisplayGUIBrewingStandHooks != null)
        {
            for (int j = 0; j < afterDisplayGUIBrewingStandHooks.length; j++)
            {
                afterDisplayGUIBrewingStandHooks[j].afterDisplayGUIBrewingStand(tileentitybrewingstand);
            }
        }
    }

    protected PlayerBase GetOverwrittenDisplayGUIBrewingStand(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideDisplayGUIBrewingStandHooks.length; i++)
        {
            if (overrideDisplayGUIBrewingStandHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideDisplayGUIBrewingStandHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void displayGUIChest(EntityPlayerSP entityplayersp, IInventory iinventory)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.displayGUIChest(iinventory);
        }
        else
        {
            entityplayersp.localDisplayGUIChest(iinventory);
        }
    }

    protected void displayGUIChest(IInventory iinventory)
    {
        if (beforeDisplayGUIChestHooks != null)
        {
            for (int i = beforeDisplayGUIChestHooks.length - 1; i >= 0; i--)
            {
                beforeDisplayGUIChestHooks[i].beforeDisplayGUIChest(iinventory);
            }
        }

        if (overrideDisplayGUIChestHooks != null)
        {
            overrideDisplayGUIChestHooks[overrideDisplayGUIChestHooks.length - 1].displayGUIChest(iinventory);
        }
        else
        {
            player.localDisplayGUIChest(iinventory);
        }

        if (afterDisplayGUIChestHooks != null)
        {
            for (int j = 0; j < afterDisplayGUIChestHooks.length; j++)
            {
                afterDisplayGUIChestHooks[j].afterDisplayGUIChest(iinventory);
            }
        }
    }

    protected PlayerBase GetOverwrittenDisplayGUIChest(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideDisplayGUIChestHooks.length; i++)
        {
            if (overrideDisplayGUIChestHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideDisplayGUIChestHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void displayGUIDispenser(EntityPlayerSP entityplayersp, TileEntityDispenser tileentitydispenser)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.displayGUIDispenser(tileentitydispenser);
        }
        else
        {
            entityplayersp.localDisplayGUIDispenser(tileentitydispenser);
        }
    }

    protected void displayGUIDispenser(TileEntityDispenser tileentitydispenser)
    {
        if (beforeDisplayGUIDispenserHooks != null)
        {
            for (int i = beforeDisplayGUIDispenserHooks.length - 1; i >= 0; i--)
            {
                beforeDisplayGUIDispenserHooks[i].beforeDisplayGUIDispenser(tileentitydispenser);
            }
        }

        if (overrideDisplayGUIDispenserHooks != null)
        {
            overrideDisplayGUIDispenserHooks[overrideDisplayGUIDispenserHooks.length - 1].displayGUIDispenser(tileentitydispenser);
        }
        else
        {
            player.localDisplayGUIDispenser(tileentitydispenser);
        }

        if (afterDisplayGUIDispenserHooks != null)
        {
            for (int j = 0; j < afterDisplayGUIDispenserHooks.length; j++)
            {
                afterDisplayGUIDispenserHooks[j].afterDisplayGUIDispenser(tileentitydispenser);
            }
        }
    }

    protected PlayerBase GetOverwrittenDisplayGUIDispenser(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideDisplayGUIDispenserHooks.length; i++)
        {
            if (overrideDisplayGUIDispenserHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideDisplayGUIDispenserHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void displayGUIEditSign(EntityPlayerSP entityplayersp, TileEntitySign tileentitysign)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.displayGUIEditSign(tileentitysign);
        }
        else
        {
            entityplayersp.localDisplayGUIEditSign(tileentitysign);
        }
    }

    protected void displayGUIEditSign(TileEntitySign tileentitysign)
    {
        if (beforeDisplayGUIEditSignHooks != null)
        {
            for (int i = beforeDisplayGUIEditSignHooks.length - 1; i >= 0; i--)
            {
                beforeDisplayGUIEditSignHooks[i].beforeDisplayGUIEditSign(tileentitysign);
            }
        }

        if (overrideDisplayGUIEditSignHooks != null)
        {
            overrideDisplayGUIEditSignHooks[overrideDisplayGUIEditSignHooks.length - 1].displayGUIEditSign(tileentitysign);
        }
        else
        {
            player.localDisplayGUIEditSign(tileentitysign);
        }

        if (afterDisplayGUIEditSignHooks != null)
        {
            for (int j = 0; j < afterDisplayGUIEditSignHooks.length; j++)
            {
                afterDisplayGUIEditSignHooks[j].afterDisplayGUIEditSign(tileentitysign);
            }
        }
    }

    protected PlayerBase GetOverwrittenDisplayGUIEditSign(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideDisplayGUIEditSignHooks.length; i++)
        {
            if (overrideDisplayGUIEditSignHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideDisplayGUIEditSignHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void displayGUIEnchantment(EntityPlayerSP entityplayersp, int i, int j, int k)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.displayGUIEnchantment(i, j, k);
        }
        else
        {
            entityplayersp.localDisplayGUIEnchantment(i, j, k);
        }
    }

    protected void displayGUIEnchantment(int i, int j, int k)
    {
        if (beforeDisplayGUIEnchantmentHooks != null)
        {
            for (int l = beforeDisplayGUIEnchantmentHooks.length - 1; l >= 0; l--)
            {
                beforeDisplayGUIEnchantmentHooks[l].beforeDisplayGUIEnchantment(i, j, k);
            }
        }

        if (overrideDisplayGUIEnchantmentHooks != null)
        {
            overrideDisplayGUIEnchantmentHooks[overrideDisplayGUIEnchantmentHooks.length - 1].displayGUIEnchantment(i, j, k);
        }
        else
        {
            player.localDisplayGUIEnchantment(i, j, k);
        }

        if (afterDisplayGUIEnchantmentHooks != null)
        {
            for (int i1 = 0; i1 < afterDisplayGUIEnchantmentHooks.length; i1++)
            {
                afterDisplayGUIEnchantmentHooks[i1].afterDisplayGUIEnchantment(i, j, k);
            }
        }
    }

    protected PlayerBase GetOverwrittenDisplayGUIEnchantment(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideDisplayGUIEnchantmentHooks.length; i++)
        {
            if (overrideDisplayGUIEnchantmentHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideDisplayGUIEnchantmentHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void displayGUIFurnace(EntityPlayerSP entityplayersp, TileEntityFurnace tileentityfurnace)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.displayGUIFurnace(tileentityfurnace);
        }
        else
        {
            entityplayersp.localDisplayGUIFurnace(tileentityfurnace);
        }
    }

    protected void displayGUIFurnace(TileEntityFurnace tileentityfurnace)
    {
        if (beforeDisplayGUIFurnaceHooks != null)
        {
            for (int i = beforeDisplayGUIFurnaceHooks.length - 1; i >= 0; i--)
            {
                beforeDisplayGUIFurnaceHooks[i].beforeDisplayGUIFurnace(tileentityfurnace);
            }
        }

        if (overrideDisplayGUIFurnaceHooks != null)
        {
            overrideDisplayGUIFurnaceHooks[overrideDisplayGUIFurnaceHooks.length - 1].displayGUIFurnace(tileentityfurnace);
        }
        else
        {
            player.localDisplayGUIFurnace(tileentityfurnace);
        }

        if (afterDisplayGUIFurnaceHooks != null)
        {
            for (int j = 0; j < afterDisplayGUIFurnaceHooks.length; j++)
            {
                afterDisplayGUIFurnaceHooks[j].afterDisplayGUIFurnace(tileentityfurnace);
            }
        }
    }

    protected PlayerBase GetOverwrittenDisplayGUIFurnace(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideDisplayGUIFurnaceHooks.length; i++)
        {
            if (overrideDisplayGUIFurnaceHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideDisplayGUIFurnaceHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void displayWorkbenchGUI(EntityPlayerSP entityplayersp, int i, int j, int k)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.displayWorkbenchGUI(i, j, k);
        }
        else
        {
            entityplayersp.localDisplayWorkbenchGUI(i, j, k);
        }
    }

    protected void displayWorkbenchGUI(int i, int j, int k)
    {
        if (beforeDisplayWorkbenchGUIHooks != null)
        {
            for (int l = beforeDisplayWorkbenchGUIHooks.length - 1; l >= 0; l--)
            {
                beforeDisplayWorkbenchGUIHooks[l].beforeDisplayWorkbenchGUI(i, j, k);
            }
        }

        if (overrideDisplayWorkbenchGUIHooks != null)
        {
            overrideDisplayWorkbenchGUIHooks[overrideDisplayWorkbenchGUIHooks.length - 1].displayWorkbenchGUI(i, j, k);
        }
        else
        {
            player.localDisplayWorkbenchGUI(i, j, k);
        }

        if (afterDisplayWorkbenchGUIHooks != null)
        {
            for (int i1 = 0; i1 < afterDisplayWorkbenchGUIHooks.length; i1++)
            {
                afterDisplayWorkbenchGUIHooks[i1].afterDisplayWorkbenchGUI(i, j, k);
            }
        }
    }

    protected PlayerBase GetOverwrittenDisplayWorkbenchGUI(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideDisplayWorkbenchGUIHooks.length; i++)
        {
            if (overrideDisplayWorkbenchGUIHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideDisplayWorkbenchGUIHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static EntityItem dropOneItem(EntityPlayerSP entityplayersp)
    {
        EntityItem entityitem;

        if (entityplayersp.playerAPI != null)
        {
            entityitem = entityplayersp.playerAPI.dropOneItem();
        }
        else
        {
            entityitem = entityplayersp.localDropOneItem();
        }

        return entityitem;
    }

    protected EntityItem dropOneItem()
    {
        if (beforeDropOneItemHooks != null)
        {
            for (int i = beforeDropOneItemHooks.length - 1; i >= 0; i--)
            {
                beforeDropOneItemHooks[i].beforeDropOneItem();
            }
        }

        EntityItem entityitem;

        if (overrideDropOneItemHooks != null)
        {
            entityitem = overrideDropOneItemHooks[overrideDropOneItemHooks.length - 1].dropOneItem();
        }
        else
        {
            entityitem = player.localDropOneItem();
        }

        if (afterDropOneItemHooks != null)
        {
            for (int j = 0; j < afterDropOneItemHooks.length; j++)
            {
                afterDropOneItemHooks[j].afterDropOneItem();
            }
        }

        return entityitem;
    }

    protected PlayerBase GetOverwrittenDropOneItem(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideDropOneItemHooks.length; i++)
        {
            if (overrideDropOneItemHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideDropOneItemHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static EntityItem dropPlayerItem(EntityPlayerSP entityplayersp, ItemStack itemstack)
    {
        EntityItem entityitem;

        if (entityplayersp.playerAPI != null)
        {
            entityitem = entityplayersp.playerAPI.dropPlayerItem(itemstack);
        }
        else
        {
            entityitem = entityplayersp.localDropPlayerItem(itemstack);
        }

        return entityitem;
    }

    protected EntityItem dropPlayerItem(ItemStack itemstack)
    {
        if (beforeDropPlayerItemHooks != null)
        {
            for (int i = beforeDropPlayerItemHooks.length - 1; i >= 0; i--)
            {
                beforeDropPlayerItemHooks[i].beforeDropPlayerItem(itemstack);
            }
        }

        EntityItem entityitem;

        if (overrideDropPlayerItemHooks != null)
        {
            entityitem = overrideDropPlayerItemHooks[overrideDropPlayerItemHooks.length - 1].dropPlayerItem(itemstack);
        }
        else
        {
            entityitem = player.localDropPlayerItem(itemstack);
        }

        if (afterDropPlayerItemHooks != null)
        {
            for (int j = 0; j < afterDropPlayerItemHooks.length; j++)
            {
                afterDropPlayerItemHooks[j].afterDropPlayerItem(itemstack);
            }
        }

        return entityitem;
    }

    protected PlayerBase GetOverwrittenDropPlayerItem(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideDropPlayerItemHooks.length; i++)
        {
            if (overrideDropPlayerItemHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideDropPlayerItemHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static EntityItem dropPlayerItemWithRandomChoice(EntityPlayerSP entityplayersp, ItemStack itemstack, boolean flag)
    {
        EntityItem entityitem;

        if (entityplayersp.playerAPI != null)
        {
            entityitem = entityplayersp.playerAPI.dropPlayerItemWithRandomChoice(itemstack, flag);
        }
        else
        {
            entityitem = entityplayersp.localDropPlayerItemWithRandomChoice(itemstack, flag);
        }

        return entityitem;
    }

    protected EntityItem dropPlayerItemWithRandomChoice(ItemStack itemstack, boolean flag)
    {
        if (beforeDropPlayerItemWithRandomChoiceHooks != null)
        {
            for (int i = beforeDropPlayerItemWithRandomChoiceHooks.length - 1; i >= 0; i--)
            {
                beforeDropPlayerItemWithRandomChoiceHooks[i].beforeDropPlayerItemWithRandomChoice(itemstack, flag);
            }
        }

        EntityItem entityitem;

        if (overrideDropPlayerItemWithRandomChoiceHooks != null)
        {
            entityitem = overrideDropPlayerItemWithRandomChoiceHooks[overrideDropPlayerItemWithRandomChoiceHooks.length - 1].dropPlayerItemWithRandomChoice(itemstack, flag);
        }
        else
        {
            entityitem = player.localDropPlayerItemWithRandomChoice(itemstack, flag);
        }

        if (afterDropPlayerItemWithRandomChoiceHooks != null)
        {
            for (int j = 0; j < afterDropPlayerItemWithRandomChoiceHooks.length; j++)
            {
                afterDropPlayerItemWithRandomChoiceHooks[j].afterDropPlayerItemWithRandomChoice(itemstack, flag);
            }
        }

        return entityitem;
    }

    protected PlayerBase GetOverwrittenDropPlayerItemWithRandomChoice(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideDropPlayerItemWithRandomChoiceHooks.length; i++)
        {
            if (overrideDropPlayerItemWithRandomChoiceHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideDropPlayerItemWithRandomChoiceHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void fall(EntityPlayerSP entityplayersp, float f)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.fall(f);
        }
        else
        {
            entityplayersp.localFall(f);
        }
    }

    protected void fall(float f)
    {
        if (beforeFallHooks != null)
        {
            for (int i = beforeFallHooks.length - 1; i >= 0; i--)
            {
                beforeFallHooks[i].beforeFall(f);
            }
        }

        if (overrideFallHooks != null)
        {
            overrideFallHooks[overrideFallHooks.length - 1].fall(f);
        }
        else
        {
            player.localFall(f);
        }

        if (afterFallHooks != null)
        {
            for (int j = 0; j < afterFallHooks.length; j++)
            {
                afterFallHooks[j].afterFall(f);
            }
        }
    }

    protected PlayerBase GetOverwrittenFall(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideFallHooks.length; i++)
        {
            if (overrideFallHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideFallHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static float getBrightness(EntityPlayerSP entityplayersp, float f)
    {
        float f1;

        if (entityplayersp.playerAPI != null)
        {
            f1 = entityplayersp.playerAPI.getBrightness(f);
        }
        else
        {
            f1 = entityplayersp.localGetBrightness(f);
        }

        return f1;
    }

    protected float getBrightness(float f)
    {
        if (beforeGetBrightnessHooks != null)
        {
            for (int i = beforeGetBrightnessHooks.length - 1; i >= 0; i--)
            {
                beforeGetBrightnessHooks[i].beforeGetBrightness(f);
            }
        }

        float f1;

        if (overrideGetBrightnessHooks != null)
        {
            f1 = overrideGetBrightnessHooks[overrideGetBrightnessHooks.length - 1].getBrightness(f);
        }
        else
        {
            f1 = player.localGetBrightness(f);
        }

        if (afterGetBrightnessHooks != null)
        {
            for (int j = 0; j < afterGetBrightnessHooks.length; j++)
            {
                afterGetBrightnessHooks[j].afterGetBrightness(f);
            }
        }

        return f1;
    }

    protected PlayerBase GetOverwrittenGetBrightness(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideGetBrightnessHooks.length; i++)
        {
            if (overrideGetBrightnessHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideGetBrightnessHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static int getBrightnessForRender(EntityPlayerSP entityplayersp, float f)
    {
        int i;

        if (entityplayersp.playerAPI != null)
        {
            i = entityplayersp.playerAPI.getBrightnessForRender(f);
        }
        else
        {
            i = entityplayersp.localGetBrightnessForRender(f);
        }

        return i;
    }

    protected int getBrightnessForRender(float f)
    {
        if (beforeGetBrightnessForRenderHooks != null)
        {
            for (int i = beforeGetBrightnessForRenderHooks.length - 1; i >= 0; i--)
            {
                beforeGetBrightnessForRenderHooks[i].beforeGetBrightnessForRender(f);
            }
        }

        int j;

        if (overrideGetBrightnessForRenderHooks != null)
        {
            j = overrideGetBrightnessForRenderHooks[overrideGetBrightnessForRenderHooks.length - 1].getBrightnessForRender(f);
        }
        else
        {
            j = player.localGetBrightnessForRender(f);
        }

        if (afterGetBrightnessForRenderHooks != null)
        {
            for (int k = 0; k < afterGetBrightnessForRenderHooks.length; k++)
            {
                afterGetBrightnessForRenderHooks[k].afterGetBrightnessForRender(f);
            }
        }

        return j;
    }

    protected PlayerBase GetOverwrittenGetBrightnessForRender(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideGetBrightnessForRenderHooks.length; i++)
        {
            if (overrideGetBrightnessForRenderHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideGetBrightnessForRenderHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static float getCurrentPlayerStrVsBlock(EntityPlayerSP entityplayersp, Block block)
    {
        float f;

        if (entityplayersp.playerAPI != null)
        {
            f = entityplayersp.playerAPI.getCurrentPlayerStrVsBlock(block);
        }
        else
        {
            f = entityplayersp.localGetCurrentPlayerStrVsBlock(block);
        }

        return f;
    }

    protected float getCurrentPlayerStrVsBlock(Block block)
    {
        if (beforeGetCurrentPlayerStrVsBlockHooks != null)
        {
            for (int i = beforeGetCurrentPlayerStrVsBlockHooks.length - 1; i >= 0; i--)
            {
                beforeGetCurrentPlayerStrVsBlockHooks[i].beforeGetCurrentPlayerStrVsBlock(block);
            }
        }

        float f;

        if (overrideGetCurrentPlayerStrVsBlockHooks != null)
        {
            f = overrideGetCurrentPlayerStrVsBlockHooks[overrideGetCurrentPlayerStrVsBlockHooks.length - 1].getCurrentPlayerStrVsBlock(block);
        }
        else
        {
            f = player.localGetCurrentPlayerStrVsBlock(block);
        }

        if (afterGetCurrentPlayerStrVsBlockHooks != null)
        {
            for (int j = 0; j < afterGetCurrentPlayerStrVsBlockHooks.length; j++)
            {
                afterGetCurrentPlayerStrVsBlockHooks[j].afterGetCurrentPlayerStrVsBlock(block);
            }
        }

        return f;
    }

    protected PlayerBase GetOverwrittenGetCurrentPlayerStrVsBlock(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideGetCurrentPlayerStrVsBlockHooks.length; i++)
        {
            if (overrideGetCurrentPlayerStrVsBlockHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideGetCurrentPlayerStrVsBlockHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static double getDistanceSq(EntityPlayerSP entityplayersp, double d, double d1, double d2)
    {
        double d3;

        if (entityplayersp.playerAPI != null)
        {
            d3 = entityplayersp.playerAPI.getDistanceSq(d, d1, d2);
        }
        else
        {
            d3 = entityplayersp.localGetDistanceSq(d, d1, d2);
        }

        return d3;
    }

    protected double getDistanceSq(double d, double d1, double d2)
    {
        if (beforeGetDistanceSqHooks != null)
        {
            for (int i = beforeGetDistanceSqHooks.length - 1; i >= 0; i--)
            {
                beforeGetDistanceSqHooks[i].beforeGetDistanceSq(d, d1, d2);
            }
        }

        double d3;

        if (overrideGetDistanceSqHooks != null)
        {
            d3 = overrideGetDistanceSqHooks[overrideGetDistanceSqHooks.length - 1].getDistanceSq(d, d1, d2);
        }
        else
        {
            d3 = player.localGetDistanceSq(d, d1, d2);
        }

        if (afterGetDistanceSqHooks != null)
        {
            for (int j = 0; j < afterGetDistanceSqHooks.length; j++)
            {
                afterGetDistanceSqHooks[j].afterGetDistanceSq(d, d1, d2);
            }
        }

        return d3;
    }

    protected PlayerBase GetOverwrittenGetDistanceSq(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideGetDistanceSqHooks.length; i++)
        {
            if (overrideGetDistanceSqHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideGetDistanceSqHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static double getDistanceSqToEntity(EntityPlayerSP entityplayersp, Entity entity)
    {
        double d;

        if (entityplayersp.playerAPI != null)
        {
            d = entityplayersp.playerAPI.getDistanceSqToEntity(entity);
        }
        else
        {
            d = entityplayersp.localGetDistanceSqToEntity(entity);
        }

        return d;
    }

    protected double getDistanceSqToEntity(Entity entity)
    {
        if (beforeGetDistanceSqToEntityHooks != null)
        {
            for (int i = beforeGetDistanceSqToEntityHooks.length - 1; i >= 0; i--)
            {
                beforeGetDistanceSqToEntityHooks[i].beforeGetDistanceSqToEntity(entity);
            }
        }

        double d;

        if (overrideGetDistanceSqToEntityHooks != null)
        {
            d = overrideGetDistanceSqToEntityHooks[overrideGetDistanceSqToEntityHooks.length - 1].getDistanceSqToEntity(entity);
        }
        else
        {
            d = player.localGetDistanceSqToEntity(entity);
        }

        if (afterGetDistanceSqToEntityHooks != null)
        {
            for (int j = 0; j < afterGetDistanceSqToEntityHooks.length; j++)
            {
                afterGetDistanceSqToEntityHooks[j].afterGetDistanceSqToEntity(entity);
            }
        }

        return d;
    }

    protected PlayerBase GetOverwrittenGetDistanceSqToEntity(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideGetDistanceSqToEntityHooks.length; i++)
        {
            if (overrideGetDistanceSqToEntityHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideGetDistanceSqToEntityHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static float getFOVMultiplier(EntityPlayerSP entityplayersp)
    {
        float f;

        if (entityplayersp.playerAPI != null)
        {
            f = entityplayersp.playerAPI.getFOVMultiplier();
        }
        else
        {
            f = entityplayersp.localGetFOVMultiplier();
        }

        return f;
    }

    protected float getFOVMultiplier()
    {
        if (beforeGetFOVMultiplierHooks != null)
        {
            for (int i = beforeGetFOVMultiplierHooks.length - 1; i >= 0; i--)
            {
                beforeGetFOVMultiplierHooks[i].beforeGetFOVMultiplier();
            }
        }

        float f;

        if (overrideGetFOVMultiplierHooks != null)
        {
            f = overrideGetFOVMultiplierHooks[overrideGetFOVMultiplierHooks.length - 1].getFOVMultiplier();
        }
        else
        {
            f = player.localGetFOVMultiplier();
        }

        if (afterGetFOVMultiplierHooks != null)
        {
            for (int j = 0; j < afterGetFOVMultiplierHooks.length; j++)
            {
                afterGetFOVMultiplierHooks[j].afterGetFOVMultiplier();
            }
        }

        return f;
    }

    protected PlayerBase GetOverwrittenGetFOVMultiplier(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideGetFOVMultiplierHooks.length; i++)
        {
            if (overrideGetFOVMultiplierHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideGetFOVMultiplierHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static String getHurtSound(EntityPlayerSP entityplayersp)
    {
        String s;

        if (entityplayersp.playerAPI != null)
        {
            s = entityplayersp.playerAPI.getHurtSound();
        }
        else
        {
            s = entityplayersp.localGetHurtSound();
        }

        return s;
    }

    protected String getHurtSound()
    {
        if (beforeGetHurtSoundHooks != null)
        {
            for (int i = beforeGetHurtSoundHooks.length - 1; i >= 0; i--)
            {
                beforeGetHurtSoundHooks[i].beforeGetHurtSound();
            }
        }

        String s;

        if (overrideGetHurtSoundHooks != null)
        {
            s = overrideGetHurtSoundHooks[overrideGetHurtSoundHooks.length - 1].getHurtSound();
        }
        else
        {
            s = player.localGetHurtSound();
        }

        if (afterGetHurtSoundHooks != null)
        {
            for (int j = 0; j < afterGetHurtSoundHooks.length; j++)
            {
                afterGetHurtSoundHooks[j].afterGetHurtSound();
            }
        }

        return s;
    }

    protected PlayerBase GetOverwrittenGetHurtSound(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideGetHurtSoundHooks.length; i++)
        {
            if (overrideGetHurtSoundHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideGetHurtSoundHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static int getItemIcon(EntityPlayerSP entityplayersp, ItemStack itemstack, int i)
    {
        int j;

        if (entityplayersp.playerAPI != null)
        {
            j = entityplayersp.playerAPI.getItemIcon(itemstack, i);
        }
        else
        {
            j = entityplayersp.localGetItemIcon(itemstack, i);
        }

        return j;
    }

    protected int getItemIcon(ItemStack itemstack, int i)
    {
        if (beforeGetItemIconHooks != null)
        {
            for (int j = beforeGetItemIconHooks.length - 1; j >= 0; j--)
            {
                beforeGetItemIconHooks[j].beforeGetItemIcon(itemstack, i);
            }
        }

        int k;

        if (overrideGetItemIconHooks != null)
        {
            k = overrideGetItemIconHooks[overrideGetItemIconHooks.length - 1].getItemIcon(itemstack, i);
        }
        else
        {
            k = player.localGetItemIcon(itemstack, i);
        }

        if (afterGetItemIconHooks != null)
        {
            for (int l = 0; l < afterGetItemIconHooks.length; l++)
            {
                afterGetItemIconHooks[l].afterGetItemIcon(itemstack, i);
            }
        }

        return k;
    }

    protected PlayerBase GetOverwrittenGetItemIcon(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideGetItemIconHooks.length; i++)
        {
            if (overrideGetItemIconHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideGetItemIconHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static int getSleepTimer(EntityPlayerSP entityplayersp)
    {
        int i;

        if (entityplayersp.playerAPI != null)
        {
            i = entityplayersp.playerAPI.getSleepTimer();
        }
        else
        {
            i = entityplayersp.localGetSleepTimer();
        }

        return i;
    }

    protected int getSleepTimer()
    {
        if (beforeGetSleepTimerHooks != null)
        {
            for (int i = beforeGetSleepTimerHooks.length - 1; i >= 0; i--)
            {
                beforeGetSleepTimerHooks[i].beforeGetSleepTimer();
            }
        }

        int j;

        if (overrideGetSleepTimerHooks != null)
        {
            j = overrideGetSleepTimerHooks[overrideGetSleepTimerHooks.length - 1].getSleepTimer();
        }
        else
        {
            j = player.localGetSleepTimer();
        }

        if (afterGetSleepTimerHooks != null)
        {
            for (int k = 0; k < afterGetSleepTimerHooks.length; k++)
            {
                afterGetSleepTimerHooks[k].afterGetSleepTimer();
            }
        }

        return j;
    }

    protected PlayerBase GetOverwrittenGetSleepTimer(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideGetSleepTimerHooks.length; i++)
        {
            if (overrideGetSleepTimerHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideGetSleepTimerHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static float getSpeedModifier(EntityPlayerSP entityplayersp)
    {
        float f;

        if (entityplayersp.playerAPI != null)
        {
            f = entityplayersp.playerAPI.getSpeedModifier();
        }
        else
        {
            f = entityplayersp.localGetSpeedModifier();
        }

        return f;
    }

    protected float getSpeedModifier()
    {
        if (beforeGetSpeedModifierHooks != null)
        {
            for (int i = beforeGetSpeedModifierHooks.length - 1; i >= 0; i--)
            {
                beforeGetSpeedModifierHooks[i].beforeGetSpeedModifier();
            }
        }

        float f;

        if (overrideGetSpeedModifierHooks != null)
        {
            f = overrideGetSpeedModifierHooks[overrideGetSpeedModifierHooks.length - 1].getSpeedModifier();
        }
        else
        {
            f = player.localGetSpeedModifier();
        }

        if (afterGetSpeedModifierHooks != null)
        {
            for (int j = 0; j < afterGetSpeedModifierHooks.length; j++)
            {
                afterGetSpeedModifierHooks[j].afterGetSpeedModifier();
            }
        }

        return f;
    }

    protected PlayerBase GetOverwrittenGetSpeedModifier(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideGetSpeedModifierHooks.length; i++)
        {
            if (overrideGetSpeedModifierHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideGetSpeedModifierHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static boolean handleLavaMovement(EntityPlayerSP entityplayersp)
    {
        boolean flag;

        if (entityplayersp.playerAPI != null)
        {
            flag = entityplayersp.playerAPI.handleLavaMovement();
        }
        else
        {
            flag = entityplayersp.localHandleLavaMovement();
        }

        return flag;
    }

    protected boolean handleLavaMovement()
    {
        if (beforeHandleLavaMovementHooks != null)
        {
            for (int i = beforeHandleLavaMovementHooks.length - 1; i >= 0; i--)
            {
                beforeHandleLavaMovementHooks[i].beforeHandleLavaMovement();
            }
        }

        boolean flag;

        if (overrideHandleLavaMovementHooks != null)
        {
            flag = overrideHandleLavaMovementHooks[overrideHandleLavaMovementHooks.length - 1].handleLavaMovement();
        }
        else
        {
            flag = player.localHandleLavaMovement();
        }

        if (afterHandleLavaMovementHooks != null)
        {
            for (int j = 0; j < afterHandleLavaMovementHooks.length; j++)
            {
                afterHandleLavaMovementHooks[j].afterHandleLavaMovement();
            }
        }

        return flag;
    }

    protected PlayerBase GetOverwrittenHandleLavaMovement(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideHandleLavaMovementHooks.length; i++)
        {
            if (overrideHandleLavaMovementHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideHandleLavaMovementHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static boolean handleWaterMovement(EntityPlayerSP entityplayersp)
    {
        boolean flag;

        if (entityplayersp.playerAPI != null)
        {
            flag = entityplayersp.playerAPI.handleWaterMovement();
        }
        else
        {
            flag = entityplayersp.localHandleWaterMovement();
        }

        return flag;
    }

    protected boolean handleWaterMovement()
    {
        if (beforeHandleWaterMovementHooks != null)
        {
            for (int i = beforeHandleWaterMovementHooks.length - 1; i >= 0; i--)
            {
                beforeHandleWaterMovementHooks[i].beforeHandleWaterMovement();
            }
        }

        boolean flag;

        if (overrideHandleWaterMovementHooks != null)
        {
            flag = overrideHandleWaterMovementHooks[overrideHandleWaterMovementHooks.length - 1].handleWaterMovement();
        }
        else
        {
            flag = player.localHandleWaterMovement();
        }

        if (afterHandleWaterMovementHooks != null)
        {
            for (int j = 0; j < afterHandleWaterMovementHooks.length; j++)
            {
                afterHandleWaterMovementHooks[j].afterHandleWaterMovement();
            }
        }

        return flag;
    }

    protected PlayerBase GetOverwrittenHandleWaterMovement(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideHandleWaterMovementHooks.length; i++)
        {
            if (overrideHandleWaterMovementHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideHandleWaterMovementHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void heal(EntityPlayerSP entityplayersp, int i)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.heal(i);
        }
        else
        {
            entityplayersp.localHeal(i);
        }
    }

    protected void heal(int i)
    {
        if (beforeHealHooks != null)
        {
            for (int j = beforeHealHooks.length - 1; j >= 0; j--)
            {
                beforeHealHooks[j].beforeHeal(i);
            }
        }

        if (overrideHealHooks != null)
        {
            overrideHealHooks[overrideHealHooks.length - 1].heal(i);
        }
        else
        {
            player.localHeal(i);
        }

        if (afterHealHooks != null)
        {
            for (int k = 0; k < afterHealHooks.length; k++)
            {
                afterHealHooks[k].afterHeal(i);
            }
        }
    }

    protected PlayerBase GetOverwrittenHeal(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideHealHooks.length; i++)
        {
            if (overrideHealHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideHealHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static boolean isEntityInsideOpaqueBlock(EntityPlayerSP entityplayersp)
    {
        boolean flag;

        if (entityplayersp.playerAPI != null)
        {
            flag = entityplayersp.playerAPI.isEntityInsideOpaqueBlock();
        }
        else
        {
            flag = entityplayersp.localIsEntityInsideOpaqueBlock();
        }

        return flag;
    }

    protected boolean isEntityInsideOpaqueBlock()
    {
        if (beforeIsEntityInsideOpaqueBlockHooks != null)
        {
            for (int i = beforeIsEntityInsideOpaqueBlockHooks.length - 1; i >= 0; i--)
            {
                beforeIsEntityInsideOpaqueBlockHooks[i].beforeIsEntityInsideOpaqueBlock();
            }
        }

        boolean flag;

        if (overrideIsEntityInsideOpaqueBlockHooks != null)
        {
            flag = overrideIsEntityInsideOpaqueBlockHooks[overrideIsEntityInsideOpaqueBlockHooks.length - 1].isEntityInsideOpaqueBlock();
        }
        else
        {
            flag = player.localIsEntityInsideOpaqueBlock();
        }

        if (afterIsEntityInsideOpaqueBlockHooks != null)
        {
            for (int j = 0; j < afterIsEntityInsideOpaqueBlockHooks.length; j++)
            {
                afterIsEntityInsideOpaqueBlockHooks[j].afterIsEntityInsideOpaqueBlock();
            }
        }

        return flag;
    }

    protected PlayerBase GetOverwrittenIsEntityInsideOpaqueBlock(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideIsEntityInsideOpaqueBlockHooks.length; i++)
        {
            if (overrideIsEntityInsideOpaqueBlockHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideIsEntityInsideOpaqueBlockHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static boolean isInWater(EntityPlayerSP entityplayersp)
    {
        boolean flag;

        if (entityplayersp.playerAPI != null)
        {
            flag = entityplayersp.playerAPI.isInWater();
        }
        else
        {
            flag = entityplayersp.localIsInWater();
        }

        return flag;
    }

    protected boolean isInWater()
    {
        if (beforeIsInWaterHooks != null)
        {
            for (int i = beforeIsInWaterHooks.length - 1; i >= 0; i--)
            {
                beforeIsInWaterHooks[i].beforeIsInWater();
            }
        }

        boolean flag;

        if (overrideIsInWaterHooks != null)
        {
            flag = overrideIsInWaterHooks[overrideIsInWaterHooks.length - 1].isInWater();
        }
        else
        {
            flag = player.localIsInWater();
        }

        if (afterIsInWaterHooks != null)
        {
            for (int j = 0; j < afterIsInWaterHooks.length; j++)
            {
                afterIsInWaterHooks[j].afterIsInWater();
            }
        }

        return flag;
    }

    protected PlayerBase GetOverwrittenIsInWater(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideIsInWaterHooks.length; i++)
        {
            if (overrideIsInWaterHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideIsInWaterHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static boolean isInsideOfMaterial(EntityPlayerSP entityplayersp, Material material)
    {
        boolean flag;

        if (entityplayersp.playerAPI != null)
        {
            flag = entityplayersp.playerAPI.isInsideOfMaterial(material);
        }
        else
        {
            flag = entityplayersp.localIsInsideOfMaterial(material);
        }

        return flag;
    }

    protected boolean isInsideOfMaterial(Material material)
    {
        if (beforeIsInsideOfMaterialHooks != null)
        {
            for (int i = beforeIsInsideOfMaterialHooks.length - 1; i >= 0; i--)
            {
                beforeIsInsideOfMaterialHooks[i].beforeIsInsideOfMaterial(material);
            }
        }

        boolean flag;

        if (overrideIsInsideOfMaterialHooks != null)
        {
            flag = overrideIsInsideOfMaterialHooks[overrideIsInsideOfMaterialHooks.length - 1].isInsideOfMaterial(material);
        }
        else
        {
            flag = player.localIsInsideOfMaterial(material);
        }

        if (afterIsInsideOfMaterialHooks != null)
        {
            for (int j = 0; j < afterIsInsideOfMaterialHooks.length; j++)
            {
                afterIsInsideOfMaterialHooks[j].afterIsInsideOfMaterial(material);
            }
        }

        return flag;
    }

    protected PlayerBase GetOverwrittenIsInsideOfMaterial(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideIsInsideOfMaterialHooks.length; i++)
        {
            if (overrideIsInsideOfMaterialHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideIsInsideOfMaterialHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static boolean isOnLadder(EntityPlayerSP entityplayersp)
    {
        boolean flag;

        if (entityplayersp.playerAPI != null)
        {
            flag = entityplayersp.playerAPI.isOnLadder();
        }
        else
        {
            flag = entityplayersp.localIsOnLadder();
        }

        return flag;
    }

    protected boolean isOnLadder()
    {
        if (beforeIsOnLadderHooks != null)
        {
            for (int i = beforeIsOnLadderHooks.length - 1; i >= 0; i--)
            {
                beforeIsOnLadderHooks[i].beforeIsOnLadder();
            }
        }

        boolean flag;

        if (overrideIsOnLadderHooks != null)
        {
            flag = overrideIsOnLadderHooks[overrideIsOnLadderHooks.length - 1].isOnLadder();
        }
        else
        {
            flag = player.localIsOnLadder();
        }

        if (afterIsOnLadderHooks != null)
        {
            for (int j = 0; j < afterIsOnLadderHooks.length; j++)
            {
                afterIsOnLadderHooks[j].afterIsOnLadder();
            }
        }

        return flag;
    }

    protected PlayerBase GetOverwrittenIsOnLadder(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideIsOnLadderHooks.length; i++)
        {
            if (overrideIsOnLadderHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideIsOnLadderHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static boolean isSneaking(EntityPlayerSP entityplayersp)
    {
        boolean flag;

        if (entityplayersp.playerAPI != null)
        {
            flag = entityplayersp.playerAPI.isSneaking();
        }
        else
        {
            flag = entityplayersp.localIsSneaking();
        }

        return flag;
    }

    protected boolean isSneaking()
    {
        if (beforeIsSneakingHooks != null)
        {
            for (int i = beforeIsSneakingHooks.length - 1; i >= 0; i--)
            {
                beforeIsSneakingHooks[i].beforeIsSneaking();
            }
        }

        boolean flag;

        if (overrideIsSneakingHooks != null)
        {
            flag = overrideIsSneakingHooks[overrideIsSneakingHooks.length - 1].isSneaking();
        }
        else
        {
            flag = player.localIsSneaking();
        }

        if (afterIsSneakingHooks != null)
        {
            for (int j = 0; j < afterIsSneakingHooks.length; j++)
            {
                afterIsSneakingHooks[j].afterIsSneaking();
            }
        }

        return flag;
    }

    protected PlayerBase GetOverwrittenIsSneaking(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideIsSneakingHooks.length; i++)
        {
            if (overrideIsSneakingHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideIsSneakingHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static boolean isSprinting(EntityPlayerSP entityplayersp)
    {
        boolean flag;

        if (entityplayersp.playerAPI != null)
        {
            flag = entityplayersp.playerAPI.isSprinting();
        }
        else
        {
            flag = entityplayersp.localIsSprinting();
        }

        return flag;
    }

    protected boolean isSprinting()
    {
        if (beforeIsSprintingHooks != null)
        {
            for (int i = beforeIsSprintingHooks.length - 1; i >= 0; i--)
            {
                beforeIsSprintingHooks[i].beforeIsSprinting();
            }
        }

        boolean flag;

        if (overrideIsSprintingHooks != null)
        {
            flag = overrideIsSprintingHooks[overrideIsSprintingHooks.length - 1].isSprinting();
        }
        else
        {
            flag = player.localIsSprinting();
        }

        if (afterIsSprintingHooks != null)
        {
            for (int j = 0; j < afterIsSprintingHooks.length; j++)
            {
                afterIsSprintingHooks[j].afterIsSprinting();
            }
        }

        return flag;
    }

    protected PlayerBase GetOverwrittenIsSprinting(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideIsSprintingHooks.length; i++)
        {
            if (overrideIsSprintingHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideIsSprintingHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void jump(EntityPlayerSP entityplayersp)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.jump();
        }
        else
        {
            entityplayersp.localJump();
        }
    }

    protected void jump()
    {
        if (beforeJumpHooks != null)
        {
            for (int i = beforeJumpHooks.length - 1; i >= 0; i--)
            {
                beforeJumpHooks[i].beforeJump();
            }
        }

        if (overrideJumpHooks != null)
        {
            overrideJumpHooks[overrideJumpHooks.length - 1].jump();
        }
        else
        {
            player.localJump();
        }

        if (afterJumpHooks != null)
        {
            for (int j = 0; j < afterJumpHooks.length; j++)
            {
                afterJumpHooks[j].afterJump();
            }
        }
    }

    protected PlayerBase GetOverwrittenJump(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideJumpHooks.length; i++)
        {
            if (overrideJumpHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideJumpHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void knockBack(EntityPlayerSP entityplayersp, Entity entity, int i, double d, double d1)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.knockBack(entity, i, d, d1);
        }
        else
        {
            entityplayersp.localKnockBack(entity, i, d, d1);
        }
    }

    protected void knockBack(Entity entity, int i, double d, double d1)
    {
        if (beforeKnockBackHooks != null)
        {
            for (int j = beforeKnockBackHooks.length - 1; j >= 0; j--)
            {
                beforeKnockBackHooks[j].beforeKnockBack(entity, i, d, d1);
            }
        }

        if (overrideKnockBackHooks != null)
        {
            overrideKnockBackHooks[overrideKnockBackHooks.length - 1].knockBack(entity, i, d, d1);
        }
        else
        {
            player.localKnockBack(entity, i, d, d1);
        }

        if (afterKnockBackHooks != null)
        {
            for (int k = 0; k < afterKnockBackHooks.length; k++)
            {
                afterKnockBackHooks[k].afterKnockBack(entity, i, d, d1);
            }
        }
    }

    protected PlayerBase GetOverwrittenKnockBack(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideKnockBackHooks.length; i++)
        {
            if (overrideKnockBackHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideKnockBackHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void moveEntity(EntityPlayerSP entityplayersp, double d, double d1, double d2)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.moveEntity(d, d1, d2);
        }
        else
        {
            entityplayersp.localMoveEntity(d, d1, d2);
        }
    }

    protected void moveEntity(double d, double d1, double d2)
    {
        if (beforeMoveEntityHooks != null)
        {
            for (int i = beforeMoveEntityHooks.length - 1; i >= 0; i--)
            {
                beforeMoveEntityHooks[i].beforeMoveEntity(d, d1, d2);
            }
        }

        if (overrideMoveEntityHooks != null)
        {
            overrideMoveEntityHooks[overrideMoveEntityHooks.length - 1].moveEntity(d, d1, d2);
        }
        else
        {
            player.localMoveEntity(d, d1, d2);
        }

        if (afterMoveEntityHooks != null)
        {
            for (int j = 0; j < afterMoveEntityHooks.length; j++)
            {
                afterMoveEntityHooks[j].afterMoveEntity(d, d1, d2);
            }
        }
    }

    protected PlayerBase GetOverwrittenMoveEntity(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideMoveEntityHooks.length; i++)
        {
            if (overrideMoveEntityHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideMoveEntityHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void moveEntityWithHeading(EntityPlayerSP entityplayersp, float f, float f1)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.moveEntityWithHeading(f, f1);
        }
        else
        {
            entityplayersp.localMoveEntityWithHeading(f, f1);
        }
    }

    protected void moveEntityWithHeading(float f, float f1)
    {
        if (beforeMoveEntityWithHeadingHooks != null)
        {
            for (int i = beforeMoveEntityWithHeadingHooks.length - 1; i >= 0; i--)
            {
                beforeMoveEntityWithHeadingHooks[i].beforeMoveEntityWithHeading(f, f1);
            }
        }

        if (overrideMoveEntityWithHeadingHooks != null)
        {
            overrideMoveEntityWithHeadingHooks[overrideMoveEntityWithHeadingHooks.length - 1].moveEntityWithHeading(f, f1);
        }
        else
        {
            player.localMoveEntityWithHeading(f, f1);
        }

        if (afterMoveEntityWithHeadingHooks != null)
        {
            for (int j = 0; j < afterMoveEntityWithHeadingHooks.length; j++)
            {
                afterMoveEntityWithHeadingHooks[j].afterMoveEntityWithHeading(f, f1);
            }
        }
    }

    protected PlayerBase GetOverwrittenMoveEntityWithHeading(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideMoveEntityWithHeadingHooks.length; i++)
        {
            if (overrideMoveEntityWithHeadingHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideMoveEntityWithHeadingHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void moveFlying(EntityPlayerSP entityplayersp, float f, float f1, float f2)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.moveFlying(f, f1, f2);
        }
        else
        {
            entityplayersp.localMoveFlying(f, f1, f2);
        }
    }

    protected void moveFlying(float f, float f1, float f2)
    {
        if (beforeMoveFlyingHooks != null)
        {
            for (int i = beforeMoveFlyingHooks.length - 1; i >= 0; i--)
            {
                beforeMoveFlyingHooks[i].beforeMoveFlying(f, f1, f2);
            }
        }

        if (overrideMoveFlyingHooks != null)
        {
            overrideMoveFlyingHooks[overrideMoveFlyingHooks.length - 1].moveFlying(f, f1, f2);
        }
        else
        {
            player.localMoveFlying(f, f1, f2);
        }

        if (afterMoveFlyingHooks != null)
        {
            for (int j = 0; j < afterMoveFlyingHooks.length; j++)
            {
                afterMoveFlyingHooks[j].afterMoveFlying(f, f1, f2);
            }
        }
    }

    protected PlayerBase GetOverwrittenMoveFlying(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideMoveFlyingHooks.length; i++)
        {
            if (overrideMoveFlyingHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideMoveFlyingHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void onDeath(EntityPlayerSP entityplayersp, DamageSource damagesource)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.onDeath(damagesource);
        }
        else
        {
            entityplayersp.localOnDeath(damagesource);
        }
    }

    protected void onDeath(DamageSource damagesource)
    {
        if (beforeOnDeathHooks != null)
        {
            for (int i = beforeOnDeathHooks.length - 1; i >= 0; i--)
            {
                beforeOnDeathHooks[i].beforeOnDeath(damagesource);
            }
        }

        if (overrideOnDeathHooks != null)
        {
            overrideOnDeathHooks[overrideOnDeathHooks.length - 1].onDeath(damagesource);
        }
        else
        {
            player.localOnDeath(damagesource);
        }

        if (afterOnDeathHooks != null)
        {
            for (int j = 0; j < afterOnDeathHooks.length; j++)
            {
                afterOnDeathHooks[j].afterOnDeath(damagesource);
            }
        }
    }

    protected PlayerBase GetOverwrittenOnDeath(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideOnDeathHooks.length; i++)
        {
            if (overrideOnDeathHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideOnDeathHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void onLivingUpdate(EntityPlayerSP entityplayersp)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.onLivingUpdate();
        }
        else
        {
            entityplayersp.localOnLivingUpdate();
        }
    }

    protected void onLivingUpdate()
    {
        if (beforeOnLivingUpdateHooks != null)
        {
            for (int i = beforeOnLivingUpdateHooks.length - 1; i >= 0; i--)
            {
                beforeOnLivingUpdateHooks[i].beforeOnLivingUpdate();
            }
        }

        if (overrideOnLivingUpdateHooks != null)
        {
            overrideOnLivingUpdateHooks[overrideOnLivingUpdateHooks.length - 1].onLivingUpdate();
        }
        else
        {
            player.localOnLivingUpdate();
        }

        if (afterOnLivingUpdateHooks != null)
        {
            for (int j = 0; j < afterOnLivingUpdateHooks.length; j++)
            {
                afterOnLivingUpdateHooks[j].afterOnLivingUpdate();
            }
        }
    }

    protected PlayerBase GetOverwrittenOnLivingUpdate(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideOnLivingUpdateHooks.length; i++)
        {
            if (overrideOnLivingUpdateHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideOnLivingUpdateHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void onKillEntity(EntityPlayerSP entityplayersp, EntityLiving entityliving)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.onKillEntity(entityliving);
        }
        else
        {
            entityplayersp.localOnKillEntity(entityliving);
        }
    }

    protected void onKillEntity(EntityLiving entityliving)
    {
        if (beforeOnKillEntityHooks != null)
        {
            for (int i = beforeOnKillEntityHooks.length - 1; i >= 0; i--)
            {
                beforeOnKillEntityHooks[i].beforeOnKillEntity(entityliving);
            }
        }

        if (overrideOnKillEntityHooks != null)
        {
            overrideOnKillEntityHooks[overrideOnKillEntityHooks.length - 1].onKillEntity(entityliving);
        }
        else
        {
            player.localOnKillEntity(entityliving);
        }

        if (afterOnKillEntityHooks != null)
        {
            for (int j = 0; j < afterOnKillEntityHooks.length; j++)
            {
                afterOnKillEntityHooks[j].afterOnKillEntity(entityliving);
            }
        }
    }

    protected PlayerBase GetOverwrittenOnKillEntity(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideOnKillEntityHooks.length; i++)
        {
            if (overrideOnKillEntityHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideOnKillEntityHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void onUpdate(EntityPlayerSP entityplayersp)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.onUpdate();
        }
        else
        {
            entityplayersp.localOnUpdate();
        }
    }

    protected void onUpdate()
    {
        if (beforeOnUpdateHooks != null)
        {
            for (int i = beforeOnUpdateHooks.length - 1; i >= 0; i--)
            {
                beforeOnUpdateHooks[i].beforeOnUpdate();
            }
        }

        if (overrideOnUpdateHooks != null)
        {
            overrideOnUpdateHooks[overrideOnUpdateHooks.length - 1].onUpdate();
        }
        else
        {
            player.localOnUpdate();
        }

        if (afterOnUpdateHooks != null)
        {
            for (int j = 0; j < afterOnUpdateHooks.length; j++)
            {
                afterOnUpdateHooks[j].afterOnUpdate();
            }
        }
    }

    protected PlayerBase GetOverwrittenOnUpdate(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideOnUpdateHooks.length; i++)
        {
            if (overrideOnUpdateHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideOnUpdateHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static boolean pushOutOfBlocks(EntityPlayerSP entityplayersp, double d, double d1, double d2)
    {
        boolean flag;

        if (entityplayersp.playerAPI != null)
        {
            flag = entityplayersp.playerAPI.pushOutOfBlocks(d, d1, d2);
        }
        else
        {
            flag = entityplayersp.localPushOutOfBlocks(d, d1, d2);
        }

        return flag;
    }

    protected boolean pushOutOfBlocks(double d, double d1, double d2)
    {
        if (beforePushOutOfBlocksHooks != null)
        {
            for (int i = beforePushOutOfBlocksHooks.length - 1; i >= 0; i--)
            {
                beforePushOutOfBlocksHooks[i].beforePushOutOfBlocks(d, d1, d2);
            }
        }

        boolean flag;

        if (overridePushOutOfBlocksHooks != null)
        {
            flag = overridePushOutOfBlocksHooks[overridePushOutOfBlocksHooks.length - 1].pushOutOfBlocks(d, d1, d2);
        }
        else
        {
            flag = player.localPushOutOfBlocks(d, d1, d2);
        }

        if (afterPushOutOfBlocksHooks != null)
        {
            for (int j = 0; j < afterPushOutOfBlocksHooks.length; j++)
            {
                afterPushOutOfBlocksHooks[j].afterPushOutOfBlocks(d, d1, d2);
            }
        }

        return flag;
    }

    protected PlayerBase GetOverwrittenPushOutOfBlocks(PlayerBase playerbase)
    {
        for (int i = 0; i < overridePushOutOfBlocksHooks.length; i++)
        {
            if (overridePushOutOfBlocksHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overridePushOutOfBlocksHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static MovingObjectPosition rayTrace(EntityPlayerSP entityplayersp, double d, float f)
    {
        MovingObjectPosition movingobjectposition;

        if (entityplayersp.playerAPI != null)
        {
            movingobjectposition = entityplayersp.playerAPI.rayTrace(d, f);
        }
        else
        {
            movingobjectposition = entityplayersp.localRayTrace(d, f);
        }

        return movingobjectposition;
    }

    protected MovingObjectPosition rayTrace(double d, float f)
    {
        if (beforeRayTraceHooks != null)
        {
            for (int i = beforeRayTraceHooks.length - 1; i >= 0; i--)
            {
                beforeRayTraceHooks[i].beforeRayTrace(d, f);
            }
        }

        MovingObjectPosition movingobjectposition;

        if (overrideRayTraceHooks != null)
        {
            movingobjectposition = overrideRayTraceHooks[overrideRayTraceHooks.length - 1].rayTrace(d, f);
        }
        else
        {
            movingobjectposition = player.localRayTrace(d, f);
        }

        if (afterRayTraceHooks != null)
        {
            for (int j = 0; j < afterRayTraceHooks.length; j++)
            {
                afterRayTraceHooks[j].afterRayTrace(d, f);
            }
        }

        return movingobjectposition;
    }

    protected PlayerBase GetOverwrittenRayTrace(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideRayTraceHooks.length; i++)
        {
            if (overrideRayTraceHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideRayTraceHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void readEntityFromNBT(EntityPlayerSP entityplayersp, NBTTagCompound nbttagcompound)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.readEntityFromNBT(nbttagcompound);
        }
        else
        {
            entityplayersp.localReadEntityFromNBT(nbttagcompound);
        }
    }

    protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
    {
        if (beforeReadEntityFromNBTHooks != null)
        {
            for (int i = beforeReadEntityFromNBTHooks.length - 1; i >= 0; i--)
            {
                beforeReadEntityFromNBTHooks[i].beforeReadEntityFromNBT(nbttagcompound);
            }
        }

        if (overrideReadEntityFromNBTHooks != null)
        {
            overrideReadEntityFromNBTHooks[overrideReadEntityFromNBTHooks.length - 1].readEntityFromNBT(nbttagcompound);
        }
        else
        {
            player.localReadEntityFromNBT(nbttagcompound);
        }

        if (afterReadEntityFromNBTHooks != null)
        {
            for (int j = 0; j < afterReadEntityFromNBTHooks.length; j++)
            {
                afterReadEntityFromNBTHooks[j].afterReadEntityFromNBT(nbttagcompound);
            }
        }
    }

    protected PlayerBase GetOverwrittenReadEntityFromNBT(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideReadEntityFromNBTHooks.length; i++)
        {
            if (overrideReadEntityFromNBTHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideReadEntityFromNBTHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void respawnPlayer(EntityPlayerSP entityplayersp)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.respawnPlayer();
        }
        else
        {
            entityplayersp.localRespawnPlayer();
        }
    }

    protected void respawnPlayer()
    {
        if (beforeRespawnPlayerHooks != null)
        {
            for (int i = beforeRespawnPlayerHooks.length - 1; i >= 0; i--)
            {
                beforeRespawnPlayerHooks[i].beforeRespawnPlayer();
            }
        }

        if (overrideRespawnPlayerHooks != null)
        {
            overrideRespawnPlayerHooks[overrideRespawnPlayerHooks.length - 1].respawnPlayer();
        }
        else
        {
            player.localRespawnPlayer();
        }

        if (afterRespawnPlayerHooks != null)
        {
            for (int j = 0; j < afterRespawnPlayerHooks.length; j++)
            {
                afterRespawnPlayerHooks[j].afterRespawnPlayer();
            }
        }
    }

    protected PlayerBase GetOverwrittenRespawnPlayer(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideRespawnPlayerHooks.length; i++)
        {
            if (overrideRespawnPlayerHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideRespawnPlayerHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void sendChatMessage(EntityPlayerSP entityplayersp, String s)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.sendChatMessage(s);
        }
        else
        {
            entityplayersp.localSendChatMessage(s);
        }
    }

    protected void sendChatMessage(String s)
    {
        if (beforeSendChatMessageHooks != null)
        {
            for (int i = beforeSendChatMessageHooks.length - 1; i >= 0; i--)
            {
                beforeSendChatMessageHooks[i].beforeSendChatMessage(s);
            }
        }

        if (overrideSendChatMessageHooks != null)
        {
            overrideSendChatMessageHooks[overrideSendChatMessageHooks.length - 1].sendChatMessage(s);
        }
        else
        {
            player.localSendChatMessage(s);
        }

        if (afterSendChatMessageHooks != null)
        {
            for (int j = 0; j < afterSendChatMessageHooks.length; j++)
            {
                afterSendChatMessageHooks[j].afterSendChatMessage(s);
            }
        }
    }

    protected PlayerBase GetOverwrittenSendChatMessage(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideSendChatMessageHooks.length; i++)
        {
            if (overrideSendChatMessageHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideSendChatMessageHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void setDead(EntityPlayerSP entityplayersp)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.setDead();
        }
        else
        {
            entityplayersp.localSetDead();
        }
    }

    protected void setDead()
    {
        if (beforeSetDeadHooks != null)
        {
            for (int i = beforeSetDeadHooks.length - 1; i >= 0; i--)
            {
                beforeSetDeadHooks[i].beforeSetDead();
            }
        }

        if (overrideSetDeadHooks != null)
        {
            overrideSetDeadHooks[overrideSetDeadHooks.length - 1].setDead();
        }
        else
        {
            player.localSetDead();
        }

        if (afterSetDeadHooks != null)
        {
            for (int j = 0; j < afterSetDeadHooks.length; j++)
            {
                afterSetDeadHooks[j].afterSetDead();
            }
        }
    }

    protected PlayerBase GetOverwrittenSetDead(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideSetDeadHooks.length; i++)
        {
            if (overrideSetDeadHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideSetDeadHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void setPositionAndRotation(EntityPlayerSP entityplayersp, double d, double d1, double d2, float f, float f1)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.setPositionAndRotation(d, d1, d2, f, f1);
        }
        else
        {
            entityplayersp.localSetPositionAndRotation(d, d1, d2, f, f1);
        }
    }

    protected void setPositionAndRotation(double d, double d1, double d2, float f, float f1)
    {
        if (beforeSetPositionAndRotationHooks != null)
        {
            for (int i = beforeSetPositionAndRotationHooks.length - 1; i >= 0; i--)
            {
                beforeSetPositionAndRotationHooks[i].beforeSetPositionAndRotation(d, d1, d2, f, f1);
            }
        }

        if (overrideSetPositionAndRotationHooks != null)
        {
            overrideSetPositionAndRotationHooks[overrideSetPositionAndRotationHooks.length - 1].setPositionAndRotation(d, d1, d2, f, f1);
        }
        else
        {
            player.localSetPositionAndRotation(d, d1, d2, f, f1);
        }

        if (afterSetPositionAndRotationHooks != null)
        {
            for (int j = 0; j < afterSetPositionAndRotationHooks.length; j++)
            {
                afterSetPositionAndRotationHooks[j].afterSetPositionAndRotation(d, d1, d2, f, f1);
            }
        }
    }

    protected PlayerBase GetOverwrittenSetPositionAndRotation(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideSetPositionAndRotationHooks.length; i++)
        {
            if (overrideSetPositionAndRotationHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideSetPositionAndRotationHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static EnumStatus sleepInBedAt(EntityPlayerSP entityplayersp, int i, int j, int k)
    {
        EnumStatus enumstatus;

        if (entityplayersp.playerAPI != null)
        {
            enumstatus = entityplayersp.playerAPI.sleepInBedAt(i, j, k);
        }
        else
        {
            enumstatus = entityplayersp.localSleepInBedAt(i, j, k);
        }

        return enumstatus;
    }

    protected EnumStatus sleepInBedAt(int i, int j, int k)
    {
        if (beforeSleepInBedAtHooks != null)
        {
            for (int l = beforeSleepInBedAtHooks.length - 1; l >= 0; l--)
            {
                beforeSleepInBedAtHooks[l].beforeSleepInBedAt(i, j, k);
            }
        }

        EnumStatus enumstatus;

        if (overrideSleepInBedAtHooks != null)
        {
            enumstatus = overrideSleepInBedAtHooks[overrideSleepInBedAtHooks.length - 1].sleepInBedAt(i, j, k);
        }
        else
        {
            enumstatus = player.localSleepInBedAt(i, j, k);
        }

        if (afterSleepInBedAtHooks != null)
        {
            for (int i1 = 0; i1 < afterSleepInBedAtHooks.length; i1++)
            {
                afterSleepInBedAtHooks[i1].afterSleepInBedAt(i, j, k);
            }
        }

        return enumstatus;
    }

    protected PlayerBase GetOverwrittenSleepInBedAt(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideSleepInBedAtHooks.length; i++)
        {
            if (overrideSleepInBedAtHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideSleepInBedAtHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void swingItem(EntityPlayerSP entityplayersp)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.swingItem();
        }
        else
        {
            entityplayersp.localSwingItem();
        }
    }

    protected void swingItem()
    {
        if (beforeSwingItemHooks != null)
        {
            for (int i = beforeSwingItemHooks.length - 1; i >= 0; i--)
            {
                beforeSwingItemHooks[i].beforeSwingItem();
            }
        }

        if (overrideSwingItemHooks != null)
        {
            overrideSwingItemHooks[overrideSwingItemHooks.length - 1].swingItem();
        }
        else
        {
            player.localSwingItem();
        }

        if (afterSwingItemHooks != null)
        {
            for (int j = 0; j < afterSwingItemHooks.length; j++)
            {
                afterSwingItemHooks[j].afterSwingItem();
            }
        }
    }

    protected PlayerBase GetOverwrittenSwingItem(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideSwingItemHooks.length; i++)
        {
            if (overrideSwingItemHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideSwingItemHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void updateEntityActionState(EntityPlayerSP entityplayersp)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.updateEntityActionState();
        }
        else
        {
            entityplayersp.localUpdateEntityActionState();
        }
    }

    protected void updateEntityActionState()
    {
        if (beforeUpdateEntityActionStateHooks != null)
        {
            for (int i = beforeUpdateEntityActionStateHooks.length - 1; i >= 0; i--)
            {
                beforeUpdateEntityActionStateHooks[i].beforeUpdateEntityActionState();
            }
        }

        if (overrideUpdateEntityActionStateHooks != null)
        {
            overrideUpdateEntityActionStateHooks[overrideUpdateEntityActionStateHooks.length - 1].updateEntityActionState();
        }
        else
        {
            player.localUpdateEntityActionState();
        }

        if (afterUpdateEntityActionStateHooks != null)
        {
            for (int j = 0; j < afterUpdateEntityActionStateHooks.length; j++)
            {
                afterUpdateEntityActionStateHooks[j].afterUpdateEntityActionState();
            }
        }
    }

    protected PlayerBase GetOverwrittenUpdateEntityActionState(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideUpdateEntityActionStateHooks.length; i++)
        {
            if (overrideUpdateEntityActionStateHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideUpdateEntityActionStateHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    protected static void writeEntityToNBT(EntityPlayerSP entityplayersp, NBTTagCompound nbttagcompound)
    {
        if (entityplayersp.playerAPI != null)
        {
            entityplayersp.playerAPI.writeEntityToNBT(nbttagcompound);
        }
        else
        {
            entityplayersp.localWriteEntityToNBT(nbttagcompound);
        }
    }

    protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
        if (beforeWriteEntityToNBTHooks != null)
        {
            for (int i = beforeWriteEntityToNBTHooks.length - 1; i >= 0; i--)
            {
                beforeWriteEntityToNBTHooks[i].beforeWriteEntityToNBT(nbttagcompound);
            }
        }

        if (overrideWriteEntityToNBTHooks != null)
        {
            overrideWriteEntityToNBTHooks[overrideWriteEntityToNBTHooks.length - 1].writeEntityToNBT(nbttagcompound);
        }
        else
        {
            player.localWriteEntityToNBT(nbttagcompound);
        }

        if (afterWriteEntityToNBTHooks != null)
        {
            for (int j = 0; j < afterWriteEntityToNBTHooks.length; j++)
            {
                afterWriteEntityToNBTHooks[j].afterWriteEntityToNBT(nbttagcompound);
            }
        }
    }

    protected PlayerBase GetOverwrittenWriteEntityToNBT(PlayerBase playerbase)
    {
        for (int i = 0; i < overrideWriteEntityToNBTHooks.length; i++)
        {
            if (overrideWriteEntityToNBTHooks[i] == playerbase)
            {
                if (i == 0)
                {
                    return null;
                }
                else
                {
                    return overrideWriteEntityToNBTHooks[i - 1];
                }
            }
        }

        return playerbase;
    }

    static
    {
        Class = (new Class[]
                {
                    net.minecraft.src.PlayerAPI.class
                });
        Classes = (new Class[]
                {
                    net.minecraft.src.PlayerAPI.class, java.lang.String.class
                });
        allBaseConstructors = new Hashtable();
        unmodifiableAllIds = Collections.unmodifiableSet(allBaseConstructors.keySet());
    }
}
