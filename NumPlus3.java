import java.util.Scanner;

public class NumPlus3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        for (int i = 1;i<=number;i+=3){
            System.out.println(i);

        }



    }
}
