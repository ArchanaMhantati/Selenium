package archana.java100programs.files_programs;

import java.awt.*;

public class HowToCreateAWT extends Frame{
    HowToCreateAWT() {
        //Abstract window toolkit
        Button button = new Button();
        button.setBounds(20,30,50,40);
        add(button);
        setSize(200,200);//farm size 200 width and 200 height
        setLayout(null);//no layout manager
        setVisible(true); //now frame is visible
    }
    public static void main(String[] args) {
        new HowToCreateAWT();
    }
}
