package archana.java100programs.matrixprogarm;

public class TransposeOfMatrixWithoutUsingScanner {
    public static void main(String[] args) {
        int[][] original ={{1,4,7},{5,2,3},{9,8,3}};
        System.out.println("Original Matrix");
        for (int i=0;i< original.length; i++){
            for (int j=0; j< original.length; j++){
                System.out.print(original[i][j]+" ");
            }
            System.out.println();
        }
        int[][] transpose = new int[3][3];
        System.out.println("Transpose Matrix");
        for (int i =0; i< transpose.length; i++){
            for (int j=0; j< transpose.length; j++){
                transpose[i][j]= original[j][i];
                System.out.print(transpose[i][j] +" ");
            }
            System.out.println();
        }
    }
}
