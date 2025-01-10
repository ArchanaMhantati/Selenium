package archana.typesofnumbers;

public class OddEvenNumber {
    public static void main(String[] args) {
        System.out.println("List of Even or Odd numbers in between 1 to 100");
        System.out.println("The Odd Number:");
        for(int i=0; i<=100; i++){
            if (i%2!=0){
                System.out.println(i+ "");
            }
        }
        System.out.println("The Even Number:");
        for (int i = 0; i<=100; i++){
            if ( i%2 ==0 ){
                System.out.println(i+ "");

            }
        }
    }
}
