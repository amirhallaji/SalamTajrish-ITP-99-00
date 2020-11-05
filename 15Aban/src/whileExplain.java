import java.util.Scanner;

public class whileExplain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int i = 1, sum = 0;
        while (i <= number){
            sum = sum + i;
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n" + sum);
    }
}
