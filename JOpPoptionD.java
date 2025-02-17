import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JOptionPane;
public class JOpPoptionD {
    public static void main(String[] args) {
        //JOptionPane.showOptionDialogue is fully customizable dialogue box
        //for customizable image icons set the icon variable and put the path of the image
        //path is ignorable if the image is in the project folder
String[] a={"Supriyo","Fabiha","NOT SUJOY"};
    ImageIcon wierd=new ImageIcon(new ImageIcon("pfp_wp.png").getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH)) ;

  int responseV= JOptionPane.showOptionDialog(null, "Who is the mentally disabled?", 
  "serious question",
   JOptionPane.YES_NO_CANCEL_OPTION, 
   JOptionPane.WARNING_MESSAGE,
    wierd, 
    a, 
    0) ; 
    if (responseV== JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(null, "Supriyo is not", "try again!", responseV);
    }else if (responseV==JOptionPane.NO_OPTION) {
        JOptionPane.showMessageDialog(null, "7 CRORE !!!!!", "cant pay 7 crore im broke", responseV);
    }else if (responseV==JOptionPane.CANCEL_OPTION) {
        JOptionPane.showMessageDialog(null, "Not Sujoy I guess","maybe idk", responseV);
    }
    }
}
