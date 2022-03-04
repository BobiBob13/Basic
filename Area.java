import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shape = scan.nextLine();

        double sum = 0;
        if (shape.equals("square")) {
            double a = Double.parseDouble(scan.nextLine());
            sum = a * a;
            System.out.printf("%.3f", sum);
        } else if (shape.equals("rectangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            sum = a * b;
            System.out.printf("%.3f", sum);
        } else if (shape.equals("circle")) {
            double radius = Double.parseDouble(scan.nextLine());
            sum = radius * radius * Math.PI;
            System.out.printf("%.3f", sum);
        } else if (shape.equals("triangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double ha = Double.parseDouble(scan.nextLine());
            sum = a * ha / 2;
            System.out.printf("%.3f", sum);
        }
    }

}



