package com.jt;
import java.util.ArrayList;

public class Sandwich extends Product{
    private int sandSize;
    private String bread;
    private String meat;
    private String extraMeat;
    private String cheese;
    private String extraCheese;
    private String toppings;
    private String sauce;
    private String toasted;

    public Sandwich(int quantity, int sandSize, String bread, String meat, String extraMeat, String cheese
            , String extraCheese, ArrayList<String> toppings, String sauce, String toasted) {
        super(0, quantity);
        this.sandSize = sandSize;
        this.bread = bread;
        this.meat = meat;
        this.extraMeat = extraMeat;
        this.cheese = cheese;
        this.extraCheese = extraCheese;
        this.toppings = String.valueOf(toppings);
        this.sauce = sauce;
        this.toasted = toasted;
    }

    public int getSandSize() {
        return sandSize;
    }

    public void setSandSize(int sandSize) {
        this.sandSize = sandSize;
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
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
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

    public String toasted() {
        return toasted;
    }

    public void setToasted(String toasted) {
        toasted = toasted;
    }


    @Override
    public String toString() {
        return "Custom Sandwich: " + sandSize + "in. Sandwich,  "+
                "Bread Type=" + bread + "," + "\n" +
                "meat=" + meat +
                ", extraMeat= " + extraMeat +
                ", cheese= " + cheese +
                ", extraCheese=" + extraCheese + "\n" +
                ", toppings= " + toppings +
                ", sauce=" + sauce +
                ", toasted=" + toasted ;
    }
}
