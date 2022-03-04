import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int numberTwo = Integer.parseInt(scan.nextLine());
        String symbol = scan.nextLine();
        double result = 0;
        switch (symbol) {
            case "+":
                result = number + numberTwo;
                if (result % 2 == 0) {
                    System.out.printf("%d + %d = %.0f - even", number, numberTwo, result);
                } else {
                    System.out.printf("%d + %d = %.0f - odd", number, numberTwo, result);
                }
                break;

            case "-":
                result = number - numberTwo;
                if (result % 2 == 0) {
                    System.out.printf("%d - %d = %.0f - even", number, numberTwo, result);
                } else {
                    System.out.printf("%d - %d = %.0f - odd", number, numberTwo, result);

                }

                break;
            case "*":
                result = number * numberTwo;
                if (result % 2 == 0) {
                    System.out.printf("%d * %d = %.0f - even", number, numberTwo, result);
                } else {
                    System.out.printf("%d * %d = %.0f - odd", number, numberTwo, result);

                }
                break;
            case "/":
                if (numberTwo == 0) {
                    System.out.printf("Cannot divide %d by zero", number);
                } else {
                    result = (number * 1.0) / numberTwo;
                    System.out.printf("%d / %d = %.2f ", number, numberTwo, result);

                }
                break;
            case "%":
                if (numberTwo == 0) {
                    System.out.printf("Cannot divide %d by zero", number);
                } else {
                    result = number % numberTwo;
                    System.out.printf("%d %% %d = %.0f", number, numberTwo, result);
                    break;
                }
        }
    }
}



