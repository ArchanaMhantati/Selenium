package archana.java100programs.files_programs;

import java.io.*;
import java.net.URL;
public class CreatingTheFileInProjectAndActionsOnIt {
    public void getUrlOfSiteUsingJavaProgram(){
        try {
            URL url = new URL("https://www.google.com/java");
            System.out.println("Protocol : " +url.getProtocol());
            System.out.println("Host name : " +url.getHost());
            System.out.println("Port Number :"+url.getPort());
            System.out.println("File name : " +url.getFile());
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws IOException {
        //Creating file
        File file = new File("sample.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        //writing a text into file using FileOutputStream
        FileOutputStream fos = new FileOutputStream(file);
        String textToBeWritten = "My name is Archana";
        fos.write(textToBeWritten.getBytes());
        fos.flush();
        fos.close();
        //reading a text of file Using FileInputStream
        FileInputStream fis = new FileInputStream(file);
        int  i  = fis.read();
        while (!(i==-1)){
            char c = (char)i;
            System.out.print(c);
            i = fis.read();
        }
        fis.close();
        CreatingTheFileInProjectAndActionsOnIt obj = new CreatingTheFileInProjectAndActionsOnIt();
        obj.getUrlOfSiteUsingJavaProgram();
    }
}

