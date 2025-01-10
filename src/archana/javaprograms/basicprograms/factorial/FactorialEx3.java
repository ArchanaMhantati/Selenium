package archana.javaprograms.basicprograms.factorial;
import java.math.BigInteger;

public class FactorialEx3 {
        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                BigInteger factorial = calculateFactorial(i);
                System.out.printf("%d! = %s%n", i, factorial.toString());
            }
        }
        public static BigInteger calculateFactorial(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Factorial is undefined for negative numbers");
            }
            BigInteger result = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }
    }

