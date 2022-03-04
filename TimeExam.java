import java.util.Scanner;

public class TimeExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

                Scanner scanner = new Scanner(System.in);
                //1.ВХОД:
                //час на изпита - int
                //минути на изпита - int
                //час на идване - int
                //минути на идване
                //2. преобразуваме в минути
                //3. проверка кога е late, ontime, early
                int examHour = Integer.parseInt(scanner.nextLine());
                int examMinutes = Integer.parseInt(scanner.nextLine());
                int arriveHour = Integer.parseInt(scanner.nextLine());
                int arriveMinutes = Integer.parseInt(scanner.nextLine());

                //време на изпита в минути = час  на изпита * 60 + минути на изпита
                int examTimeMinutes = examHour * 60 + examMinutes;
                //време на пристигане в минути = час на пристинаге * 60 + минути на пристигане
                int arriveTimeMinutes = arriveHour * 60 + arriveMinutes;


                if (arriveTimeMinutes > examTimeMinutes) {
                    //Late
                    System.out.println("Late");
                    int lateMinutes = arriveTimeMinutes - examTimeMinutes;
                    if (lateMinutes < 60) {
                        System.out.printf("%d minutes after the start", lateMinutes);
                    } else {
                        int hour = lateMinutes / 60;
                        int minutes = lateMinutes % 60;
                        System.out.printf("%d:%02d hours after the start", hour, minutes);
                    }
                } else if (arriveMinutes == examTimeMinutes || examTimeMinutes - arriveTimeMinutes <= 30) {
                    //On time
                    System.out.println("On time");
                    if(examTimeMinutes - arriveTimeMinutes <= 30 && arriveTimeMinutes != examTimeMinutes) {
                        System.out.printf("%d minutes before the start", examTimeMinutes - arriveTimeMinutes);
                    }
                } else if (examTimeMinutes - arriveTimeMinutes > 30) {
                    //Early
                    System.out.println("Early");
                    int earlyMinutes = examTimeMinutes - arriveTimeMinutes; //подраняването
                    if(earlyMinutes < 60) {
                        System.out.printf("%d minutes before the start", earlyMinutes);
                    } else {
                        int hour = earlyMinutes / 60;
                        int minutes = earlyMinutes % 60;
                        System.out.printf("%d:%02d hours before the start", hour, minutes);
                    }

                }


            }
    }

