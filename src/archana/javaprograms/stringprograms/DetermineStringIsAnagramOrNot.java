package archana.javaprograms.stringprograms;

import java.util.Arrays;

public class DetermineStringIsAnagramOrNot {
    //Two String are said to be anagram if they contain the same character. however,
    // the order or sequence of the character can be  different
    public static void main(String[] args) {
        String str1 = "Paru";
        String str2 = "Arpu";
        //Conversion of String in lower case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //Checking length of the string
        if (str1.length()!=str2.length()){
            System.out.println("Sorry Both String are not Anagram");
        }
        else {
            //Converting both the strings to character Array
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

            //Sorting the Arrays using in built function sort()
            Arrays.sort(string1);
            Arrays.sort(string2);
            //comparison between the two Arrays using inbuilt function equals()
            if (Arrays.equals(string1, string2) == true) {
                System.out.println("Both Strings are Anagrams");
            } else {
                System.out.println("Both the Strings Are not Anagrams");
            }
        }
    }
}
