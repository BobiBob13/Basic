import java.util.Scanner;

public class CinemaTickts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String nameMovie = scan.nextLine();
        int freeSpace = Integer.parseInt(scan.nextLine());
        String ticketType = scan.nextLine();
        int countTicket = 0;
        int kidTicket = 0;
        int studentTicket = 0;
        int standardTickt = 0;

        while (!nameMovie.equals("End")) {

            if (ticketType.equals("kid")) {
                kidTicket++;
                countTicket++;

            }
            if (ticketType.equals("student")) {
                studentTicket++;
                countTicket++;
            }
            if (ticketType.equals("standard")) {
                standardTickt++;
                countTicket++;
            }
            if (countTicket >= freeSpace) {
                System.out.printf("%s - 100%% full.", nameMovie);
                System.out.println();
                break;
            }
            ticketType = scan.nextLine();
        }
        String newMovie = scan.nextLine();

        while (newMovie.equals("End")) {
           nameMovie = scan.nextLine();
            freeSpace = Integer.parseInt(scan.nextLine());
            if (ticketType.equals("kid")) {
                kidTicket++;
                countTicket++;

            }
            if (ticketType.equals("student")) {
                studentTicket++;
                countTicket++;
            }
            if (ticketType.equals("standard")) {
                standardTickt++;
                countTicket++;
            }
            ticketType = scan.nextLine();

        }
        if (nameMovie.equals("Finish")) {
            double result = (studentTicket * 1.0) / countTicket * 100;
            System.out.printf("%f student ticket", result);
            double result1 = (standardTickt * 1.0) / countTicket * 100;
            System.out.printf("%f standard ticket", result1);
            double result2 = (kidTicket * 1.0) / countTicket * 100;
            System.out.printf("%f kid ticket", result2);
        }
        // if (countTicket >= freeSpace) {
        // System.out.printf("%s 100%% full.", nameMovie);
    }
}
