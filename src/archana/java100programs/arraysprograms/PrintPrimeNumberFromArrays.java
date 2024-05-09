package archana.java100programs.arraysprograms;

public class PrintPrimeNumberFromArrays {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5,6,7,8,9,10};
        for (int i :number) {
            int count=0;
            for (int j=1; j<=i;j++) {
                if (i % j == 0) {
                    count++;
                }
            }if (count==2) {
              System.out.print(i+" ");
            }
        }
    }
}
