import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number1, number2, number3, number4;
        number1 = scan.nextInt();
        number2 = scan.nextInt();
        number3 = scan.nextInt();
        number4 = scan.nextInt();

        double ratio = number2 / number1;
        if(ratio == (number3 / number2)  && ratio == (number4 / number3)){
            System.out.println("It can contain a progression");
            int nth = scan.nextInt();
            for (int i = 0; i < nth+4 ; i++) {
                System.out.print((int)(number1 * Math.pow(ratio, i)) + " ");
            }
            System.out.println();
        }
        else {
            System.out.println("NO");
        }
    }
}
