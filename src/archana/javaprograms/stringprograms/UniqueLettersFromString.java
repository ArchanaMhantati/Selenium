package archana.javaprograms.stringprograms;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class UniqueLettersFromString {
    public static void main(String[] args) {
       String str = "Archana Mhantati";
       Set<Character > st = new LinkedHashSet<>();
      char[] ch =  str.toCharArray();
        for (char s :ch) {
            st.add(s);
        }
        StringBuilder sb = new StringBuilder();
        for (char c :st){
            sb.append(c);
        }
        System.out.println(sb.toString().replaceAll("//s"," "));
    }
}
