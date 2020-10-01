import java.util.Scanner;

public class TriangleRecognition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,c ;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if(a + b > c && b + c > a && a + c > b){
            System.out.println("Possible");
        }
        else {
            System.out.println("Impossible");
        }
    }
}
