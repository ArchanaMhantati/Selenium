package archana.javaprograms.arryasprograms;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int [] arr = {2,3,4,6,7,4,5,3,4,5};
        int [] fr = new int[arr.length];
        int visited = -1 ;
        for (int i=0; i< arr.length; i++){
            int count = 1 ;
            for (int j =i+1; j< arr.length; j++){
                if (arr[i]==arr[j]){
                    count++;
                    fr[j]=visited;
                }
            }
            if (fr[i]!=visited){
                fr[i]=count;
            }
        }
        for (int i=0; i< fr.length; i++){
            if (fr[i]!=visited){
                System.out.println(arr[i]+ "========="+fr[i]);
            }
        }

    }

}
