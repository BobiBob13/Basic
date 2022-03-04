import java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flower = scan.nextLine();
        int countFlower = Integer.parseInt(scan.nextLine());
        int budger = Integer.parseInt(scan.nextLine());
        double price = 0;
        double leftMoney = 0;
        double needMoney = 0;

        switch (flower) {
            case "Roses":
                price = countFlower * 5;
                if (countFlower > 80) {
                    price = price - price * 0.10;
                }
                break;

            case "Dahlias":
                price = countFlower * 3.80;
                if (countFlower > 90) {
                    price = price - price * 0.15;
                }
                break;
            case "Tulips":
                price = countFlower * 2.80;
                if (countFlower > 80) {
                    price = price - price * 0.15;
                }
                break;
            case "Narcissus":
                price = countFlower * 3;
                if (countFlower < 120) {
                    price = price + price * 0.15;
                }
                break;
            case "Gladiolus":
                price = countFlower * 2.50;
                if (countFlower < 80) {
                    price = price + price * 0.20;
                }
                break;
        }
        if (budger >= price) {
            leftMoney = budger - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlower, flower, leftMoney);
        } else {
            needMoney = price - budger;
            System.out.printf("Not enough money, you need %.2f leva more.", needMoney);
        }

    }
}

