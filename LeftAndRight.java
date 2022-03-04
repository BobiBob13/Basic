import java.util.Scanner;

public class LeftAndRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sumLeft = 0;
        int sumRight = 0;


        for (int i = 1; i <= n; i++) {
            int leftNumber = Integer.parseInt(scan.nextLine());

            sumLeft += leftNumber;

        }
        for (int i = 1; i <= n; i++) {
            int rightNumber = Integer.parseInt(scan.nextLine());
            sumRight += rightNumber;

        }
        if (sumLeft == sumRight) {
            System.out.println("Yes, sum = " + sumRight);
        } else {
            int result = Math.abs(sumLeft - sumRight);
            System.out.println("No, diff = " + result);
        }

    }
}
