package com.jt;

import java.util.ArrayList;

public class Sandwich extends Product {
    private String bread;
    private String meat;
    private String extraMeat;
    private String cheese;
    private String extraCheese;
    private String toppings;
    private String sauce;
    private String toasted;

    public Sandwich(float price, int quantity, String size, String bread, String meat, String extraMeat, String cheese
            , String extraCheese, ArrayList<String> toppings, String sauce, String toasted) {
        super(price, quantity, size);
        this.bread = bread;
        this.meat = meat;
        this.extraMeat = extraMeat;
        this.cheese = cheese;
        this.extraCheese = extraCheese;
        this.toppings = String.valueOf(toppings);
        this.sauce = sauce;
        this.toasted = toasted;
    }

    public static float getPrice() {
        float price;
        int size = Product.getSize();

        if (size.contains("4")) {
            price = 5.50f;
        } else if (size.contains("8")) {
            price = 7.00f;
        } else if (size.contains("12")) {
            price = 8.50f;
        } else {
            price = 0.0F;
        }
        return price;
    }


    @Override
    public void setPrice(float price) {
        if (getSize().contains("4")) {
            price += 5.50f;

        } else if (getSize().contains("8")) {
            price += 7.00f;
        } else if (getSize().contains("12")) {
            price += 8.50f;
        } else {
            System.out.println("Sorry. That is an invalid entry.");
        }
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(String extraMeat) {
        this.extraMeat = extraMeat;
    }

    public String getCheese() {
        return Cheese;
    }

    public void setCheese(String cheese) {
        Cheese = cheese;
    }

    public String getExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(String extraCheese) {
        this.extraCheese = extraCheese;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getToasted() {
            return toasted;
        }

        public void setToasted (String toasted){
            this.toasted = toasted;
        }
    }