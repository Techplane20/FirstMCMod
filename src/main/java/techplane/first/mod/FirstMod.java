package techplane.first.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FirstMod implements ModInitializer {
	//Item and Block instances
	public static final Item FIRST_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Block FIRST_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(5.0F, 5.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES));

	@Override
	public void onInitialize() {

		System.out.println("Hi!");
		Registry.register(Registry.ITEM, new Identifier("firstmod", "first_item"), FIRST_ITEM);
		Registry.register(Registry.BLOCK, new Identifier("firstmod", "first_block"), FIRST_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("firstmod", "first_block"), new BlockItem(FIRST_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
	}
}
