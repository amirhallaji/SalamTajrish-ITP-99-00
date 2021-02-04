import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double [] grades = new double[10];

        grades[0] = 19.4;
        grades[1] = 20.00;
        grades[1] = 10;
        grades[6] = 19;
        grades[8] = scan.nextDouble();
        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[7]);
        System.out.println("grades8 " + grades[8]);

    }
}
