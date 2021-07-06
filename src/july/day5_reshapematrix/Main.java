package july.day5_reshapematrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int [][] mat = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(matrixReshape(mat, 4, 1)));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if((r * c) != mat.length * mat[0].length)
            return mat;
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                numbers.add(mat[i][j]);
            }
        }

        int[][] newMatrix = new int[r][c];
        int counter = 0;
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                newMatrix[i][j] = numbers.get(counter);
                counter++;
            }
        }

        return newMatrix;
    }
}
