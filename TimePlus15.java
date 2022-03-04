import java.util.Scanner;

public class TimePlus15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int hoursMinute = hours * 60;
        int timePlus15 = hoursMinute + minutes + 15;
        int finalHours =  timePlus15 / 60 ;
        int finalMinute = timePlus15 % 60 ;

        if (finalHours >= 24){
            finalHours -= 24;

        }
        System.out.printf("%d:%02d", finalHours , finalMinute);

    }
}
