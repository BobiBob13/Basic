import java.util.Scanner;

public class Balance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         double sum = 0;
        String input = scan.nextLine();

        while (!input.equals("NoMoreMoney")){
            double num = Double.parseDouble(input);
            if (num<0){
                System.out.println("Invalid operation!");
                break;
            }
            sum +=num;
            System.out.printf("Increase: %.2f%n",num);
            input = scan.nextLine();

        }
        System.out.printf("Total: %.2f",sum);
    }
}
