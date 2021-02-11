import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        double[] grades = new double[size];
        double sum = 0;

        for (int i = 0; i < grades.length; i++) {
            grades[i] = scan.nextDouble();
            sum += grades[i];
        }

        double average = sum / grades.length;

        System.out.println("average -> " + average);


    }
}
