package archana.javaprograms.basicprograms.patternprogram.pyramid;

public class PyramidPatternAlphabets {
    public static void main(String[] args) {
        int i,j,row = 5;
        for(i=0; i<=row; i++){
            for(j=0; j<=row-i; j++){//Inner loop for space by row wise
                System.out.print(" ");// to print space between two stars
            }
            for(j=0;j<=i; j++){
                char ch =(char)(64+j);
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }
}
