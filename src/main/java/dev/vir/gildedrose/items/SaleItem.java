package dev.vir.gildedrose.items;

public class SaleItem extends Item{
    public SaleItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        sellIn--;

        if (quality > 0) {
            quality -= (sellIn < 0) ? 2 : 1;
        }

        if (quality < 0) {
            quality = 0;
        }
    }
}
