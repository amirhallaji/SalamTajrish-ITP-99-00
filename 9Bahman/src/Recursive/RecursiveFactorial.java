package Recursive;

public class RecursiveFactorial {
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
        //7*6*5*4*3*2*1
    }
    public static void main(String[] args) {
        System.out.println(factorial(7));
    }
}
