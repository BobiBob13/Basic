import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String destination = scan.nextLine();

        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scan.nextLine());
            double needMoney = 0;
            while (needMoney < budget) {
                double savedMoney = Double.parseDouble(scan.nextLine());
                needMoney += savedMoney;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scan.nextLine();
        }

    }
}
