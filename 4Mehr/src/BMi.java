import java.util.Scanner;

public class BMi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double height = scan.nextDouble();
        double weight = scan.nextDouble();

        double bmi = weight / (height*height);
        System.out.printf("%.1f",bmi);
    }
}
