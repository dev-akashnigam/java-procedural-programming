import java.util.Scanner;

class SolidSquarePattern {
    static void printSolidSquare(int rowCount) {
        for(int row=1; row<=rowCount; row++) {
            for(int col=1; col<=rowCount; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of rows in the square pattern: ");
        int number = scanner.nextInt();

        printSolidSquare(number);

        scanner.close();
    }
}
