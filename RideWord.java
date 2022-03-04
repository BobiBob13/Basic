import java.util.Scanner;

public class RideWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        while (!name.equals("Stop")){
            System.out.println(name);
        name = scan.nextLine();
        }

    }
}
