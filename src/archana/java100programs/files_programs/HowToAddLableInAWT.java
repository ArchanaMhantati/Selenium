package archana.java100programs.files_programs;

import java.awt.*;
public class HowToAddLableInAWT {
    public static void main(String[] args) {
        Frame f = new Frame("Label example");
        Label l1,l2;
        l1 = new Label("First Label");
        l1.setBounds(100,50,80,80);
        l2 = new Label("Second Label");
        l2.setBounds(200,40,50,60);
        f.add(l1); f.add(l2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

}
