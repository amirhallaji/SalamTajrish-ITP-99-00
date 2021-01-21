import java.util.Scanner;

public class Triangle {
    public static boolean isTriangle(double a, double b, double c){
        return a + b > c && a + c > b && b + c > a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        System.out.println(isTriangle(a, b, c));
    }
}
