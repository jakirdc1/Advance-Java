package jakircore4.com;
import javax.swing.JFrame;
public class Window1 {
    public static void main(String[] args) {
        JFrame jf=new JFrame("title");
        jf.setBounds(200, 100, 500, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
