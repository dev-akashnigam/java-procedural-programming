import java.util.Scanner;

class LCM {
    static int findLCM(int firstNumber, int secondNumber) {
        int largerNum;
        int smallerNum;
        if(firstNumber > secondNumber) {
            largerNum = firstNumber;
            smallerNum = secondNumber;
        }
        else {
            largerNum = secondNumber;
            smallerNum = firstNumber;
        }

        int lcm;
        for(int i=1; ; i++) {
            if((largerNum*i)%smallerNum==0) {
                lcm = largerNum*i;
                break;
            }
        }
        return lcm;
    }

    static void displayResult(int firstNumber, int secondNumber) {
        System.out.printf("LCM of %d and %d = %d", firstNumber, secondNumber, findLCM(firstNumber, secondNumber));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int secondNum = scanner.nextInt();

        displayResult(firstNum, secondNum);

        scanner.close();
    }
}
