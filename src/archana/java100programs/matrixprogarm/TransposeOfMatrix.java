package archana.java100programs.matrixprogarm;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int [][] originalMatrix = new int[3][3];
        int [][] transposeMAtrix = new int[3][3] ;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter matrix Elements");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
               originalMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing original Matrix");
        for (int[] o :originalMatrix){
            System.out.println(Arrays.toString(o));
        }
        for (int i =0; i<3;i++){
            for (int j=0;j<3; j++){
                transposeMAtrix[i][j]=originalMatrix[j][i];
            }
        }
        System.out.println("Printing Transpose Of Matrix");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(transposeMAtrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
