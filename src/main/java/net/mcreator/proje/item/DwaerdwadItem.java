
package net.mcreator.proje.item;

@ProjeModElements.ModElement.Tag
public class DwaerdwadItem extends ProjeModElements.ModElement {

	@ObjectHolder("proje:dwaerdwad")
	public static final Item block = null;

	public DwaerdwadItem(ProjeModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {

		public MusicDiscItemCustom() {
			super(0, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.place")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("dwaerdwad");
		}

	}

}
