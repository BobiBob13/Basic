import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int faildTry = Integer.parseInt(scan.nextLine());

        int badGrade = 0;
        int compleateTask = 0;
        double sumGrade = 0;
        String lastTask = "";
        boolean isFailed = true;

        while (badGrade < faildTry) {
            String task = scan.nextLine();
            if ("Enough".equals(task)) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scan.nextLine());
            if (grade <= 4) {
                badGrade++;
            }
            sumGrade += grade;
            compleateTask++;
            lastTask = task;
        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", badGrade);
        } else {
            System.out.printf("Average score: %.2f%n", sumGrade / compleateTask);
            System.out.printf("Number of problems: %d%n", compleateTask);
            System.out.printf("Last problem: %s", lastTask);
        }
    }
}
