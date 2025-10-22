import java.util.Scanner;

public class spiral {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void spiralPrintMatrix(int[][] matrix, int r , int c){
        int topRow =0, bottomRow = r -1, leftCol =0, rigCol = c -1;
        int totalElement = 0;

        while (totalElement < r * c){
            //top row = left to ri8 colunm
            for (int j = leftCol; j <= rigCol && totalElement < r * c ; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElement++;

            }
            topRow++; //shifting by 1 row from 0 to 1 to avoid repeat

            //ri8 col = top to bottom
            for (int i = topRow; i <= bottomRow && totalElement < r * c ; i++) {
                System.out.print(matrix[i][rigCol] + " ");
                totalElement++;

            }
            rigCol--; // same go for this avoid repeat

            //bottom row = ri8 to left
            for (int j = rigCol; j >= leftCol && totalElement < r * c ; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElement++;

            }
            bottomRow--; // same go for this avoid repeat

            //left col = bottom to top row
            for (int i = bottomRow; i >= topRow && totalElement < r * c; i++) {
                System.out.print(matrix[i][leftCol] + " ");
                totalElement++;

            }
            leftCol++; // same go for this avoid repeat
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and coloumn of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter" + totalElements + "values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);

        System.out.println("spiral Matrix");
        spiralPrintMatrix(matrix, r, c);


    }
}
