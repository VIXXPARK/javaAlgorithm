package 자바기초.ch9.ScannerEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("data.txt"));
        int sum = 0;
        int cnt = 0;

        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            cnt++;
        }
        System.out.println("sum=" + sum);
        System.out.println("average=" + (double) sum / cnt);
    }
}
