package archana.java100programs;
import java.util.Arrays;
import java.util.Scanner;

public class Programs1 {
    String s;
    int i ;
    float f ;
    int temperature;
    Scanner sc = new Scanner(System.in);
    public void Programs1(){
        System.out.println("In programs1 constructor");
    }
    public void from1to1oIntegersUsingScanner(){
        System.out.println("Enter String  : ");
        s = sc.nextLine();
        System.out.println( "After Enter the String : " +s);

        System.out.println("Enter Integer :");
        i = sc.nextInt();
        System.out.println("After Enter the Integer : " +i);

        System.out.println("Enter Float");
        f = sc.nextFloat();
        System.out.println("After Enter the Float : " +f);
    }
    public void convertFahrenheitToCelsius(){
        System.out.println("Enter the Temperature in Fahrenheit :" );
        temperature = sc.nextInt();
        temperature = ((temperature-32)*5)/9;
        System.out.println("Temperature in Celsius : " +temperature) ;
    }
    public void swappingOf3Number(){
        int a  = 1;
        int b = 2 ;
        int c = 4 ;
        a = a + b +c ;//7
        b = a - (b+c) ;//1
        c = a - (b+c);//2
        a = a - (b+c) ;//4
      //  a = a + c ;
        System.out.println( "After Swapping the Number " +a +" " +b +" " +c );
    }
    public void swappingOf2Number(){
        int a = 3 ;
        int b = 5 ;
        a = a + b ;
        b = a - b ;
        a = a - b ;
        System.out.println("After Swapping 2 Numbers " +a +"_"+b);
    }
    public void largestNumber(int a , int b ,int c){
        if (a>b && a>c){
            System.out.println("a is greatest Number ");
        }else if (b>a && b>c) {
            System.out.println("b is greatest Number");
        }else if (c>a && c>b){
            System.out.println("c is greatest Number");
        }
    }
    public void howToCheckGivenNumberOddOrEven(){
        System.out.println("Enter The given number : ");
         i = sc.nextInt();
         if (i%2==0){
             System.out.println("Given Number is Even number");
         }else {
             System.out.println("Given Number is Odd number ");
         }
    }
    public void factorialOfGivenNumber(){
        int num;
        System.out.println("Enter the Number : ");
        num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i<=num; i++){
            fact = fact *i;
        }
        System.out.println(fact);
    }

    public void howToCompare2String(){
        System.out.println("Enter first String : ");
       String s1 =  sc.nextLine();
        System.out.println("Enter Second String : ");
        String s2 = sc.nextLine();
        if (s1.compareTo(s2)>0){
            System.out.println("First String is greatest than Second");
        }else if (s1.compareTo(s2)<0){
            System.out.println("Second String is smaller than first");
        }else{
            System.out.println("Two Strings are equals");
        }
    }
    public void starConsole(){
        int row = 7;
        for (int i = 1; i<=row; i++){
            for (int j =1 ; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void inversionOfStarRightStarPattern(){
        int row = 7;
        for (int i =0;i<=row; i++){
            for (int j =row; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void reverseNumber(){
        int num = 123;
        int  r ;
        int sum = 0;
        while (num>0){
            r = num%10;
            num = num/10;
            sum= sum*10 + r;
        }
        System.out.println("Reverse Number : " +sum);
    }
    public void bubbleSort(){
        int temp ;
        int[] intArr ={60,40,30,70,10};
        for (int i =0; i< intArr.length; i++){
            for (int j=0; j< intArr.length-1; j++){
                if (intArr[j]>intArr[j+1]){
                    temp = intArr[j];
                    intArr[j]=intArr[j+1];
                    intArr[j+1] =temp;
                }
            }
        }
        for (int i=0; i<intArr.length; i++){
            System.out.print(intArr[i] +" ");
        }
    }
    public void printMultiplicationTable(){
        for (int i =2 ; i<=10; i++){
            for (int j =1; j<=10; j++){
                int table = i*j;
                System.out.println(table);
            }
        }
    }
    public void printAlphabetsFromAToZ(){
        char ch ;
        for (ch ='a'; ch<='z'; ch++){
            System.out.println(ch +" ");
        }
    }
    public void checkUserNumberIsPrimeOrNotUsingScanner(){
        System.out.println("Enter the number :" );
       i =  sc.nextInt();
      //  System.out.println("Enter the number :" +i);
        int count = 0;
            for (int i1 = 1; i1 <= i; i1++) {
                if (i % i1 == 0) {
                    count++;
                }
            }
            if (count == 2) {
            System.out.println("The number is prime Number");
            }
        else {
            System.out.println("The number is not prime Number");
        }
    }
    public void primeNumberFrom1To100(){
        for (int i=1; i<=100; i++){
            int count=0;
            for (int j=1; j<=i; j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.println(i);
            }
        }
    }
    public void checkNumberIsAnagramOrNot(){
        int num1 = 234;
        int num2 = 243;
        char[]  ch1 = Integer.toString(num1).toCharArray();
        char[] ch2 = Integer.toString(num2).toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1,ch2)){
            System.out.println("The numbers is anagram");
        }else {
            System.out.println("The number is not anagram");
        }
    }
    public void floydTriangle(){
        int rows = 7;
        int num = 1;
       for (int i=1; i<=rows; i++){
           for (int j=1; j<=i; j++){
               System.out.print(num + " ");
               num++;
           }
           System.out.println();
       }
    }
    public void substring(){
        String str ="abcdabc";
       //char[] chArr = str.toCharArray();
       for (int i =0; i<=str.length(); i++){
           for (int j=i+1; j<=str.length(); j++){
               String st = str.substring(i,j-1);
               System.out.println(st);
           }
       }
    }
    public void palindromeOfString(){
        String str = "aba";
      String reverse = "" ;
      for (int i = str.length()-1;i>=0; i--){
          reverse = reverse + str.charAt(i);
      }
      if (str.equals(reverse)){
          System.out.println("The string is palindrome");
      }else {
          System.out.println("String is not palindrome");
      }
    }
    public void palindromeOfNumber(){
        int num = 234;
        int r,temp,sum=0;
        temp=sum;
        while (num>0){
            r= num%10;
            num = num/10;
            sum=sum*10+r;
        }
        if (temp==sum){
            System.out.println("The given String is Palindrome");
        }else {
            System.out.println("The given String is Palindrome");
        }
    }
    public void anagramOfString(){
        String str1 = "Archana".toLowerCase();
        String str2 ="Anahcra".toLowerCase();
        boolean flage = true;
        if (str1!=str2){
            flage = false;
        }else {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
           flage = Arrays.equals(ch1 , ch2);
        }
        if (flage=true){
            System.out.println("The given String is Anagram");
        }else {
            System.out.println("The given String is not Anagram");
        }
    }
    public void compareTo(){
        String str1 = "Archana";
        String str2 = "Radha";
        String str3 = "Archana";
        System.out.println(str1.compareTo(str2));
        System.out.println(str3.compareTo(str1));
    }
    public void stringWidthWithSpecificChar(){
        String str = "Java is my not good";
        System.out.println(str.endsWith("good"));//true
        System.out.println(str.endsWith("r"));//false
    }
    public static void main(String[] args){
        Programs1 obj = new Programs1();
        //obj.from1to1oIntegersUsingScanner();
        //obj.convertFahrenheitToCelsius();
        //obj.swappingOf3Number();
      //  obj.swappingOf2Number();
        //obj.largestNumber(2,4,7);
       // obj.howToCheckGivenNumberOddOrEven();
       // obj.factorialOfGivenNumber();
       // obj.howToCompare2String();
        //obj.starConsole();
       // obj.reverseNumber();
       // obj.bubbleSort();
       // obj.inversionOfStarRightStarPattern();
        //obj.printAlphabetsFromAToZ();
       // obj.printMultiplicationTable();
       // obj.checkUserNumberIsPrimeOrNotUsingScanner();
      // obj.primeNumberFrom1To100();
       // obj.checkNumberIsAnagramOrNot();
        obj.floydTriangle();
       // obj.substring();
        //obj.palindromeOfString();
        //obj.palindromeOfNumber();
       // obj.anagramOfString();
       // obj.compareTo();

    }
}
