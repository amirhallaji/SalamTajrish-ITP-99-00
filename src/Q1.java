import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,counter = 0 ;
        a = scan.nextInt();
        b = scan.nextInt();

        if((a % 2 == 0) || (b % 2 == 0)){
            counter++;
        }

        if(a % b == 0 && counter != 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
