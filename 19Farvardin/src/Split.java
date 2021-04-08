import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] result = scan.nextLine().split(" ");

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
