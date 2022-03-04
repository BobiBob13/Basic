import java.util.Scanner;

public class clock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for ( int hours = 0 ; hours <=23 ; hours++) {
            for (int minute = 0;minute<=59;minute++){
                System.out.printf("%d:%d%n",hours,minute );
            }

        }

    }

}
