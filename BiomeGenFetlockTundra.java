package net.minecraft.src;

public class BiomeGenFetlockTundra extends BiomeGenBase{
	public BiomeGenFetlockTundra(int i){
		super(i);
		this.maxHeight = 0.5F;
		this.minHeight = -1F;
		this.temperature = -10F;
		this.topBlock = (byte)Block.blockSnow.blockID;
		this.fillerBlock = (byte)Block.ice.blockID;
		this.biomeDecorator.treesPerChunk = -999;
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.setColor(0xFF00FF);
	}
}
