import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        if (a == 0) {
            System.out.printf("%.2f", -c / b);
        }
        else {
            double delta = b * b - (4 * a * c);
            if (delta < 0) {
                System.out.println("Equation has no real roots");
            }
            else if (delta == 0) {
                System.out.printf("%.2f", -b / (2 * a));
            }
            else {
                double ans1, ans2;
                ans1 = (-b + Math.sqrt(delta)) / (2 * a);
                ans2 = (-b - Math.sqrt(delta)) / (2 * a);
                if (ans1 > ans2) {
                    System.out.printf("%.2f %.2f", ans1, ans2);
                }
                else {
                    System.out.printf("%.2f %.2f", ans2, ans1);
                }
            }
        }
    }
}