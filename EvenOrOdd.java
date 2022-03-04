import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double oddSum=0;
        double evenSum=0;
        for (int i = 1 ;i<=n;i++){
            int number = Integer.parseInt(scan.nextLine());


            if ( i %2 == 0){
                evenSum += number;
            }else {
                oddSum += number ;
                if (evenSum==oddSum){

                }else {

                }
            }
        }
        if (evenSum == oddSum) {
            System.out.printf("Yes%nSum = %.0f", (Math.abs(evenSum)));

        } else {
            System.out.printf("No%nDiff = %.0f", (Math.abs(evenSum-oddSum)));

        }

    }
}
