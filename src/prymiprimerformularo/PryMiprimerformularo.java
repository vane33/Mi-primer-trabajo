
package prymiprimerformularo;

import java.awt.Event;
import java.awt.Label;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class PryMiprimerformularo extends JFrame implements ActionListener{
     private JLabel label1;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    public PryMiprimerformularo() {
        
        setLayout(null);
        label1 = new JLabel("REGISTROS");
        label1.setBounds(135,20,200,30);
        add(label1);
        
        boton1 = new JButton("FINALIZAR_PROYECTO");
        boton1.setBounds(170, 60, 100, 30);
        add(boton1);
        boton1.addActionListener((ActionListener)this);
        
        boton2 = new JButton("SIGUIENTE_VENTANA");
        boton2.setBounds(50, 60, 100, 30);
        add(boton2);
        boton2.addActionListener((ActionListener)this);
            
        boton3 = new JButton("IR A FORMULARIO 4");
        boton3.setBounds(60, 100, 150,90);
        add(boton3);
        boton3.addActionListener((ActionListener)this);
    }
    public void actionPerformed(ActionEvent e){
    if(e.getSource()==boton1){
            System.exit(0);//
        }
  if(e.getSource()==boton2){
    formulario_dos frm2=new formulario_dos();
         frm2.setVisible(true);
         frm2.setBounds(500,400,400,200);
         this.setVisible(false);////para ocultar el fromulario
  }
  
  if(e.getSource()==boton3){
        Formulario4 x =new Formulario4() {};
        x.setVisible(true);
         x.setBounds(500,400,400,200);
         this.setVisible(false);
    }
    
    }
    
    public static void main(String[] args) {
        PryMiprimerformularo obj;
        
        obj = new PryMiprimerformularo();
        obj.setBounds(500, 400, 400, 200);
        obj.setVisible(true);
        obj.getLocation();
        
        
    }

}
