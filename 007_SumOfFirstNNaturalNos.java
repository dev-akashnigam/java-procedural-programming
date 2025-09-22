import java.util.Scanner;;
class SumOfFirstNNaturalNos {
    static int calcSum(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the Natural Number till where sum is required: ");
        int natNum = scanner.nextInt();

        System.out.printf("Sum of first %d natural numbers = %d", natNum, calcSum((natNum)));

        scanner.close();
    }
}
