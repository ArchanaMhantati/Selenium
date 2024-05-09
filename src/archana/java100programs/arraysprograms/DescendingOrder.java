package archana.java100programs.arraysprograms;

public class DescendingOrder {
    public static void main(String[] args) {
        int [] num ={1,6,8,9,6,5};
        int temp;
        System.out.println("Original array");
        for (int i=0; i< num.length; i++){
            System.out.print(num[i]+" ");
        }
        for (int i=0; i< num.length; i++){
            for (int j=i+1; j< num.length; j++){
                if (num[i]<num[j]){
                    temp = num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Descending  Array");
       for (int i=0; i< num.length; i++){
           System.out.print(num[i]+" ");
       }
    }
}
