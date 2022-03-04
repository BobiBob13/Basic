import java.util.Scanner;

public class OutfitTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int degrees = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();
        String outfit = "";
        String shoes = "";


        if (day.equals("Morning")) {
            if (10 <= degrees && degrees <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (18 < degrees && degrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degrees >= 25) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
            System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
        }if (day.equals("Afternoon")) {
            if (10 <= degrees && degrees <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (18 < degrees && degrees <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (degrees >= 25) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
            System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
        }if (day.equals("Evening")) {
            if (10 <= degrees && degrees <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (18 < degrees && degrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degrees >= 25) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
        }
    }
}