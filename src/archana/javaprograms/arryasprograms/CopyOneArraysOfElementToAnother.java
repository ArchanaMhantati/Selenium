package archana.javaprograms.arryasprograms;

public class CopyOneArraysOfElementToAnother {
    public static void main(String[] args) {
        char[] ch1 ={'a','b','c','d'};
        char[] ch2={ };
        for (int i=0; i<=ch1.length-1;i++){
            ch2[i]=ch1[i];
        }
        System.out.println(ch2);
    }
}
