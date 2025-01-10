package archana.javaprograms.stringprograms;

public class ToCountPunctuateMark {
    public static void main(String[] args) {
        int count = 0;
        String string = "She is Very Beautiful girl.'Wow'! ";
        for(int i =0; i<string.length(); i++){
            if(string.charAt(i) == '!' || string.charAt(i) == ',' || string.charAt(i) == ';' || string.charAt(i) == '.' ||  string.charAt(i) == '?' ||
                    string.charAt(i) == '-' ||
                    string.charAt(i) == '\'' || string.charAt(i) == '\"' || string.charAt(i) == ':');
        }
        count++;
        System.out.println("The Number of Punctuation exits in The String : " +count);
    }
}
