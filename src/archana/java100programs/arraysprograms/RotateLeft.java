package archana.java100programs.arraysprograms;

public class RotateLeft {
    public static void main(String[] args) {
       int [] arr ={1,2,3,4,5,6};
       int n=2;
        System.out.println("Original array");
       for (int i=0; i< arr.length; i++){
           System.out.print(arr[i] +" ");
       }
       for (int i=0; i<n;i++){
           int j, first;
          first = arr[0];
          for ( j=0; j< arr.length-1; j++){
              arr[j] = arr[j+1];
          }
           arr[j] =first;
       }
        System.out.println("Left Rotation of Arrays from 3rd position");
       for (int j=0; j< arr.length; j++){
           System.out.print(arr[j] +" ");
       }
    }

}
