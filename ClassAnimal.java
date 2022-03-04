import java.util.Scanner;

public class ClassAnimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        switch (text) {
            case "dog":
                System.out.println("mammal");
                break;
            case "snake":
            case "crocodile":
            case "tortoise":
                System.out.println("reptile ");
                break;
            default:
                System.out.println("unknown");
                break;
        }


    }
}
