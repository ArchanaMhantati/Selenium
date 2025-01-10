package archana.javaprograms.arryasprograms;

public class TheSumOfElementOfArrays {
    public static void main(String[] args) {
        int [] arr = {2,3,5,7,8,10,12};
        int sum =0;
        for (int i =0 ; i<arr.length; i++){
            sum =sum + arr[i];
        }
        System.out.println(sum);
    }
}
