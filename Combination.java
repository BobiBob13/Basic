import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int validCounter = 0;
        for (int i = 0; i <= number; i++) {
            for (int x = 0; x <= number; x++) {
                for (int y = 0; y <= number; y++) {

                    if (i + x + y == number) {
                        validCounter++;
                    }
                }
            }

        }
        System.out.println(validCounter);
    }
}
