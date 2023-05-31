package com.jt;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SandwichTest {

    @org.junit.jupiter.api.Test
    void getPrice_Returns_Price() {
        //Arrange
        Product sandwich = new Sandwich(Sandwich.getPrice(), 1, "4in", "bread", "addMeat", "extraMeat", "cheese",
                "extraCheese",null, "sauce", "toasted");
        Product actual = sandwich = new Sandwich(5.50f, 1, "4in", "bread", "addMeat", "extraMeat", "cheese",
                "extraCheese",null, "sauce", "toasted");
        Product expected = sandwich = new Sandwich(Sandwich.getPrice(), 1, "4in", "bread", "addMeat", "extraMeat",
                "cheese",
                "extraCheese",null, "sauce", "toasted");
        //Assert
        Assertions.assertEquals(actual, expected);

    }
}