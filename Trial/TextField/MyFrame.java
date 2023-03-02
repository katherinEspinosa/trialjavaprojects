package TextField;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {

    //declare this outside of the constructor so that the actionperformed can access it.
    JButton button;
    JTextField textField;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font ("Arial", Font.BOLD, 20));
        textField.setForeground(Color.green);
        textField.setBackground(Color.black);

        this.add(button);
        this.add(textField);
        this.pack(); //so that the size of the frame will adjust to the components that you add
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button) {
            System.out.println("Hello, "+ textField.getText());
            button.setEnabled(false); //to only use the button once
            textField.setEditable(false); //so that we cannot edit the input textfield after we submit

        }
    }
}
