package Recursive;

public class RecursiveSum {
    public static int sum = 0;
    public static int recSum(int n){
        if(n == 0){
            return sum;
        }
        sum = n + recSum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(recSum(100));
    }
}
