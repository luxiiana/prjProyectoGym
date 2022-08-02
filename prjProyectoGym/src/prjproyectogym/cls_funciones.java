/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjproyectogym;

import javax.swing.JOptionPane;

/**
 *
 * @author Derek
 */
public class cls_funciones {
    
        //----Inicio Cadena 
    public String cadena(String dato){
        String cad = JOptionPane.showInputDialog(dato);
        return cad;
    }//fin cadena 
    
    //----Inicio Char
    public char caracter(String dato){
        String carac = JOptionPane.showInputDialog(dato).toUpperCase();
        char caracter = carac.charAt(0);
        return caracter;
    }
    
    public int numeros (String dato){
        String cadena = JOptionPane.showInputDialog(dato);
        int num = Integer.parseInt(cadena);
        return num;
    }
    
    //----Validacion de numero-----
    public boolean esNumero(String dato){
        try {
            Integer.parseInt(dato);
            return true;
        } catch (NumberFormatException datofe) {
            return false;
        }
    }
    
    //-----IMPRIMIR MENSAJE------
    public void imprimeMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

}//----fin cls_funciones------
