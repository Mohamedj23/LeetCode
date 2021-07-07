package july.day7_findkclosetelementinsortedmatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{5}};
        System.out.println(kthSmallest(matrix,1));
    }

    public static int kthSmallest(int[][] matrix, int k) {
        int size = matrix.length * matrix[0].length;
        int[] arr = new int[size];
        int index = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arr[index] = matrix[i][j];
                index++;
            }
        }

        return arr[k-1];
    }
}
