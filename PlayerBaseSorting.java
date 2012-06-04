package net.minecraft.src;

public final class PlayerBaseSorting
{
    private String beforeLocalConstructingSuperiors[];
    private String beforeLocalConstructingInferiors[];
    private String afterLocalConstructingSuperiors[];
    private String afterLocalConstructingInferiors[];
    private String beforeAddExhaustionSuperiors[];
    private String beforeAddExhaustionInferiors[];
    private String overrideAddExhaustionSuperiors[];
    private String overrideAddExhaustionInferiors[];
    private String afterAddExhaustionSuperiors[];
    private String afterAddExhaustionInferiors[];
    private String beforeAttackEntityFromSuperiors[];
    private String beforeAttackEntityFromInferiors[];
    private String overrideAttackEntityFromSuperiors[];
    private String overrideAttackEntityFromInferiors[];
    private String afterAttackEntityFromSuperiors[];
    private String afterAttackEntityFromInferiors[];
    private String beforeAttackTargetEntityWithCurrentItemSuperiors[];
    private String beforeAttackTargetEntityWithCurrentItemInferiors[];
    private String overrideAttackTargetEntityWithCurrentItemSuperiors[];
    private String overrideAttackTargetEntityWithCurrentItemInferiors[];
    private String afterAttackTargetEntityWithCurrentItemSuperiors[];
    private String afterAttackTargetEntityWithCurrentItemInferiors[];
    private String beforeCanBreatheUnderwaterSuperiors[];
    private String beforeCanBreatheUnderwaterInferiors[];
    private String overrideCanBreatheUnderwaterSuperiors[];
    private String overrideCanBreatheUnderwaterInferiors[];
    private String afterCanBreatheUnderwaterSuperiors[];
    private String afterCanBreatheUnderwaterInferiors[];
    private String beforeCanHarvestBlockSuperiors[];
    private String beforeCanHarvestBlockInferiors[];
    private String overrideCanHarvestBlockSuperiors[];
    private String overrideCanHarvestBlockInferiors[];
    private String afterCanHarvestBlockSuperiors[];
    private String afterCanHarvestBlockInferiors[];
    private String beforeCanPlayerEditSuperiors[];
    private String beforeCanPlayerEditInferiors[];
    private String overrideCanPlayerEditSuperiors[];
    private String overrideCanPlayerEditInferiors[];
    private String afterCanPlayerEditSuperiors[];
    private String afterCanPlayerEditInferiors[];
    private String beforeCanTriggerWalkingSuperiors[];
    private String beforeCanTriggerWalkingInferiors[];
    private String overrideCanTriggerWalkingSuperiors[];
    private String overrideCanTriggerWalkingInferiors[];
    private String afterCanTriggerWalkingSuperiors[];
    private String afterCanTriggerWalkingInferiors[];
    private String beforeCloseScreenSuperiors[];
    private String beforeCloseScreenInferiors[];
    private String overrideCloseScreenSuperiors[];
    private String overrideCloseScreenInferiors[];
    private String afterCloseScreenSuperiors[];
    private String afterCloseScreenInferiors[];
    private String beforeDamageEntitySuperiors[];
    private String beforeDamageEntityInferiors[];
    private String overrideDamageEntitySuperiors[];
    private String overrideDamageEntityInferiors[];
    private String afterDamageEntitySuperiors[];
    private String afterDamageEntityInferiors[];
    private String beforeDisplayGUIBrewingStandSuperiors[];
    private String beforeDisplayGUIBrewingStandInferiors[];
    private String overrideDisplayGUIBrewingStandSuperiors[];
    private String overrideDisplayGUIBrewingStandInferiors[];
    private String afterDisplayGUIBrewingStandSuperiors[];
    private String afterDisplayGUIBrewingStandInferiors[];
    private String beforeDisplayGUIChestSuperiors[];
    private String beforeDisplayGUIChestInferiors[];
    private String overrideDisplayGUIChestSuperiors[];
    private String overrideDisplayGUIChestInferiors[];
    private String afterDisplayGUIChestSuperiors[];
    private String afterDisplayGUIChestInferiors[];
    private String beforeDisplayGUIDispenserSuperiors[];
    private String beforeDisplayGUIDispenserInferiors[];
    private String overrideDisplayGUIDispenserSuperiors[];
    private String overrideDisplayGUIDispenserInferiors[];
    private String afterDisplayGUIDispenserSuperiors[];
    private String afterDisplayGUIDispenserInferiors[];
    private String beforeDisplayGUIEditSignSuperiors[];
    private String beforeDisplayGUIEditSignInferiors[];
    private String overrideDisplayGUIEditSignSuperiors[];
    private String overrideDisplayGUIEditSignInferiors[];
    private String afterDisplayGUIEditSignSuperiors[];
    private String afterDisplayGUIEditSignInferiors[];
    private String beforeDisplayGUIEnchantmentSuperiors[];
    private String beforeDisplayGUIEnchantmentInferiors[];
    private String overrideDisplayGUIEnchantmentSuperiors[];
    private String overrideDisplayGUIEnchantmentInferiors[];
    private String afterDisplayGUIEnchantmentSuperiors[];
    private String afterDisplayGUIEnchantmentInferiors[];
    private String beforeDisplayGUIFurnaceSuperiors[];
    private String beforeDisplayGUIFurnaceInferiors[];
    private String overrideDisplayGUIFurnaceSuperiors[];
    private String overrideDisplayGUIFurnaceInferiors[];
    private String afterDisplayGUIFurnaceSuperiors[];
    private String afterDisplayGUIFurnaceInferiors[];
    private String beforeDisplayWorkbenchGUISuperiors[];
    private String beforeDisplayWorkbenchGUIInferiors[];
    private String overrideDisplayWorkbenchGUISuperiors[];
    private String overrideDisplayWorkbenchGUIInferiors[];
    private String afterDisplayWorkbenchGUISuperiors[];
    private String afterDisplayWorkbenchGUIInferiors[];
    private String beforeDropOneItemSuperiors[];
    private String beforeDropOneItemInferiors[];
    private String overrideDropOneItemSuperiors[];
    private String overrideDropOneItemInferiors[];
    private String afterDropOneItemSuperiors[];
    private String afterDropOneItemInferiors[];
    private String beforeDropPlayerItemSuperiors[];
    private String beforeDropPlayerItemInferiors[];
    private String overrideDropPlayerItemSuperiors[];
    private String overrideDropPlayerItemInferiors[];
    private String afterDropPlayerItemSuperiors[];
    private String afterDropPlayerItemInferiors[];
    private String beforeDropPlayerItemWithRandomChoiceSuperiors[];
    private String beforeDropPlayerItemWithRandomChoiceInferiors[];
    private String overrideDropPlayerItemWithRandomChoiceSuperiors[];
    private String overrideDropPlayerItemWithRandomChoiceInferiors[];
    private String afterDropPlayerItemWithRandomChoiceSuperiors[];
    private String afterDropPlayerItemWithRandomChoiceInferiors[];
    private String beforeFallSuperiors[];
    private String beforeFallInferiors[];
    private String overrideFallSuperiors[];
    private String overrideFallInferiors[];
    private String afterFallSuperiors[];
    private String afterFallInferiors[];
    private String beforeGetBrightnessSuperiors[];
    private String beforeGetBrightnessInferiors[];
    private String overrideGetBrightnessSuperiors[];
    private String overrideGetBrightnessInferiors[];
    private String afterGetBrightnessSuperiors[];
    private String afterGetBrightnessInferiors[];
    private String beforeGetBrightnessForRenderSuperiors[];
    private String beforeGetBrightnessForRenderInferiors[];
    private String overrideGetBrightnessForRenderSuperiors[];
    private String overrideGetBrightnessForRenderInferiors[];
    private String afterGetBrightnessForRenderSuperiors[];
    private String afterGetBrightnessForRenderInferiors[];
    private String beforeGetCurrentPlayerStrVsBlockSuperiors[];
    private String beforeGetCurrentPlayerStrVsBlockInferiors[];
    private String overrideGetCurrentPlayerStrVsBlockSuperiors[];
    private String overrideGetCurrentPlayerStrVsBlockInferiors[];
    private String afterGetCurrentPlayerStrVsBlockSuperiors[];
    private String afterGetCurrentPlayerStrVsBlockInferiors[];
    private String beforeGetDistanceSqSuperiors[];
    private String beforeGetDistanceSqInferiors[];
    private String overrideGetDistanceSqSuperiors[];
    private String overrideGetDistanceSqInferiors[];
    private String afterGetDistanceSqSuperiors[];
    private String afterGetDistanceSqInferiors[];
    private String beforeGetDistanceSqToEntitySuperiors[];
    private String beforeGetDistanceSqToEntityInferiors[];
    private String overrideGetDistanceSqToEntitySuperiors[];
    private String overrideGetDistanceSqToEntityInferiors[];
    private String afterGetDistanceSqToEntitySuperiors[];
    private String afterGetDistanceSqToEntityInferiors[];
    private String beforeGetFOVMultiplierSuperiors[];
    private String beforeGetFOVMultiplierInferiors[];
    private String overrideGetFOVMultiplierSuperiors[];
    private String overrideGetFOVMultiplierInferiors[];
    private String afterGetFOVMultiplierSuperiors[];
    private String afterGetFOVMultiplierInferiors[];
    private String beforeGetHurtSoundSuperiors[];
    private String beforeGetHurtSoundInferiors[];
    private String overrideGetHurtSoundSuperiors[];
    private String overrideGetHurtSoundInferiors[];
    private String afterGetHurtSoundSuperiors[];
    private String afterGetHurtSoundInferiors[];
    private String beforeGetItemIconSuperiors[];
    private String beforeGetItemIconInferiors[];
    private String overrideGetItemIconSuperiors[];
    private String overrideGetItemIconInferiors[];
    private String afterGetItemIconSuperiors[];
    private String afterGetItemIconInferiors[];
    private String beforeGetSleepTimerSuperiors[];
    private String beforeGetSleepTimerInferiors[];
    private String overrideGetSleepTimerSuperiors[];
    private String overrideGetSleepTimerInferiors[];
    private String afterGetSleepTimerSuperiors[];
    private String afterGetSleepTimerInferiors[];
    private String beforeGetSpeedModifierSuperiors[];
    private String beforeGetSpeedModifierInferiors[];
    private String overrideGetSpeedModifierSuperiors[];
    private String overrideGetSpeedModifierInferiors[];
    private String afterGetSpeedModifierSuperiors[];
    private String afterGetSpeedModifierInferiors[];
    private String beforeHandleLavaMovementSuperiors[];
    private String beforeHandleLavaMovementInferiors[];
    private String overrideHandleLavaMovementSuperiors[];
    private String overrideHandleLavaMovementInferiors[];
    private String afterHandleLavaMovementSuperiors[];
    private String afterHandleLavaMovementInferiors[];
    private String beforeHandleWaterMovementSuperiors[];
    private String beforeHandleWaterMovementInferiors[];
    private String overrideHandleWaterMovementSuperiors[];
    private String overrideHandleWaterMovementInferiors[];
    private String afterHandleWaterMovementSuperiors[];
    private String afterHandleWaterMovementInferiors[];
    private String beforeHealSuperiors[];
    private String beforeHealInferiors[];
    private String overrideHealSuperiors[];
    private String overrideHealInferiors[];
    private String afterHealSuperiors[];
    private String afterHealInferiors[];
    private String beforeIsEntityInsideOpaqueBlockSuperiors[];
    private String beforeIsEntityInsideOpaqueBlockInferiors[];
    private String overrideIsEntityInsideOpaqueBlockSuperiors[];
    private String overrideIsEntityInsideOpaqueBlockInferiors[];
    private String afterIsEntityInsideOpaqueBlockSuperiors[];
    private String afterIsEntityInsideOpaqueBlockInferiors[];
    private String beforeIsInWaterSuperiors[];
    private String beforeIsInWaterInferiors[];
    private String overrideIsInWaterSuperiors[];
    private String overrideIsInWaterInferiors[];
    private String afterIsInWaterSuperiors[];
    private String afterIsInWaterInferiors[];
    private String beforeIsInsideOfMaterialSuperiors[];
    private String beforeIsInsideOfMaterialInferiors[];
    private String overrideIsInsideOfMaterialSuperiors[];
    private String overrideIsInsideOfMaterialInferiors[];
    private String afterIsInsideOfMaterialSuperiors[];
    private String afterIsInsideOfMaterialInferiors[];
    private String beforeIsOnLadderSuperiors[];
    private String beforeIsOnLadderInferiors[];
    private String overrideIsOnLadderSuperiors[];
    private String overrideIsOnLadderInferiors[];
    private String afterIsOnLadderSuperiors[];
    private String afterIsOnLadderInferiors[];
    private String beforeIsSneakingSuperiors[];
    private String beforeIsSneakingInferiors[];
    private String overrideIsSneakingSuperiors[];
    private String overrideIsSneakingInferiors[];
    private String afterIsSneakingSuperiors[];
    private String afterIsSneakingInferiors[];
    private String beforeIsSprintingSuperiors[];
    private String beforeIsSprintingInferiors[];
    private String overrideIsSprintingSuperiors[];
    private String overrideIsSprintingInferiors[];
    private String afterIsSprintingSuperiors[];
    private String afterIsSprintingInferiors[];
    private String beforeJumpSuperiors[];
    private String beforeJumpInferiors[];
    private String overrideJumpSuperiors[];
    private String overrideJumpInferiors[];
    private String afterJumpSuperiors[];
    private String afterJumpInferiors[];
    private String beforeKnockBackSuperiors[];
    private String beforeKnockBackInferiors[];
    private String overrideKnockBackSuperiors[];
    private String overrideKnockBackInferiors[];
    private String afterKnockBackSuperiors[];
    private String afterKnockBackInferiors[];
    private String beforeMoveEntitySuperiors[];
    private String beforeMoveEntityInferiors[];
    private String overrideMoveEntitySuperiors[];
    private String overrideMoveEntityInferiors[];
    private String afterMoveEntitySuperiors[];
    private String afterMoveEntityInferiors[];
    private String beforeMoveEntityWithHeadingSuperiors[];
    private String beforeMoveEntityWithHeadingInferiors[];
    private String overrideMoveEntityWithHeadingSuperiors[];
    private String overrideMoveEntityWithHeadingInferiors[];
    private String afterMoveEntityWithHeadingSuperiors[];
    private String afterMoveEntityWithHeadingInferiors[];
    private String beforeMoveFlyingSuperiors[];
    private String beforeMoveFlyingInferiors[];
    private String overrideMoveFlyingSuperiors[];
    private String overrideMoveFlyingInferiors[];
    private String afterMoveFlyingSuperiors[];
    private String afterMoveFlyingInferiors[];
    private String beforeOnDeathSuperiors[];
    private String beforeOnDeathInferiors[];
    private String overrideOnDeathSuperiors[];
    private String overrideOnDeathInferiors[];
    private String afterOnDeathSuperiors[];
    private String afterOnDeathInferiors[];
    private String beforeOnLivingUpdateSuperiors[];
    private String beforeOnLivingUpdateInferiors[];
    private String overrideOnLivingUpdateSuperiors[];
    private String overrideOnLivingUpdateInferiors[];
    private String afterOnLivingUpdateSuperiors[];
    private String afterOnLivingUpdateInferiors[];
    private String beforeOnKillEntitySuperiors[];
    private String beforeOnKillEntityInferiors[];
    private String overrideOnKillEntitySuperiors[];
    private String overrideOnKillEntityInferiors[];
    private String afterOnKillEntitySuperiors[];
    private String afterOnKillEntityInferiors[];
    private String beforeOnUpdateSuperiors[];
    private String beforeOnUpdateInferiors[];
    private String overrideOnUpdateSuperiors[];
    private String overrideOnUpdateInferiors[];
    private String afterOnUpdateSuperiors[];
    private String afterOnUpdateInferiors[];
    private String beforePushOutOfBlocksSuperiors[];
    private String beforePushOutOfBlocksInferiors[];
    private String overridePushOutOfBlocksSuperiors[];
    private String overridePushOutOfBlocksInferiors[];
    private String afterPushOutOfBlocksSuperiors[];
    private String afterPushOutOfBlocksInferiors[];
    private String beforeRayTraceSuperiors[];
    private String beforeRayTraceInferiors[];
    private String overrideRayTraceSuperiors[];
    private String overrideRayTraceInferiors[];
    private String afterRayTraceSuperiors[];
    private String afterRayTraceInferiors[];
    private String beforeReadEntityFromNBTSuperiors[];
    private String beforeReadEntityFromNBTInferiors[];
    private String overrideReadEntityFromNBTSuperiors[];
    private String overrideReadEntityFromNBTInferiors[];
    private String afterReadEntityFromNBTSuperiors[];
    private String afterReadEntityFromNBTInferiors[];
    private String beforeRespawnPlayerSuperiors[];
    private String beforeRespawnPlayerInferiors[];
    private String overrideRespawnPlayerSuperiors[];
    private String overrideRespawnPlayerInferiors[];
    private String afterRespawnPlayerSuperiors[];
    private String afterRespawnPlayerInferiors[];
    private String beforeSendChatMessageSuperiors[];
    private String beforeSendChatMessageInferiors[];
    private String overrideSendChatMessageSuperiors[];
    private String overrideSendChatMessageInferiors[];
    private String afterSendChatMessageSuperiors[];
    private String afterSendChatMessageInferiors[];
    private String beforeSetDeadSuperiors[];
    private String beforeSetDeadInferiors[];
    private String overrideSetDeadSuperiors[];
    private String overrideSetDeadInferiors[];
    private String afterSetDeadSuperiors[];
    private String afterSetDeadInferiors[];
    private String beforeSetPositionAndRotationSuperiors[];
    private String beforeSetPositionAndRotationInferiors[];
    private String overrideSetPositionAndRotationSuperiors[];
    private String overrideSetPositionAndRotationInferiors[];
    private String afterSetPositionAndRotationSuperiors[];
    private String afterSetPositionAndRotationInferiors[];
    private String beforeSleepInBedAtSuperiors[];
    private String beforeSleepInBedAtInferiors[];
    private String overrideSleepInBedAtSuperiors[];
    private String overrideSleepInBedAtInferiors[];
    private String afterSleepInBedAtSuperiors[];
    private String afterSleepInBedAtInferiors[];
    private String beforeSwingItemSuperiors[];
    private String beforeSwingItemInferiors[];
    private String overrideSwingItemSuperiors[];
    private String overrideSwingItemInferiors[];
    private String afterSwingItemSuperiors[];
    private String afterSwingItemInferiors[];
    private String beforeUpdateEntityActionStateSuperiors[];
    private String beforeUpdateEntityActionStateInferiors[];
    private String overrideUpdateEntityActionStateSuperiors[];
    private String overrideUpdateEntityActionStateInferiors[];
    private String afterUpdateEntityActionStateSuperiors[];
    private String afterUpdateEntityActionStateInferiors[];
    private String beforeWriteEntityToNBTSuperiors[];
    private String beforeWriteEntityToNBTInferiors[];
    private String overrideWriteEntityToNBTSuperiors[];
    private String overrideWriteEntityToNBTInferiors[];
    private String afterWriteEntityToNBTSuperiors[];
    private String afterWriteEntityToNBTInferiors[];

    public PlayerBaseSorting()
    {
        beforeLocalConstructingSuperiors = null;
        beforeLocalConstructingInferiors = null;
        afterLocalConstructingSuperiors = null;
        afterLocalConstructingInferiors = null;
        beforeAddExhaustionSuperiors = null;
        beforeAddExhaustionInferiors = null;
        overrideAddExhaustionSuperiors = null;
        overrideAddExhaustionInferiors = null;
        afterAddExhaustionSuperiors = null;
        afterAddExhaustionInferiors = null;
        beforeAttackEntityFromSuperiors = null;
        beforeAttackEntityFromInferiors = null;
        overrideAttackEntityFromSuperiors = null;
        overrideAttackEntityFromInferiors = null;
        afterAttackEntityFromSuperiors = null;
        afterAttackEntityFromInferiors = null;
        beforeAttackTargetEntityWithCurrentItemSuperiors = null;
        beforeAttackTargetEntityWithCurrentItemInferiors = null;
        overrideAttackTargetEntityWithCurrentItemSuperiors = null;
        overrideAttackTargetEntityWithCurrentItemInferiors = null;
        afterAttackTargetEntityWithCurrentItemSuperiors = null;
        afterAttackTargetEntityWithCurrentItemInferiors = null;
        beforeCanBreatheUnderwaterSuperiors = null;
        beforeCanBreatheUnderwaterInferiors = null;
        overrideCanBreatheUnderwaterSuperiors = null;
        overrideCanBreatheUnderwaterInferiors = null;
        afterCanBreatheUnderwaterSuperiors = null;
        afterCanBreatheUnderwaterInferiors = null;
        beforeCanHarvestBlockSuperiors = null;
        beforeCanHarvestBlockInferiors = null;
        overrideCanHarvestBlockSuperiors = null;
        overrideCanHarvestBlockInferiors = null;
        afterCanHarvestBlockSuperiors = null;
        afterCanHarvestBlockInferiors = null;
        beforeCanPlayerEditSuperiors = null;
        beforeCanPlayerEditInferiors = null;
        overrideCanPlayerEditSuperiors = null;
        overrideCanPlayerEditInferiors = null;
        afterCanPlayerEditSuperiors = null;
        afterCanPlayerEditInferiors = null;
        beforeCanTriggerWalkingSuperiors = null;
        beforeCanTriggerWalkingInferiors = null;
        overrideCanTriggerWalkingSuperiors = null;
        overrideCanTriggerWalkingInferiors = null;
        afterCanTriggerWalkingSuperiors = null;
        afterCanTriggerWalkingInferiors = null;
        beforeCloseScreenSuperiors = null;
        beforeCloseScreenInferiors = null;
        overrideCloseScreenSuperiors = null;
        overrideCloseScreenInferiors = null;
        afterCloseScreenSuperiors = null;
        afterCloseScreenInferiors = null;
        beforeDamageEntitySuperiors = null;
        beforeDamageEntityInferiors = null;
        overrideDamageEntitySuperiors = null;
        overrideDamageEntityInferiors = null;
        afterDamageEntitySuperiors = null;
        afterDamageEntityInferiors = null;
        beforeDisplayGUIBrewingStandSuperiors = null;
        beforeDisplayGUIBrewingStandInferiors = null;
        overrideDisplayGUIBrewingStandSuperiors = null;
        overrideDisplayGUIBrewingStandInferiors = null;
        afterDisplayGUIBrewingStandSuperiors = null;
        afterDisplayGUIBrewingStandInferiors = null;
        beforeDisplayGUIChestSuperiors = null;
        beforeDisplayGUIChestInferiors = null;
        overrideDisplayGUIChestSuperiors = null;
        overrideDisplayGUIChestInferiors = null;
        afterDisplayGUIChestSuperiors = null;
        afterDisplayGUIChestInferiors = null;
        beforeDisplayGUIDispenserSuperiors = null;
        beforeDisplayGUIDispenserInferiors = null;
        overrideDisplayGUIDispenserSuperiors = null;
        overrideDisplayGUIDispenserInferiors = null;
        afterDisplayGUIDispenserSuperiors = null;
        afterDisplayGUIDispenserInferiors = null;
        beforeDisplayGUIEditSignSuperiors = null;
        beforeDisplayGUIEditSignInferiors = null;
        overrideDisplayGUIEditSignSuperiors = null;
        overrideDisplayGUIEditSignInferiors = null;
        afterDisplayGUIEditSignSuperiors = null;
        afterDisplayGUIEditSignInferiors = null;
        beforeDisplayGUIEnchantmentSuperiors = null;
        beforeDisplayGUIEnchantmentInferiors = null;
        overrideDisplayGUIEnchantmentSuperiors = null;
        overrideDisplayGUIEnchantmentInferiors = null;
        afterDisplayGUIEnchantmentSuperiors = null;
        afterDisplayGUIEnchantmentInferiors = null;
        beforeDisplayGUIFurnaceSuperiors = null;
        beforeDisplayGUIFurnaceInferiors = null;
        overrideDisplayGUIFurnaceSuperiors = null;
        overrideDisplayGUIFurnaceInferiors = null;
        afterDisplayGUIFurnaceSuperiors = null;
        afterDisplayGUIFurnaceInferiors = null;
        beforeDisplayWorkbenchGUISuperiors = null;
        beforeDisplayWorkbenchGUIInferiors = null;
        overrideDisplayWorkbenchGUISuperiors = null;
        overrideDisplayWorkbenchGUIInferiors = null;
        afterDisplayWorkbenchGUISuperiors = null;
        afterDisplayWorkbenchGUIInferiors = null;
        beforeDropOneItemSuperiors = null;
        beforeDropOneItemInferiors = null;
        overrideDropOneItemSuperiors = null;
        overrideDropOneItemInferiors = null;
        afterDropOneItemSuperiors = null;
        afterDropOneItemInferiors = null;
        beforeDropPlayerItemSuperiors = null;
        beforeDropPlayerItemInferiors = null;
        overrideDropPlayerItemSuperiors = null;
        overrideDropPlayerItemInferiors = null;
        afterDropPlayerItemSuperiors = null;
        afterDropPlayerItemInferiors = null;
        beforeDropPlayerItemWithRandomChoiceSuperiors = null;
        beforeDropPlayerItemWithRandomChoiceInferiors = null;
        overrideDropPlayerItemWithRandomChoiceSuperiors = null;
        overrideDropPlayerItemWithRandomChoiceInferiors = null;
        afterDropPlayerItemWithRandomChoiceSuperiors = null;
        afterDropPlayerItemWithRandomChoiceInferiors = null;
        beforeFallSuperiors = null;
        beforeFallInferiors = null;
        overrideFallSuperiors = null;
        overrideFallInferiors = null;
        afterFallSuperiors = null;
        afterFallInferiors = null;
        beforeGetBrightnessSuperiors = null;
        beforeGetBrightnessInferiors = null;
        overrideGetBrightnessSuperiors = null;
        overrideGetBrightnessInferiors = null;
        afterGetBrightnessSuperiors = null;
        afterGetBrightnessInferiors = null;
        beforeGetBrightnessForRenderSuperiors = null;
        beforeGetBrightnessForRenderInferiors = null;
        overrideGetBrightnessForRenderSuperiors = null;
        overrideGetBrightnessForRenderInferiors = null;
        afterGetBrightnessForRenderSuperiors = null;
        afterGetBrightnessForRenderInferiors = null;
        beforeGetCurrentPlayerStrVsBlockSuperiors = null;
        beforeGetCurrentPlayerStrVsBlockInferiors = null;
        overrideGetCurrentPlayerStrVsBlockSuperiors = null;
        overrideGetCurrentPlayerStrVsBlockInferiors = null;
        afterGetCurrentPlayerStrVsBlockSuperiors = null;
        afterGetCurrentPlayerStrVsBlockInferiors = null;
        beforeGetDistanceSqSuperiors = null;
        beforeGetDistanceSqInferiors = null;
        overrideGetDistanceSqSuperiors = null;
        overrideGetDistanceSqInferiors = null;
        afterGetDistanceSqSuperiors = null;
        afterGetDistanceSqInferiors = null;
        beforeGetDistanceSqToEntitySuperiors = null;
        beforeGetDistanceSqToEntityInferiors = null;
        overrideGetDistanceSqToEntitySuperiors = null;
        overrideGetDistanceSqToEntityInferiors = null;
        afterGetDistanceSqToEntitySuperiors = null;
        afterGetDistanceSqToEntityInferiors = null;
        beforeGetFOVMultiplierSuperiors = null;
        beforeGetFOVMultiplierInferiors = null;
        overrideGetFOVMultiplierSuperiors = null;
        overrideGetFOVMultiplierInferiors = null;
        afterGetFOVMultiplierSuperiors = null;
        afterGetFOVMultiplierInferiors = null;
        beforeGetHurtSoundSuperiors = null;
        beforeGetHurtSoundInferiors = null;
        overrideGetHurtSoundSuperiors = null;
        overrideGetHurtSoundInferiors = null;
        afterGetHurtSoundSuperiors = null;
        afterGetHurtSoundInferiors = null;
        beforeGetItemIconSuperiors = null;
        beforeGetItemIconInferiors = null;
        overrideGetItemIconSuperiors = null;
        overrideGetItemIconInferiors = null;
        afterGetItemIconSuperiors = null;
        afterGetItemIconInferiors = null;
        beforeGetSleepTimerSuperiors = null;
        beforeGetSleepTimerInferiors = null;
        overrideGetSleepTimerSuperiors = null;
        overrideGetSleepTimerInferiors = null;
        afterGetSleepTimerSuperiors = null;
        afterGetSleepTimerInferiors = null;
        beforeGetSpeedModifierSuperiors = null;
        beforeGetSpeedModifierInferiors = null;
        overrideGetSpeedModifierSuperiors = null;
        overrideGetSpeedModifierInferiors = null;
        afterGetSpeedModifierSuperiors = null;
        afterGetSpeedModifierInferiors = null;
        beforeHandleLavaMovementSuperiors = null;
        beforeHandleLavaMovementInferiors = null;
        overrideHandleLavaMovementSuperiors = null;
        overrideHandleLavaMovementInferiors = null;
        afterHandleLavaMovementSuperiors = null;
        afterHandleLavaMovementInferiors = null;
        beforeHandleWaterMovementSuperiors = null;
        beforeHandleWaterMovementInferiors = null;
        overrideHandleWaterMovementSuperiors = null;
        overrideHandleWaterMovementInferiors = null;
        afterHandleWaterMovementSuperiors = null;
        afterHandleWaterMovementInferiors = null;
        beforeHealSuperiors = null;
        beforeHealInferiors = null;
        overrideHealSuperiors = null;
        overrideHealInferiors = null;
        afterHealSuperiors = null;
        afterHealInferiors = null;
        beforeIsEntityInsideOpaqueBlockSuperiors = null;
        beforeIsEntityInsideOpaqueBlockInferiors = null;
        overrideIsEntityInsideOpaqueBlockSuperiors = null;
        overrideIsEntityInsideOpaqueBlockInferiors = null;
        afterIsEntityInsideOpaqueBlockSuperiors = null;
        afterIsEntityInsideOpaqueBlockInferiors = null;
        beforeIsInWaterSuperiors = null;
        beforeIsInWaterInferiors = null;
        overrideIsInWaterSuperiors = null;
        overrideIsInWaterInferiors = null;
        afterIsInWaterSuperiors = null;
        afterIsInWaterInferiors = null;
        beforeIsInsideOfMaterialSuperiors = null;
        beforeIsInsideOfMaterialInferiors = null;
        overrideIsInsideOfMaterialSuperiors = null;
        overrideIsInsideOfMaterialInferiors = null;
        afterIsInsideOfMaterialSuperiors = null;
        afterIsInsideOfMaterialInferiors = null;
        beforeIsOnLadderSuperiors = null;
        beforeIsOnLadderInferiors = null;
        overrideIsOnLadderSuperiors = null;
        overrideIsOnLadderInferiors = null;
        afterIsOnLadderSuperiors = null;
        afterIsOnLadderInferiors = null;
        beforeIsSneakingSuperiors = null;
        beforeIsSneakingInferiors = null;
        overrideIsSneakingSuperiors = null;
        overrideIsSneakingInferiors = null;
        afterIsSneakingSuperiors = null;
        afterIsSneakingInferiors = null;
        beforeIsSprintingSuperiors = null;
        beforeIsSprintingInferiors = null;
        overrideIsSprintingSuperiors = null;
        overrideIsSprintingInferiors = null;
        afterIsSprintingSuperiors = null;
        afterIsSprintingInferiors = null;
        beforeJumpSuperiors = null;
        beforeJumpInferiors = null;
        overrideJumpSuperiors = null;
        overrideJumpInferiors = null;
        afterJumpSuperiors = null;
        afterJumpInferiors = null;
        beforeKnockBackSuperiors = null;
        beforeKnockBackInferiors = null;
        overrideKnockBackSuperiors = null;
        overrideKnockBackInferiors = null;
        afterKnockBackSuperiors = null;
        afterKnockBackInferiors = null;
        beforeMoveEntitySuperiors = null;
        beforeMoveEntityInferiors = null;
        overrideMoveEntitySuperiors = null;
        overrideMoveEntityInferiors = null;
        afterMoveEntitySuperiors = null;
        afterMoveEntityInferiors = null;
        beforeMoveEntityWithHeadingSuperiors = null;
        beforeMoveEntityWithHeadingInferiors = null;
        overrideMoveEntityWithHeadingSuperiors = null;
        overrideMoveEntityWithHeadingInferiors = null;
        afterMoveEntityWithHeadingSuperiors = null;
        afterMoveEntityWithHeadingInferiors = null;
        beforeMoveFlyingSuperiors = null;
        beforeMoveFlyingInferiors = null;
        overrideMoveFlyingSuperiors = null;
        overrideMoveFlyingInferiors = null;
        afterMoveFlyingSuperiors = null;
        afterMoveFlyingInferiors = null;
        beforeOnDeathSuperiors = null;
        beforeOnDeathInferiors = null;
        overrideOnDeathSuperiors = null;
        overrideOnDeathInferiors = null;
        afterOnDeathSuperiors = null;
        afterOnDeathInferiors = null;
        beforeOnLivingUpdateSuperiors = null;
        beforeOnLivingUpdateInferiors = null;
        overrideOnLivingUpdateSuperiors = null;
        overrideOnLivingUpdateInferiors = null;
        afterOnLivingUpdateSuperiors = null;
        afterOnLivingUpdateInferiors = null;
        beforeOnKillEntitySuperiors = null;
        beforeOnKillEntityInferiors = null;
        overrideOnKillEntitySuperiors = null;
        overrideOnKillEntityInferiors = null;
        afterOnKillEntitySuperiors = null;
        afterOnKillEntityInferiors = null;
        beforeOnUpdateSuperiors = null;
        beforeOnUpdateInferiors = null;
        overrideOnUpdateSuperiors = null;
        overrideOnUpdateInferiors = null;
        afterOnUpdateSuperiors = null;
        afterOnUpdateInferiors = null;
        beforePushOutOfBlocksSuperiors = null;
        beforePushOutOfBlocksInferiors = null;
        overridePushOutOfBlocksSuperiors = null;
        overridePushOutOfBlocksInferiors = null;
        afterPushOutOfBlocksSuperiors = null;
        afterPushOutOfBlocksInferiors = null;
        beforeRayTraceSuperiors = null;
        beforeRayTraceInferiors = null;
        overrideRayTraceSuperiors = null;
        overrideRayTraceInferiors = null;
        afterRayTraceSuperiors = null;
        afterRayTraceInferiors = null;
        beforeReadEntityFromNBTSuperiors = null;
        beforeReadEntityFromNBTInferiors = null;
        overrideReadEntityFromNBTSuperiors = null;
        overrideReadEntityFromNBTInferiors = null;
        afterReadEntityFromNBTSuperiors = null;
        afterReadEntityFromNBTInferiors = null;
        beforeRespawnPlayerSuperiors = null;
        beforeRespawnPlayerInferiors = null;
        overrideRespawnPlayerSuperiors = null;
        overrideRespawnPlayerInferiors = null;
        afterRespawnPlayerSuperiors = null;
        afterRespawnPlayerInferiors = null;
        beforeSendChatMessageSuperiors = null;
        beforeSendChatMessageInferiors = null;
        overrideSendChatMessageSuperiors = null;
        overrideSendChatMessageInferiors = null;
        afterSendChatMessageSuperiors = null;
        afterSendChatMessageInferiors = null;
        beforeSetDeadSuperiors = null;
        beforeSetDeadInferiors = null;
        overrideSetDeadSuperiors = null;
        overrideSetDeadInferiors = null;
        afterSetDeadSuperiors = null;
        afterSetDeadInferiors = null;
        beforeSetPositionAndRotationSuperiors = null;
        beforeSetPositionAndRotationInferiors = null;
        overrideSetPositionAndRotationSuperiors = null;
        overrideSetPositionAndRotationInferiors = null;
        afterSetPositionAndRotationSuperiors = null;
        afterSetPositionAndRotationInferiors = null;
        beforeSleepInBedAtSuperiors = null;
        beforeSleepInBedAtInferiors = null;
        overrideSleepInBedAtSuperiors = null;
        overrideSleepInBedAtInferiors = null;
        afterSleepInBedAtSuperiors = null;
        afterSleepInBedAtInferiors = null;
        beforeSwingItemSuperiors = null;
        beforeSwingItemInferiors = null;
        overrideSwingItemSuperiors = null;
        overrideSwingItemInferiors = null;
        afterSwingItemSuperiors = null;
        afterSwingItemInferiors = null;
        beforeUpdateEntityActionStateSuperiors = null;
        beforeUpdateEntityActionStateInferiors = null;
        overrideUpdateEntityActionStateSuperiors = null;
        overrideUpdateEntityActionStateInferiors = null;
        afterUpdateEntityActionStateSuperiors = null;
        afterUpdateEntityActionStateInferiors = null;
        beforeWriteEntityToNBTSuperiors = null;
        beforeWriteEntityToNBTInferiors = null;
        overrideWriteEntityToNBTSuperiors = null;
        overrideWriteEntityToNBTInferiors = null;
        afterWriteEntityToNBTSuperiors = null;
        afterWriteEntityToNBTInferiors = null;
    }

    public String[] getBeforeLocalConstructingSuperiors()
    {
        return beforeLocalConstructingSuperiors;
    }

    public String[] getBeforeLocalConstructingInferiors()
    {
        return beforeLocalConstructingInferiors;
    }

    public String[] getAfterLocalConstructingSuperiors()
    {
        return afterLocalConstructingSuperiors;
    }

    public String[] getAfterLocalConstructingInferiors()
    {
        return afterLocalConstructingInferiors;
    }

    public void setBeforeLocalConstructingSuperiors(String as[])
    {
        beforeLocalConstructingSuperiors = as;
    }

    public void setBeforeLocalConstructingInferiors(String as[])
    {
        beforeLocalConstructingInferiors = as;
    }

    public void setAfterLocalConstructingSuperiors(String as[])
    {
        afterLocalConstructingSuperiors = as;
    }

    public void setAfterLocalConstructingInferiors(String as[])
    {
        afterLocalConstructingInferiors = as;
    }

    public String[] getBeforeAddExhaustionSuperiors()
    {
        return beforeAddExhaustionSuperiors;
    }

    public String[] getBeforeAddExhaustionInferiors()
    {
        return beforeAddExhaustionInferiors;
    }

    public String[] getOverrideAddExhaustionSuperiors()
    {
        return overrideAddExhaustionSuperiors;
    }

    public String[] getOverrideAddExhaustionInferiors()
    {
        return overrideAddExhaustionInferiors;
    }

    public String[] getAfterAddExhaustionSuperiors()
    {
        return afterAddExhaustionSuperiors;
    }

    public String[] getAfterAddExhaustionInferiors()
    {
        return afterAddExhaustionInferiors;
    }

    public void setBeforeAddExhaustionSuperiors(String as[])
    {
        beforeAddExhaustionSuperiors = as;
    }

    public void setBeforeAddExhaustionInferiors(String as[])
    {
        beforeAddExhaustionInferiors = as;
    }

    public void setOverrideAddExhaustionSuperiors(String as[])
    {
        overrideAddExhaustionSuperiors = as;
    }

    public void setOverrideAddExhaustionInferiors(String as[])
    {
        overrideAddExhaustionInferiors = as;
    }

    public void setAfterAddExhaustionSuperiors(String as[])
    {
        afterAddExhaustionSuperiors = as;
    }

    public void setAfterAddExhaustionInferiors(String as[])
    {
        afterAddExhaustionInferiors = as;
    }

    public String[] getBeforeAttackEntityFromSuperiors()
    {
        return beforeAttackEntityFromSuperiors;
    }

    public String[] getBeforeAttackEntityFromInferiors()
    {
        return beforeAttackEntityFromInferiors;
    }

    public String[] getOverrideAttackEntityFromSuperiors()
    {
        return overrideAttackEntityFromSuperiors;
    }

    public String[] getOverrideAttackEntityFromInferiors()
    {
        return overrideAttackEntityFromInferiors;
    }

    public String[] getAfterAttackEntityFromSuperiors()
    {
        return afterAttackEntityFromSuperiors;
    }

    public String[] getAfterAttackEntityFromInferiors()
    {
        return afterAttackEntityFromInferiors;
    }

    public void setBeforeAttackEntityFromSuperiors(String as[])
    {
        beforeAttackEntityFromSuperiors = as;
    }

    public void setBeforeAttackEntityFromInferiors(String as[])
    {
        beforeAttackEntityFromInferiors = as;
    }

    public void setOverrideAttackEntityFromSuperiors(String as[])
    {
        overrideAttackEntityFromSuperiors = as;
    }

    public void setOverrideAttackEntityFromInferiors(String as[])
    {
        overrideAttackEntityFromInferiors = as;
    }

    public void setAfterAttackEntityFromSuperiors(String as[])
    {
        afterAttackEntityFromSuperiors = as;
    }

    public void setAfterAttackEntityFromInferiors(String as[])
    {
        afterAttackEntityFromInferiors = as;
    }

    public String[] getBeforeAttackTargetEntityWithCurrentItemSuperiors()
    {
        return beforeAttackTargetEntityWithCurrentItemSuperiors;
    }

    public String[] getBeforeAttackTargetEntityWithCurrentItemInferiors()
    {
        return beforeAttackTargetEntityWithCurrentItemInferiors;
    }

    public String[] getOverrideAttackTargetEntityWithCurrentItemSuperiors()
    {
        return overrideAttackTargetEntityWithCurrentItemSuperiors;
    }

    public String[] getOverrideAttackTargetEntityWithCurrentItemInferiors()
    {
        return overrideAttackTargetEntityWithCurrentItemInferiors;
    }

    public String[] getAfterAttackTargetEntityWithCurrentItemSuperiors()
    {
        return afterAttackTargetEntityWithCurrentItemSuperiors;
    }

    public String[] getAfterAttackTargetEntityWithCurrentItemInferiors()
    {
        return afterAttackTargetEntityWithCurrentItemInferiors;
    }

    public void setBeforeAttackTargetEntityWithCurrentItemSuperiors(String as[])
    {
        beforeAttackTargetEntityWithCurrentItemSuperiors = as;
    }

    public void setBeforeAttackTargetEntityWithCurrentItemInferiors(String as[])
    {
        beforeAttackTargetEntityWithCurrentItemInferiors = as;
    }

    public void setOverrideAttackTargetEntityWithCurrentItemSuperiors(String as[])
    {
        overrideAttackTargetEntityWithCurrentItemSuperiors = as;
    }

    public void setOverrideAttackTargetEntityWithCurrentItemInferiors(String as[])
    {
        overrideAttackTargetEntityWithCurrentItemInferiors = as;
    }

    public void setAfterAttackTargetEntityWithCurrentItemSuperiors(String as[])
    {
        afterAttackTargetEntityWithCurrentItemSuperiors = as;
    }

    public void setAfterAttackTargetEntityWithCurrentItemInferiors(String as[])
    {
        afterAttackTargetEntityWithCurrentItemInferiors = as;
    }

    public String[] getBeforeCanBreatheUnderwaterSuperiors()
    {
        return beforeCanBreatheUnderwaterSuperiors;
    }

    public String[] getBeforeCanBreatheUnderwaterInferiors()
    {
        return beforeCanBreatheUnderwaterInferiors;
    }

    public String[] getOverrideCanBreatheUnderwaterSuperiors()
    {
        return overrideCanBreatheUnderwaterSuperiors;
    }

    public String[] getOverrideCanBreatheUnderwaterInferiors()
    {
        return overrideCanBreatheUnderwaterInferiors;
    }

    public String[] getAfterCanBreatheUnderwaterSuperiors()
    {
        return afterCanBreatheUnderwaterSuperiors;
    }

    public String[] getAfterCanBreatheUnderwaterInferiors()
    {
        return afterCanBreatheUnderwaterInferiors;
    }

    public void setBeforeCanBreatheUnderwaterSuperiors(String as[])
    {
        beforeCanBreatheUnderwaterSuperiors = as;
    }

    public void setBeforeCanBreatheUnderwaterInferiors(String as[])
    {
        beforeCanBreatheUnderwaterInferiors = as;
    }

    public void setOverrideCanBreatheUnderwaterSuperiors(String as[])
    {
        overrideCanBreatheUnderwaterSuperiors = as;
    }

    public void setOverrideCanBreatheUnderwaterInferiors(String as[])
    {
        overrideCanBreatheUnderwaterInferiors = as;
    }

    public void setAfterCanBreatheUnderwaterSuperiors(String as[])
    {
        afterCanBreatheUnderwaterSuperiors = as;
    }

    public void setAfterCanBreatheUnderwaterInferiors(String as[])
    {
        afterCanBreatheUnderwaterInferiors = as;
    }

    public String[] getBeforeCanHarvestBlockSuperiors()
    {
        return beforeCanHarvestBlockSuperiors;
    }

    public String[] getBeforeCanHarvestBlockInferiors()
    {
        return beforeCanHarvestBlockInferiors;
    }

    public String[] getOverrideCanHarvestBlockSuperiors()
    {
        return overrideCanHarvestBlockSuperiors;
    }

    public String[] getOverrideCanHarvestBlockInferiors()
    {
        return overrideCanHarvestBlockInferiors;
    }

    public String[] getAfterCanHarvestBlockSuperiors()
    {
        return afterCanHarvestBlockSuperiors;
    }

    public String[] getAfterCanHarvestBlockInferiors()
    {
        return afterCanHarvestBlockInferiors;
    }

    public void setBeforeCanHarvestBlockSuperiors(String as[])
    {
        beforeCanHarvestBlockSuperiors = as;
    }

    public void setBeforeCanHarvestBlockInferiors(String as[])
    {
        beforeCanHarvestBlockInferiors = as;
    }

    public void setOverrideCanHarvestBlockSuperiors(String as[])
    {
        overrideCanHarvestBlockSuperiors = as;
    }

    public void setOverrideCanHarvestBlockInferiors(String as[])
    {
        overrideCanHarvestBlockInferiors = as;
    }

    public void setAfterCanHarvestBlockSuperiors(String as[])
    {
        afterCanHarvestBlockSuperiors = as;
    }

    public void setAfterCanHarvestBlockInferiors(String as[])
    {
        afterCanHarvestBlockInferiors = as;
    }

    public String[] getBeforeCanPlayerEditSuperiors()
    {
        return beforeCanPlayerEditSuperiors;
    }

    public String[] getBeforeCanPlayerEditInferiors()
    {
        return beforeCanPlayerEditInferiors;
    }

    public String[] getOverrideCanPlayerEditSuperiors()
    {
        return overrideCanPlayerEditSuperiors;
    }

    public String[] getOverrideCanPlayerEditInferiors()
    {
        return overrideCanPlayerEditInferiors;
    }

    public String[] getAfterCanPlayerEditSuperiors()
    {
        return afterCanPlayerEditSuperiors;
    }

    public String[] getAfterCanPlayerEditInferiors()
    {
        return afterCanPlayerEditInferiors;
    }

    public void setBeforeCanPlayerEditSuperiors(String as[])
    {
        beforeCanPlayerEditSuperiors = as;
    }

    public void setBeforeCanPlayerEditInferiors(String as[])
    {
        beforeCanPlayerEditInferiors = as;
    }

    public void setOverrideCanPlayerEditSuperiors(String as[])
    {
        overrideCanPlayerEditSuperiors = as;
    }

    public void setOverrideCanPlayerEditInferiors(String as[])
    {
        overrideCanPlayerEditInferiors = as;
    }

    public void setAfterCanPlayerEditSuperiors(String as[])
    {
        afterCanPlayerEditSuperiors = as;
    }

    public void setAfterCanPlayerEditInferiors(String as[])
    {
        afterCanPlayerEditInferiors = as;
    }

    public String[] getBeforeCanTriggerWalkingSuperiors()
    {
        return beforeCanTriggerWalkingSuperiors;
    }

    public String[] getBeforeCanTriggerWalkingInferiors()
    {
        return beforeCanTriggerWalkingInferiors;
    }

    public String[] getOverrideCanTriggerWalkingSuperiors()
    {
        return overrideCanTriggerWalkingSuperiors;
    }

    public String[] getOverrideCanTriggerWalkingInferiors()
    {
        return overrideCanTriggerWalkingInferiors;
    }

    public String[] getAfterCanTriggerWalkingSuperiors()
    {
        return afterCanTriggerWalkingSuperiors;
    }

    public String[] getAfterCanTriggerWalkingInferiors()
    {
        return afterCanTriggerWalkingInferiors;
    }

    public void setBeforeCanTriggerWalkingSuperiors(String as[])
    {
        beforeCanTriggerWalkingSuperiors = as;
    }

    public void setBeforeCanTriggerWalkingInferiors(String as[])
    {
        beforeCanTriggerWalkingInferiors = as;
    }

    public void setOverrideCanTriggerWalkingSuperiors(String as[])
    {
        overrideCanTriggerWalkingSuperiors = as;
    }

    public void setOverrideCanTriggerWalkingInferiors(String as[])
    {
        overrideCanTriggerWalkingInferiors = as;
    }

    public void setAfterCanTriggerWalkingSuperiors(String as[])
    {
        afterCanTriggerWalkingSuperiors = as;
    }

    public void setAfterCanTriggerWalkingInferiors(String as[])
    {
        afterCanTriggerWalkingInferiors = as;
    }

    public String[] getBeforeCloseScreenSuperiors()
    {
        return beforeCloseScreenSuperiors;
    }

    public String[] getBeforeCloseScreenInferiors()
    {
        return beforeCloseScreenInferiors;
    }

    public String[] getOverrideCloseScreenSuperiors()
    {
        return overrideCloseScreenSuperiors;
    }

    public String[] getOverrideCloseScreenInferiors()
    {
        return overrideCloseScreenInferiors;
    }

    public String[] getAfterCloseScreenSuperiors()
    {
        return afterCloseScreenSuperiors;
    }

    public String[] getAfterCloseScreenInferiors()
    {
        return afterCloseScreenInferiors;
    }

    public void setBeforeCloseScreenSuperiors(String as[])
    {
        beforeCloseScreenSuperiors = as;
    }

    public void setBeforeCloseScreenInferiors(String as[])
    {
        beforeCloseScreenInferiors = as;
    }

    public void setOverrideCloseScreenSuperiors(String as[])
    {
        overrideCloseScreenSuperiors = as;
    }

    public void setOverrideCloseScreenInferiors(String as[])
    {
        overrideCloseScreenInferiors = as;
    }

    public void setAfterCloseScreenSuperiors(String as[])
    {
        afterCloseScreenSuperiors = as;
    }

    public void setAfterCloseScreenInferiors(String as[])
    {
        afterCloseScreenInferiors = as;
    }

    public String[] getBeforeDamageEntitySuperiors()
    {
        return beforeDamageEntitySuperiors;
    }

    public String[] getBeforeDamageEntityInferiors()
    {
        return beforeDamageEntityInferiors;
    }

    public String[] getOverrideDamageEntitySuperiors()
    {
        return overrideDamageEntitySuperiors;
    }

    public String[] getOverrideDamageEntityInferiors()
    {
        return overrideDamageEntityInferiors;
    }

    public String[] getAfterDamageEntitySuperiors()
    {
        return afterDamageEntitySuperiors;
    }

    public String[] getAfterDamageEntityInferiors()
    {
        return afterDamageEntityInferiors;
    }

    public void setBeforeDamageEntitySuperiors(String as[])
    {
        beforeDamageEntitySuperiors = as;
    }

    public void setBeforeDamageEntityInferiors(String as[])
    {
        beforeDamageEntityInferiors = as;
    }

    public void setOverrideDamageEntitySuperiors(String as[])
    {
        overrideDamageEntitySuperiors = as;
    }

    public void setOverrideDamageEntityInferiors(String as[])
    {
        overrideDamageEntityInferiors = as;
    }

    public void setAfterDamageEntitySuperiors(String as[])
    {
        afterDamageEntitySuperiors = as;
    }

    public void setAfterDamageEntityInferiors(String as[])
    {
        afterDamageEntityInferiors = as;
    }

    public String[] getBeforeDisplayGUIBrewingStandSuperiors()
    {
        return beforeDisplayGUIBrewingStandSuperiors;
    }

    public String[] getBeforeDisplayGUIBrewingStandInferiors()
    {
        return beforeDisplayGUIBrewingStandInferiors;
    }

    public String[] getOverrideDisplayGUIBrewingStandSuperiors()
    {
        return overrideDisplayGUIBrewingStandSuperiors;
    }

    public String[] getOverrideDisplayGUIBrewingStandInferiors()
    {
        return overrideDisplayGUIBrewingStandInferiors;
    }

    public String[] getAfterDisplayGUIBrewingStandSuperiors()
    {
        return afterDisplayGUIBrewingStandSuperiors;
    }

    public String[] getAfterDisplayGUIBrewingStandInferiors()
    {
        return afterDisplayGUIBrewingStandInferiors;
    }

    public void setBeforeDisplayGUIBrewingStandSuperiors(String as[])
    {
        beforeDisplayGUIBrewingStandSuperiors = as;
    }

    public void setBeforeDisplayGUIBrewingStandInferiors(String as[])
    {
        beforeDisplayGUIBrewingStandInferiors = as;
    }

    public void setOverrideDisplayGUIBrewingStandSuperiors(String as[])
    {
        overrideDisplayGUIBrewingStandSuperiors = as;
    }

    public void setOverrideDisplayGUIBrewingStandInferiors(String as[])
    {
        overrideDisplayGUIBrewingStandInferiors = as;
    }

    public void setAfterDisplayGUIBrewingStandSuperiors(String as[])
    {
        afterDisplayGUIBrewingStandSuperiors = as;
    }

    public void setAfterDisplayGUIBrewingStandInferiors(String as[])
    {
        afterDisplayGUIBrewingStandInferiors = as;
    }

    public String[] getBeforeDisplayGUIChestSuperiors()
    {
        return beforeDisplayGUIChestSuperiors;
    }

    public String[] getBeforeDisplayGUIChestInferiors()
    {
        return beforeDisplayGUIChestInferiors;
    }

    public String[] getOverrideDisplayGUIChestSuperiors()
    {
        return overrideDisplayGUIChestSuperiors;
    }

    public String[] getOverrideDisplayGUIChestInferiors()
    {
        return overrideDisplayGUIChestInferiors;
    }

    public String[] getAfterDisplayGUIChestSuperiors()
    {
        return afterDisplayGUIChestSuperiors;
    }

    public String[] getAfterDisplayGUIChestInferiors()
    {
        return afterDisplayGUIChestInferiors;
    }

    public void setBeforeDisplayGUIChestSuperiors(String as[])
    {
        beforeDisplayGUIChestSuperiors = as;
    }

    public void setBeforeDisplayGUIChestInferiors(String as[])
    {
        beforeDisplayGUIChestInferiors = as;
    }

    public void setOverrideDisplayGUIChestSuperiors(String as[])
    {
        overrideDisplayGUIChestSuperiors = as;
    }

    public void setOverrideDisplayGUIChestInferiors(String as[])
    {
        overrideDisplayGUIChestInferiors = as;
    }

    public void setAfterDisplayGUIChestSuperiors(String as[])
    {
        afterDisplayGUIChestSuperiors = as;
    }

    public void setAfterDisplayGUIChestInferiors(String as[])
    {
        afterDisplayGUIChestInferiors = as;
    }

    public String[] getBeforeDisplayGUIDispenserSuperiors()
    {
        return beforeDisplayGUIDispenserSuperiors;
    }

    public String[] getBeforeDisplayGUIDispenserInferiors()
    {
        return beforeDisplayGUIDispenserInferiors;
    }

    public String[] getOverrideDisplayGUIDispenserSuperiors()
    {
        return overrideDisplayGUIDispenserSuperiors;
    }

    public String[] getOverrideDisplayGUIDispenserInferiors()
    {
        return overrideDisplayGUIDispenserInferiors;
    }

    public String[] getAfterDisplayGUIDispenserSuperiors()
    {
        return afterDisplayGUIDispenserSuperiors;
    }

    public String[] getAfterDisplayGUIDispenserInferiors()
    {
        return afterDisplayGUIDispenserInferiors;
    }

    public void setBeforeDisplayGUIDispenserSuperiors(String as[])
    {
        beforeDisplayGUIDispenserSuperiors = as;
    }

    public void setBeforeDisplayGUIDispenserInferiors(String as[])
    {
        beforeDisplayGUIDispenserInferiors = as;
    }

    public void setOverrideDisplayGUIDispenserSuperiors(String as[])
    {
        overrideDisplayGUIDispenserSuperiors = as;
    }

    public void setOverrideDisplayGUIDispenserInferiors(String as[])
    {
        overrideDisplayGUIDispenserInferiors = as;
    }

    public void setAfterDisplayGUIDispenserSuperiors(String as[])
    {
        afterDisplayGUIDispenserSuperiors = as;
    }

    public void setAfterDisplayGUIDispenserInferiors(String as[])
    {
        afterDisplayGUIDispenserInferiors = as;
    }

    public String[] getBeforeDisplayGUIEditSignSuperiors()
    {
        return beforeDisplayGUIEditSignSuperiors;
    }

    public String[] getBeforeDisplayGUIEditSignInferiors()
    {
        return beforeDisplayGUIEditSignInferiors;
    }

    public String[] getOverrideDisplayGUIEditSignSuperiors()
    {
        return overrideDisplayGUIEditSignSuperiors;
    }

    public String[] getOverrideDisplayGUIEditSignInferiors()
    {
        return overrideDisplayGUIEditSignInferiors;
    }

    public String[] getAfterDisplayGUIEditSignSuperiors()
    {
        return afterDisplayGUIEditSignSuperiors;
    }

    public String[] getAfterDisplayGUIEditSignInferiors()
    {
        return afterDisplayGUIEditSignInferiors;
    }

    public void setBeforeDisplayGUIEditSignSuperiors(String as[])
    {
        beforeDisplayGUIEditSignSuperiors = as;
    }

    public void setBeforeDisplayGUIEditSignInferiors(String as[])
    {
        beforeDisplayGUIEditSignInferiors = as;
    }

    public void setOverrideDisplayGUIEditSignSuperiors(String as[])
    {
        overrideDisplayGUIEditSignSuperiors = as;
    }

    public void setOverrideDisplayGUIEditSignInferiors(String as[])
    {
        overrideDisplayGUIEditSignInferiors = as;
    }

    public void setAfterDisplayGUIEditSignSuperiors(String as[])
    {
        afterDisplayGUIEditSignSuperiors = as;
    }

    public void setAfterDisplayGUIEditSignInferiors(String as[])
    {
        afterDisplayGUIEditSignInferiors = as;
    }

    public String[] getBeforeDisplayGUIEnchantmentSuperiors()
    {
        return beforeDisplayGUIEnchantmentSuperiors;
    }

    public String[] getBeforeDisplayGUIEnchantmentInferiors()
    {
        return beforeDisplayGUIEnchantmentInferiors;
    }

    public String[] getOverrideDisplayGUIEnchantmentSuperiors()
    {
        return overrideDisplayGUIEnchantmentSuperiors;
    }

    public String[] getOverrideDisplayGUIEnchantmentInferiors()
    {
        return overrideDisplayGUIEnchantmentInferiors;
    }

    public String[] getAfterDisplayGUIEnchantmentSuperiors()
    {
        return afterDisplayGUIEnchantmentSuperiors;
    }

    public String[] getAfterDisplayGUIEnchantmentInferiors()
    {
        return afterDisplayGUIEnchantmentInferiors;
    }

    public void setBeforeDisplayGUIEnchantmentSuperiors(String as[])
    {
        beforeDisplayGUIEnchantmentSuperiors = as;
    }

    public void setBeforeDisplayGUIEnchantmentInferiors(String as[])
    {
        beforeDisplayGUIEnchantmentInferiors = as;
    }

    public void setOverrideDisplayGUIEnchantmentSuperiors(String as[])
    {
        overrideDisplayGUIEnchantmentSuperiors = as;
    }

    public void setOverrideDisplayGUIEnchantmentInferiors(String as[])
    {
        overrideDisplayGUIEnchantmentInferiors = as;
    }

    public void setAfterDisplayGUIEnchantmentSuperiors(String as[])
    {
        afterDisplayGUIEnchantmentSuperiors = as;
    }

    public void setAfterDisplayGUIEnchantmentInferiors(String as[])
    {
        afterDisplayGUIEnchantmentInferiors = as;
    }

    public String[] getBeforeDisplayGUIFurnaceSuperiors()
    {
        return beforeDisplayGUIFurnaceSuperiors;
    }

    public String[] getBeforeDisplayGUIFurnaceInferiors()
    {
        return beforeDisplayGUIFurnaceInferiors;
    }

    public String[] getOverrideDisplayGUIFurnaceSuperiors()
    {
        return overrideDisplayGUIFurnaceSuperiors;
    }

    public String[] getOverrideDisplayGUIFurnaceInferiors()
    {
        return overrideDisplayGUIFurnaceInferiors;
    }

    public String[] getAfterDisplayGUIFurnaceSuperiors()
    {
        return afterDisplayGUIFurnaceSuperiors;
    }

    public String[] getAfterDisplayGUIFurnaceInferiors()
    {
        return afterDisplayGUIFurnaceInferiors;
    }

    public void setBeforeDisplayGUIFurnaceSuperiors(String as[])
    {
        beforeDisplayGUIFurnaceSuperiors = as;
    }

    public void setBeforeDisplayGUIFurnaceInferiors(String as[])
    {
        beforeDisplayGUIFurnaceInferiors = as;
    }

    public void setOverrideDisplayGUIFurnaceSuperiors(String as[])
    {
        overrideDisplayGUIFurnaceSuperiors = as;
    }

    public void setOverrideDisplayGUIFurnaceInferiors(String as[])
    {
        overrideDisplayGUIFurnaceInferiors = as;
    }

    public void setAfterDisplayGUIFurnaceSuperiors(String as[])
    {
        afterDisplayGUIFurnaceSuperiors = as;
    }

    public void setAfterDisplayGUIFurnaceInferiors(String as[])
    {
        afterDisplayGUIFurnaceInferiors = as;
    }

    public String[] getBeforeDisplayWorkbenchGUISuperiors()
    {
        return beforeDisplayWorkbenchGUISuperiors;
    }

    public String[] getBeforeDisplayWorkbenchGUIInferiors()
    {
        return beforeDisplayWorkbenchGUIInferiors;
    }

    public String[] getOverrideDisplayWorkbenchGUISuperiors()
    {
        return overrideDisplayWorkbenchGUISuperiors;
    }

    public String[] getOverrideDisplayWorkbenchGUIInferiors()
    {
        return overrideDisplayWorkbenchGUIInferiors;
    }

    public String[] getAfterDisplayWorkbenchGUISuperiors()
    {
        return afterDisplayWorkbenchGUISuperiors;
    }

    public String[] getAfterDisplayWorkbenchGUIInferiors()
    {
        return afterDisplayWorkbenchGUIInferiors;
    }

    public void setBeforeDisplayWorkbenchGUISuperiors(String as[])
    {
        beforeDisplayWorkbenchGUISuperiors = as;
    }

    public void setBeforeDisplayWorkbenchGUIInferiors(String as[])
    {
        beforeDisplayWorkbenchGUIInferiors = as;
    }

    public void setOverrideDisplayWorkbenchGUISuperiors(String as[])
    {
        overrideDisplayWorkbenchGUISuperiors = as;
    }

    public void setOverrideDisplayWorkbenchGUIInferiors(String as[])
    {
        overrideDisplayWorkbenchGUIInferiors = as;
    }

    public void setAfterDisplayWorkbenchGUISuperiors(String as[])
    {
        afterDisplayWorkbenchGUISuperiors = as;
    }

    public void setAfterDisplayWorkbenchGUIInferiors(String as[])
    {
        afterDisplayWorkbenchGUIInferiors = as;
    }

    public String[] getBeforeDropOneItemSuperiors()
    {
        return beforeDropOneItemSuperiors;
    }

    public String[] getBeforeDropOneItemInferiors()
    {
        return beforeDropOneItemInferiors;
    }

    public String[] getOverrideDropOneItemSuperiors()
    {
        return overrideDropOneItemSuperiors;
    }

    public String[] getOverrideDropOneItemInferiors()
    {
        return overrideDropOneItemInferiors;
    }

    public String[] getAfterDropOneItemSuperiors()
    {
        return afterDropOneItemSuperiors;
    }

    public String[] getAfterDropOneItemInferiors()
    {
        return afterDropOneItemInferiors;
    }

    public void setBeforeDropOneItemSuperiors(String as[])
    {
        beforeDropOneItemSuperiors = as;
    }

    public void setBeforeDropOneItemInferiors(String as[])
    {
        beforeDropOneItemInferiors = as;
    }

    public void setOverrideDropOneItemSuperiors(String as[])
    {
        overrideDropOneItemSuperiors = as;
    }

    public void setOverrideDropOneItemInferiors(String as[])
    {
        overrideDropOneItemInferiors = as;
    }

    public void setAfterDropOneItemSuperiors(String as[])
    {
        afterDropOneItemSuperiors = as;
    }

    public void setAfterDropOneItemInferiors(String as[])
    {
        afterDropOneItemInferiors = as;
    }

    public String[] getBeforeDropPlayerItemSuperiors()
    {
        return beforeDropPlayerItemSuperiors;
    }

    public String[] getBeforeDropPlayerItemInferiors()
    {
        return beforeDropPlayerItemInferiors;
    }

    public String[] getOverrideDropPlayerItemSuperiors()
    {
        return overrideDropPlayerItemSuperiors;
    }

    public String[] getOverrideDropPlayerItemInferiors()
    {
        return overrideDropPlayerItemInferiors;
    }

    public String[] getAfterDropPlayerItemSuperiors()
    {
        return afterDropPlayerItemSuperiors;
    }

    public String[] getAfterDropPlayerItemInferiors()
    {
        return afterDropPlayerItemInferiors;
    }

    public void setBeforeDropPlayerItemSuperiors(String as[])
    {
        beforeDropPlayerItemSuperiors = as;
    }

    public void setBeforeDropPlayerItemInferiors(String as[])
    {
        beforeDropPlayerItemInferiors = as;
    }

    public void setOverrideDropPlayerItemSuperiors(String as[])
    {
        overrideDropPlayerItemSuperiors = as;
    }

    public void setOverrideDropPlayerItemInferiors(String as[])
    {
        overrideDropPlayerItemInferiors = as;
    }

    public void setAfterDropPlayerItemSuperiors(String as[])
    {
        afterDropPlayerItemSuperiors = as;
    }

    public void setAfterDropPlayerItemInferiors(String as[])
    {
        afterDropPlayerItemInferiors = as;
    }

    public String[] getBeforeDropPlayerItemWithRandomChoiceSuperiors()
    {
        return beforeDropPlayerItemWithRandomChoiceSuperiors;
    }

    public String[] getBeforeDropPlayerItemWithRandomChoiceInferiors()
    {
        return beforeDropPlayerItemWithRandomChoiceInferiors;
    }

    public String[] getOverrideDropPlayerItemWithRandomChoiceSuperiors()
    {
        return overrideDropPlayerItemWithRandomChoiceSuperiors;
    }

    public String[] getOverrideDropPlayerItemWithRandomChoiceInferiors()
    {
        return overrideDropPlayerItemWithRandomChoiceInferiors;
    }

    public String[] getAfterDropPlayerItemWithRandomChoiceSuperiors()
    {
        return afterDropPlayerItemWithRandomChoiceSuperiors;
    }

    public String[] getAfterDropPlayerItemWithRandomChoiceInferiors()
    {
        return afterDropPlayerItemWithRandomChoiceInferiors;
    }

    public void setBeforeDropPlayerItemWithRandomChoiceSuperiors(String as[])
    {
        beforeDropPlayerItemWithRandomChoiceSuperiors = as;
    }

    public void setBeforeDropPlayerItemWithRandomChoiceInferiors(String as[])
    {
        beforeDropPlayerItemWithRandomChoiceInferiors = as;
    }

    public void setOverrideDropPlayerItemWithRandomChoiceSuperiors(String as[])
    {
        overrideDropPlayerItemWithRandomChoiceSuperiors = as;
    }

    public void setOverrideDropPlayerItemWithRandomChoiceInferiors(String as[])
    {
        overrideDropPlayerItemWithRandomChoiceInferiors = as;
    }

    public void setAfterDropPlayerItemWithRandomChoiceSuperiors(String as[])
    {
        afterDropPlayerItemWithRandomChoiceSuperiors = as;
    }

    public void setAfterDropPlayerItemWithRandomChoiceInferiors(String as[])
    {
        afterDropPlayerItemWithRandomChoiceInferiors = as;
    }

    public String[] getBeforeFallSuperiors()
    {
        return beforeFallSuperiors;
    }

    public String[] getBeforeFallInferiors()
    {
        return beforeFallInferiors;
    }

    public String[] getOverrideFallSuperiors()
    {
        return overrideFallSuperiors;
    }

    public String[] getOverrideFallInferiors()
    {
        return overrideFallInferiors;
    }

    public String[] getAfterFallSuperiors()
    {
        return afterFallSuperiors;
    }

    public String[] getAfterFallInferiors()
    {
        return afterFallInferiors;
    }

    public void setBeforeFallSuperiors(String as[])
    {
        beforeFallSuperiors = as;
    }

    public void setBeforeFallInferiors(String as[])
    {
        beforeFallInferiors = as;
    }

    public void setOverrideFallSuperiors(String as[])
    {
        overrideFallSuperiors = as;
    }

    public void setOverrideFallInferiors(String as[])
    {
        overrideFallInferiors = as;
    }

    public void setAfterFallSuperiors(String as[])
    {
        afterFallSuperiors = as;
    }

    public void setAfterFallInferiors(String as[])
    {
        afterFallInferiors = as;
    }

    public String[] getBeforeGetBrightnessSuperiors()
    {
        return beforeGetBrightnessSuperiors;
    }

    public String[] getBeforeGetBrightnessInferiors()
    {
        return beforeGetBrightnessInferiors;
    }

    public String[] getOverrideGetBrightnessSuperiors()
    {
        return overrideGetBrightnessSuperiors;
    }

    public String[] getOverrideGetBrightnessInferiors()
    {
        return overrideGetBrightnessInferiors;
    }

    public String[] getAfterGetBrightnessSuperiors()
    {
        return afterGetBrightnessSuperiors;
    }

    public String[] getAfterGetBrightnessInferiors()
    {
        return afterGetBrightnessInferiors;
    }

    public void setBeforeGetBrightnessSuperiors(String as[])
    {
        beforeGetBrightnessSuperiors = as;
    }

    public void setBeforeGetBrightnessInferiors(String as[])
    {
        beforeGetBrightnessInferiors = as;
    }

    public void setOverrideGetBrightnessSuperiors(String as[])
    {
        overrideGetBrightnessSuperiors = as;
    }

    public void setOverrideGetBrightnessInferiors(String as[])
    {
        overrideGetBrightnessInferiors = as;
    }

    public void setAfterGetBrightnessSuperiors(String as[])
    {
        afterGetBrightnessSuperiors = as;
    }

    public void setAfterGetBrightnessInferiors(String as[])
    {
        afterGetBrightnessInferiors = as;
    }

    public String[] getBeforeGetBrightnessForRenderSuperiors()
    {
        return beforeGetBrightnessForRenderSuperiors;
    }

    public String[] getBeforeGetBrightnessForRenderInferiors()
    {
        return beforeGetBrightnessForRenderInferiors;
    }

    public String[] getOverrideGetBrightnessForRenderSuperiors()
    {
        return overrideGetBrightnessForRenderSuperiors;
    }

    public String[] getOverrideGetBrightnessForRenderInferiors()
    {
        return overrideGetBrightnessForRenderInferiors;
    }

    public String[] getAfterGetBrightnessForRenderSuperiors()
    {
        return afterGetBrightnessForRenderSuperiors;
    }

    public String[] getAfterGetBrightnessForRenderInferiors()
    {
        return afterGetBrightnessForRenderInferiors;
    }

    public void setBeforeGetBrightnessForRenderSuperiors(String as[])
    {
        beforeGetBrightnessForRenderSuperiors = as;
    }

    public void setBeforeGetBrightnessForRenderInferiors(String as[])
    {
        beforeGetBrightnessForRenderInferiors = as;
    }

    public void setOverrideGetBrightnessForRenderSuperiors(String as[])
    {
        overrideGetBrightnessForRenderSuperiors = as;
    }

    public void setOverrideGetBrightnessForRenderInferiors(String as[])
    {
        overrideGetBrightnessForRenderInferiors = as;
    }

    public void setAfterGetBrightnessForRenderSuperiors(String as[])
    {
        afterGetBrightnessForRenderSuperiors = as;
    }

    public void setAfterGetBrightnessForRenderInferiors(String as[])
    {
        afterGetBrightnessForRenderInferiors = as;
    }

    public String[] getBeforeGetCurrentPlayerStrVsBlockSuperiors()
    {
        return beforeGetCurrentPlayerStrVsBlockSuperiors;
    }

    public String[] getBeforeGetCurrentPlayerStrVsBlockInferiors()
    {
        return beforeGetCurrentPlayerStrVsBlockInferiors;
    }

    public String[] getOverrideGetCurrentPlayerStrVsBlockSuperiors()
    {
        return overrideGetCurrentPlayerStrVsBlockSuperiors;
    }

    public String[] getOverrideGetCurrentPlayerStrVsBlockInferiors()
    {
        return overrideGetCurrentPlayerStrVsBlockInferiors;
    }

    public String[] getAfterGetCurrentPlayerStrVsBlockSuperiors()
    {
        return afterGetCurrentPlayerStrVsBlockSuperiors;
    }

    public String[] getAfterGetCurrentPlayerStrVsBlockInferiors()
    {
        return afterGetCurrentPlayerStrVsBlockInferiors;
    }

    public void setBeforeGetCurrentPlayerStrVsBlockSuperiors(String as[])
    {
        beforeGetCurrentPlayerStrVsBlockSuperiors = as;
    }

    public void setBeforeGetCurrentPlayerStrVsBlockInferiors(String as[])
    {
        beforeGetCurrentPlayerStrVsBlockInferiors = as;
    }

    public void setOverrideGetCurrentPlayerStrVsBlockSuperiors(String as[])
    {
        overrideGetCurrentPlayerStrVsBlockSuperiors = as;
    }

    public void setOverrideGetCurrentPlayerStrVsBlockInferiors(String as[])
    {
        overrideGetCurrentPlayerStrVsBlockInferiors = as;
    }

    public void setAfterGetCurrentPlayerStrVsBlockSuperiors(String as[])
    {
        afterGetCurrentPlayerStrVsBlockSuperiors = as;
    }

    public void setAfterGetCurrentPlayerStrVsBlockInferiors(String as[])
    {
        afterGetCurrentPlayerStrVsBlockInferiors = as;
    }

    public String[] getBeforeGetDistanceSqSuperiors()
    {
        return beforeGetDistanceSqSuperiors;
    }

    public String[] getBeforeGetDistanceSqInferiors()
    {
        return beforeGetDistanceSqInferiors;
    }

    public String[] getOverrideGetDistanceSqSuperiors()
    {
        return overrideGetDistanceSqSuperiors;
    }

    public String[] getOverrideGetDistanceSqInferiors()
    {
        return overrideGetDistanceSqInferiors;
    }

    public String[] getAfterGetDistanceSqSuperiors()
    {
        return afterGetDistanceSqSuperiors;
    }

    public String[] getAfterGetDistanceSqInferiors()
    {
        return afterGetDistanceSqInferiors;
    }

    public void setBeforeGetDistanceSqSuperiors(String as[])
    {
        beforeGetDistanceSqSuperiors = as;
    }

    public void setBeforeGetDistanceSqInferiors(String as[])
    {
        beforeGetDistanceSqInferiors = as;
    }

    public void setOverrideGetDistanceSqSuperiors(String as[])
    {
        overrideGetDistanceSqSuperiors = as;
    }

    public void setOverrideGetDistanceSqInferiors(String as[])
    {
        overrideGetDistanceSqInferiors = as;
    }

    public void setAfterGetDistanceSqSuperiors(String as[])
    {
        afterGetDistanceSqSuperiors = as;
    }

    public void setAfterGetDistanceSqInferiors(String as[])
    {
        afterGetDistanceSqInferiors = as;
    }

    public String[] getBeforeGetDistanceSqToEntitySuperiors()
    {
        return beforeGetDistanceSqToEntitySuperiors;
    }

    public String[] getBeforeGetDistanceSqToEntityInferiors()
    {
        return beforeGetDistanceSqToEntityInferiors;
    }

    public String[] getOverrideGetDistanceSqToEntitySuperiors()
    {
        return overrideGetDistanceSqToEntitySuperiors;
    }

    public String[] getOverrideGetDistanceSqToEntityInferiors()
    {
        return overrideGetDistanceSqToEntityInferiors;
    }

    public String[] getAfterGetDistanceSqToEntitySuperiors()
    {
        return afterGetDistanceSqToEntitySuperiors;
    }

    public String[] getAfterGetDistanceSqToEntityInferiors()
    {
        return afterGetDistanceSqToEntityInferiors;
    }

    public void setBeforeGetDistanceSqToEntitySuperiors(String as[])
    {
        beforeGetDistanceSqToEntitySuperiors = as;
    }

    public void setBeforeGetDistanceSqToEntityInferiors(String as[])
    {
        beforeGetDistanceSqToEntityInferiors = as;
    }

    public void setOverrideGetDistanceSqToEntitySuperiors(String as[])
    {
        overrideGetDistanceSqToEntitySuperiors = as;
    }

    public void setOverrideGetDistanceSqToEntityInferiors(String as[])
    {
        overrideGetDistanceSqToEntityInferiors = as;
    }

    public void setAfterGetDistanceSqToEntitySuperiors(String as[])
    {
        afterGetDistanceSqToEntitySuperiors = as;
    }

    public void setAfterGetDistanceSqToEntityInferiors(String as[])
    {
        afterGetDistanceSqToEntityInferiors = as;
    }

    public String[] getBeforeGetFOVMultiplierSuperiors()
    {
        return beforeGetFOVMultiplierSuperiors;
    }

    public String[] getBeforeGetFOVMultiplierInferiors()
    {
        return beforeGetFOVMultiplierInferiors;
    }

    public String[] getOverrideGetFOVMultiplierSuperiors()
    {
        return overrideGetFOVMultiplierSuperiors;
    }

    public String[] getOverrideGetFOVMultiplierInferiors()
    {
        return overrideGetFOVMultiplierInferiors;
    }

    public String[] getAfterGetFOVMultiplierSuperiors()
    {
        return afterGetFOVMultiplierSuperiors;
    }

    public String[] getAfterGetFOVMultiplierInferiors()
    {
        return afterGetFOVMultiplierInferiors;
    }

    public void setBeforeGetFOVMultiplierSuperiors(String as[])
    {
        beforeGetFOVMultiplierSuperiors = as;
    }

    public void setBeforeGetFOVMultiplierInferiors(String as[])
    {
        beforeGetFOVMultiplierInferiors = as;
    }

    public void setOverrideGetFOVMultiplierSuperiors(String as[])
    {
        overrideGetFOVMultiplierSuperiors = as;
    }

    public void setOverrideGetFOVMultiplierInferiors(String as[])
    {
        overrideGetFOVMultiplierInferiors = as;
    }

    public void setAfterGetFOVMultiplierSuperiors(String as[])
    {
        afterGetFOVMultiplierSuperiors = as;
    }

    public void setAfterGetFOVMultiplierInferiors(String as[])
    {
        afterGetFOVMultiplierInferiors = as;
    }

    public String[] getBeforeGetHurtSoundSuperiors()
    {
        return beforeGetHurtSoundSuperiors;
    }

    public String[] getBeforeGetHurtSoundInferiors()
    {
        return beforeGetHurtSoundInferiors;
    }

    public String[] getOverrideGetHurtSoundSuperiors()
    {
        return overrideGetHurtSoundSuperiors;
    }

    public String[] getOverrideGetHurtSoundInferiors()
    {
        return overrideGetHurtSoundInferiors;
    }

    public String[] getAfterGetHurtSoundSuperiors()
    {
        return afterGetHurtSoundSuperiors;
    }

    public String[] getAfterGetHurtSoundInferiors()
    {
        return afterGetHurtSoundInferiors;
    }

    public void setBeforeGetHurtSoundSuperiors(String as[])
    {
        beforeGetHurtSoundSuperiors = as;
    }

    public void setBeforeGetHurtSoundInferiors(String as[])
    {
        beforeGetHurtSoundInferiors = as;
    }

    public void setOverrideGetHurtSoundSuperiors(String as[])
    {
        overrideGetHurtSoundSuperiors = as;
    }

    public void setOverrideGetHurtSoundInferiors(String as[])
    {
        overrideGetHurtSoundInferiors = as;
    }

    public void setAfterGetHurtSoundSuperiors(String as[])
    {
        afterGetHurtSoundSuperiors = as;
    }

    public void setAfterGetHurtSoundInferiors(String as[])
    {
        afterGetHurtSoundInferiors = as;
    }

    public String[] getBeforeGetItemIconSuperiors()
    {
        return beforeGetItemIconSuperiors;
    }

    public String[] getBeforeGetItemIconInferiors()
    {
        return beforeGetItemIconInferiors;
    }

    public String[] getOverrideGetItemIconSuperiors()
    {
        return overrideGetItemIconSuperiors;
    }

    public String[] getOverrideGetItemIconInferiors()
    {
        return overrideGetItemIconInferiors;
    }

    public String[] getAfterGetItemIconSuperiors()
    {
        return afterGetItemIconSuperiors;
    }

    public String[] getAfterGetItemIconInferiors()
    {
        return afterGetItemIconInferiors;
    }

    public void setBeforeGetItemIconSuperiors(String as[])
    {
        beforeGetItemIconSuperiors = as;
    }

    public void setBeforeGetItemIconInferiors(String as[])
    {
        beforeGetItemIconInferiors = as;
    }

    public void setOverrideGetItemIconSuperiors(String as[])
    {
        overrideGetItemIconSuperiors = as;
    }

    public void setOverrideGetItemIconInferiors(String as[])
    {
        overrideGetItemIconInferiors = as;
    }

    public void setAfterGetItemIconSuperiors(String as[])
    {
        afterGetItemIconSuperiors = as;
    }

    public void setAfterGetItemIconInferiors(String as[])
    {
        afterGetItemIconInferiors = as;
    }

    public String[] getBeforeGetSleepTimerSuperiors()
    {
        return beforeGetSleepTimerSuperiors;
    }

    public String[] getBeforeGetSleepTimerInferiors()
    {
        return beforeGetSleepTimerInferiors;
    }

    public String[] getOverrideGetSleepTimerSuperiors()
    {
        return overrideGetSleepTimerSuperiors;
    }

    public String[] getOverrideGetSleepTimerInferiors()
    {
        return overrideGetSleepTimerInferiors;
    }

    public String[] getAfterGetSleepTimerSuperiors()
    {
        return afterGetSleepTimerSuperiors;
    }

    public String[] getAfterGetSleepTimerInferiors()
    {
        return afterGetSleepTimerInferiors;
    }

    public void setBeforeGetSleepTimerSuperiors(String as[])
    {
        beforeGetSleepTimerSuperiors = as;
    }

    public void setBeforeGetSleepTimerInferiors(String as[])
    {
        beforeGetSleepTimerInferiors = as;
    }

    public void setOverrideGetSleepTimerSuperiors(String as[])
    {
        overrideGetSleepTimerSuperiors = as;
    }

    public void setOverrideGetSleepTimerInferiors(String as[])
    {
        overrideGetSleepTimerInferiors = as;
    }

    public void setAfterGetSleepTimerSuperiors(String as[])
    {
        afterGetSleepTimerSuperiors = as;
    }

    public void setAfterGetSleepTimerInferiors(String as[])
    {
        afterGetSleepTimerInferiors = as;
    }

    public String[] getBeforeGetSpeedModifierSuperiors()
    {
        return beforeGetSpeedModifierSuperiors;
    }

    public String[] getBeforeGetSpeedModifierInferiors()
    {
        return beforeGetSpeedModifierInferiors;
    }

    public String[] getOverrideGetSpeedModifierSuperiors()
    {
        return overrideGetSpeedModifierSuperiors;
    }

    public String[] getOverrideGetSpeedModifierInferiors()
    {
        return overrideGetSpeedModifierInferiors;
    }

    public String[] getAfterGetSpeedModifierSuperiors()
    {
        return afterGetSpeedModifierSuperiors;
    }

    public String[] getAfterGetSpeedModifierInferiors()
    {
        return afterGetSpeedModifierInferiors;
    }

    public void setBeforeGetSpeedModifierSuperiors(String as[])
    {
        beforeGetSpeedModifierSuperiors = as;
    }

    public void setBeforeGetSpeedModifierInferiors(String as[])
    {
        beforeGetSpeedModifierInferiors = as;
    }

    public void setOverrideGetSpeedModifierSuperiors(String as[])
    {
        overrideGetSpeedModifierSuperiors = as;
    }

    public void setOverrideGetSpeedModifierInferiors(String as[])
    {
        overrideGetSpeedModifierInferiors = as;
    }

    public void setAfterGetSpeedModifierSuperiors(String as[])
    {
        afterGetSpeedModifierSuperiors = as;
    }

    public void setAfterGetSpeedModifierInferiors(String as[])
    {
        afterGetSpeedModifierInferiors = as;
    }

    public String[] getBeforeHandleLavaMovementSuperiors()
    {
        return beforeHandleLavaMovementSuperiors;
    }

    public String[] getBeforeHandleLavaMovementInferiors()
    {
        return beforeHandleLavaMovementInferiors;
    }

    public String[] getOverrideHandleLavaMovementSuperiors()
    {
        return overrideHandleLavaMovementSuperiors;
    }

    public String[] getOverrideHandleLavaMovementInferiors()
    {
        return overrideHandleLavaMovementInferiors;
    }

    public String[] getAfterHandleLavaMovementSuperiors()
    {
        return afterHandleLavaMovementSuperiors;
    }

    public String[] getAfterHandleLavaMovementInferiors()
    {
        return afterHandleLavaMovementInferiors;
    }

    public void setBeforeHandleLavaMovementSuperiors(String as[])
    {
        beforeHandleLavaMovementSuperiors = as;
    }

    public void setBeforeHandleLavaMovementInferiors(String as[])
    {
        beforeHandleLavaMovementInferiors = as;
    }

    public void setOverrideHandleLavaMovementSuperiors(String as[])
    {
        overrideHandleLavaMovementSuperiors = as;
    }

    public void setOverrideHandleLavaMovementInferiors(String as[])
    {
        overrideHandleLavaMovementInferiors = as;
    }

    public void setAfterHandleLavaMovementSuperiors(String as[])
    {
        afterHandleLavaMovementSuperiors = as;
    }

    public void setAfterHandleLavaMovementInferiors(String as[])
    {
        afterHandleLavaMovementInferiors = as;
    }

    public String[] getBeforeHandleWaterMovementSuperiors()
    {
        return beforeHandleWaterMovementSuperiors;
    }

    public String[] getBeforeHandleWaterMovementInferiors()
    {
        return beforeHandleWaterMovementInferiors;
    }

    public String[] getOverrideHandleWaterMovementSuperiors()
    {
        return overrideHandleWaterMovementSuperiors;
    }

    public String[] getOverrideHandleWaterMovementInferiors()
    {
        return overrideHandleWaterMovementInferiors;
    }

    public String[] getAfterHandleWaterMovementSuperiors()
    {
        return afterHandleWaterMovementSuperiors;
    }

    public String[] getAfterHandleWaterMovementInferiors()
    {
        return afterHandleWaterMovementInferiors;
    }

    public void setBeforeHandleWaterMovementSuperiors(String as[])
    {
        beforeHandleWaterMovementSuperiors = as;
    }

    public void setBeforeHandleWaterMovementInferiors(String as[])
    {
        beforeHandleWaterMovementInferiors = as;
    }

    public void setOverrideHandleWaterMovementSuperiors(String as[])
    {
        overrideHandleWaterMovementSuperiors = as;
    }

    public void setOverrideHandleWaterMovementInferiors(String as[])
    {
        overrideHandleWaterMovementInferiors = as;
    }

    public void setAfterHandleWaterMovementSuperiors(String as[])
    {
        afterHandleWaterMovementSuperiors = as;
    }

    public void setAfterHandleWaterMovementInferiors(String as[])
    {
        afterHandleWaterMovementInferiors = as;
    }

    public String[] getBeforeHealSuperiors()
    {
        return beforeHealSuperiors;
    }

    public String[] getBeforeHealInferiors()
    {
        return beforeHealInferiors;
    }

    public String[] getOverrideHealSuperiors()
    {
        return overrideHealSuperiors;
    }

    public String[] getOverrideHealInferiors()
    {
        return overrideHealInferiors;
    }

    public String[] getAfterHealSuperiors()
    {
        return afterHealSuperiors;
    }

    public String[] getAfterHealInferiors()
    {
        return afterHealInferiors;
    }

    public void setBeforeHealSuperiors(String as[])
    {
        beforeHealSuperiors = as;
    }

    public void setBeforeHealInferiors(String as[])
    {
        beforeHealInferiors = as;
    }

    public void setOverrideHealSuperiors(String as[])
    {
        overrideHealSuperiors = as;
    }

    public void setOverrideHealInferiors(String as[])
    {
        overrideHealInferiors = as;
    }

    public void setAfterHealSuperiors(String as[])
    {
        afterHealSuperiors = as;
    }

    public void setAfterHealInferiors(String as[])
    {
        afterHealInferiors = as;
    }

    public String[] getBeforeIsEntityInsideOpaqueBlockSuperiors()
    {
        return beforeIsEntityInsideOpaqueBlockSuperiors;
    }

    public String[] getBeforeIsEntityInsideOpaqueBlockInferiors()
    {
        return beforeIsEntityInsideOpaqueBlockInferiors;
    }

    public String[] getOverrideIsEntityInsideOpaqueBlockSuperiors()
    {
        return overrideIsEntityInsideOpaqueBlockSuperiors;
    }

    public String[] getOverrideIsEntityInsideOpaqueBlockInferiors()
    {
        return overrideIsEntityInsideOpaqueBlockInferiors;
    }

    public String[] getAfterIsEntityInsideOpaqueBlockSuperiors()
    {
        return afterIsEntityInsideOpaqueBlockSuperiors;
    }

    public String[] getAfterIsEntityInsideOpaqueBlockInferiors()
    {
        return afterIsEntityInsideOpaqueBlockInferiors;
    }

    public void setBeforeIsEntityInsideOpaqueBlockSuperiors(String as[])
    {
        beforeIsEntityInsideOpaqueBlockSuperiors = as;
    }

    public void setBeforeIsEntityInsideOpaqueBlockInferiors(String as[])
    {
        beforeIsEntityInsideOpaqueBlockInferiors = as;
    }

    public void setOverrideIsEntityInsideOpaqueBlockSuperiors(String as[])
    {
        overrideIsEntityInsideOpaqueBlockSuperiors = as;
    }

    public void setOverrideIsEntityInsideOpaqueBlockInferiors(String as[])
    {
        overrideIsEntityInsideOpaqueBlockInferiors = as;
    }

    public void setAfterIsEntityInsideOpaqueBlockSuperiors(String as[])
    {
        afterIsEntityInsideOpaqueBlockSuperiors = as;
    }

    public void setAfterIsEntityInsideOpaqueBlockInferiors(String as[])
    {
        afterIsEntityInsideOpaqueBlockInferiors = as;
    }

    public String[] getBeforeIsInWaterSuperiors()
    {
        return beforeIsInWaterSuperiors;
    }

    public String[] getBeforeIsInWaterInferiors()
    {
        return beforeIsInWaterInferiors;
    }

    public String[] getOverrideIsInWaterSuperiors()
    {
        return overrideIsInWaterSuperiors;
    }

    public String[] getOverrideIsInWaterInferiors()
    {
        return overrideIsInWaterInferiors;
    }

    public String[] getAfterIsInWaterSuperiors()
    {
        return afterIsInWaterSuperiors;
    }

    public String[] getAfterIsInWaterInferiors()
    {
        return afterIsInWaterInferiors;
    }

    public void setBeforeIsInWaterSuperiors(String as[])
    {
        beforeIsInWaterSuperiors = as;
    }

    public void setBeforeIsInWaterInferiors(String as[])
    {
        beforeIsInWaterInferiors = as;
    }

    public void setOverrideIsInWaterSuperiors(String as[])
    {
        overrideIsInWaterSuperiors = as;
    }

    public void setOverrideIsInWaterInferiors(String as[])
    {
        overrideIsInWaterInferiors = as;
    }

    public void setAfterIsInWaterSuperiors(String as[])
    {
        afterIsInWaterSuperiors = as;
    }

    public void setAfterIsInWaterInferiors(String as[])
    {
        afterIsInWaterInferiors = as;
    }

    public String[] getBeforeIsInsideOfMaterialSuperiors()
    {
        return beforeIsInsideOfMaterialSuperiors;
    }

    public String[] getBeforeIsInsideOfMaterialInferiors()
    {
        return beforeIsInsideOfMaterialInferiors;
    }

    public String[] getOverrideIsInsideOfMaterialSuperiors()
    {
        return overrideIsInsideOfMaterialSuperiors;
    }

    public String[] getOverrideIsInsideOfMaterialInferiors()
    {
        return overrideIsInsideOfMaterialInferiors;
    }

    public String[] getAfterIsInsideOfMaterialSuperiors()
    {
        return afterIsInsideOfMaterialSuperiors;
    }

    public String[] getAfterIsInsideOfMaterialInferiors()
    {
        return afterIsInsideOfMaterialInferiors;
    }

    public void setBeforeIsInsideOfMaterialSuperiors(String as[])
    {
        beforeIsInsideOfMaterialSuperiors = as;
    }

    public void setBeforeIsInsideOfMaterialInferiors(String as[])
    {
        beforeIsInsideOfMaterialInferiors = as;
    }

    public void setOverrideIsInsideOfMaterialSuperiors(String as[])
    {
        overrideIsInsideOfMaterialSuperiors = as;
    }

    public void setOverrideIsInsideOfMaterialInferiors(String as[])
    {
        overrideIsInsideOfMaterialInferiors = as;
    }

    public void setAfterIsInsideOfMaterialSuperiors(String as[])
    {
        afterIsInsideOfMaterialSuperiors = as;
    }

    public void setAfterIsInsideOfMaterialInferiors(String as[])
    {
        afterIsInsideOfMaterialInferiors = as;
    }

    public String[] getBeforeIsOnLadderSuperiors()
    {
        return beforeIsOnLadderSuperiors;
    }

    public String[] getBeforeIsOnLadderInferiors()
    {
        return beforeIsOnLadderInferiors;
    }

    public String[] getOverrideIsOnLadderSuperiors()
    {
        return overrideIsOnLadderSuperiors;
    }

    public String[] getOverrideIsOnLadderInferiors()
    {
        return overrideIsOnLadderInferiors;
    }

    public String[] getAfterIsOnLadderSuperiors()
    {
        return afterIsOnLadderSuperiors;
    }

    public String[] getAfterIsOnLadderInferiors()
    {
        return afterIsOnLadderInferiors;
    }

    public void setBeforeIsOnLadderSuperiors(String as[])
    {
        beforeIsOnLadderSuperiors = as;
    }

    public void setBeforeIsOnLadderInferiors(String as[])
    {
        beforeIsOnLadderInferiors = as;
    }

    public void setOverrideIsOnLadderSuperiors(String as[])
    {
        overrideIsOnLadderSuperiors = as;
    }

    public void setOverrideIsOnLadderInferiors(String as[])
    {
        overrideIsOnLadderInferiors = as;
    }

    public void setAfterIsOnLadderSuperiors(String as[])
    {
        afterIsOnLadderSuperiors = as;
    }

    public void setAfterIsOnLadderInferiors(String as[])
    {
        afterIsOnLadderInferiors = as;
    }

    public String[] getBeforeIsSneakingSuperiors()
    {
        return beforeIsSneakingSuperiors;
    }

    public String[] getBeforeIsSneakingInferiors()
    {
        return beforeIsSneakingInferiors;
    }

    public String[] getOverrideIsSneakingSuperiors()
    {
        return overrideIsSneakingSuperiors;
    }

    public String[] getOverrideIsSneakingInferiors()
    {
        return overrideIsSneakingInferiors;
    }

    public String[] getAfterIsSneakingSuperiors()
    {
        return afterIsSneakingSuperiors;
    }

    public String[] getAfterIsSneakingInferiors()
    {
        return afterIsSneakingInferiors;
    }

    public void setBeforeIsSneakingSuperiors(String as[])
    {
        beforeIsSneakingSuperiors = as;
    }

    public void setBeforeIsSneakingInferiors(String as[])
    {
        beforeIsSneakingInferiors = as;
    }

    public void setOverrideIsSneakingSuperiors(String as[])
    {
        overrideIsSneakingSuperiors = as;
    }

    public void setOverrideIsSneakingInferiors(String as[])
    {
        overrideIsSneakingInferiors = as;
    }

    public void setAfterIsSneakingSuperiors(String as[])
    {
        afterIsSneakingSuperiors = as;
    }

    public void setAfterIsSneakingInferiors(String as[])
    {
        afterIsSneakingInferiors = as;
    }

    public String[] getBeforeIsSprintingSuperiors()
    {
        return beforeIsSprintingSuperiors;
    }

    public String[] getBeforeIsSprintingInferiors()
    {
        return beforeIsSprintingInferiors;
    }

    public String[] getOverrideIsSprintingSuperiors()
    {
        return overrideIsSprintingSuperiors;
    }

    public String[] getOverrideIsSprintingInferiors()
    {
        return overrideIsSprintingInferiors;
    }

    public String[] getAfterIsSprintingSuperiors()
    {
        return afterIsSprintingSuperiors;
    }

    public String[] getAfterIsSprintingInferiors()
    {
        return afterIsSprintingInferiors;
    }

    public void setBeforeIsSprintingSuperiors(String as[])
    {
        beforeIsSprintingSuperiors = as;
    }

    public void setBeforeIsSprintingInferiors(String as[])
    {
        beforeIsSprintingInferiors = as;
    }

    public void setOverrideIsSprintingSuperiors(String as[])
    {
        overrideIsSprintingSuperiors = as;
    }

    public void setOverrideIsSprintingInferiors(String as[])
    {
        overrideIsSprintingInferiors = as;
    }

    public void setAfterIsSprintingSuperiors(String as[])
    {
        afterIsSprintingSuperiors = as;
    }

    public void setAfterIsSprintingInferiors(String as[])
    {
        afterIsSprintingInferiors = as;
    }

    public String[] getBeforeJumpSuperiors()
    {
        return beforeJumpSuperiors;
    }

    public String[] getBeforeJumpInferiors()
    {
        return beforeJumpInferiors;
    }

    public String[] getOverrideJumpSuperiors()
    {
        return overrideJumpSuperiors;
    }

    public String[] getOverrideJumpInferiors()
    {
        return overrideJumpInferiors;
    }

    public String[] getAfterJumpSuperiors()
    {
        return afterJumpSuperiors;
    }

    public String[] getAfterJumpInferiors()
    {
        return afterJumpInferiors;
    }

    public void setBeforeJumpSuperiors(String as[])
    {
        beforeJumpSuperiors = as;
    }

    public void setBeforeJumpInferiors(String as[])
    {
        beforeJumpInferiors = as;
    }

    public void setOverrideJumpSuperiors(String as[])
    {
        overrideJumpSuperiors = as;
    }

    public void setOverrideJumpInferiors(String as[])
    {
        overrideJumpInferiors = as;
    }

    public void setAfterJumpSuperiors(String as[])
    {
        afterJumpSuperiors = as;
    }

    public void setAfterJumpInferiors(String as[])
    {
        afterJumpInferiors = as;
    }

    public String[] getBeforeKnockBackSuperiors()
    {
        return beforeKnockBackSuperiors;
    }

    public String[] getBeforeKnockBackInferiors()
    {
        return beforeKnockBackInferiors;
    }

    public String[] getOverrideKnockBackSuperiors()
    {
        return overrideKnockBackSuperiors;
    }

    public String[] getOverrideKnockBackInferiors()
    {
        return overrideKnockBackInferiors;
    }

    public String[] getAfterKnockBackSuperiors()
    {
        return afterKnockBackSuperiors;
    }

    public String[] getAfterKnockBackInferiors()
    {
        return afterKnockBackInferiors;
    }

    public void setBeforeKnockBackSuperiors(String as[])
    {
        beforeKnockBackSuperiors = as;
    }

    public void setBeforeKnockBackInferiors(String as[])
    {
        beforeKnockBackInferiors = as;
    }

    public void setOverrideKnockBackSuperiors(String as[])
    {
        overrideKnockBackSuperiors = as;
    }

    public void setOverrideKnockBackInferiors(String as[])
    {
        overrideKnockBackInferiors = as;
    }

    public void setAfterKnockBackSuperiors(String as[])
    {
        afterKnockBackSuperiors = as;
    }

    public void setAfterKnockBackInferiors(String as[])
    {
        afterKnockBackInferiors = as;
    }

    public String[] getBeforeMoveEntitySuperiors()
    {
        return beforeMoveEntitySuperiors;
    }

    public String[] getBeforeMoveEntityInferiors()
    {
        return beforeMoveEntityInferiors;
    }

    public String[] getOverrideMoveEntitySuperiors()
    {
        return overrideMoveEntitySuperiors;
    }

    public String[] getOverrideMoveEntityInferiors()
    {
        return overrideMoveEntityInferiors;
    }

    public String[] getAfterMoveEntitySuperiors()
    {
        return afterMoveEntitySuperiors;
    }

    public String[] getAfterMoveEntityInferiors()
    {
        return afterMoveEntityInferiors;
    }

    public void setBeforeMoveEntitySuperiors(String as[])
    {
        beforeMoveEntitySuperiors = as;
    }

    public void setBeforeMoveEntityInferiors(String as[])
    {
        beforeMoveEntityInferiors = as;
    }

    public void setOverrideMoveEntitySuperiors(String as[])
    {
        overrideMoveEntitySuperiors = as;
    }

    public void setOverrideMoveEntityInferiors(String as[])
    {
        overrideMoveEntityInferiors = as;
    }

    public void setAfterMoveEntitySuperiors(String as[])
    {
        afterMoveEntitySuperiors = as;
    }

    public void setAfterMoveEntityInferiors(String as[])
    {
        afterMoveEntityInferiors = as;
    }

    public String[] getBeforeMoveEntityWithHeadingSuperiors()
    {
        return beforeMoveEntityWithHeadingSuperiors;
    }

    public String[] getBeforeMoveEntityWithHeadingInferiors()
    {
        return beforeMoveEntityWithHeadingInferiors;
    }

    public String[] getOverrideMoveEntityWithHeadingSuperiors()
    {
        return overrideMoveEntityWithHeadingSuperiors;
    }

    public String[] getOverrideMoveEntityWithHeadingInferiors()
    {
        return overrideMoveEntityWithHeadingInferiors;
    }

    public String[] getAfterMoveEntityWithHeadingSuperiors()
    {
        return afterMoveEntityWithHeadingSuperiors;
    }

    public String[] getAfterMoveEntityWithHeadingInferiors()
    {
        return afterMoveEntityWithHeadingInferiors;
    }

    public void setBeforeMoveEntityWithHeadingSuperiors(String as[])
    {
        beforeMoveEntityWithHeadingSuperiors = as;
    }

    public void setBeforeMoveEntityWithHeadingInferiors(String as[])
    {
        beforeMoveEntityWithHeadingInferiors = as;
    }

    public void setOverrideMoveEntityWithHeadingSuperiors(String as[])
    {
        overrideMoveEntityWithHeadingSuperiors = as;
    }

    public void setOverrideMoveEntityWithHeadingInferiors(String as[])
    {
        overrideMoveEntityWithHeadingInferiors = as;
    }

    public void setAfterMoveEntityWithHeadingSuperiors(String as[])
    {
        afterMoveEntityWithHeadingSuperiors = as;
    }

    public void setAfterMoveEntityWithHeadingInferiors(String as[])
    {
        afterMoveEntityWithHeadingInferiors = as;
    }

    public String[] getBeforeMoveFlyingSuperiors()
    {
        return beforeMoveFlyingSuperiors;
    }

    public String[] getBeforeMoveFlyingInferiors()
    {
        return beforeMoveFlyingInferiors;
    }

    public String[] getOverrideMoveFlyingSuperiors()
    {
        return overrideMoveFlyingSuperiors;
    }

    public String[] getOverrideMoveFlyingInferiors()
    {
        return overrideMoveFlyingInferiors;
    }

    public String[] getAfterMoveFlyingSuperiors()
    {
        return afterMoveFlyingSuperiors;
    }

    public String[] getAfterMoveFlyingInferiors()
    {
        return afterMoveFlyingInferiors;
    }

    public void setBeforeMoveFlyingSuperiors(String as[])
    {
        beforeMoveFlyingSuperiors = as;
    }

    public void setBeforeMoveFlyingInferiors(String as[])
    {
        beforeMoveFlyingInferiors = as;
    }

    public void setOverrideMoveFlyingSuperiors(String as[])
    {
        overrideMoveFlyingSuperiors = as;
    }

    public void setOverrideMoveFlyingInferiors(String as[])
    {
        overrideMoveFlyingInferiors = as;
    }

    public void setAfterMoveFlyingSuperiors(String as[])
    {
        afterMoveFlyingSuperiors = as;
    }

    public void setAfterMoveFlyingInferiors(String as[])
    {
        afterMoveFlyingInferiors = as;
    }

    public String[] getBeforeOnDeathSuperiors()
    {
        return beforeOnDeathSuperiors;
    }

    public String[] getBeforeOnDeathInferiors()
    {
        return beforeOnDeathInferiors;
    }

    public String[] getOverrideOnDeathSuperiors()
    {
        return overrideOnDeathSuperiors;
    }

    public String[] getOverrideOnDeathInferiors()
    {
        return overrideOnDeathInferiors;
    }

    public String[] getAfterOnDeathSuperiors()
    {
        return afterOnDeathSuperiors;
    }

    public String[] getAfterOnDeathInferiors()
    {
        return afterOnDeathInferiors;
    }

    public void setBeforeOnDeathSuperiors(String as[])
    {
        beforeOnDeathSuperiors = as;
    }

    public void setBeforeOnDeathInferiors(String as[])
    {
        beforeOnDeathInferiors = as;
    }

    public void setOverrideOnDeathSuperiors(String as[])
    {
        overrideOnDeathSuperiors = as;
    }

    public void setOverrideOnDeathInferiors(String as[])
    {
        overrideOnDeathInferiors = as;
    }

    public void setAfterOnDeathSuperiors(String as[])
    {
        afterOnDeathSuperiors = as;
    }

    public void setAfterOnDeathInferiors(String as[])
    {
        afterOnDeathInferiors = as;
    }

    public String[] getBeforeOnLivingUpdateSuperiors()
    {
        return beforeOnLivingUpdateSuperiors;
    }

    public String[] getBeforeOnLivingUpdateInferiors()
    {
        return beforeOnLivingUpdateInferiors;
    }

    public String[] getOverrideOnLivingUpdateSuperiors()
    {
        return overrideOnLivingUpdateSuperiors;
    }

    public String[] getOverrideOnLivingUpdateInferiors()
    {
        return overrideOnLivingUpdateInferiors;
    }

    public String[] getAfterOnLivingUpdateSuperiors()
    {
        return afterOnLivingUpdateSuperiors;
    }

    public String[] getAfterOnLivingUpdateInferiors()
    {
        return afterOnLivingUpdateInferiors;
    }

    public void setBeforeOnLivingUpdateSuperiors(String as[])
    {
        beforeOnLivingUpdateSuperiors = as;
    }

    public void setBeforeOnLivingUpdateInferiors(String as[])
    {
        beforeOnLivingUpdateInferiors = as;
    }

    public void setOverrideOnLivingUpdateSuperiors(String as[])
    {
        overrideOnLivingUpdateSuperiors = as;
    }

    public void setOverrideOnLivingUpdateInferiors(String as[])
    {
        overrideOnLivingUpdateInferiors = as;
    }

    public void setAfterOnLivingUpdateSuperiors(String as[])
    {
        afterOnLivingUpdateSuperiors = as;
    }

    public void setAfterOnLivingUpdateInferiors(String as[])
    {
        afterOnLivingUpdateInferiors = as;
    }

    public String[] getBeforeOnKillEntitySuperiors()
    {
        return beforeOnKillEntitySuperiors;
    }

    public String[] getBeforeOnKillEntityInferiors()
    {
        return beforeOnKillEntityInferiors;
    }

    public String[] getOverrideOnKillEntitySuperiors()
    {
        return overrideOnKillEntitySuperiors;
    }

    public String[] getOverrideOnKillEntityInferiors()
    {
        return overrideOnKillEntityInferiors;
    }

    public String[] getAfterOnKillEntitySuperiors()
    {
        return afterOnKillEntitySuperiors;
    }

    public String[] getAfterOnKillEntityInferiors()
    {
        return afterOnKillEntityInferiors;
    }

    public void setBeforeOnKillEntitySuperiors(String as[])
    {
        beforeOnKillEntitySuperiors = as;
    }

    public void setBeforeOnKillEntityInferiors(String as[])
    {
        beforeOnKillEntityInferiors = as;
    }

    public void setOverrideOnKillEntitySuperiors(String as[])
    {
        overrideOnKillEntitySuperiors = as;
    }

    public void setOverrideOnKillEntityInferiors(String as[])
    {
        overrideOnKillEntityInferiors = as;
    }

    public void setAfterOnKillEntitySuperiors(String as[])
    {
        afterOnKillEntitySuperiors = as;
    }

    public void setAfterOnKillEntityInferiors(String as[])
    {
        afterOnKillEntityInferiors = as;
    }

    public String[] getBeforeOnUpdateSuperiors()
    {
        return beforeOnUpdateSuperiors;
    }

    public String[] getBeforeOnUpdateInferiors()
    {
        return beforeOnUpdateInferiors;
    }

    public String[] getOverrideOnUpdateSuperiors()
    {
        return overrideOnUpdateSuperiors;
    }

    public String[] getOverrideOnUpdateInferiors()
    {
        return overrideOnUpdateInferiors;
    }

    public String[] getAfterOnUpdateSuperiors()
    {
        return afterOnUpdateSuperiors;
    }

    public String[] getAfterOnUpdateInferiors()
    {
        return afterOnUpdateInferiors;
    }

    public void setBeforeOnUpdateSuperiors(String as[])
    {
        beforeOnUpdateSuperiors = as;
    }

    public void setBeforeOnUpdateInferiors(String as[])
    {
        beforeOnUpdateInferiors = as;
    }

    public void setOverrideOnUpdateSuperiors(String as[])
    {
        overrideOnUpdateSuperiors = as;
    }

    public void setOverrideOnUpdateInferiors(String as[])
    {
        overrideOnUpdateInferiors = as;
    }

    public void setAfterOnUpdateSuperiors(String as[])
    {
        afterOnUpdateSuperiors = as;
    }

    public void setAfterOnUpdateInferiors(String as[])
    {
        afterOnUpdateInferiors = as;
    }

    public String[] getBeforePushOutOfBlocksSuperiors()
    {
        return beforePushOutOfBlocksSuperiors;
    }

    public String[] getBeforePushOutOfBlocksInferiors()
    {
        return beforePushOutOfBlocksInferiors;
    }

    public String[] getOverridePushOutOfBlocksSuperiors()
    {
        return overridePushOutOfBlocksSuperiors;
    }

    public String[] getOverridePushOutOfBlocksInferiors()
    {
        return overridePushOutOfBlocksInferiors;
    }

    public String[] getAfterPushOutOfBlocksSuperiors()
    {
        return afterPushOutOfBlocksSuperiors;
    }

    public String[] getAfterPushOutOfBlocksInferiors()
    {
        return afterPushOutOfBlocksInferiors;
    }

    public void setBeforePushOutOfBlocksSuperiors(String as[])
    {
        beforePushOutOfBlocksSuperiors = as;
    }

    public void setBeforePushOutOfBlocksInferiors(String as[])
    {
        beforePushOutOfBlocksInferiors = as;
    }

    public void setOverridePushOutOfBlocksSuperiors(String as[])
    {
        overridePushOutOfBlocksSuperiors = as;
    }

    public void setOverridePushOutOfBlocksInferiors(String as[])
    {
        overridePushOutOfBlocksInferiors = as;
    }

    public void setAfterPushOutOfBlocksSuperiors(String as[])
    {
        afterPushOutOfBlocksSuperiors = as;
    }

    public void setAfterPushOutOfBlocksInferiors(String as[])
    {
        afterPushOutOfBlocksInferiors = as;
    }

    public String[] getBeforeRayTraceSuperiors()
    {
        return beforeRayTraceSuperiors;
    }

    public String[] getBeforeRayTraceInferiors()
    {
        return beforeRayTraceInferiors;
    }

    public String[] getOverrideRayTraceSuperiors()
    {
        return overrideRayTraceSuperiors;
    }

    public String[] getOverrideRayTraceInferiors()
    {
        return overrideRayTraceInferiors;
    }

    public String[] getAfterRayTraceSuperiors()
    {
        return afterRayTraceSuperiors;
    }

    public String[] getAfterRayTraceInferiors()
    {
        return afterRayTraceInferiors;
    }

    public void setBeforeRayTraceSuperiors(String as[])
    {
        beforeRayTraceSuperiors = as;
    }

    public void setBeforeRayTraceInferiors(String as[])
    {
        beforeRayTraceInferiors = as;
    }

    public void setOverrideRayTraceSuperiors(String as[])
    {
        overrideRayTraceSuperiors = as;
    }

    public void setOverrideRayTraceInferiors(String as[])
    {
        overrideRayTraceInferiors = as;
    }

    public void setAfterRayTraceSuperiors(String as[])
    {
        afterRayTraceSuperiors = as;
    }

    public void setAfterRayTraceInferiors(String as[])
    {
        afterRayTraceInferiors = as;
    }

    public String[] getBeforeReadEntityFromNBTSuperiors()
    {
        return beforeReadEntityFromNBTSuperiors;
    }

    public String[] getBeforeReadEntityFromNBTInferiors()
    {
        return beforeReadEntityFromNBTInferiors;
    }

    public String[] getOverrideReadEntityFromNBTSuperiors()
    {
        return overrideReadEntityFromNBTSuperiors;
    }

    public String[] getOverrideReadEntityFromNBTInferiors()
    {
        return overrideReadEntityFromNBTInferiors;
    }

    public String[] getAfterReadEntityFromNBTSuperiors()
    {
        return afterReadEntityFromNBTSuperiors;
    }

    public String[] getAfterReadEntityFromNBTInferiors()
    {
        return afterReadEntityFromNBTInferiors;
    }

    public void setBeforeReadEntityFromNBTSuperiors(String as[])
    {
        beforeReadEntityFromNBTSuperiors = as;
    }

    public void setBeforeReadEntityFromNBTInferiors(String as[])
    {
        beforeReadEntityFromNBTInferiors = as;
    }

    public void setOverrideReadEntityFromNBTSuperiors(String as[])
    {
        overrideReadEntityFromNBTSuperiors = as;
    }

    public void setOverrideReadEntityFromNBTInferiors(String as[])
    {
        overrideReadEntityFromNBTInferiors = as;
    }

    public void setAfterReadEntityFromNBTSuperiors(String as[])
    {
        afterReadEntityFromNBTSuperiors = as;
    }

    public void setAfterReadEntityFromNBTInferiors(String as[])
    {
        afterReadEntityFromNBTInferiors = as;
    }

    public String[] getBeforeRespawnPlayerSuperiors()
    {
        return beforeRespawnPlayerSuperiors;
    }

    public String[] getBeforeRespawnPlayerInferiors()
    {
        return beforeRespawnPlayerInferiors;
    }

    public String[] getOverrideRespawnPlayerSuperiors()
    {
        return overrideRespawnPlayerSuperiors;
    }

    public String[] getOverrideRespawnPlayerInferiors()
    {
        return overrideRespawnPlayerInferiors;
    }

    public String[] getAfterRespawnPlayerSuperiors()
    {
        return afterRespawnPlayerSuperiors;
    }

    public String[] getAfterRespawnPlayerInferiors()
    {
        return afterRespawnPlayerInferiors;
    }

    public void setBeforeRespawnPlayerSuperiors(String as[])
    {
        beforeRespawnPlayerSuperiors = as;
    }

    public void setBeforeRespawnPlayerInferiors(String as[])
    {
        beforeRespawnPlayerInferiors = as;
    }

    public void setOverrideRespawnPlayerSuperiors(String as[])
    {
        overrideRespawnPlayerSuperiors = as;
    }

    public void setOverrideRespawnPlayerInferiors(String as[])
    {
        overrideRespawnPlayerInferiors = as;
    }

    public void setAfterRespawnPlayerSuperiors(String as[])
    {
        afterRespawnPlayerSuperiors = as;
    }

    public void setAfterRespawnPlayerInferiors(String as[])
    {
        afterRespawnPlayerInferiors = as;
    }

    public String[] getBeforeSendChatMessageSuperiors()
    {
        return beforeSendChatMessageSuperiors;
    }

    public String[] getBeforeSendChatMessageInferiors()
    {
        return beforeSendChatMessageInferiors;
    }

    public String[] getOverrideSendChatMessageSuperiors()
    {
        return overrideSendChatMessageSuperiors;
    }

    public String[] getOverrideSendChatMessageInferiors()
    {
        return overrideSendChatMessageInferiors;
    }

    public String[] getAfterSendChatMessageSuperiors()
    {
        return afterSendChatMessageSuperiors;
    }

    public String[] getAfterSendChatMessageInferiors()
    {
        return afterSendChatMessageInferiors;
    }

    public void setBeforeSendChatMessageSuperiors(String as[])
    {
        beforeSendChatMessageSuperiors = as;
    }

    public void setBeforeSendChatMessageInferiors(String as[])
    {
        beforeSendChatMessageInferiors = as;
    }

    public void setOverrideSendChatMessageSuperiors(String as[])
    {
        overrideSendChatMessageSuperiors = as;
    }

    public void setOverrideSendChatMessageInferiors(String as[])
    {
        overrideSendChatMessageInferiors = as;
    }

    public void setAfterSendChatMessageSuperiors(String as[])
    {
        afterSendChatMessageSuperiors = as;
    }

    public void setAfterSendChatMessageInferiors(String as[])
    {
        afterSendChatMessageInferiors = as;
    }

    public String[] getBeforeSetDeadSuperiors()
    {
        return beforeSetDeadSuperiors;
    }

    public String[] getBeforeSetDeadInferiors()
    {
        return beforeSetDeadInferiors;
    }

    public String[] getOverrideSetDeadSuperiors()
    {
        return overrideSetDeadSuperiors;
    }

    public String[] getOverrideSetDeadInferiors()
    {
        return overrideSetDeadInferiors;
    }

    public String[] getAfterSetDeadSuperiors()
    {
        return afterSetDeadSuperiors;
    }

    public String[] getAfterSetDeadInferiors()
    {
        return afterSetDeadInferiors;
    }

    public void setBeforeSetDeadSuperiors(String as[])
    {
        beforeSetDeadSuperiors = as;
    }

    public void setBeforeSetDeadInferiors(String as[])
    {
        beforeSetDeadInferiors = as;
    }

    public void setOverrideSetDeadSuperiors(String as[])
    {
        overrideSetDeadSuperiors = as;
    }

    public void setOverrideSetDeadInferiors(String as[])
    {
        overrideSetDeadInferiors = as;
    }

    public void setAfterSetDeadSuperiors(String as[])
    {
        afterSetDeadSuperiors = as;
    }

    public void setAfterSetDeadInferiors(String as[])
    {
        afterSetDeadInferiors = as;
    }

    public String[] getBeforeSetPositionAndRotationSuperiors()
    {
        return beforeSetPositionAndRotationSuperiors;
    }

    public String[] getBeforeSetPositionAndRotationInferiors()
    {
        return beforeSetPositionAndRotationInferiors;
    }

    public String[] getOverrideSetPositionAndRotationSuperiors()
    {
        return overrideSetPositionAndRotationSuperiors;
    }

    public String[] getOverrideSetPositionAndRotationInferiors()
    {
        return overrideSetPositionAndRotationInferiors;
    }

    public String[] getAfterSetPositionAndRotationSuperiors()
    {
        return afterSetPositionAndRotationSuperiors;
    }

    public String[] getAfterSetPositionAndRotationInferiors()
    {
        return afterSetPositionAndRotationInferiors;
    }

    public void setBeforeSetPositionAndRotationSuperiors(String as[])
    {
        beforeSetPositionAndRotationSuperiors = as;
    }

    public void setBeforeSetPositionAndRotationInferiors(String as[])
    {
        beforeSetPositionAndRotationInferiors = as;
    }

    public void setOverrideSetPositionAndRotationSuperiors(String as[])
    {
        overrideSetPositionAndRotationSuperiors = as;
    }

    public void setOverrideSetPositionAndRotationInferiors(String as[])
    {
        overrideSetPositionAndRotationInferiors = as;
    }

    public void setAfterSetPositionAndRotationSuperiors(String as[])
    {
        afterSetPositionAndRotationSuperiors = as;
    }

    public void setAfterSetPositionAndRotationInferiors(String as[])
    {
        afterSetPositionAndRotationInferiors = as;
    }

    public String[] getBeforeSleepInBedAtSuperiors()
    {
        return beforeSleepInBedAtSuperiors;
    }

    public String[] getBeforeSleepInBedAtInferiors()
    {
        return beforeSleepInBedAtInferiors;
    }

    public String[] getOverrideSleepInBedAtSuperiors()
    {
        return overrideSleepInBedAtSuperiors;
    }

    public String[] getOverrideSleepInBedAtInferiors()
    {
        return overrideSleepInBedAtInferiors;
    }

    public String[] getAfterSleepInBedAtSuperiors()
    {
        return afterSleepInBedAtSuperiors;
    }

    public String[] getAfterSleepInBedAtInferiors()
    {
        return afterSleepInBedAtInferiors;
    }

    public void setBeforeSleepInBedAtSuperiors(String as[])
    {
        beforeSleepInBedAtSuperiors = as;
    }

    public void setBeforeSleepInBedAtInferiors(String as[])
    {
        beforeSleepInBedAtInferiors = as;
    }

    public void setOverrideSleepInBedAtSuperiors(String as[])
    {
        overrideSleepInBedAtSuperiors = as;
    }

    public void setOverrideSleepInBedAtInferiors(String as[])
    {
        overrideSleepInBedAtInferiors = as;
    }

    public void setAfterSleepInBedAtSuperiors(String as[])
    {
        afterSleepInBedAtSuperiors = as;
    }

    public void setAfterSleepInBedAtInferiors(String as[])
    {
        afterSleepInBedAtInferiors = as;
    }

    public String[] getBeforeSwingItemSuperiors()
    {
        return beforeSwingItemSuperiors;
    }

    public String[] getBeforeSwingItemInferiors()
    {
        return beforeSwingItemInferiors;
    }

    public String[] getOverrideSwingItemSuperiors()
    {
        return overrideSwingItemSuperiors;
    }

    public String[] getOverrideSwingItemInferiors()
    {
        return overrideSwingItemInferiors;
    }

    public String[] getAfterSwingItemSuperiors()
    {
        return afterSwingItemSuperiors;
    }

    public String[] getAfterSwingItemInferiors()
    {
        return afterSwingItemInferiors;
    }

    public void setBeforeSwingItemSuperiors(String as[])
    {
        beforeSwingItemSuperiors = as;
    }

    public void setBeforeSwingItemInferiors(String as[])
    {
        beforeSwingItemInferiors = as;
    }

    public void setOverrideSwingItemSuperiors(String as[])
    {
        overrideSwingItemSuperiors = as;
    }

    public void setOverrideSwingItemInferiors(String as[])
    {
        overrideSwingItemInferiors = as;
    }

    public void setAfterSwingItemSuperiors(String as[])
    {
        afterSwingItemSuperiors = as;
    }

    public void setAfterSwingItemInferiors(String as[])
    {
        afterSwingItemInferiors = as;
    }

    public String[] getBeforeUpdateEntityActionStateSuperiors()
    {
        return beforeUpdateEntityActionStateSuperiors;
    }

    public String[] getBeforeUpdateEntityActionStateInferiors()
    {
        return beforeUpdateEntityActionStateInferiors;
    }

    public String[] getOverrideUpdateEntityActionStateSuperiors()
    {
        return overrideUpdateEntityActionStateSuperiors;
    }

    public String[] getOverrideUpdateEntityActionStateInferiors()
    {
        return overrideUpdateEntityActionStateInferiors;
    }

    public String[] getAfterUpdateEntityActionStateSuperiors()
    {
        return afterUpdateEntityActionStateSuperiors;
    }

    public String[] getAfterUpdateEntityActionStateInferiors()
    {
        return afterUpdateEntityActionStateInferiors;
    }

    public void setBeforeUpdateEntityActionStateSuperiors(String as[])
    {
        beforeUpdateEntityActionStateSuperiors = as;
    }

    public void setBeforeUpdateEntityActionStateInferiors(String as[])
    {
        beforeUpdateEntityActionStateInferiors = as;
    }

    public void setOverrideUpdateEntityActionStateSuperiors(String as[])
    {
        overrideUpdateEntityActionStateSuperiors = as;
    }

    public void setOverrideUpdateEntityActionStateInferiors(String as[])
    {
        overrideUpdateEntityActionStateInferiors = as;
    }

    public void setAfterUpdateEntityActionStateSuperiors(String as[])
    {
        afterUpdateEntityActionStateSuperiors = as;
    }

    public void setAfterUpdateEntityActionStateInferiors(String as[])
    {
        afterUpdateEntityActionStateInferiors = as;
    }

    public String[] getBeforeWriteEntityToNBTSuperiors()
    {
        return beforeWriteEntityToNBTSuperiors;
    }

    public String[] getBeforeWriteEntityToNBTInferiors()
    {
        return beforeWriteEntityToNBTInferiors;
    }

    public String[] getOverrideWriteEntityToNBTSuperiors()
    {
        return overrideWriteEntityToNBTSuperiors;
    }

    public String[] getOverrideWriteEntityToNBTInferiors()
    {
        return overrideWriteEntityToNBTInferiors;
    }

    public String[] getAfterWriteEntityToNBTSuperiors()
    {
        return afterWriteEntityToNBTSuperiors;
    }

    public String[] getAfterWriteEntityToNBTInferiors()
    {
        return afterWriteEntityToNBTInferiors;
    }

    public void setBeforeWriteEntityToNBTSuperiors(String as[])
    {
        beforeWriteEntityToNBTSuperiors = as;
    }

    public void setBeforeWriteEntityToNBTInferiors(String as[])
    {
        beforeWriteEntityToNBTInferiors = as;
    }

    public void setOverrideWriteEntityToNBTSuperiors(String as[])
    {
        overrideWriteEntityToNBTSuperiors = as;
    }

    public void setOverrideWriteEntityToNBTInferiors(String as[])
    {
        overrideWriteEntityToNBTInferiors = as;
    }

    public void setAfterWriteEntityToNBTSuperiors(String as[])
    {
        afterWriteEntityToNBTSuperiors = as;
    }

    public void setAfterWriteEntityToNBTInferiors(String as[])
    {
        afterWriteEntityToNBTInferiors = as;
    }
}
