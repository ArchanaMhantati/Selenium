package archana.javaprograms.basicprograms.armstrong;

public class ArmStrongNumber1 {
    public static void main(String[] args) {
        int sum =0;
        int a, temp ;
        int num =153;
        temp=num;
        while (num>0){
            a=num%10;//3
            num= num /10;//15
            sum = sum + (a*a*a);
        }
        if(temp == sum){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not Armstrong number");
        }
    }
}
