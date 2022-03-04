import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double sum = 0;

        double evenSum = 0;
        double evenMax = Integer.MIN_VALUE;
        double evenMin = Integer.MAX_VALUE;

        double oddSum = 0;
        double oddMax = Integer.MIN_VALUE;
        double oddMin = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scan.nextLine());

            if (i % 2 == 0) {
                evenSum += number;

                if (number > evenMax) {
                    evenMax = number;
                }
                if (number < evenMin) {
                    evenMin = number;
                }


            } else {
                oddSum += number;

                if (number > oddMax) {
                    oddMax = number;

                }
                if (number < oddMin) {
                    oddMin = number;
                }
            }

        }
        if (oddSum == 0) {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
        if (evenSum == 0) {
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f", evenMax);

        }

    }
}

