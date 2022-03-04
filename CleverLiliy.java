import java.util.Scanner;

public class CleverLiliy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double moneyWash = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());

        int  saveMoney = 0;
        int numberOfToys = 0;
        int moneyForBirthday = 10;
        double leftMoney = 0;
        double needMoney = 0;
        for (int i = 1; i <= age; i++) {

            if (age % 2 == 0) {
                moneyForBirthday +=10;
                saveMoney += moneyForBirthday;
            } else  {
               numberOfToys+=1;
            }
        }
        saveMoney += toyPrice * numberOfToys;
        if (saveMoney >= moneyWash) {
            leftMoney = saveMoney - moneyWash;
            System.out.printf("Yes! %.2f ", leftMoney);

        } else {
             needMoney = moneyWash - saveMoney;
            System.out.printf("No! %.2f", needMoney);
        }
    }
}
