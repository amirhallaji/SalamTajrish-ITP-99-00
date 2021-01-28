import java.util.Scanner;

public class Swap {

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println("a: " + a + "\nb: " + b);
    }
}
