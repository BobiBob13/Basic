import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startNumber = Integer.parseInt(scan.nextLine());
        int endNumber = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());
        int combination = 0;
        boolean weFoundIt=false;

        for (int i = startNumber; i <= endNumber; i++) {
            for (int x = startNumber; x <= endNumber; x++) {
                combination++;
                if (i + x == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combination, i, x, magicNumber);
                    weFoundIt=true;
                        break;
                }
            }
        if (weFoundIt){
            break;
        }
        }
   if (!weFoundIt){
       System.out.printf("%d combinations - neither equals %d ",combination,magicNumber);
   }
    }
}
