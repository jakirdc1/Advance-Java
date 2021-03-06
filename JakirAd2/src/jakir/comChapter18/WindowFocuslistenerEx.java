
package jakir.comChapter18;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WindowFocuslistenerEx {
    private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   
   public WindowFocuslistenerEx(){
      prepareGUI();
   }
   public static void main(String[] args){
      WindowFocuslistenerEx  swingListenerDemo = new WindowFocuslistenerEx();  
      swingListenerDemo.showFocusListenerDemo();
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Java SWING Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));

      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);        
      statusLabel.setSize(350,100);
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   private void showFocusListenerDemo(){
      headerLabel.setText("Listener in action: FocusListener");      
      JButton okButton = new JButton("OK");
      JButton cancelButton = new JButton("Cancel");
   
      okButton.addFocusListener((FocusListener) new CustomFocusListener());  
      cancelButton.addFocusListener(new CustomFocusListener());  
   
      controlPanel.add(okButton);
      controlPanel.add(cancelButton);     
      mainFrame.setVisible(true);  
   }
   class CustomFocusListener implements FocusListener{
      public void focusGained(FocusEvent e) {
         statusLabel.setText(statusLabel.getText() 
            + e.getComponent().getClass().getSimpleName() + " gained focus. ");
      }
      public void focusLost(FocusEvent e) {
         statusLabel.setText(statusLabel.getText() 
            + e.getComponent().getClass().getSimpleName() + " lost focus. ");
      }

        
   }
}

    