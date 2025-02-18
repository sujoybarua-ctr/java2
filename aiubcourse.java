import javax.swing.JOptionPane;
import java.awt.Image;
import javax.swing.ImageIcon;
public class aiubcourse {
   
    public static void main(String[] args) {
        Object[] a={"Electrial circuits", "Physics2 Lab","Electrical circuits lab"};
        ImageIcon aiub= new ImageIcon(new ImageIcon("aiub-logo-1115122C7B-seeklogo.com.png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
       int b= JOptionPane.showOptionDialog(null, "Aiub course select korun", "Course chan?", 
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
         aiub, a,a[0]);
         if (b==JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Boombastic side eye", "NO section available", b);
         }else {JOptionPane.showMessageDialog(null, "This is buisiness!");};

    }
}
