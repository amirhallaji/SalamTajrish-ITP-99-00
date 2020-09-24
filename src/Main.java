import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Width and Length of your Rectangle");
        double length, width  ;
        length = scan.nextDouble();
        width = scan.nextDouble();

        double area = length*width;
        System.out.println("Area is: " + area);
    }
}
