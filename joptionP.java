import javax.swing.JOptionPane;
public class joptionP {
    public static void main(String[] args) {
    //JOptionPane is just a popup window or standard dialoguebox for informing or inputting 
    //data from the user.
    //showMessageDialogue is used to display a message
    JOptionPane.showMessageDialog(null, "Nojor lagle chokh nosto hoi naki ?", "Ajaira group er ajaira question", JOptionPane.PLAIN_MESSAGE);
    JOptionPane.showMessageDialog(null, "Nojor lagle chokh nosto hoi naki ?", "Ajaira group er ajaira question", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Nojor lagle chokh nosto hoi naki ?", "Ajaira group er ajaira question", JOptionPane.ERROR_MESSAGE);
    JOptionPane.showMessageDialog(null, "Nojor lagle chokh nosto hoi naki ?", "Ajaira group er ajaira question", JOptionPane.WARNING_MESSAGE);
    JOptionPane.showMessageDialog(null, "Nojor lagle chokh nosto hoi naki ?", "Ajaira group er ajaira question", JOptionPane.CLOSED_OPTION);
//JOptionPane.showConfirmDialogue is used for an interactive dialogue box 
//supporting yes,no,cancel,etc
JOptionPane.showConfirmDialog(null, "nojor lage naki bolo", "nojor lage kina ask kora", JOptionPane.YES_NO_CANCEL_OPTION); 
// for response lets create a variable that will store the response
int responsevar=JOptionPane.showConfirmDialog(null, "nojor lagle yes chapun!", "Nojor laga bla bla", JOptionPane.YES_NO_CANCEL_OPTION);
if (responsevar==JOptionPane.YES_OPTION) {
    JOptionPane.showMessageDialog(null, "Haire! nojor lagai dila!");
}else if (responsevar==JOptionPane.NO_OPTION) {
    JOptionPane.showMessageDialog(null, "valo valo, nojor lagaio na!");
}else if (responsevar==JOptionPane.CANCEL_OPTION) {
    JOptionPane.showMessageDialog(null,"cancel koira dilen haire!");
}
}
}

