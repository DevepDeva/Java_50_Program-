//Program to transpose a matrix

public class Transpose_Matrix {
    public static int[][] transpose(int[][] matrix){
        int arr[][]=new int[matrix[0].length][matrix.length];
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[0].length;j++){
                arr[j][i]=matrix[i][j];
            }
        }
        return arr;
    }
    public static void main(String[] args) {

        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int res[][]=transpose(matrix);
        for (int[] row : res) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
