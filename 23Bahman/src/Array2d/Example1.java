package Array2d;

public class Example1 {
    public static void main(String[] args) {

        double [][] array2d = new double[3][3];

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                array2d[i][j] = Math.random()*10;
                System.out.print(array2d[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
