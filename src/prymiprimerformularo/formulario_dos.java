/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prymiprimerformularo;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Event;
import java.awt.Label;
import java.awt.event.ActionEvent;
import javax.swing.*;///swing llamar a todas las cosas/// para atraer un sin numero de objetos
import java.awt.event.ActionListener;

public class formulario_dos  extends JFrame implements ActionListener{
    private JLabel label2;
    private JLabel label1;
    private JButton Boton2;
    private JButton Boton3;
    private JButton Boton4;
    
    private JTextField txt;

    public formulario_dos() {
        setLayout(null);
        label1 = new JLabel("Formulario 2");
        label1.setBounds(135, 20, 200, 30);
        add(label1);

        label2 = new JLabel(" Usuario ");
        label2.setBounds(20, 50, 100, 30);
        add(label2);
        
        txt = new JTextField("");
        txt.setBounds(80, 50, 200, 30);
        add(txt);
        
        Boton2= new JButton("Aceptar");
        Boton2.setBounds(50, 90, 100, 30);
        add(Boton2);
        Boton2.addActionListener((ActionListener)this);
        
         Boton3= new JButton("Regresar");
        Boton3.setBounds(170, 90, 100, 30);
        add(Boton3);
        Boton3.addActionListener((ActionListener)this);
        
         Boton4= new JButton("Ir al siguiente formulario");
        Boton4.setBounds(66, 125, 190, 30);
        add(Boton4);
        Boton4.addActionListener((ActionListener)this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Boton2){
            String cad=txt.getText();
            setTitle(cad);
        }
         if(e.getSource()==Boton3){
             
            PryMiprimerformularo frm2=new PryMiprimerformularo();
         frm2.setVisible(true);
         frm2.setBounds(500,400,400,200);
         this.setVisible(false);////para ocultar el fromulario
       
        }
         if(e.getSource()==Boton4){
         formulario_3 frm2=new formulario_3();
         frm2.setBounds(500,300,540,400);
                 frm2.setVisible(true);
         this.setVisible(false);////para ocultar el fromulario
         this.setResizable(false);/// avilita y desavilia los vordes
         ///
        
         }
      
    }
  
    
}
