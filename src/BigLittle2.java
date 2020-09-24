import java.util.Scanner;

public class BigLittle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char first = scan.next().charAt(0);
        char second = scan.next().charAt(0);

        System.out.print(Character.toUpperCase(first) + " " + Character.toLowerCase(second));
    }
}
