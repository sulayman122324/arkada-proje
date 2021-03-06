
package net.mcreator.proje.item;

@ProjeModElements.ModElement.Tag
public class FvewwItem extends ProjeModElements.ModElement {

	@ObjectHolder("proje:fveww")
	public static final Item block = null;

	public FvewwItem(ProjeModElements instance) {
		super(instance, 2);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("fveww");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
