package archana.javaprograms.basicprograms.patternprogram.pyramid;

public class PyramidPatternWithOddNumberOfStars {
    public static void main(String[] args) {
        int i,j,k,row=5;
        for(i=1; i<=row; i++){//printing for 10 rows (i)
            for(j =1; j<=row-i; j++){// for space (j) in first row 9 spaces
                // second row 8 spaces
                System.out.print(" ");
            }
            for (k =1; k<= 2*i-1; k++){
                System.out.print("*");//
            }
            System.out.println();
        }
    }

}
