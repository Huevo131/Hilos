/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.*;
/**
 *
 * @author yahir
 */
public class Ventanita2 extends JFrame{
    JLabel usuario, contrasenia;
    JTextField tusuario, tcontrasenia;
    JButton nuevo, entrar;
    
    public void Ventanita(){
       setTitle("Ventana2");
       setSize(500,600);
       setLayout(null);
       setResizable(false);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       Componentes();
    }
    
    public void Componentes(){
        usuario = new JLabel("Usuario");
        usuario.setBounds(50,50,100,30);
        
        tusuario = new JTextField();
        tusuario.setBounds(150,50,100,30);
        
        contrasenia = new JLabel("Contraseña");
        contrasenia.setBounds(50,100,100,30);
        
        tcontrasenia = new JTextField();
        tcontrasenia.setBounds(150,100,100,30);
        
        nuevo = new JButton("Nuevo");
        nuevo.setBounds(50, 200, 100, 30);
        
        entrar = new JButton("Entrar");
        entrar.setBounds(180, 200, 100, 30);
        
        add(usuario);
        add(tusuario);
        add(contrasenia);
        add(tcontrasenia);
        add(nuevo);
        add(entrar);
    }
    
    public static void main(String[] args) {
        Ventanita2 Ventana2 = new Ventanita2();
        Ventana2.Ventanita();
        Ventana2.setVisible(true);
    }
}