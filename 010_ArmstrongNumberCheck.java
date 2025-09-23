import java.util.Scanner;

class ArmstrongNumberCheck {

    static int findDigitsInNumber(int num) {
        int noOfDigits = 0;
        while(num!=0) {
            num = num / 10;
            noOfDigits++;
        }
        return noOfDigits;
    }

    static boolean isArmStrongNumber(int num) {
        int originalNumber = num;
        int totalDigits = findDigitsInNumber(num);

        int lastDigit;
        int sum = 0;
        while(num!=0) {
            lastDigit = num % 10;
            sum = sum + (int)Math.pow(lastDigit, totalDigits);

            num = num / 10;
        }

        return sum==originalNumber;
    }

    static void displayResult(int num) {
        if(isArmStrongNumber(num)) {
            System.out.printf("Number %d is an ARMSTRONG NUMBER.", num);
        }
        else {
            System.out.printf("Number %d is NOT ARMSTRONG NUMBER.", num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        displayResult(num);
        scanner.close();
    }
}