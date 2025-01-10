package archana.javaprograms.basicprograms.armstrong;
//ArmStrong number is a positive m-digit  number that is equal to the sum of mth power
// of their digit .It is also known as Pluperfect,Plus Perfect
//ex : 153 = 1^3 + 5^3 + 3^3

import java.util.Scanner;

public class ArmStrongNumber {
    //function to check if the number is ArmStrong or not
    static boolean isArmstrong(int n) {
        int temp, digit = 0, last = 0, sum = 0;
        //assigning n into a temp variable
        temp = n;
        //loop execute until the condition becomes
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }
        temp = n;
        while (temp > 0) {
            //determines the last digit from  the number
            last = temp % 10;
            //calculates the power of a number up to digit times and add the resultant to the
            // sum variable
            sum += (Math.pow(last, digit));
            //remove the last digit
            temp = temp / 10;
        }
        //compares the sum with n
        if (n == sum)
            //return if sum and n are equal
            return true;
        //return false if sum and n are not equal
        else return false;
    }
    //driver code
    public static void main(String[] args) {
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the limit :");
        //read the limit from the user
        num = sc.nextInt();
        System.out.println("Armstrong Number up to " +num+"are :");
        for(int i =0; i<=num; i++) {
            //function calling
            if (isArmstrong(i));
            //Prints the armstrong numbers
            System.out.print(i + ",");
        }


    }

}