package archana.javaprograms.stringprograms;

public class StringInverse {
    public static void main(String[] args) {
        String name = "Arc\nhana\n";
        String temp ="";
        char[] charr = name.toCharArray();

        for(int i =charr.length-1; i>=0; i-- ){
            temp=temp+charr[i];
        }
        System.out.println(temp);
    }
}
