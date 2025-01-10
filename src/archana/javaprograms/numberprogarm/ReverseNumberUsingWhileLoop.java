package archana.javaprograms.numberprogarm;
//using while loop

public class ReverseNumberUsingWhileLoop {
    public static void main(String[] args) {
        int number = 3245678,reverse =0;
        while (number!=0) {
            int remainder = number%10;//8
            reverse = reverse*10 +remainder;//8
            number= number/10;//324567
        }
        System.out.println("The reverse of te given number is:" +reverse);
    }
}
