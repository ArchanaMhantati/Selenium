package archana.javaprograms.basicprograms.patternprogram.triangle;

public class StarLeftAngleTriangle {
    public static void main(String[] args) {
        int i,j, row = 6;
        for(i=0; i<row;i++){// for row
            for (j=2*(row - i); j>=0; j--){//this is for space
                System.out.print(" ");
            }
            for (j=0;j<=i; j++){//column
                System.out.print("* ");
            }
            System.out.println();// for new line after printing star
        }
    }
}
