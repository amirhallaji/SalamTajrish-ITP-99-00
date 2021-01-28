import java.util.Scanner;

public class Method {

    public static boolean completeNumber(int n){
        int sum = 0;
        for (int i = 1; i < n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return n == sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for (int i = a; i <= b ; i++) {
            if(completeNumber(i)){
                System.out.println(i);
            }
        }
    }
}
