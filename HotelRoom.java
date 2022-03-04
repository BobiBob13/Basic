import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int numberNight = Integer.parseInt(scan.nextLine());
        double studio = 0;
        double apartment = 0;
        double sum = 0;
        double sumTwo = 0;
        switch (month) {
            case "May":
            case "October":

                studio = 50;
                apartment = 65;

                if (numberNight > 7 && numberNight <= 14) {
                    studio = studio - studio * 0.05;

                } else if (numberNight > 14) {
                    studio = studio - studio * 0.3;


                }
                break;
            case "June":
            case "September":
                studio = 75.20;
                apartment = 68.70;

                if (numberNight > 14) {
                    studio = studio - studio * 0.20;

                }

                break;
            case "July":
            case "August":
                studio = 76;
                apartment = 77;
                break;
        }
        if (numberNight > 14) {


            apartment = apartment * 0.90;
        }
        sumTwo = numberNight * apartment;
        sum = numberNight * studio;

        System.out.printf("Apartment: %.2f lv.%n", sumTwo);
        System.out.printf("Studio: %.2f lv.", sum);


    }


}
