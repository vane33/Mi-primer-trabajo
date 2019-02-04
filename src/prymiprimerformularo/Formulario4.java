/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prymiprimerformularo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
public  class Formulario4 extends JFrame implements ActionListener {
private JTextField txt6;
private JLabel label6;
  public Formulario4(){
     
        setLayout(null);
        label6 = new JLabel("Bienvenido a mi formulario 4");
        label6.setBounds(135, 20, 200, 30);
        add(label6);      
 }
       @Override
    public void actionPerformed(ActionEvent e) {

   
 

    }

   
}
