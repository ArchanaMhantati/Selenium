package archana.javaprograms.basicprograms.patternprogram.squar;

public class SquarePatternByTaking1111AndIterated {
    public static void main(String[] args) {
        int i,j,row=4;
        for ( i =1; i<=row; i++){
            for(j=1; j<=row; j++){
                System.out.print(i+ " ");// print the value of 1 in 4 times in row and iterate the value of j
            }
            System.out.println();
        }
    }
}
