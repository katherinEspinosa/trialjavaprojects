package JFrame;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;


public class MyFrame extends JFrame{
    
    MyFrame() {

         //Jthis = a GUI window to add components to 

         this.setTitle("Katherine Maegan"); //sets title of this
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
         this.setResizable(false); // prevent this from being resized
         this.setSize(420,420); //sets the x-dimension and y-dimension of this
         this.setVisible(true); //make this visible 
 
      
        ImageIcon image = new ImageIcon("C:\\Users\\EDE\\OneDrive\\Pictures\\Katherine Maegan Espinosa\\logo1.png"); //create an ImageIcon
        this.setIconImage(image.getImage()); // change icon of this
        this.getContentPane().setBackground(Color.PINK); //change color of background
 
     }
 }
    
