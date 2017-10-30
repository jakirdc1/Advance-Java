
package jakir.com818;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TryBoxLayout {
 static JFrame aWindow = new JFrame("This is Window Titile");
    public static void main(String[] args) {
       
        Toolkit theKit = aWindow.getToolkit();
        Dimension wnDSize = theKit.getScreenSize();
        aWindow.setBounds(wnDSize.width/4, wnDSize.height/4, wnDSize.width/2, wnDSize.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        Box left = Box.createVerticalBox();
        ButtonGroup radioGroup = new ButtonGroup();
        JRadioButton rbutton;
        radioGroup.add(rbutton =new JRadioButton("Red"));
        left.add(rbutton);
        
        radioGroup.add(rbutton =new JRadioButton("Green"));
        left.add(rbutton);
        
        radioGroup.add(rbutton =new JRadioButton("Blue"));
        left.add(rbutton);
        
        radioGroup.add(rbutton =new JRadioButton("Yellow"));
        left.add(rbutton);
        
        Box right =Box.createVerticalBox();
        right.add(new JCheckBox("Dashed"));
        right.add(new JCheckBox("Thick"));
        right.add(new JCheckBox("Rounded"));
        
        Box top =Box.createHorizontalBox();
        top.add(left);
        top.add(right);
        
        JPanel bottomPanel = new JPanel();
        javax.swing.border.Border edge=BorderFactory.createRaisedBevelBorder();
        
        JButton button;
        Dimension size =new Dimension(80,20);
        bottomPanel.add(button = new JButton("Dfaults"));
                button.setBorder(edge);

}
}