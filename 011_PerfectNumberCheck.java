import java.util.Scanner;

class PerfectNumberCheck {
    static boolean isPerfect(int num) {
        int halfNum = num / 2;
        int sumOfDivisors = 0;
        for(int i=1; i<=halfNum; i++) {
            if(num%i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors==num;
    }

    static void displayResult(int num) {
        if(isPerfect(num)) {
            System.out.printf("Number: %d is a PERFECT NUMBER.", num);
        }
        else {
            System.out.printf("Number: %d is NOT PERFECT NUMBER.", num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        displayResult(number);
        scanner.close();
    }
}