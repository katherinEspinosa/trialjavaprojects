package JButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class MyFrame extends JFrame implements ActionListener{
    
    JButton button;
    JLabel label;

    MyFrame (){

        ImageIcon icon = new ImageIcon("C:\\Users\\EDE\\Downloads\\smiley.jpg");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\EDE\\Downloads\\cute.gif");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(500,250,500,500);
        label.setVisible(false);
        label.setHorizontalAlignment(JButton.CENTER);
        label.setVerticalAlignment(JButton.BOTTOM);

        button = new JButton();
        button.setBounds(100,100,500,550);
        // button.addActionListener(e -> System.out.println("HI!")); //instead of implementing actionlistener, we can use it directly like this.
        button.addActionListener(this);
        button.setText("Say Hi!"); //set text on button
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setIconTextGap(-15); //gap of the text and imageicon
        button.setForeground(Color.BLACK); //font color
        button.setBackground(Color.lightGray); //button bg color
        button.setBorder(BorderFactory.createEtchedBorder()); //button border
        // button.setEnabled(false); //to disable a button

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000,1000);
        this.setVisible(true);
        this.add(button);
        this.add(label);
        
  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            // System.out.println("Hello there");
            //button.setEnabled(false); button to use once then disabled.
            label.setVisible(true);
        }
    } //use this when you use implement Action Listener
}
