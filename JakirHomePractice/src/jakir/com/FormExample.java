package jakir.com;

import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class FormExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        
        JMenuBar mb = new JMenuBar();
        
        JMenu  file= new JMenu("File");
        JMenu help = new JMenu("Help");
        JMenu open = new JMenu("Open");
        JMenu server = new JMenu("From Server");
                
        JMenuItem ne = new JMenuItem("New");
        JMenuItem save = new JMenuItem("Sava");
        JMenuItem savaAs = new JMenuItem("Sava As");
        JMenuItem computer = new JMenuItem("From Coumputer");
        JMenuItem github = new JMenuItem("GitHub");
        JMenuItem gitbash = new JMenuItem("GitBash");
        JMenuItem gitbucket = new JMenuItem("GitBucket");
        
        f.setBounds(200,150,300,250);
        f.setJMenuBar(mb);
        
        mb.add(file);
        mb.add(help);
        
        file.add(ne);
        file.add(save);
        file.add(savaAs);
        file.addSeparator();
        file.add(open);
        
        open.add(computer);
        file.addSeparator();
        open.add(server);
        
        server.add(github);
        server.add(gitbash);
        file.addSeparator();
        server.add(gitbucket);
       
        file.setMnemonic('F');
         
        ne.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_DOWN_MASK));
        save.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.CTRL_DOWN_MASK));
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    }
          
}
