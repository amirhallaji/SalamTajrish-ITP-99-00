import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        if (input > 10) {
            System.out.println("greater than 10");
        }
        else if(input < 10) {
            System.out.println("less than 10");
        }
        else {
            System.out.println("10");
        }


    }
}
