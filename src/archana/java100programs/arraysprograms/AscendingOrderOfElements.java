package archana.java100programs.arraysprograms;
public class AscendingOrderOfElements {
    public static void main(String[] args) {
        int [] num ={2,5,3,1,7,6,9};
        System.out.println("Elements Without Ascending order");
        for (int i=0; i< num.length; i++){
            System.out.print(num[i]+" ");
        }
        for (int i=0; i< num.length; i++){
            int temp;
            for (int j=i+1; j< num.length; j++){
                if (num[i]>num[j]){
                    temp = num[i];
                   num[i]= num[j];
                   num[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements in Ascending order");
        for (int i =0; i< num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
}
