import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double [] numbers = new double [20];
        double sum = 0;
        boolean isTrue = false;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextDouble();
            sum += numbers[i];
        }

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == (sum / numbers.length)){
                isTrue = true;
                break;
            }
        }
        if(isTrue){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
