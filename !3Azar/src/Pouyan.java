import java.util.Scanner;

public class Pouyan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p, d;
        p = scan.nextInt();
        d = scan.nextInt();
        int copyOfd = d;
        int remainder = d % p;
        boolean isOk = false;
        while (!isOk){
            isOk = (remainder >= 0 && remainder <= p/2);
            if(!isOk){
                d += copyOfd;
            }
            remainder = d % p;
        }
        System.out.println(d);
    }
}
