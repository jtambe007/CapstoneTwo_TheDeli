package com.jt;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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





//        public void writeReceiptToFile(ArrayList<Product> productArrayList) throws IOException {
//            FileWriter writer = null;
//            try {
////            addDateTimeToReceipt();
//                writer = new FileWriter("./src/main/java/receipts");
//                for (Order order: productArrayList) {
//                    writer.write("Receipt"+ order.getProductList() );
//                }
//            } finally {
//                if (writer != null) {
//                    writer.close();
//                }
//            }
//        }
        // Original receipt filewriter
//    public void writeReceiptToFile(String receiptData, String fileName) throws IOException {
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter(fileName);
//            writer.write(receiptData);
//        } finally {
//            if (writer != null) {
//                writer.close();
//            }
//        }
//    }

//        public String addDateTimeToReceipt(String receiptData) {
//            LocalDateTime currentDateTime = LocalDateTime.now();
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//            String formattedDateTime = currentDateTime.format(formatter);
//            return formattedDateTime + "    " + receiptData;
//        }


}
