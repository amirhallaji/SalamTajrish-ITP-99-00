import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if(a + b <= c || a + c <= b || b + c  <= a){
            System.out.println("can't be a triangle");
        }
        else if(a * a == b * b + c * c || c * c == a * a + b * b || c * c + a * a == b * b){
            System.out.println("right angled triangle");
        }
        else if((a == b && a != c) || (a == c && a != b) || (b == c && b != a)){
            System.out.println("isosceles triangle");
        }
        else if(a == b && b == c){
            System.out.println("equilateral triangle");
        }
        else {
            System.out.println("triangle");
        }
    }
}
