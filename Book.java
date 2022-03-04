import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String bookName = scan.nextLine();
        int count = 0;
        boolean isFind = false;
        String input = scan.nextLine();

        while (!input.equals("No More Books")) {
            if (input.equals(bookName)) {
                isFind = true;
                break;
            }
            count++;
            input = scan.nextLine();
        }
        if (isFind){
            System.out.printf("You checked %d books and found it.",count  );
        }else{
            System.out.printf("The book you search is not here!%nYou checked %d books.",count);
        }
    }
}