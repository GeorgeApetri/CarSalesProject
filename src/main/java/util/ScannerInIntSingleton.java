package util;

import java.util.Scanner;

public enum ScannerInIntSingleton {

    INSTANCE_INT;

    private Scanner scanner;

    ScannerInIntSingleton() {
        scanner = new Scanner( System.in, "UTF-8" );
    }

    public int readIntInput() {
        return scanner.nextInt();
    }

}
