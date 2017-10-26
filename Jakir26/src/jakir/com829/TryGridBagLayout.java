
package jakir.com829;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TryGridBagLayout {
   static JFrame aWindow = new JFrame("This is Window Titile");
    public static void main(String[] args) {
       
        Toolkit theKit = aWindow.getToolkit();
        Dimension wnDSize = theKit.getScreenSize();
        aWindow.setBounds(wnDSize.width/4, wnDSize.height/4, wnDSize.width/2, wnDSize.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    GridBagLayout gridbag= new GridBagLayout();
    GridBagConstraints constraints = new GridBagConstraints();
    aWindow.getContentPane().setLayout(gridbag);
    
    constraints.weightx=constraints.weighty=10.0;
    constraints.fill=constraints.BOTH;
    addButton("Press", constraints,gridbag);
    
    constraints.gridwidth=constraints.REMAINDER;
    addButton("Go", constraints,gridbag);
    
    aWindow.setVisible(true);   
            
    }
    static void addButton(String label,
                          GridBagConstraints constraints,
                          GridBagLayout layout){
        javax.swing.border.Border edge = BorderFactory.createRaisedBevelBorder();
    JButton button =new JButton(label);
    button.setBorder(edge);
    layout.setConstraints(button, constraints);
    aWindow.getContentPane().add(button);
   
    
    }
}
