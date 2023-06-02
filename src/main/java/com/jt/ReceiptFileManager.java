package com.jt;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReceiptFileManager {
    public void writeReceiptToFile(String receipt) throws IOException {

        try {
            // Generate a unique file name using the current timestamp
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timestamp = dateFormat.format(new Date());
            String fileName = "receipt_" + timestamp + ".txt";

            FileOutputStream writeReceipt = new FileOutputStream(fileName);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeReceipt);
            writeStream.writeObject(Order.getProductList());
            writeStream.flush();
            writeStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}