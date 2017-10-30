
package jakir.comm848;

import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class TryMenu2   {
    JMenu menu1, exit;
    JMenuItem item1, item2;
    TryMenu2(){
    JFrame f = new JFrame("Try Menu");
    JMenuBar mb = new JMenuBar();
    menu1 = new JMenu("File");
    item1 = new JMenuItem("Exit");
   item1.setAccelerator(KeyStroke.getKeyStroke('E', InputEvent.CTRL_DOWN_MASK));
   menu1.add(item1);
   exit=new JMenu("Exit");
   mb.add(menu1);
   mb.add(exit);
   
   f.setJMenuBar(mb);
   f.setSize(500,400);
   f.setLayout(null);
   f.setVisible(true);
 
}
    public static void main(String[] args) {
        new TryMenu2();
    }
}

        