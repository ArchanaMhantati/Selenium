package archana.javaprograms.basicprograms.random;
//Random between range of 300 to 400 ie max is 400 and min is 200
// Formula : Math.random()*(max-min+1) +min

public class RanNumBetweenSpecifiedRange {
    public static void main(String[] args) {
        int min = 300;
        int max = 400;
        // Generate random value of type double between 300 to 400
        System.out.println("Random Value of type double between  " +min+ "to" + max + ":");
        double a = Math.random() * (max - min + 1) + min;
        System.out.println(a);
        // Generate random value of type int between 300 to 400
        System.out.println("Random Value of type int between" + min + "to" + max + ":");
        int b = (int) (Math.random() * (max - min + 1) + min);// int Should be compulsory after = sign
        System.out.println(b);
    }
}

