package com.jt;
import java.io.FileWriter;
import java.io.IOException;
public class ReceiptFileManager {
    public void writeReceiptToFile(String receiptData, String fileName) throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName);
            writer.write(receiptData);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}