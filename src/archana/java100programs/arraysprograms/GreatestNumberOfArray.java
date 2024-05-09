package archana.java100programs.arraysprograms;

public class GreatestNumberOfArray {
    public static void main(String[] args) {
        int[] num ={1,2,5,3,7,9,1};
        int max;
        max=num[0];
        for (int i=0; i< num.length; i++){
            if (num[i]>max){
               max= num[i];
            }
        }
        System.out.println(max);
    }
}
