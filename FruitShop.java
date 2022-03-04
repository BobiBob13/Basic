import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String dayOfWeek = scan.nextLine();
        double count = Double.parseDouble(scan.nextLine());
        double result = 0.0;

        if ("Monday".equals(dayOfWeek) || "Tuesday".equals(dayOfWeek) || "Wednesday".equals(dayOfWeek) ||
                "Thursday".equals(dayOfWeek) || "Friday".equals(dayOfWeek)) {
            if ("banana".equals(fruit)) {
                result = count * 2.50;
                System.out.printf("%.2f",result);
            } else if ("apple".equals(fruit)) {
                result = count * 1.20;
                System.out.printf("%.2f",result);
            } else if ("orange".equals(fruit)) {
                result = count * 0.85;
                System.out.printf("%.2f",result);
            } else if ("grapefruit".equals(fruit)) {
                result = count * 1.45;
                System.out.printf("%.2f",result);
            } else if ("kiwi".equals(fruit)) {
                result = count * 2.70;
                System.out.printf("%.2f",result);
            } else if ("pineapple".equals(fruit)) {
                result = count * 5.50;
                System.out.printf("%.2f",result);
            } else if ("grapes".equals(fruit)) {
                result = count * 3.85;
                System.out.printf("%.2f",result);
            }else
                System.out.println("error");

        } else if ("Saturday".equals(dayOfWeek) || "Sunday".equals(dayOfWeek)) {
            if ("banana".equals(fruit)) {
                result = count * 2.70;
                System.out.printf("%.2f",result);
            } else if ("apple".equals(fruit)) {
                result = count * 1.25;
                System.out.printf("%.2f",result);
            } else if ("orange".equals(fruit)) {
                result = count * 0.90;
                System.out.printf("%.2f",result);
            } else if ("grapefruit".equals(fruit)) {
                result = count * 1.60;
                System.out.printf("%.2f",result);
            } else if ("kiwi".equals(fruit)) {
                result = count * 3.00;
                System.out.printf("%.2f",result);
            } else if ("pineapple".equals(fruit)) {
                result = count * 5.60;
                System.out.printf("%.2f",result);
            } else if ("grapes".equals(fruit)) {
                result = count * 4.20;
                System.out.printf("%.2f",result);
            }
        }else
            System.out.println("error");
    }

}

