
package jakir.com840;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class TrySringLayout {
    static JFrame aWindow = new JFrame("This is Window Titile");
    public static void main(String[] args) {
       
        Toolkit theKit = aWindow.getToolkit();
        Dimension wnDSize = theKit.getScreenSize();
        aWindow.setBounds(wnDSize.width/6, wnDSize.height/6, 2*wnDSize.width/3, 2*wnDSize.height/3);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SpringLayout layout = new SpringLayout();
        Container content =aWindow.getContentPane();
        
        content.setLayout(layout);
        JButton[] buttons=new JButton[6];
        SpringLayout.Constraints constr=null;
        for(int i=0; i<buttons.length; i++){
        buttons[i]=new JButton("Press" +(i+1));
          content.add(buttons[i]);
        
        }
    Spring xPring = Spring.constant(5,15,25);
    Spring yPring = Spring.constant(10,30,50);
    constr =layout.getConstraints(buttons[0]);
    constr.setX(xPring);
    constr.setY(yPring);
    for(int i=1; i<buttons.length; i++){
    constr=layout.getConstraints(buttons[i]);
    layout.putConstraint(SpringLayout.SOUTH, buttons[i], xPring,SpringLayout.NORTH, buttons[i-1]);
    layout.putConstraint(SpringLayout.EAST, buttons[i], yPring,SpringLayout.SOUTH, buttons[i-1]);
    }
    aWindow.setVisible(true);
}
}