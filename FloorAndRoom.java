import java.util.Scanner;

public class FloorAndRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floor = Integer.parseInt(scan.nextLine());
        int room = Integer.parseInt(scan.nextLine());

        for (int f = floor; f >= 1; f--) {
            for (int r = 0; r < room; r++) {
                if (f == floor) {
                    System.out.printf("L%d%d ",f,r);
                } else if (f % 2 == 0) {
                    System.out.printf("O%d%d ",f,r);
                }else {
                    System.out.printf("A%d%d ",f,r);
                }
            }
            System.out.println();
        }
    }

}
