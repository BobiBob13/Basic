import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int goal = 0;
        String input = scan.nextLine();


        while (!input.equals("Going home")) {

            double steps = Integer.parseInt(input);
            goal += steps;

            if (goal >= 10000) {
                break;
            }
            input = scan.nextLine();
        }
        if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scan.nextLine());
                goal += stepsToHome;

            }
        if (goal >= 10000){
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!",goal-10000);
        }else {

            System.out.printf("%d more steps to reach goal.",10000 - goal);

        }
    }

}

