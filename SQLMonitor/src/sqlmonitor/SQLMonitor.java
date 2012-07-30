/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlmonitor;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Rumesh Eranga
 */
public class SQLMonitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
            new NewConnection().setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SQLMonitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
