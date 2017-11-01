
package jakir.comToolBar;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Main {
    
   Main() {
        JFrame f =new JFrame("JToolBar Demo");
        
        JToolBar tool = new JToolBar("Appliocation");
        
        JButton btn1 = new JButton(new ImageIcon(getClass().getResource("/jakir/comToolBar/Image/Blue.gif")));
        JButton btn2 = new JButton(new ImageIcon(getClass().getResource("/jakir/comToolBar/Image/circle.gif")));
        JButton btn3 = new JButton(new ImageIcon(getClass().getResource("/jakir/comToolBar/Image/curve.gif")));
        JButton btn4 = new JButton(new ImageIcon(getClass().getResource("/jakir/comToolBar/Image/green.gif")));
        JButton btn5 = new JButton(new ImageIcon(getClass().getResource("/jakir/comToolBar/Image/Line.gif")));
        JButton btn6 = new JButton(new ImageIcon(getClass().getResource("/jakir/comToolBar/Image/New.gif")));
        JButton btn7 = new JButton(new ImageIcon(getClass().getResource("/jakir/comToolBar/Image/Open.gif")));
        
      tool.add(btn1);
      tool.add(btn2);
      tool.add(btn3);
      tool.add(btn4);
       tool.add(btn5);
        tool.add(btn6);
         tool.add(btn7);
      
      f.setLayout(new BorderLayout());
      f.getContentPane().add(tool, BorderLayout.NORTH);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(500, 300);
    f.setVisible(true);
}
    
    public static void main(String[] args) {
    new Main();
  
  JToolBar obj = new JToolBar();
 }
}