package archana.javaprograms.basicprograms.patternprogram.squar;

public class SquareFrom1to10Pattern {
    public static void main(String[] args) {
        int i,j,row=4;
        for ( i =1; i<=row; i++){
            for(j=1; j<=row; j++){
                System.out.print(j+" ");// j represent the value from 1 to 4 in row wise

            }
            System.out.println();
        }
    }
}
