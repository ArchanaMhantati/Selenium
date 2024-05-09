package archana.java100programs.arraysprograms;

public class NumberOfElementsPresentInArray {
    public static void main(String[] args) {
        int[] num ={2,5,6,8,9};
        int count =0;
        for (int i=0;i< num.length; i++){
            count++;
        }
        System.out.println(count);
    }
}
