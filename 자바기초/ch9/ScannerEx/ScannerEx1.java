package 자바기초.ch9.ScannerEx;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] argArr = null;

        while (true) {
            String prompt = ">>";
            System.out.println(prompt);

            String input = scanner.nextLine();

            input = input.trim();
            argArr = input.split(" +");

            String command = argArr[0].trim();

            if ("".equals(command))
                continue;

            command = command.toLowerCase();

            if (command.equals("q")) {
                System.exit(0);
            } else {
                for (int i = 0; i < argArr.length; i++) {
                    System.out.println(argArr[i]);
                }
            }
        }
    }
}
