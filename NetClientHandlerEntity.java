package net.minecraft.src;

public class NetClientHandlerEntity
{
    public Class entityClass;
    public boolean entityHasOwner;

    public NetClientHandlerEntity(Class class1, boolean flag)
    {
        entityClass = null;
        entityHasOwner = false;
        entityClass = class1;
        entityHasOwner = flag;
    }
}
