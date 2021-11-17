package StartBuzz.sizes;

import StartBuzz.Beverage;

public enum SoySize implements SizeCoffee{
    TALL(0.10f), GRANDE(0.15f), VENTI(0.20f);
    public final float price;
    SoySize(float price){
        this.price = price;
    }
    @Override
    public float getSize() {
        return price;
    }
}
