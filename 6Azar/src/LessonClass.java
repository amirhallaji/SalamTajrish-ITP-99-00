import java.util.Scanner;

public class LessonClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        int count = scan.nextInt();

        for (int i = 1; i <= count ; i++) {
            int number = scan.nextInt();
            sum += number * Math.pow(2, 1-i);
        }
        System.out.println(sum / count);
    }
}
