package Array2d;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [][] matrix1, matrix2, matrix3;
        matrix1 = new int[3][3];
        matrix2 = new int[3][3];
        matrix3 = new int[3][3];



        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix2[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrix3[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
