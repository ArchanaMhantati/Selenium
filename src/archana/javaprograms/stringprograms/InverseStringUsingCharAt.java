package archana.javaprograms.stringprograms;

public class InverseStringUsingCharAt {
    public static void main(String[] args) {
        String name = "Archana Mhantati";
        for(int i = name.length()-1; i>0; i--){
            System.out.print(name.charAt(i));
        }
    }
}
