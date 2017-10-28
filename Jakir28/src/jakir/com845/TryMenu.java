
package jakir.com845;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TryMenu extends JFrame{
    JMenuBar menuBar;
    JMenu menu1, menu2, subMenu;
    JMenuItem item1, item2,item3,h1,h2;
    
   TryMenu(){
   JFrame f = new JFrame("Try Menu");
   JMenuBar menuBar= new JMenuBar();
   
   menu1 =new JMenu("File");
    item1 = new JMenuItem("File");
    item2 = new JMenuItem("New");
    item3 = new JMenuItem("Exit");
    
    menu1.add(item1);
    menu1.addSeparator();
    
     menu1.add(item2);
    menu1.addSeparator();
    
     menu1.add(item3);
   
    
    menu2 =new JMenu("Help");
    
    subMenu = new JMenu("SubMenu");
    
        h1 =new JMenuItem("Live Support");
         h2 =new JMenuItem("Email  Support");
         
         subMenu.add(h1);
          subMenu.addSeparator();
          
         subMenu.add(h2);
          subMenu.addSeparator();
          menu2.add(subMenu);
   // step-3
    menuBar.add(menu1);
    menuBar.add(menu2);
    //step-4
   f.setJMenuBar(menuBar);
   f.setSize(500, 550);
   f.setLayout(null);
   f.setVisible(true);
   } 
   
    public static void main(String[] args) {
     new TryMenu();   
    }
}
