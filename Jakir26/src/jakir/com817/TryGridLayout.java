package jakir.com817;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;

public class TryGridLayout {
    public static void main(String[] args) {
        JFrame aWindow = new JFrame("This is Window Titile");
        Toolkit theKit = aWindow.getToolkit();
        Dimension wnDSize = theKit.getScreenSize();
        aWindow.setBounds(wnDSize.width/4, wnDSize.height/4, wnDSize.width/2, wnDSize.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        GridLayout grid= new GridLayout(3,4,30,20);
        Container content = aWindow.getContentPane();
        content.setLayout(grid);
        EtchedBorder edge = new EtchedBorder(EtchedBorder.RAISED);
        JButton button = null;
        for(int i =1; i<=10; i++){
     content.add(button=new JButton("Press"+i), "Card"+i);
    button.setBorder(edge);
    }
        aWindow.pack();
        aWindow.setVisible(true);
    }
}