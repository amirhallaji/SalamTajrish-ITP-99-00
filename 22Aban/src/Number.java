import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long number = scan.nextLong();
        int counter0 = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        int counter7 = 0;
        int counter8 = 0;
        int counter9 = 0;

        while (number > 0) {
            int ones = (int)(number % 10);
            switch (ones) {
                case 0 -> counter0++;
                case 1 -> counter1++;
                case 2 -> counter2++;
                case 3 -> counter3++;
                case 4 -> counter4++;
                case 5 -> counter5++;
                case 6 -> counter6++;
                case 7 -> counter7++;
                case 8 -> counter8++;
                case 9 -> counter9++;
            }
            number /= 10;
        }
        for(int i = 0 ;i < counter9 ; i++){
            System.out.print(9);
        }
        for(int i = 0 ;i < counter8 ; i++){
            System.out.print(8);
        }
        for(int i = 0 ;i < counter7 ; i++){
            System.out.print(7);
        }
        for(int i = 0 ;i < counter6 ; i++){
            System.out.print(6);
        }
        for(int i = 0 ;i < counter5 ; i++){
            System.out.print(5);
        }
        for(int i = 0 ;i < counter4 ; i++){
            System.out.print(4);
        }
        for(int i = 0 ;i < counter3 ; i++){
            System.out.print(3);
        }
        for(int i = 0 ;i < counter2 ; i++){
            System.out.print(2);
        }
        for(int i = 0 ;i < counter1 ; i++){
            System.out.print(1);
        }
        for(int i = 0 ;i < counter0 ; i++){
            System.out.print(0);
        }
    }
}
