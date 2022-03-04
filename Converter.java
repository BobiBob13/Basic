import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double number = Double.parseDouble(scan.nextLine());
        String in = scan.nextLine();
        String out = scan.nextLine();

        if (in.equals("m") && (out.equals("cm"))) {
            double result = number * 100;
            System.out.printf("%.3f", result);
        } else if (in.equals("m") && (out.equals("mm"))) {
            double result = number * 1000;
            System.out.printf("%.3f", result);
        } else if (in.equals("cm") && (out.equals("m"))) {
            double result = number / 100;
            System.out.printf("%.3f", result);
        } else if (in.equals("cm") && (out.equals("mm"))) {
            double result = number * 10;
            System.out.printf("%.3f", result);
        } else if (in.equals("mm") && (out.equals("m"))) {
            double result = number / 1000;
            System.out.printf("%.3f", result);
        } else if (in.equals("mm") && (out.equals("cm"))){
            double result = number / 10;
            System.out.printf("%.3f", result);

        }

    }
}










