package io;

import java.util.Scanner;

public class DataReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getTextFromUser() {
        return scanner.nextLine();
    }

    public static int getIntFromUser() {
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
}
