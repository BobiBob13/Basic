import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        String comannd = scan.nextLine();


        while (!comannd.equals("Stop")) {
            int number = Integer.parseInt(comannd);
            if (number < min) {
                min = number;
            }
            comannd = scan.nextLine();
        }
        System.out.println(min);

    }
}
