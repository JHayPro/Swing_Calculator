package packLab1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab1 {
    private JButton button1, button2, button3, button4;//Buttons
    private JPanel panel1;//Panel
    private JLabel display;//Display text for what button was pressed

    public Lab1() {//Polls for button press
        button1.addActionListener(new ActionListener() {//If button 1 is pressed change the display object's text
            @Override
            public void actionPerformed(ActionEvent evt) {
                display.setText("Last Button Pressed Was No. 1");
            }
        });
        button2.addActionListener(new ActionListener() {//If button 2 is pressed change the display object's text
            @Override
            public void actionPerformed(ActionEvent evt) {
                display.setText("Last Button Pressed Was No. 2");
            }
        });
        button3.addActionListener(new ActionListener() {//If button 3 is pressed change the display object's text
            @Override
            public void actionPerformed(ActionEvent evt) {
                display.setText("Last Button Pressed Was No. 3");
            }
        });
        button4.addActionListener(new ActionListener() {//If button 4 is pressed change the display object's text
            @Override
            public void actionPerformed(ActionEvent evt) {
                display.setText("Last Button Pressed Was No. 4");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab1");//Creates a frame
        frame.setContentPane(new Lab1().panel1);//Sets container for lab1
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Sets close on exit
        frame.pack();//Pack contents of frame
        frame.setVisible(true);//Makes the frame visible
    }
}
