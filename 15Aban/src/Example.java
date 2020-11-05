public class Example {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 10 ; i++){
            for(int j = 1 ; j <= 10 ; j++){
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
