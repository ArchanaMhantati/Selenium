package archana.javaprograms.basicprograms.patternprogram.squar;

public class SquareINABCDPattern {
    public static void main(String[] args) {
        int i,j,row=4;
        for ( i =1; i<=row; i++){
            for(j=1; j<=row; j++){
                System.out.print((char)(64+j)+" "); //By ascii code
            }
            System.out.println();//Printing A B C D in new line
        }
    }
}
