import java.util.Scanner;
class LeapYearCheck {
    static boolean isLeapYear(int year) {
        if(year%100 == 0) {
            if(year%400 == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if(year%4 == 0) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    static void displayResult(int year) {
        if(isLeapYear(year)) {
            System.out.printf("Year: %d is a leap year.", year);
        }
        else {
            System.out.printf("Year: %d is NOT leap year.", year);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the year: ");
        int year = scanner.nextInt();

        LeapYearCheck.displayResult(year);

        scanner.close();
    }
}
