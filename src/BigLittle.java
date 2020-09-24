import java.util.Scanner;

public class BigLittle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char first = scan.next().charAt(0);
        char second = scan.next().charAt(0);

        int newFirst = first - 32 ;
        int newSeocnd = second + 32 ;
        System.out.print((char)newFirst + " " + (char)newSeocnd );
//        System.out.println();
//        System.out.print((char)((int)first - 32) + " " + (char)((int)second+32));
    }
}
