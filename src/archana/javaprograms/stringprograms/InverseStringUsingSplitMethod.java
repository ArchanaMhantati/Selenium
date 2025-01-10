package archana.javaprograms.stringprograms;

public class InverseStringUsingSplitMethod {
    public static void main(String[] args) {
        String name  = new String( "My name is Archana");
      String [] stringArr = name.split(" ");
        for(int i = stringArr.length-1; i>0; i--){
            System.out.println(stringArr[i]);
        }
    }
}
