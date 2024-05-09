package archana.java100programs.arraysprograms;

import java.util.Scanner;

public class DuplicatesOFArray {
    public static void main(String[] args) {
        int[] num={3,4,5,6,5,6,7};
        for (int i=0; i< num.length; i++){
            for (int j=i+1; j< num.length; j++){
                if (num[i]==num[j]) {
                    System.out.println(num[j]);
                }
            }
        }
    }
}

