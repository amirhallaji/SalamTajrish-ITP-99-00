import java.util.Scanner;

public class Q1b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();

        if ((a % b == 0) && ((a % 2 == 0) || (b % 2 == 0))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
