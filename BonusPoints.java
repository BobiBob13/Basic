import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        double points = 0;

        if (number <= 100){
            points =  5 ;
        } else if (number > 1000){
            points = number * 0.10 ;
        }else    {
            points = number * 0.20;

        }if (number % 2 == 0){
            points = points + 1 ;
        }else  if (number % 10 == 5 ) {
            points = points + 2 ;

        }           System.out.println(points);
                    System.out.println(points + number);
    }
}
