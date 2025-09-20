import java.util.Scanner;

class EvenOrOdd {
    
    static void displayResult(int num) {
        if(num%2 == 0) {
            System.out.printf("Number: %d is even.", num);
        }
        else {
            System.out.printf("Number: %d is odd.", num);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        EvenOrOdd.displayResult(num);

        scanner.close();
    }   
}