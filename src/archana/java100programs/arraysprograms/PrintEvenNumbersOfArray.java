package archana.java100programs.arraysprograms;

public class PrintEvenNumbersOfArray {
    public static void main(String[] args) {
        int [] num ={1,2,4,5,6,8,10};
        for (int i=0; i< num.length; i++){
            if (i%2==0){
                System.out.print(num[i] +" ");
            }
        }
    }
}
