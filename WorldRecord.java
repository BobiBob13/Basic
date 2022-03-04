import java.util.Scanner;

public class WorldRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double recordInSecond = Double.parseDouble(scan.nextLine());
        double lenghtInMeters = Double.parseDouble(scan.nextLine());
        double timeForMinute = Double.parseDouble(scan.nextLine());

        double ivanSwim = lenghtInMeters * timeForMinute;
        double every15km =  Math.floor(lenghtInMeters / 15) * 12.5 ;
        double sumTime = ivanSwim + every15km;

        if (recordInSecond > sumTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",sumTime);
        }else if (recordInSecond <= sumTime){
            double needTime = sumTime - recordInSecond;
            System.out.printf("No, he failed! He was %.2f seconds slower.",needTime);
        }

    }
}
