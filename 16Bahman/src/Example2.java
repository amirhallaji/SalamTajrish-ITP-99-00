import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double [] grades = new double[10];
        double sum = 0;
        String [] names = {"amir", "ali", "ahmad"};
        System.out.println(names[2]);

        for(int i = 0 ; i < grades.length; i++){
            grades[i] = (Math.random() * 20);
            sum += grades[i];
        }
        for(int i = 0 ; i < grades.length; i++){
            if(grades[i] < 10){
                System.out.println("grades" + (i+1) + ": " + grades[i] + " failed the exam");
            }
        }
        System.out.printf("Average of the class is: %.2f\n" , sum / grades.length);
    }
}
