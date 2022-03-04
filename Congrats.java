import java.util.Scanner;

public class Congrats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int clas = 1;
        double sum = 0;
        double repeat = 0;
        boolean finish = false;
        while (clas <= 12) {
            double points = Double.parseDouble(scan.nextLine());

            if (points < 4) {
                repeat++;
                if (repeat == 2) {
                    System.out.printf("%s has been excluded at %d grade", name, clas);
                    finish = true;
                    break;
                }
                continue;
            }

            sum += points;
            clas++;
        }
        if (!finish) {
            double AverageGrade = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f ", name, AverageGrade);
        }


    }
}
