import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tipeProjection = scan.nextLine();
        int redove = Integer.parseInt(scan.nextLine());
        int koloni = Integer.parseInt(scan.nextLine());
        double price = 0;
        if ("Premiere".equals(tipeProjection)) {
            price = redove * koloni * 12;
            System.out.printf("%.2f",price);
        } else if ("Normal".equals(tipeProjection)) {
            price = redove * koloni * 7.50;
            System.out.printf("%.2f",price);
        } else if ("Discount".equals(tipeProjection)) {
            price = redove * koloni * 5;
            System.out.printf("%.2f",price);
        }


    }
}
