// Read a number and print its multiplication table.

import java.util.Scanner;

class PrintMultiplicationTable {
    static void printTable(int number) {
        for(int i=1; i<=10; i++) {
            System.out.printf("%d X %d = %d%n", number, i, number*i);
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        printTable(num);
        scanner.close();
    }
}
