package net.minecraft.src;

public class EntityAISit extends EntityAIBase
{
    private EntityTameable theEntity;

    /** If the EntityTameable is sitting. */
    private boolean isSitting;

    public EntityAISit(EntityTameable par1EntityTameable)
    {
        isSitting = false;
        theEntity = par1EntityTameable;
        setMutexBits(5);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (!theEntity.isTamed())
        {
            return false;
        }

        if (theEntity.isInWater())
        {
            return false;
        }

        if (!theEntity.onGround)
        {
            return false;
        }

        EntityLiving entityliving = theEntity.getOwner();

        if (entityliving == null)
        {
            return true;
        }

        if (theEntity.getDistanceSqToEntity(entityliving) < 144D && entityliving.getAITarget() != null)
        {
            return false;
        }
        else
        {
            return isSitting;
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        theEntity.getNavigator().clearPathEntity();
        theEntity.setSitting(true);
    }

    /**
     * Resets the task
     */
    public void resetTask()
    {
        theEntity.setSitting(false);
    }

    /**
     * Sets the sitting flag.
     */
    public void setIsSitting(boolean par1)
    {
        isSitting = par1;
    }
}
