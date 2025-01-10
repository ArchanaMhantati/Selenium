package archana.javaprograms.basicprograms.patternprogram.pyramid;

public class DiamondShapePyramid {
    public static void main(String[] args) {
        int i, j, k, row = 4;
        for (i = 0; i < row; i++) {
            for (j = 0; j < row - i - 1; j++) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
