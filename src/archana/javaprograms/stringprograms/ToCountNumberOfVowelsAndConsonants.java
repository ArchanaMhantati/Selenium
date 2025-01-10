package archana.javaprograms.stringprograms;

import com.sun.deploy.security.SelectableSecurityManager;

public class ToCountNumberOfVowelsAndConsonants {
    public void ToCount(){
        String str = "My name is Archana".toLowerCase();
        char[] chrr = str.toCharArray();
        int count = 0;
        for (char ch :chrr){
            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        String string = "My name is archana";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i'
                    || string.charAt(i) == 'o' || string.charAt(i) == 'u')
                vowels++;
            else
                consonants++;
        }
            System.out.println("The Number of Vowels : " +vowels);
            System.out.println("The Number of Consonants : " + consonants);
            ToCountNumberOfVowelsAndConsonants obj = new ToCountNumberOfVowelsAndConsonants();
            obj.ToCount();

    }
}
