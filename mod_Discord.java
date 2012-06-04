package net.minecraft.src;

public class mod_Discord extends BaseMod{
	
	public static final BiomeGenBase fetlocktundra = (new BiomeGenFetlockTundra(40)).setBiomeName("Fetlock Tundra").setEnableSnow();
	
	public void load(){
		ModLoader.addBiome(fetlocktundra);
	}
	
	public String getVersion(){
		return "Discord Alpha v0.0";
	}
	
}
