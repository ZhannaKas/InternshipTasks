package Problems;

public class Problem12 {
    //TODO: sort lines in n*n matrix by sum (sorted by ascending order)

    public static void sort(int [][] matrix) {

        int [] sortedArray = new int[matrix.length];
        for (int i = 0; i<matrix.length; i++) {
            if (matrix.length != matrix[i].length) {
                System.out.println("It's not matrix n*n");
                return;
            }
        }
        boolean isCount = true;
        while (isCount) {
            int count = 0;
            int previousSum = 0;
            int actualSum = 0;
            for (int i = 0; i<matrix.length; i++) {
                for (int j = 0; j<matrix.length; j++) {
                    actualSum += matrix[i][j];
                }
                if (previousSum != 0 && actualSum<previousSum) {
                    for (int n = i; n>i-1; n--) {
                        for (int m = 0;m<matrix.length; m++) {
                            matrix[n-1][m] = matrix[n][m];
                        }
                    }
                    System.arraycopy(sortedArray, 0, matrix[i], 0, matrix.length);
                    actualSum = 0;
                    count++;
                }
                else {
                    System.arraycopy(matrix[i], 0, sortedArray, 0, matrix.length);
                    previousSum = actualSum;
                    actualSum = 0;
                }
            }
            isCount = count>0;
        }
        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0; j<matrix.length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
