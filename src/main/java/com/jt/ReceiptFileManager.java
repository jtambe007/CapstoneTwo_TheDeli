package com.jt;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ReceiptFileManager {
    public void writeReceiptToFile(String receipt) throws IOException {
        try (FileWriter writer = new FileWriter("./src/main/java/receipts")) {
//            writer.write(DeliDisplay);
        } catch (IOException e) {
            System.out.println("Printing receipt unsuccessful");
            e.printStackTrace();
        }
    }

    public String customReceiptFile() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
        Date date = new Date();
        return dateFormat.format(date) + ".txt";
    }
}