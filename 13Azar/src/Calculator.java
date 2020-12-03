import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double first, second;
        first = scan.nextDouble();
        char ch = scan.next().charAt(0);
        second = scan.nextDouble();

        switch (ch){
            case '+':
                System.out.println(first + second);
                break;
            case '-':
                System.out.println(first - second);
                break;
            case '*':
                System.out.println(first * second);
                break;
            case '/':
                System.out.println(first / second);
                break;
        }
    }
}
