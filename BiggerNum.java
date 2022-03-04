import java.util.Scanner;

public class BiggerNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.MIN_VALUE;
        String  n = scan.nextLine();

        while (!n.equals("Stop")){
             int number = Integer.parseInt(n);
            if (number > num){
                num = number;
            }
        n = scan.nextLine();
        }
        System.out.println(num);
    }
}
