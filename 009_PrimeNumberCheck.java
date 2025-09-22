import java.util.Scanner;

class PrimeNumberCheck {
    static boolean isPrime(int number) {
        if(number<=1) {   
            return false;
        }
        else if(number == 2) { 
            return true;
        }
        else if(number%2 == 0) {
            return false;
        }
        else {
            int sqrt = (int)Math.sqrt(number);
            boolean isPrime = true;
            for(int i=3; i<=sqrt; i+=2) {
                if(number%i == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }
    }

    static void displayResult(int num) {
        if(isPrime(num)) {
            System.out.printf("Number %d is PRIME.%n", num);
        }
        else {
            System.out.printf("Number %d is NOT PRIME.%n", num);
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