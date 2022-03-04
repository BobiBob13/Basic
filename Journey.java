import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        double price = 0;
        String destination = "";

        if (budget <= 100 && season.equals("summer")) {
            destination = "Camp";
            budget = budget * 0.30;
            System.out.printf("Somewhere in Bulgaria %n%s - %.2f", destination, budget);
        } else if (budget <= 100 && season.equals("winter")) {
            destination = "Hotel";
            budget = budget * 0.70;
            System.out.printf("Somewhere in Bulgaria %n%s - %.2f", destination, budget);
        }
        if ( budget > 100 && budget <= 1000 && season.equals("summer")) {
            destination = "Camp";
            budget = budget * 0.40;
            System.out.printf("Somewhere in Balkans %n%s - %.2f", destination, budget);
        } else if (budget > 100 && budget <= 1000 && season.equals("winter")) {
            destination = "Hotel";
            budget = budget * 0.80;
            System.out.printf("Somewhere in Balkans %n%s - %.2f", destination, budget);
        } else if (budget > 1000){
            destination = "Hotel";
            budget = budget * 0.90;
            System.out.printf("Somewhere in Europe %n%s - %.2f", destination, budget);
        }
    }


}

