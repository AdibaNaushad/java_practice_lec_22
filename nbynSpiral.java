import java.util.Scanner;

public class nbynSpiral {


        static void printMatrix(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

        }

        static int[][] nBynSpiral(int n) { //return a 2D matrix so changed return type here
            int[][] matrix = new int[n][n];
            int topRow = 0, bottomRow = n - 1, leftCol = 0, rigCol = n - 1;
            int current = 1;

            while (current <= n * n) {
                //top row = left to ri8 colunm
                for (int j = leftCol; j <= rigCol && current <= n * n; j++) {
                    matrix[topRow][j] = current++;

                }
                topRow++; //shifting by 1 row from 0 to 1 to avoid repeat

                //ri8 col = top to bottom
                for (int i = topRow; i <= bottomRow && current <= n * n; i++) {
                    matrix[i][rigCol] = current++;


                }
                rigCol--; // same go for this avoid repeat

                //bottom row = ri8 to left
                for (int j = rigCol; j >= leftCol && current <= n * n; j--) {
                    matrix[bottomRow][j] = current++;


                }
                bottomRow--; // same go for this avoid repeat

                //left col = bottom to top row
                for (int i = bottomRow; i >= topRow && current <= n * n; i++) {
                    matrix[i][leftCol] = current++;

                }
                leftCol++; // same go for this avoid repeat
            }

            return matrix;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter n of matrix");
            int n = sc.nextInt();


            System.out.println("Ihe spiral of Matrix is ");
            int[][] matrix = nBynSpiral(n);
            printMatrix(matrix);



        }
    }


