import java.util.Scanner;

class ReverseNumber {
    static int getReversedNumber(int num) {
        int reversedNum = 0;
        int lastDigit;

        while(num!=0) {
            lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;

            num = num / 10;
        }

        return reversedNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        System.out.printf("Reversed Number of number %d = %d%n", num, getReversedNumber(num));

        scanner.close();
    }
}
