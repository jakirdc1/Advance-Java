
package jakir.comChapter18;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javafx.fxml.FXMLLoader;

public class MouseListenerEx extends Frame implements MouseListener {
    Label l;

MouseListenerEx(){
addMouseListener(this);
l = new Label();
l.setBounds(20,50, 100, 20);
add(l);
setSize(300, 300);
setLayout(null);
setVisible(true);

}

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse clicked");
   }

    @Override
    public void mousePressed(MouseEvent e) {
         l.setText("Mouse presed");
     }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse relase");
   }

    @Override
    public void mouseEntered(MouseEvent e) {
         l.setText("Mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
         l.setText("Mouse exit");
  }
    public static void main(String[] args) {
       new MouseListenerEx(); 
    }
}
