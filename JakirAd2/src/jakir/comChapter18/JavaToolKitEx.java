package jakir.comChapter18;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JavaToolKitEx {
    public JavaToolKitEx(){
     
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        JLabel toolLabel = new JLabel("Username");
        toolLabel.setToolTipText("Enter Your username");
        
        JTextField tooltipTextfied =new JTextField(15);
        tooltipTextfied.setToolTipText("Enter username over here, that other Thing");
        JButton toolButton = new JButton("Click me");
        toolButton.setToolTipText("Click this button to make something happen.");
        f.getContentPane().setLayout(new FlowLayout());
        f.add(toolLabel);
        f.getContentPane().add(tooltipTextfied);
        f.getContentPane().add(toolButton);
        f.setSize(100, 200);
        f.pack();
       
       f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
 
    public static void main(String[] args) {
    new JavaToolKitEx();   
    }
  
    
    
}
