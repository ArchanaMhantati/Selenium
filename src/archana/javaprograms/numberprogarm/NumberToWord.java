package archana.javaprograms.numberprogarm;

public class NumberToWord {
    //defined static method that convert a number into word
    public static void numberToWord(char num[]) {
        //determine the number of digit in the given number
       int len= num.length;
       //Check the given number has number or not
       if(len==0) {
           System.out.println("The String is empty");
           return;
       }
       //here,we have specified the length of the number to 4
        if (len>4){
            // if the given number more than four digit number,it print the following number
            System.out.println("\n The given number has more than 4");
            return;
        }





    }

    public static void main(String[] args) {

    }
}
