import java.util.Scanner;

public class SumSecond {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int firstTime = Integer.parseInt(scan.nextLine());
        int secondTime = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());

        int sum = firstTime + secondTime + third;

        int totalMinute = sum / 60 ;
        int totalSecond = sum % 60 ;
        System.out.printf("%d:%02d",totalMinute , totalSecond);
    }
}
