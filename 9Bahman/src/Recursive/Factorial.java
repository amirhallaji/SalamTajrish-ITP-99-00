package Recursive;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int n){
        int result = 1;
        if(n == 0){
            return 1;
        }
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(factorial(6));
    }
}
