package 자바기초.ch9.ScannerEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("data3.txt"));
        int cnt = 0;
        int totalSum = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Scanner scanner2 = new Scanner(line).useDelimiter(",");
            int sum = 0;

            while (scanner2.hasNextInt()) {
                sum += scanner2.nextInt();
            }
            System.out.println(line + ", sum = " + sum);
            totalSum += sum;
            cnt++;
            scanner2.close();
        }
        scanner.close();
        System.out.println("Line: " + cnt + ", Total: " + totalSum);
    }
}
