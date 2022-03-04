import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double needMoneyForTrip = Double.parseDouble(scan.nextLine());
        double ownedMoney = Double.parseDouble(scan.nextLine());

        int saveMoneyDays = 0;
        int spendCountDays = 0;

        while (ownedMoney < needMoneyForTrip && spendCountDays < 5) {
            String command = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            saveMoneyDays++;


            if ("save".equals(command)) {
                ownedMoney += money;
                spendCountDays = 0;
            } else if ("spend".equals(command)) {
                ownedMoney -= money;
                spendCountDays += 1;
                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }
            }
            if (spendCountDays == 5) {
                System.out.printf("You can't save the money.%n%.2d", saveMoneyDays);
            }
            if (ownedMoney >= needMoneyForTrip) {
                System.out.printf("You saved the money for %.2d days.", saveMoneyDays);
            }
        }
    }
}


