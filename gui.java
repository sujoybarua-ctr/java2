import javax.swing.JOptionPane;
public class gui {
    public static void main(String[] args) {
        String a=JOptionPane.showInputDialog("enter your name:");
  JOptionPane.showMessageDialog(null, "hello mister "+a);
    int age= Integer.parseInt(JOptionPane.showInputDialog("enter your age:"));
    JOptionPane.showMessageDialog(null, "youre "+age+" years old?");
double cg=Double.parseDouble(JOptionPane.showInputDialog("enter your CGPA:"));
JOptionPane.showMessageDialog(null,"you are a " +age+" years old boy and your CGPA is "+cg +"?");
}
}
