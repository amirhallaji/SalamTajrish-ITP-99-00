import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day, nth;
        day = scan.nextInt();
        nth = scan.nextInt();

        switch ((day + nth) % 7) {
            case 0 -> System.out.println("FRIDAY");
            case 1 -> System.out.println("SATURDAY");
            case 2 -> System.out.println("SUNDAY");
            case 3 -> System.out.println("MONDAY");
            case 4 -> System.out.println("TUESDAY");
            case 5 -> System.out.println("WEDNESDAY");
            case 6 -> System.out.println("THURSDAY");
        }
    }
}
