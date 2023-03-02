package HowToOpenANewWindow;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{

    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");

    
    LaunchPage(){

        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(420,420));
        frame.setLayout(null);
        frame.add(myButton);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource()==myButton) {
            frame.dispose(); //code so that when you click the button, once lang siya maglalabas ng new window
            NewWindow myWindow = new NewWindow(); 

        }

    }
}