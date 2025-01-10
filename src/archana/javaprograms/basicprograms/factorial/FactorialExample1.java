package archana.javaprograms.basicprograms.factorial;

public class FactorialExample1 {

    public static void main(String[] args) {
        int i, fact=1 ;
        int n=5;
        for ( i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of  5 =" +fact);
        System.out.println("----------");
    }
}
