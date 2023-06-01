package com.jt;

public class Drink extends Product{
    private String flavor;
    private int drinkOption;
    private String drinkSize;

    public Drink(int quantity, String drinkSize, String flavor) {
        super(0, quantity);
        float drinkPrice = 0f;
        if(drinkOption == 1){ // option for Sm. Drink
           drinkPrice = 2.00f;
        } else if(drinkOption == 2){ // option for Med. Drink
           drinkPrice = 2.50f;
        } else if(drinkOption == 3){ // option for Lrg. Drink
           drinkPrice = 3.00f;
        }
        setPrice(drinkPrice);
        this.flavor = flavor;
        this.drinkSize = drinkSize;

    }

    @Override
    public float getPrice() {
        if (this.drinkSize.equalsIgnoreCase("small")) { // option for Sm. Drink
            return 2.00f;
        } else if (this.drinkSize.equalsIgnoreCase("medium")) { // option for Med. Drink
            return 2.50f;
        } else if (this.drinkSize.equalsIgnoreCase("large")) { // option for Lrg. Drink
            return 3.00f;
        } else {
            return 0;
        }
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "flavor='" + flavor + '\'' +
                ", drinkSize='" + drinkSize + '\'' +
                '}';
    }
}