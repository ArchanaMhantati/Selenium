package archana.javaprograms.basicprograms.patternprogram.pyramid;

public class PyramidPattern {
    public static void main(String[] args) {
        int i,j,row = 5;
        for(i=0; i<=row; i++){
            for(j=0; j<=row-i; j++){//Inner loop for space by row wise
                System.out.print(" ");// to print space between two stars
            }
            for(j=0;j<=i; j++){
                System.out.print(i+" ");// Space should be compulsory
            }
            System.out.println();
        }
    }
}
