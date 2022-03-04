import java.util.Scanner;

public class BirthdayCacke {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dalzhina = Integer.parseInt(scan.nextLine());
        int shirina = Integer.parseInt(scan.nextLine());
        int parcheta = dalzhina * shirina;

        String input = scan.nextLine();
        while (!input.equals("STOP")) {
            int number = Integer.parseInt(input);
            parcheta -= number;
            if ( parcheta < 0){
                System.out.printf("No more cake left! You need %d pieces more.",Math.abs(parcheta));
                break;
            }
            input=scan.nextLine();
        }
    if (input.equals("STOP")){
        System.out.printf("%d pieces are left.",parcheta);
    }
    }
}
