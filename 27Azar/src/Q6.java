import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if(number % i == 0){
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
