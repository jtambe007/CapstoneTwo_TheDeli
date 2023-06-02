package com.jt;

import java.io.IOException;
import java.util.ArrayList;
public class Order {
    private static ArrayList<Product> productList;
    public static ArrayList<Product> getProductList() {
        return productList;
    }

    public Order() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void getReceipt() throws IOException {
        ReceiptFileManager receiptFileManager = new ReceiptFileManager();
        receiptFileManager.writeReceiptToFile(productList.toString());
    }

    @Override
    public String toString() {
        return "Order{" + productList + '}' + "\n";
    }




}


