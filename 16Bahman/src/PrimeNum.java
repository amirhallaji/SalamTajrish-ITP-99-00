import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();
        Prime(a, b);
    }

    public static void Prime(int first, int second) {
        for(int i = first+1; i< second; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        boolean isPrime = true;

        if(n == 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}
