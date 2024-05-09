package archana.java100programs.matrixprogarm;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationOFTwoMatrices {
    int i,j;

    int [][] firstMatrix = new int[3][3];
    int [][] secondMatrix = new int[3][3];
    int [][] mulOfMatrix = new int[3][3];

    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of Matrix1");
        for ( i= 0; i<3; i++){
            for (j=0; j<3;j++ ){
               firstMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter numbers of Matrix2");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                secondMatrix[i][j] = sc.nextInt();
            }
        }
    }
    public void printMatrix(){
        System.out.println("Printing First Matrix");
        for (int [] f :firstMatrix){
            System.out.println(Arrays.toString(f));
        }
        System.out.println("Printing second matrix");
        for (int [] s :secondMatrix ){
            System.out.println(Arrays.toString(s));
        }
    }
    public void multiplicationLogic(){
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                for (int k=0;k<3;k++) {
                    mulOfMatrix[i][j] = 0;
                    mulOfMatrix[i][j] = mulOfMatrix[i][j]+(firstMatrix[i][k]*secondMatrix[k][j]);
                }
            }
        }
        System.out.println("Multiplication Of Matrix ");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print(mulOfMatrix[i][j] + "  ");
            }
        }
    }

    public static void main(String[] args) {
        MultiplicationOFTwoMatrices mul = new MultiplicationOFTwoMatrices();
        mul.getData();
        mul.printMatrix();
        mul.multiplicationLogic();

    }
}
