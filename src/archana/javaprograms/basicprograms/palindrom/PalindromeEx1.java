package archana.javaprograms.basicprograms.palindrom;
//Palindrome number is a number that is same as inverse.eg 545,151

public class PalindromeEx1 {
    //To check whether number is palindrome or not
    public static void main(String[] args) {
        int r,sum=0,temp;// initial value of sum = 0
        int n = 151;//To check given number is palindrome
        temp=n;
        while (n>0){
            r=n%10;//Getting remainder
            sum = sum*10 +r;//0+1=1
            n=n/10;//15.1
        }
        if(temp==sum)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not palindrome Number");
    }
}
