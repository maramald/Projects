
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maram
 */

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class Maram_SillyStringGUI { 
public static void main(String[] args) {
Maram_SillyStringGUI gui = new Maram_SillyStringGUI();
}
private JFrame frame; 
private JTextField textField; 
private JButton uppercase; 
private JButton lowercase;   
public Maram_SillyStringGUI() {

textField = new JTextField ();
uppercase = new JButton ("Upper Case");
lowercase = new JButton ("Lower Case");
uppercase.addActionListener(new UpperCaseListener());
lowercase. addActionListener(new LowerCaseListener());
JPanel north = new JPanel (new FlowLayout());
north.add (uppercase);
JPanel south = new JPanel (new FlowLayout());
south.add (lowercase);
frame = new JFrame();
frame.setTitle ("Silly String Game");
frame.setSize (300, 150);
frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE) ;
frame.setResizable(false);
frame.add (north, BorderLayout. NORTH);
frame.add (textField, BorderLayout. CENTER);
frame.add (south, BorderLayout. SOUTH);
frame.setVisible(true);    
}
public class UpperCaseListener implements ActionListener {
public void actionPerformed (ActionEvent event) {
textField.setText (textField.getText().toUpperCase());
}
}
public class LowerCaseListener implements ActionListener {
public void actionPerformed (ActionEvent event) {
textField.setText (textField.getText().toLowerCase());
}
}
}