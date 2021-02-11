package Array2d;

public class Example3 {
    public static void main(String[] args) {

        int [] [] array2d = new int[4][4];
        int [] sums = new int [4];

        for (int i = 0; i < sums.length; i++) {
            sums[i] = 0;
        }

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                array2d[i][j] = (int)(Math.random()*10);
                System.out.print(array2d[i][j] + "  ");
                sums[i] += array2d[i][j];
            }
            System.out.println();
        }

        int max = sums[0];
        for (int i = 1; i < sums.length; i++) {
            if(max < sums[i]){
                max = sums[i];
            }
        }
        System.out.println(max);
    }
}
