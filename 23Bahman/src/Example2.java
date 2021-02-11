import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        double[] array = new double[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 10) + 10;
            System.out.println(array[i]);
        }
    }
}
