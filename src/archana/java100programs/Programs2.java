package archana.java100programs;

import sun.util.calendar.LocalGregorianCalendar;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Programs2 {
    public void removeSpaceOfMatrix(){
        String str1 = "   My name is Archana   ";
        System.out.println(str1.trim());//remove space only leading and trailing
        System.out.println(str1.replaceAll("\\s",""));
    }
    public void replaceString(){
        String str2 = "My name is krishna";
        System.out.println(str2.replace("Krishna","Radha"));
        System.out.println(str2.concat("I am so noughty"));
       // System.exit(0);//stop to nextExecution
    }
    static void howToThrowException(int age ){
        if (age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("Welcome to vote on java ");
    }
    public void getCurrentDateAndTime(){
        int day,month,year;
        int second,minute,hour;
        GregorianCalendar date = new GregorianCalendar();
        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);

        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);

        System.out.println(day +"/"+month+"/"+year);
        System.out.println(second+"/"+minute+"/"+hour);
    }
    public void randomNumber(){
        Random rd = new Random();
        int c ;
        for ( c =1 ;c<10 ;c++){
            System.out.println(rd.nextInt(100));
        }
    }
    public void howToOpenNotePad(){
        Runtime rn =Runtime.getRuntime();
        try{
            rn.exec("notepad");
        }catch (IOException e ){
            System.out.println(e);
        }
    }
    public void bubbleSortInDescendingOrder(){
        int[] in = {2,1,4,7,5,9};
        for (int i=0; i< in.length-1; i++){
            int temp ;
            for (int j=0; j<in.length-1; j++){
                if (in[j+1]>in[j]){
                    //swapping
                   temp = in[j];
                   in[j]=in[j+1];
                   in[j+1]=temp;
                }
            }
        }
        for (int i=0; i< in.length; i++){
            System.out.print(in[i] + " ");
        }
    }
    public void howToWriteDataInTextFile(){
        try{
            FileOutputStream fout =new FileOutputStream("F:\\testout.txt");
            byte bt = 002;
            fout.write(bt);
            fout.close();
            System.out.println("java");
        }catch(IOException e){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        Programs2 obj = new Programs2();
       // obj.removeSpaceOfMatrix();
       // obj.replaceString();
       // howToThrowException(17);
       // System.out.println("rest of the code");
       // obj.getCurrentDateAndTime();
       // obj.randomNumber();
       // obj.howToOpenNotePad();
        obj.bubbleSortInDescendingOrder();
       // obj.howToWriteDataInTextFile();




    }
}
