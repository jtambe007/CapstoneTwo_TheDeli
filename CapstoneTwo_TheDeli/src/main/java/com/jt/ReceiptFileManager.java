package com.jt;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

    public String addDateTimeToReceipt(String receiptData) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime + "    " + receiptData;
    }
}