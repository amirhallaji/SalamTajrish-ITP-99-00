import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();

        double grade1 = (first / 100) * (first % 100);
        double grade2 = (second / 100) * (second % 100);
        double grade3 = (third / 100) * (third % 100);
        System.out.printf("%.4f", (grade1+grade2+grade3)/(first/100+second/100+third/100));
    }
}
