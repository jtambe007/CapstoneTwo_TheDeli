package com.jt;

public class Drink extends Product{
    private String flavor;
    private int drinkOption;
    private String drinkSize;

    public Drink(float price, int quantity, String drinkSize, String flavor) {
        super(price, quantity);
        if(drinkOption == 1){ // option for Sm. Drink
            setPrice(2.00f);
        } else if(drinkOption == 2){ // option for Med. Drink
            setPrice(2.50f);
        } else if(drinkOption == 3){ // option for Lrg. Drink
            setPrice(3.00f);
        }
        this.flavor = flavor;

    }

//    @Override
//    public void setPrice(float price) {
//        if(getSize() == 1){ // option for Sm. Drink
//            price = 2.00f;
//        } else if(getSize() == 2){ // option for Med. Drink
//            price = 2.50f;
//        } else if(getSize() == 3){ // option for Lrg. Drink
//            price = 3.00f;
//        }
//    }
}