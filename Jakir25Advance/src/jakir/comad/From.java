
package jakir.com805;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;

public class From {
    public static void main(String[] args) {
           JFrame aWindow = new JFrame("This is Window Titile");
          
        Toolkit theKit = aWindow.getToolkit();
        Dimension wnDSize = theKit.getScreenSize();
        aWindow.setBounds(wnDSize.width/4, wnDSize.height/4, wnDSize.width/2, wnDSize.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 10, 100);
        Container content = aWindow.getContentPane();
        content.setLayout(flow);
        
        for(int i = 1; i<=6; i++){
            content.add(new JButton("Press "+i));
            aWindow.pack();
            aWindow.setVisible(true);
         aWindow.pack();
        }
    }
}

/*FlowLayout
row use
1. if row fillupsspace, then start new row
2.By default , position is center.
3.Default orientation is L+R(left to right)
4.

* 
* */