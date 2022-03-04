import java.util.Scanner;

public class Boat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int countFisher = Integer.parseInt(scan.nextLine());
        double price = 0;
        double discount = 0;

        if (season.equals("Spring")) {
            price = 3000;
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            price = 4200;
        } else if (season.equals("Winter")) {
            price = 2600;
        }
        if (countFisher <= 6) {
            price = price - price * 0.10;
        } else if ( countFisher <= 11) {
            price = price - price * 0.15;
        } else {
            price = price - price * 0.25;
        } if (countFisher % 2 == 0 && !season.equals("Autumn")){
            price = price - price * 0.5;
        }
        if (budget >= price) {
            double leftMoney = budget - price;
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        } else {
            double needMoney = price - budget;
            System.out.printf("Not enough money! You need %.2f leva.", needMoney);
        }

    }
}

