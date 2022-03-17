
package quiz.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    JButton b1, b2;
    String username;
    Rules(String username){
        this.username = username;
        setBounds(250, 50, 800, 625);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l1 = new JLabel("Welcome " + username + " to Simple Minds");
        l1.setForeground(new Color(30, 144, 255));
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        l1.setBounds(130, 20, 700, 30);
        add(l1);

        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(20, 90, 600, 350);
        l2.setText(
            "<html>"+ 
                "1. There will be total 10 question in the quiz." + "<br><br>" +
                "2. Time alloted for each question is 15 seconds." + "<br><br>" +
                "3. 10 points will be awarded for each correct answer." + "<br><br>" +
                "4. No negative marking." + "<br><br>" +
                "5. Marks Obtained will be displayed at the end of quiz." + "<br><br>" +
            "<html>"
        );
        add(l2);

        b1 = new JButton("Back");
        b1.setBounds(250, 500, 100, 30);
        b1.setBackground(new Color(30, 144, 255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Start");
        b2.setBounds(400, 500, 100, 30);
        b2.setBackground(new Color(30, 144, 255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new simpleMinds().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }

    public static void main(String[] args){
        new Rules("");
    }
}
