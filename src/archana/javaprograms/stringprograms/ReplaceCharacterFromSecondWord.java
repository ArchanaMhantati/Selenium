package archana.javaprograms.stringprograms;

public class ReplaceCharacterFromSecondWord {
    public static void main(String[] args) {
        String name = "Archana Mantati";
        String [] word = name.split(" ");
        String newword = word[1].replace('a','h');
        System.out.println(word[0] + newword);
    }
}
