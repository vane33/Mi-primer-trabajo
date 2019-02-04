/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prymiprimerformularo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class formulario_3 extends JFrame implements ActionListener{

  private JTextField txt;
  private JTextArea textarea1;
  private JScrollPane scrollpane1;
  private JButton Boton4;
    private JButton BotonS;
  
    public formulario_3() {
        setLayout(null);
        txt = new JTextField("");
        txt.setBounds(150, 15, 200, 30);
        add(txt);
        
        textarea1=new JTextArea();        
        scrollpane1=new JScrollPane(textarea1);    
        scrollpane1.setBounds(60,50,400,200);
        add(scrollpane1);
        
        
         Boton4= new JButton(" PASAR A OTRO ");
        Boton4.setBounds(50, 300, 135, 30);
        add(Boton4);
        Boton4.addActionListener((ActionListener)this);
         
        
        BotonS= new JButton("VOLVER");
        BotonS.setBounds(200, 300, 100, 30);
        add(BotonS);
        BotonS.addActionListener((ActionListener)this);
    }

     

    @Override
    public void actionPerformed(ActionEvent e) {
       
if(e.getSource()==Boton4){
   
       String mensaje = txt.getText().trim() ;
       textarea1.setText(textarea1.getText()+ "\n" + mensaje);
       txt.setText("");
}
if(e.getSource()==BotonS){
   
          formulario_dos frm2=new formulario_dos();
         frm2.setVisible(true);
        frm2.setBounds(500,400,400,200);
         this.setVisible(false);
         this.setResizable(false);
       
}

    }
    
}
