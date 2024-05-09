package archana.java100programs.matrixprogarm;

import java.util.Scanner;

public class CreateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns");
        int column = sc.nextInt();

        int [][] matrix = new int [rows][column];
        System.out.println("Enter the data of matrix ");
        for (int i=0;i<rows; i++){
            for (int j=0; j<column; j++){
                matrix[i][j] = sc.nextInt() ;
            }
        }
        for (int i =0; i<rows; i++){
            for(int j =0; j<column; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
