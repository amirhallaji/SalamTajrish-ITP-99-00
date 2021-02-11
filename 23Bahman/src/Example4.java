import javax.naming.PartialResultException;

public class Example4{
    public static void main(String[] args) {

        int [] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*30 + 10);
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ") ;
        }
        System.out.println();
        System.out.println(max);
    }
}
