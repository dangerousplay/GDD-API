package discord.gdd.customentity.Type;

import java.lang.reflect.Field;

import discord.gdd.Main;
import discord.gdd.customentity.MobBase;
import discord.gdd.customentity.MobUtils;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.util.UnsafeList;

import net.minecraft.server.v1_8_R3.EntitySkeleton;
import net.minecraft.server.v1_8_R3.PathfinderGoalSelector;
import net.minecraft.server.v1_8_R3.World;

public class CustomEntitySkeleton extends EntitySkeleton implements MobBase{

	public CustomEntitySkeleton(World world) {
		super(world);
	}

	public CustomEntitySkeleton(World world, MobUtils.TipoDeInteligencia tipo){
		super(world);
		Main.getMobUtils().setarPathfinder(this,goalSelector,targetSelector,tipo);
	}
	
}
