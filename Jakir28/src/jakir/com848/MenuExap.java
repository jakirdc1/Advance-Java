
package jakir.com848;

import java.awt.PopupMenu;
import java.rmi.Remote;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuExap extends JFrame {
    JMenuBar menuBar;
    JMenu menu1, menu2,menu3, menu4;
    JMenuItem item1, item2,item3,item4,item5;
    
   MenuExap(){
       setLayout(null);
       setSize(500, 550);
       menuBar =new JMenuBar();
       menu1 = new JMenu("File");
       menu2 = new JMenu("New");
       menu1.add(item1);
       menu1.addSeparator();
      menu3 = new JMenu("open");
      menu4 = new JMenu("Exit");
      
    
   JFrame f = new JFrame("Try Menu");
   JMenuBar menuBar= new JMenuBar();
   
   menu1 =new JMenu("File");
    item1 = new JMenuItem("File");
    item2 = new JMenuItem("New");
    item3 = new JMenuItem("Open");
    
    item4 = new JMenuItem("Exit");
    
    menu1.add(item1);
    menu1.addSeparator();
    
     menu1.add(item2);
    menu1.addSeparator();
    
     menu1.add(item3);
     menu1.addSeparator();
     
     menu1.add(item4);
   
    
    menu2 =new JMenu("Help");
    
  
          
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
     new MenuExap();   
    }
}


