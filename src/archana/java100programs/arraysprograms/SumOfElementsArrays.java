package archana.java100programs.arraysprograms;

public class SumOfElementsArrays {
    public static void main(String[] args) {
        int[] num ={3,4,6,7,8,9};
        int sum=0;
        for (int i=0; i< num.length; i++){
            sum = sum +num[i];
        }
        System.out.println(sum);
    }
}
