package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    public void main(String[] args){
        Fenster fenster = new Fenster();
        JButton button = new JButton();
        button.addActionListener(this);
        fenster.add(button, BorderLayout.NORTH);
        button.setText("TestButton");


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Test");

    }
}
