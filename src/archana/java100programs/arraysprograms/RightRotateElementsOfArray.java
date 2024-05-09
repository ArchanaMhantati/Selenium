package archana.java100programs.arraysprograms;
public class RightRotateElementsOfArray {
    public static void main(String[] args) {
        int [] num ={2,4,5,7,9,7,3,2};
        int n=3;
        System.out.println("Original Arrays Elements");
        for (int i=0; i< num.length; i++){
            System.out.print(num[i]+" ");
        }
        for (int i=0; i<n; i++){
            int j ,last;
            last = num[num.length-1];
            for (j=num.length-1; j>0; j--){
                num[j] =num[j-1];
            }
            num[0]=last;
        }
        System.out.println();
        System.out.println("Right Rotate elements ");
        for (int i=0; i< num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
}
