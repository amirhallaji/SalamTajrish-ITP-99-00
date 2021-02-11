import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double [] array = new double[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random()*10;
        }

        for (int i = 0; i < array.length; i += 2) {
            array[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
