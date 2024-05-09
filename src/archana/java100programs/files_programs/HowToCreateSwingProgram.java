package archana.java100programs.files_programs;

import javax.swing.*;
public class HowToCreateSwingProgram {
    public static void main(String[] args) {
        JFrame f = new JFrame();//creating instance of jFrame
        JButton b =new JButton("Click");
        b.setBounds(20,30,40,50);
        f.add(b);
        f.setSize(200,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
