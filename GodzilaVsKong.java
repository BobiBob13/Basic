import java.util.Scanner;

public class GodzilaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int countOfStatist = Integer.parseInt(scan.nextLine());
        double priceForClothes = Double.parseDouble(scan.next());

        double sumForDekor = 0.10 * budget;
        double sumForClothes = countOfStatist * priceForClothes;

        if (countOfStatist > 150) {
            sumForClothes = sumForClothes - (sumForClothes * 0.10) ;
            }
            double expensive = sumForDekor + sumForClothes;
            double moneyLeft = budget - expensive;
            if ( expensive <= budget){
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left." , moneyLeft);

            }else if (expensive > budget){

                System.out.println("Not enough money!");
               double needMoney = expensive - budget;
                System.out.printf("Wingard needs %.2f leva more.", needMoney);
            }

    }
    }

