import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first, second, third, forth;
        first = scan.nextInt();
        second = scan.nextInt();
        third = scan.nextInt();
        forth = scan.nextInt();

        if(forth > third) {
            System.out.println("MORE");
        }
        else if(forth > second && forth < third){
            System.out.println("MID2");
        }
        else if (forth > first && forth < second){
            System.out.println("MID1");
        }
        else if(forth < first){
            System.out.println("LESS");
        }
        else {
            System.out.println("EQUAL");
        }
    }
}
