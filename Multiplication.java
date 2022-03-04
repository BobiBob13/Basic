import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int number =1 ;number<=10;number++){
            for (int numberTwo =1 ;numberTwo<=10;numberTwo++){
                int result = number * numberTwo;
                System.out.printf("%d * %d = %d%n",number,numberTwo,result);
            }
        }

    }
}
