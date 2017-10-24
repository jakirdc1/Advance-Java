
package jakir.color792;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

public class FontInfo {
    public static void main(String[] args) {
        Toolkit theKit= Toolkit.getDefaultToolkit();
        System.out.println("\nScreeen Resolution: "+theKit.getScreenResolution()+"dots per inch");
        Dimension screenDim =theKit.getScreenSize();
        System.out.println("Screen size: "
                            +screenDim.width +"by"
                            +screenDim.height+"pixels");
        GraphicsEnvironment e= GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontnames =e.getAvailableFontFamilyNames();
        System.out.println("\nFonts avalable on this platform:");
        int count = 0;
        for(String fontname : fontnames){
            System.out.printf("%-30s", fontname);
            if(++count % 4 == 0){
                System.out.println(" jakir  ");
            
            }
            
        
        }
        return;
    }
 
}
