package com.jt;

import java.io.IOException;
import java.util.ArrayList;
public class Order {
    private ArrayList<Product> productList;
    public ArrayList<Product> getProductList() {
        return productList;
    }

    public Order() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                '}';
    }

//    public void printReceiptData() throws IOException {
//        ReceiptFileManager fileManager = new ReceiptFileManager();
//        fileManager.writeReceiptToFile(productList);
//    }


}


