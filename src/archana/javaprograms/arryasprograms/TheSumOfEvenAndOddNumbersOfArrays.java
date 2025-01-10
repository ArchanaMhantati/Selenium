package archana.javaprograms.arryasprograms;

public class TheSumOfEvenAndOddNumbersOfArrays {
    public static void main(String[] args) {
        int [] arr = {23,56,5,9,45,7};
        int sumEven =0;
        int sumOdd =0;
        for (int i = 0 ; i<arr.length; i++){
            if (arr[i]%2==0){
                //System.out.println(arr[i]);
                sumEven = sumEven +arr[i];
            }
            else {
                //System.out.println(arr[i]);
                sumOdd = sumOdd + arr[i];
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);

    }
}
