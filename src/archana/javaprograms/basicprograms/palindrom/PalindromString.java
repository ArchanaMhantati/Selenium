package archana.javaprograms.basicprograms.palindrom;

public class PalindromString {
    public static void main(String[] args) {
        String  str1 ="Naresh";
        String str2 = "Areshn";
        if(str1.length()!=str2.length()){
            System.out.println("String is not palindrom ");
        }else {
            str1.toLowerCase().toCharArray();
            str2.toLowerCase().toCharArray();

        }

    }

}
