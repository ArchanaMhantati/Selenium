package archana.javaprograms.stringprograms;

public class SubsetsOfString {
    public static void main(String[] args) {
        String string = "abc";
        for(int i = 0; i<string.length(); i++){
            for(int j = i+1; j<=string.length(); j++){
                System.out.println(string.substring(i,j));
            }
        }
    }
}