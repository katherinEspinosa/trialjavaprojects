package Checkboxes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;

    MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // xIcon = new ImageIcon("X.jpg");
        // checkIcon = new ImageIcon("Check.png");


        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I am cute");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Arial",Font.BOLD,25));
        // checkBox.setIcon(checkIcon);
        // checkBox.setSelectedIcon(xIcon);

    
        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==button) {
            System.out.println(checkBox.isSelected());
        }
    }
}