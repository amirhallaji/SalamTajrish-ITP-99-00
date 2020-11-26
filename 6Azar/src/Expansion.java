import java.util.Scanner;

public class Expansion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x, n;
        x = scan.nextInt();
        n = scan.nextInt();

        double sum = 0;

        for(int i = 0 ; i <= n ;i++){
            //power
            double result = 1;
            for(int j = 1; j <= i ; j++){
                result *= x;
            }
            //factorial
            double factorial = 1;
            for (int j = i; j >= 1 ; j--) {
                factorial *= j;
            }
            sum += (result / factorial);
        }
        System.out.printf("%.3f\n", sum);
    }
}
