import java.util.Scanner;

public class WorkingDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        switch (text) {
            case ("Monday"):
            case ("Tuesday"):
            case ("Wednesday"):
            case ("Thursday"):
            case ("Friday"):
                System.out.println("Working day");
                break;
            case ("Saturday"):
            case ("Sunday"):
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");

        }


    }
}
