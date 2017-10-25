
package jakir.com811;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;

public class TryBorderLayout {
 //   static JFrame aWindow = new JFrame("This is Window Titile");
    public static void main(String[] args) {
        JFrame aWindow = new JFrame("This is Window Titile");
        Toolkit theKit = aWindow.getToolkit();
        Dimension wnDSize = theKit.getScreenSize();
        aWindow.setBounds(wnDSize.width/4, wnDSize.height/4, wnDSize.width/2, wnDSize.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        BorderLayout border = new BorderLayout();
        Container content = aWindow.getContentPane();
        content.setLayout(border);
        EtchedBorder edge = new EtchedBorder(EtchedBorder.RAISED);
        JButton button;
        content.add(button = new JButton("East "), BorderLayout.EAST);
        button.setBorder(edge);
        
        content.add(button = new JButton("West "), BorderLayout.WEST);
        button.setBorder(edge);
        
        content.add(button = new JButton("North "), BorderLayout.NORTH);
        button.setBorder(edge);
        
        content.add(button = new JButton("South "), BorderLayout.SOUTH);
        button.setBorder(edge);
        
        content.add(button = new JButton("Center "), BorderLayout.CENTER);
        button.setBorder(edge);
        
         
        
        aWindow.setVisible(true);
}
}