package archana.java100programs.files_programs;

import java.awt.*;

public class HowToDropdownInAWT {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Choice choice = new Choice();
        choice.setBounds(60,60,80,80);
        choice.add("Item1");
        choice.add("Item2");
        choice.add("Item3");
        choice.add("Item4");
        frame.add(choice);
        frame.setSize(200,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
