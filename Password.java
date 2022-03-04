import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Username ");
        String username = scan.nextLine();
        System.out.print("Enter Password ");
        String password = scan.nextLine();

        System.out.print("Enter Password ");
        String input = scan.nextLine();
        while (!input.equals(password)){
            System.out.println("Wrong Password, try again: ");
            input= scan.nextLine();

        }
        System.out.printf("Welcome %s!",username);
    }
}