import java.util.Scanner;

public class RealNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            if (currentNumber < min) {
                min = currentNumber;
            }
            if (currentNumber > max){
                max=currentNumber;
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);


    }
}
