package archana.javaprograms.stringprograms;

public class ToCountTotalNumberOfWords {
    public static void main(String[] args) {
        String string = "My name is Archana Mhantati";
        int count = 0;
        for (int i = 0; i <string.length(); i++) {
            if (string.charAt(i)!=' ')
                count++;
        }
        //Display the total number
        System.out.println("The total number of character in a string :" + count);
    }
}
