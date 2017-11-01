
package jakir.com912;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;


    public class ToolBarWithIcon extends JFrame {

    public ToolBarWithIcon(String title) {
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        JMenu elementMenu = new JMenu("Elements");

        menuBar.add(fileMenu);
        menuBar.add(elementMenu);
        
        JToolBar toolBar = new JToolBar();
        getContentPane().add(toolBar, BorderLayout.NORTH);
        
        JButton button = new JButton("Open");
        button.setBorder(BorderFactory.createRaisedBevelBorder());
        toolBar.add(button);
    }
    private JMenuBar menuBar = new JMenuBar();
}


