import java.util.Scanner;

public class Func {

    public static int sum(double a, double b){
        return (int)(a + b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b;
        a = scan.nextDouble();
        b = scan.nextDouble();
        double c = sum(a, b);

    }
}
