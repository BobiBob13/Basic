import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (sum <num){
            int currentnum = Integer.parseInt(scan.nextLine());
            sum +=currentnum;
        }
        System.out.println(sum);
    }
}
