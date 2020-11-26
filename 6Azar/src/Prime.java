import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first, second;
        first = scan.nextInt();
        second = scan.nextInt();
        boolean isPrime;

        for (int i = first+1; i < second ; i++) {
            isPrime = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }

    }
}
