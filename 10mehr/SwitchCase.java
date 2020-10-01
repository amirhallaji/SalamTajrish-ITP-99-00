import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int monthNumber = scan.nextInt();

        switch (monthNumber % 12) {
            case 0:
                System.out.println("Esfand");
                break;
            case 1:
                System.out.println("Farvardin");
                break;
            case 2:
                System.out.println("Ordibehesht");
                break;
            case 3:
                System.out.println("Khordad");
                break;
            case 4:
                System.out.println("Tir");
                break;
            case 5:
                System.out.println("Mordad");
                break;
            case 6:
                System.out.println("Shahrivar");
                break;
            case 7:
                System.out.println("Mehr");
                break;
            case 8:
                System.out.println("Aban");
                break;
            case 9:
                System.out.println("Azar");
                break;
            case 10:
                System.out.println("Dey");
                break;
            default:
                System.out.println("Bahman");
                break;
//            case 11:
//                System.out.println("Bahman");
//                break;
        }
    }
}
