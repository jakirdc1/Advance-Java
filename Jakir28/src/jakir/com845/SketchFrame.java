
package jakir.com845;

import javax.lang.model.element.Element;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class SketchFrame extends JFrame {
    public SketchFrame(String title){
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
      //  JMenuBar menubar = null;
        setJMenuBar(menuBar);
      JMenu fileMenu = new JMenu("File");
       // String Element = null;
      JMenu elementMenu =new JMenu("Element");
      JMenu helpMenu = new JMenu("Help");
            JMenu formateMenu = new JMenu("Formate");

    menuBar.add(fileMenu);
    menuBar.add(elementMenu);
    menuBar.add(helpMenu);
    menuBar.add(formateMenu);
    }
    private JMenuBar menuBar = new JMenuBar();
}
