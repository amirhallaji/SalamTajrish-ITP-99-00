import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();
        long tempMax = number;
        long tempMin = number;

        int numberLength = 0;
        while (number > 0){
            number /= 10;
            numberLength++;
        }
        int cursurMin = 1, cursurMax = 1, index = 1;

        // Finding maximum
        int max = (int)(tempMax % 10);
        tempMax /= 10;
        while (tempMax > 0){  //36
            if(max <= (tempMax % 10)){
                max = (int)(tempMax % 10);
                cursurMax = index;
            }
            tempMax /= 10;
            index++;
        }
        // Finding minimum
        int min = (int)(tempMin % 10);
        index = 1;
        tempMin /= 10;
        while (tempMin > 0){
            if(min >= (tempMin % 10)){
                min = (int)(tempMin % 10);
                cursurMin = index;
            }
            tempMin /= 10;
            index++;
        }
        System.out.println((numberLength-cursurMax) + " " + (numberLength - cursurMin));
    }
}
