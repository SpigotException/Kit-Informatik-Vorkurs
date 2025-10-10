package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster extends JFrame implements ActionListener {


    public Fenster() {
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    this.setSize(1000,1000);
    this.setVisible(true);
    this.setTitle("Test");
    this.setLocationRelativeTo(null);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
