import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 8 ; i <= 10 ; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= number ; i++){
            sum += i;
        }
        System.out.println(sum);

    }
}
