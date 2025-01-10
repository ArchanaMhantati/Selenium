package archana.javaprograms.stringprograms;

public class ReplaceNonDigitAndDigitFromString {
    public static void main(String[] args) {
        String word = "HelloArchanaMhantati57459";
       String newword = word.replaceAll("\\D","");
        System.out.println("Only numbers : " +newword);
        String newword1 = word.replaceAll("\\d","" );
        System.out.println("Only words : " +newword1);
    }
}
