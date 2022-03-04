import java.util.Scanner;

public class Sallary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabs = Integer.parseInt(scan.nextLine());
        int sallary = Integer.parseInt(scan.nextLine());
        int sum = 0;
        boolean isFinish = false;
        for (int i = 0; i < tabs; i++) {
            String web = scan.nextLine();


            switch (web) {
                case "Facebook":
                    sallary = sallary - 150;
                    break;
                case "Instagram":
                    sallary = sallary - 100;

                    break;
                case "Reddit":
                    sallary = sallary - 50;
                    break;
            }
            if (sallary <= 0) {
                isFinish = true;
                break;
            }
        }
        if (isFinish) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(Math.abs(sallary));
        }

    }
}



