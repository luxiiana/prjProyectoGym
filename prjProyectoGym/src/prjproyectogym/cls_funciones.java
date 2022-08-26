/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjproyectogym;

import javax.swing.JOptionPane;

public class cls_funciones {

    //----Inicio Cadena 
    public String cadena(String dato) {
        String cad = JOptionPane.showInputDialog(dato);
        return cad;
    }//fin cadena 

    //----Inicio Char
    public char caracter(String dato) {
        String carac = JOptionPane.showInputDialog(dato).toUpperCase();
        char caracter = carac.charAt(0);
        return caracter;
    }

    public int numeros(String dato) {
        String cadena = JOptionPane.showInputDialog(dato);
        int num = Integer.parseInt(cadena);
        return num;
    }

    //----Validacion de numero-----
    public boolean esNumero(String dato) {
        try {
            Float.parseFloat(dato);
            return true;
        } catch (NumberFormatException datofe) {
            return false;
        }
    }

    //-----IMPRIMIR MENSAJE------
    public void imprimeMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public int PesoIdeal(float altura, String sexo) {
        float p = 0;
        int pesoIdeal = 0;
        if (sexo.equalsIgnoreCase("Masculino")) {
            p = (altura * altura) * (float) 22.5;
            pesoIdeal = (int) Math.floor(p);
        } else if (sexo.equalsIgnoreCase("Femenino")) {
            p = (altura * altura) * (float) 21.5;
            pesoIdeal = (int) Math.floor(p);
        }
        return pesoIdeal;
    }

    public float CaloriasDiarias(float peso, float altura, int edad, String sexo) {
        int caloriasDiarias = 0;
        if (sexo.equalsIgnoreCase("Masculino")) {
            caloriasDiarias = (int) (((10 * peso) + (6.25 * altura) - (5 * edad) + 5) * 1.55);
        } else if (sexo.equalsIgnoreCase("Femenino")) {
            caloriasDiarias = (int) (((10 * peso) + (6.25 * altura) - (5 * edad) - 161) * 1.55);
        }
        return caloriasDiarias;
    }

    public float CaloriasObjetivo(String objetivo, float caloriasDiarias) {
        float caloriasObjetivo = 0;
        if (objetivo.equalsIgnoreCase("Subir de peso")) {
            caloriasObjetivo = caloriasDiarias + 250;
        } else if (objetivo.equalsIgnoreCase("Bajar de peso")) {
            caloriasObjetivo = caloriasDiarias - 250;
        } else if (objetivo.equalsIgnoreCase("Mantener peso")) {
            caloriasObjetivo = caloriasDiarias;
        }
        return caloriasObjetivo;
    }

    public int IMC(float altura, float peso) {

        float imc = 0;
        imc = (float) (peso / Math.pow(altura, 2));

        int IMC = Math.round(imc);

        return IMC;
    }

    //--METODO LISTAR 'bdCLIENTES'---
    public void impListaClientes(clsCliente bdClientes[], int v, String pase) {

        if (pase.equals("Basico")) {
            JOptionPane.showMessageDialog(null, "Nombre Cliente: " + bdClientes[v].getNombreC()
                    + "\nIdentificacion Cliente: " + bdClientes[v].getIdentificacion()
                    + "\nTelefono Cliente: " + bdClientes[v].getTelefono()
                    + "\nSexo Cliente: " + bdClientes[v].getSexo()
                    + "\nEdad Cliente: " + bdClientes[v].getEdad()
                    + "\nTipo de Pase: " + bdClientes[v].getTipoDePase()
                    + "\nCantidad de Pago: " + bdClientes[v].getPago());
        } else if (pase.equals("Max")) {
            JOptionPane.showMessageDialog(null, "Nombre Cliente: " + bdClientes[v].getNombreC()
                    + "\nIdentificacion Cliente: " + bdClientes[v].getIdentificacion()
                    + "\nTelefono Cliente: " + bdClientes[v].getTelefono()
                    + "\nSexo Cliente: " + bdClientes[v].getSexo()
                    + "\nEdad Cliente: " + bdClientes[v].getEdad()
                    + "\nTipo de Pase: " + bdClientes[v].getTipoDePase()
                    + "\nCantidad de Pago: " + bdClientes[v].getPago()
                    + "\nEntrenador: " + bdClientes[v].getEntrenador());
        } else {
            JOptionPane.showMessageDialog(null, "Nombre Cliente: " + bdClientes[v].getNombreC()
                    + "\nIdentificacion Cliente: " + bdClientes[v].getIdentificacion()
                    + "\nTelefono Cliente: "+bdClientes[v].getTelefono()
                    + "\nSexo Cliente: " + bdClientes[v].getSexo()
                    + "\nEdad Cliente: " + bdClientes[v].getEdad()
                    + "\nTipo de Pase: " + bdClientes[v].getTipoDePase()
                    + "\nCantidad de Pago: " + bdClientes[v].getPago()
                    + "\nEntrenador: " + bdClientes[v].getEntrenador()
                    + "\nSomatotipo del Cliente: " + bdClientes[v].getSomatotipo()
                    + "\nObjetivo del Cliente: " + bdClientes[v].getObjetivo()
                    + "\nPeso del Cliente: " + bdClientes[v].getPesoKg()
                    + "\nEstatura del Cliente: " + bdClientes[v].getEstaturaMts()
                    + "\nCalorias Diarias: " + bdClientes[v].getCaloriasDiarias()
                    + "\nCalorias Objetivo: " + bdClientes[v].getCaloriasObjetivo()
                    + "\nIMC del Cleinte: " + bdClientes[v].getIMC()
                    + "\nDIAS PARA EJERCITARSE: " + bdClientes[v].rutina.getDiasEjercicio()
                    + "\nDIAS DESCANSO: " + bdClientes[v].rutina.getDiasDescanso()
                    + "\n-----------------------RUTINA-----------------------------\n"
                    + bdClientes[v].rutina.getEjercicios());
        }

        //return imp;
    }

}//----fin cls_funciones------
