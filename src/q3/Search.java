package q3;

import java.io.File;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
       String file1 = "C:/Users/HP/Desktop/report.txt";
        String file2 = "C:/Users/HP/Desktop/address.txt";

       try {
           Scanner in1 = new Scanner(new File(file1));
           while (in1.hasNextLine()) {
               String result = in1.nextLine();
               System.out.println("report.txt: " + result);
           }
           Scanner in2 = new Scanner(new File(file2));
           while (in2.hasNextLine()) {
               String result = in2.nextLine();
               System.out.println("address.txt: " + result);
           }
       } catch (Exception e) {
           throw new RuntimeException(e);
       }

    }
}
