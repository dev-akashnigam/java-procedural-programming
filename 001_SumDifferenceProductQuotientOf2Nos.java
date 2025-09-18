// Read two numbers and print their sum, difference, product, and quotient.

import java.util.Scanner;
class SumDifferenceProductQuotientOf2Nos {

    static void printResult(int numX, int numY) {
        int sum = numX + numY;
        int diff = numX - numY;
        int product = numX * numY;
        int quotient = numX / numY;

        System.out.printf("Sum = %d%n", sum);
        System.out.printf("Difference = %d%n", diff);
        System.out.printf("Product = %d%n", product);
        System.out.printf("Quotient = %d%n", quotient);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int secondNum = scanner.nextInt();

        printResult(firstNum, secondNum);

        scanner.close();
    }
}
