import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char first, second;
        first = scan.next().charAt(0);
        second = scan.next().charAt(0);

        if(first > second){
            char temp = first;
            first = second;
            second = temp;
        }
        int distance = second - first + 1;
        for(int i = first,line = 1; i <= second; i++,line++){
            for(int j = 1; j <= distance - line; j++){
                System.out.print(" ");
            }
            char forPrint = first;
            for(int j = 1; j <= line; j++){
                System.out.print(forPrint++ + " ");
            }
            System.out.println();
        }
        for(int i = second, line = distance-1; i >= first; i--,line-- ){
            for(int j = distance-line; j >= 1; j--){
                System.out.print(" ");
            }
            char forPrint = first;
            for(int j = 1; j <= line; j++){
                System.out.print(forPrint++ + " ");
            }
            System.out.println();
        }
    }
}
