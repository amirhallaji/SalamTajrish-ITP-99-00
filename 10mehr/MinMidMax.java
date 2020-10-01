import java.util.Scanner;

public class MinMidMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,c ;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        int min,max,mid ;

        //finding minimum
        if(a < b && a < c){
            min = a ;
        }
        else if(b < a && b < c){
            min = b ;
        }
        else {
            min = c ;
        }

        //finding maximum
        if(a > b && a > c) {
            max = a ;
        }
        else if(b > a && b > c){
            max = b ;
        }
        else {
            max = c;
        }

        mid = a + b + c - min - max ;
        System.out.println("max : " + max + "\n" + "mid : " + mid + "\n" + "min : " + min);

    }
}
