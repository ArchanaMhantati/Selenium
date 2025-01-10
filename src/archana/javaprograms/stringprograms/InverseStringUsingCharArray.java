package archana.javaprograms.stringprograms;

public class InverseStringUsingCharArray {
    public static void main(String[] args) {
        String name = "Archana Neelkanth Mhantati";
        char[] charArr = name.toCharArray();
        for(int i = name.length()-1; i>0; i--){
            System.out.print(charArr[i]);
        }
    }
}
