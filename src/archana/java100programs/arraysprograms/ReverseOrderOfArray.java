package archana.java100programs.arraysprograms;

public class ReverseOrderOfArray {
    public static void main(String[] args) {
        int[] num={3,4,5,6,5,6,7};
        for (int i= num.length-1; i>0; i--){
            System.out.print(num[i]+" ");
        }
    }
}
