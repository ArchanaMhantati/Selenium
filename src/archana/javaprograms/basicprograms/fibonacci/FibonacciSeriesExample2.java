package archana.javaprograms.basicprograms.fibonacci;
//Recursion mean call the function and methods again an again
//Fibonacci Series using Recursion

public class FibonacciSeriesExample2 {
    static int n1=0,n2=1,n3=0;
    static void printFibonacci(int count){
        if(count>0){
            n3 = n1 + n3;
            n1 = n2;
            n2= n3;
            System.out.println(" " +n3);
            printFibonacci(count-1);
        }
    }
    public static void main(String[] args) {
        int count =10;
        System.out.println(n1+""+n2);//Printing 0 and 1
        printFibonacci(count-2);//n-2 because 2 numbers already printed
    }
}
