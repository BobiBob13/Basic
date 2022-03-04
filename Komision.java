import java.util.Scanner;

public class Komision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String cityName = scan.nextLine();
        double countSales = Double.parseDouble(scan.nextLine());
        double result = 0.0;
        if ("Sofia".equals(cityName)) {
            if (0 <= countSales && countSales <= 500) {
                result = countSales * 0.05;
                System.out.printf("%.2f", result);
            } else if (500 < countSales && countSales <= 1000) {
                result = countSales * 0.07;
                System.out.printf("%.2f", result);
            } else if (1000 < countSales && countSales <= 10000) {
                result = countSales * 0.08;
                System.out.printf("%.2f", result);
            } else if (countSales > 10000) {
                result = countSales * 0.12;
                System.out.printf("%.2f", result);
            } else {
                System.out.println("error");
            }
        }
        if ("Varna".equals(cityName)) {
            if (0 <= countSales && countSales <= 500) {
                result = countSales * 0.045;
                System.out.printf("%.2f", result);
            } else if (500 < countSales && countSales <= 1000) {
                result = countSales * 0.075;
                System.out.printf("%.2f", result);
            } else if (1000 < countSales && countSales <= 10000) {
                result = countSales * 0.1;
                System.out.printf("%.2f", result);
            } else if (countSales > 10000) {
                result = countSales * 0.13;
                System.out.printf("%.2f", result);
            } else {
                System.out.println("error");
            }
        }
        if ("Plovdiv".equals(cityName)) {
            if (0 <= countSales && countSales <= 500) {
                result = countSales * 0.055;
                System.out.printf("%.2f", result);
            } else if (500 < countSales && countSales <= 1000) {
                result = countSales * 0.08;
                System.out.printf("%.2f", result);
            } else if (1000 < countSales && countSales <= 10000) {
                result = countSales * 0.12;
                System.out.printf("%.2f", result);
            } else if (countSales > 10000) {
                result = countSales * 0.145;
                System.out.printf("%.2f", result);
            } else {
                System.out.println("error");
            }
        }if (!"Plovdiv".equals(cityName) || !"Varna".equals(cityName) || !"Sofia".equals(cityName)){

        }

    }
}



