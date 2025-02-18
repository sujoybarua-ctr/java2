import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.ImageIcon;

public class jframe {
    public static void main(String[] args) {
        JFrame framVar= new JFrame();// creating a variable for the window for recognition of the window
        framVar.setVisible(true);// sets the visibility for the variable to true
        framVar.setTitle("title for the frame");// for the title of the window
framVar.setSize(420,420);
framVar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//defining a function for close button
framVar.setResizable(false);// to lock the size of window!!!!!
ImageIcon imvar= new ImageIcon("pfp_wp.png");
framVar.setIconImage(imvar.getImage());//JFrame needs getimage() to get the image from ImageIcon
//changes the icon of the window
framVar.getContentPane().setBackground(new Color(25,58,58));//used new keyword before color for customizable colours....
    }
}
