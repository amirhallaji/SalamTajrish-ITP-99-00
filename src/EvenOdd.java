import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int a3 = scan.nextInt();
        int a4 = scan.nextInt();
        int a5 = scan.nextInt();

        int odd = 0 , even = 0 ;

        even = (a1 % 2 == 0) ? ++even : ++odd;
        even = (a2 % 2 == 0) ? ++even : ++odd;
        even = (a3 % 2 == 0) ? ++even : ++odd;
        even = (a4 % 2 == 0) ? ++even : ++odd;
        even = (a5 % 2 == 0) ? ++even : ++odd;

        System.out.println(even + " " + (5-even));





    }
}
