import java.util.Scanner;

public class FriendlyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first, second;
        first = scan.nextInt();
        second = scan.nextInt();

        for (int i = first+1; i < second; i++) {
            if(i % 6 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
