/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Gracias
 * https://jonathanmelgoza.com/blog/como-hacer-una-calculadora-en-java/
 * https://docs.oracle.com/javase/7/docs/api/javax/swing/package-summary.html
 *By
 *Jesus Flor Farias
 *@Iesous_Flor
 *www.3f10r.com
 */
package jff;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author i5
 */
public class Ventana extends JFrame {
    JPanel panel_principal;
    JPanel panel_botones;
    JTextField caja;
    JButton button[];
    double op1=0, op2;
    String operacion="";
    boolean nueva=true;
    
    public Ventana() {
        //Inicializamos nuestra ventana
        setTitle("Calculadora Swing");
        setSize(250, 300);
        setResizable(false);
        //Cerramos con clic en la x
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Inicializamos compoonentes
        init();
    }
    
    private void init(){
        panel_principal = new JPanel();
        panel_principal.setLayout(new BorderLayout());
        
        caja = new JTextField();
        panel_principal.add("North", caja);
        panel_botones = new JPanel();
        panel_botones.setLayout(new GridLayout(5,4,8,8));
        agregarBotones();
        panel_principal.add("Center", panel_botones);
        getContentPane().add(panel_principal);
    }
    
    public void agregarBotones(){
        button = new JButton[20];
        //Inicializamos botones
        button[0] = new JButton("CE");
        button[1]=new JButton("");
        button[2]=new JButton("");
        button[3]=new JButton("");
        button[4]=new JButton("7");
        button[5]=new JButton("8");
        button[6]=new JButton("9");
        button[7]=new JButton("/");
        button[8]=new JButton("4");
        button[9]=new JButton("5");
        button[10]=new JButton("6");
        button[11]=new JButton("*");
        button[12]=new JButton("1");
        button[13]=new JButton("2");
        button[14]=new JButton("3");
        button[15]=new JButton("-");
        button[16]=new JButton("0");
        button[17]=new JButton(".");
        button[18]=new JButton("=");
        button[19]=new JButton("+");
        for(int i=0; i<20; i++){
            panel_botones.add(button[i]);
        }
        
        //Operacion suma, resta, divicion, mulriplicacion
        button[19].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                try{
                    if(op1!=0){
                        op1=op1+Double.parseDouble(caja.getText());
                    }else{
                        op1=Double.parseDouble(caja.getText());
                    }
                    operacion="suma";
                    caja.setText("");
                    
                }catch(Exception err){}
            }
            
        });
        button[15].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(op1!=0)
                        op1=op1-Double.parseDouble(caja.getText());
                    else
                        op1=Double.parseDouble(caja.getText());
                    operacion="resta";
                    caja.setText("");
                }catch(Exception err){}
            }
        });
        button[11].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(op1!=0)
                        op1=op1*Double.parseDouble(caja.getText());
                    else
                        op1=Double.parseDouble(caja.getText());
                    operacion="multiplicacion";
                    caja.setText("");
                }catch(Exception err){}
            }
        });
        button[7].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(op1!=0)
                        op1=op1/Double.parseDouble(caja.getText());
                    else
                        op1=Double.parseDouble(caja.getText());
                    operacion="division";
                    caja.setText("");
                }catch(Exception err){}
            }
        });
        
        //Numeros y otros caracteres
        button[4].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"7");
            }
        });
        button[5].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"8");
            }
        });
        button[6].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"9");
            }
        });
        button[8].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"4");
            }
        });
        button[9].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"5");
            }
        });
        button[10].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"6");
            }
        });
        button[12].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"1");
            }
        });
        button[13].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"2");
            }
        });
        button[14].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"3");
            }
        });
        button[16].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"0");
            }
        });
        button[17].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+".");
            }
        });
         //IGUAL
        button[18].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    op2=Double.parseDouble(caja.getText());
                }catch(Exception err){}
                if(operacion.equals("suma")){
                    double res=op1+op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("resta")){
                    double res=op1-op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("multiplicacion")){
                    double res=op1*op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("division")){
                    double res=op1/op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }
                nueva=true;
            }
        });
        //CE
        button[0].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                caja.setText("");
                op1=op2=0;
                operacion="";
            }
        });
    }
}
