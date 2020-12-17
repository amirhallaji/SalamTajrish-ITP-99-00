import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();
        while (!(input >= 1 && input < 1000) || !(input == (int)(input))){
            input = scan.nextDouble();
        }
        double next = scan.nextDouble();
        System.out.printf("%.5f %.6f", input, next);
    }
}
