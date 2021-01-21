import java.util.Scanner;

public class PrintEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        printSocre(score);
    }

    public static void printSocre(int score) {
        if(score > 80){
            System.out.println("if 1");
        }
        else if(score > 70){
            System.out.println("if 2");
        }
        else{
            System.out.println("not");
        }
    }
}
