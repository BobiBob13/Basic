import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceAdventure = Double.parseDouble(scan.nextLine());
        int numberOfPuzzel = Integer.parseInt(scan.nextLine());
        int numberOfSpeakBarby = Integer.parseInt(scan.nextLine());
        int numberOfBear = Integer.parseInt(scan.nextLine());
        int numberOfMinions = Integer.parseInt(scan.nextLine());
        int numberOfTruck = Integer.parseInt(scan.nextLine());
        ;
        double discount = 0;

        double totalToysPrice = (numberOfPuzzel * 2.60) + (numberOfSpeakBarby * 3) + (numberOfBear * 4.10) + (numberOfMinions * 8.20)
                + (numberOfTruck * 2);
        //System.out.println(totalToysPrice);
        int numberOfToy = numberOfPuzzel + numberOfSpeakBarby + numberOfBear + numberOfMinions + numberOfTruck;
        //System.out.println(numberOfToy);

        if (numberOfToy >= 50) {
            discount = totalToysPrice * 0.25;
            //System.out.println(discount);
        }
        double finalSum = totalToysPrice - discount;
        //System.out.println(finalSum);
        double rent = finalSum * 0.10;
        //System.out.println(rent);

        double win = finalSum - rent;
        //System.out.println(win);

        if (win >= priceAdventure) {
            double left = win - priceAdventure;
            System.out.printf("Yes! %.2f lv left.", left);
        } else if (win <= priceAdventure) {
            double needMoney = priceAdventure - win;

            System.out.printf("Not enough money! %.2f lv needed.", needMoney);

        }


    }
}
