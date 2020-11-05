import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        for(int i = 1 ; i <= b ; i++){
            for(int j = 1 ; j <= b ; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
        System.out.println("***************");
        int i = 1, j = 1;
        while (i <= 10){
            j = 1;
            while (j <= 10){
                System.out.print(i*j + " ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
