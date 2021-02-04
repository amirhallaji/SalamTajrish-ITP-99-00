import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double [] grades = new double[10];

        for(int i = 0 ; i < 10; i++){
            grades[i] = (Math.random())* 10;
        }

        for(int i = 0 ; i < 10; i++){
            System.out.printf("grades%d: %.2f\n", (i+1), grades[i]);
        }
    }
}
