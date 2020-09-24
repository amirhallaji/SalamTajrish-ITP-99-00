import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        int ans = 0 ;
        int mod = number % 10 ;
        ans = ans * 10 + mod ;

        number /= 10 ;

        mod = number % 10 ;

        ans = ans * 10 + mod ;

        number /= 10 ;

        mod = number % 10 ;
        ans = ans * 10 + mod ;

        System.out.println(ans);

    }
}
