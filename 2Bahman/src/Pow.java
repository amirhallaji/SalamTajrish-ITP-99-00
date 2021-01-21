import java.util.Scanner;

public class Pow {

    public static double pow(double base, int power){
        double result = 1;
        for(int i = 0; i < power; i++){
            result *= base;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        int b = scan.nextInt();
        System.out.println(pow(a, b));

    }
}
