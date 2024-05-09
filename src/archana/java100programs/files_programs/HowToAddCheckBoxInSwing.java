package archana.java100programs.files_programs;

import javax.swing.*;

public class HowToAddCheckBoxInSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JCheckBox checkBox1 = new JCheckBox("c#");
        checkBox1.setBounds(100,200,40,50);
        JCheckBox checkBox2 = new JCheckBox("java");
        checkBox2.setBounds(300,400,40,50);
        f.add(checkBox1);
        f.add(checkBox2);
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
