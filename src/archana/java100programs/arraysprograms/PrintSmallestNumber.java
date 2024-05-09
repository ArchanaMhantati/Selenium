package archana.java100programs.arraysprograms;

public class PrintSmallestNumber {
    public static void main(String[] args) {
        int [] num ={2,3,4,5,6,7,4};
        int min;
        min=num[0];
        for (int i=0; i< num.length; i++){
            if (num[i]<min){
                min=num[i];
            }
        }
        System.out.println(min);
    }
}
