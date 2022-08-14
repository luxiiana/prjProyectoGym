/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjproyectogym;

import javax.swing.JOptionPane;

public class clsRutina {

    //-----VARIABLES RUTINA--------
    private int diasEjercicio; //El admin pone cuantos dias debe hacer ejercicios pero no cuales asi que el cliente puede elegir cuales dias 
    private String tiempoEjercicio;

    private int diasDescanso; // dias descanso = 6diasSemana-dias Ejercicio
    private String Ejercicios; // aqui el admin escribe que deberia hacer el cliente
    
    //--------INSTANCIAs------
    cls_funciones clsF = new cls_funciones();
    
    
    //------- CONSTRUCTOR VACIO--------
    public clsRutina() {
    }

    //--------CONSTRUCTIR LLENO-------------
    public clsRutina(int diasEjercicio, String tiempoEjercicio, int diasDescanso, String Ejercicios) {
        this.diasEjercicio = diasEjercicio;
        this.tiempoEjercicio = tiempoEjercicio;
        this.diasDescanso = diasDescanso;
        this.Ejercicios = Ejercicios;
    }
    
    //--------GETTERS & SETTERS
    
    
    
    

    public int getDiasEjercicio() {
        return diasEjercicio;
    }

    public void setDiasEjercicio(int diasEjercicio) {
        this.diasEjercicio = diasEjercicio;
    }

    public String getTiempoEjercicio() {
        return tiempoEjercicio;
    }

    public void setTiempoEjercicio(String tiempoEjercicio) {
        this.tiempoEjercicio = tiempoEjercicio;
    }

    public int getDiasDescanso() {
        return diasDescanso;
    }

    public void setDiasDescanso(int diasDescanso) {
        this.diasDescanso = diasDescanso;
    }

    public String getEjercicios() {
        return Ejercicios;
    }

    public void setEjercicios(String Ejercicios) {
        this.Ejercicios = Ejercicios;
    }
    
    
    
    //-------------------------METODOS CRUD---------------------------------
    public void agregarRutina(clsRutina rutina){
        
        //--variables--
        int diasEjerc=0,diasDesc=0;
        String tiempoEjerc="", Ejercicio="",diasEjerS="",tiempoEjercicioS="";
        
        
        //-------EJERCICIOS
        while(Ejercicio.isBlank() && Ejercicio.length()<10){
            Ejercicio=JOptionPane.showInputDialog("Digite los ejercicios para el Cliente");
            if(Ejercicio.isBlank() && Ejercicio.length()<10){
                JOptionPane.showMessageDialog(null, "EJERCICIOS INVALIDOS");
            }
        }
        //------DIAS EJERCICIOS
        while(!clsF.esNumero(diasEjerS) ||  Integer.parseInt(diasEjerS)<1 && Integer.parseInt(diasEjerS)>6){
            diasEjerS=JOptionPane.showInputDialog("DIGITA LA CANTIDAD DE DIAS A EJERCITARSE");
            if(!clsF.esNumero(diasEjerS) ||  Integer.parseInt(diasEjerS)<1 && Integer.parseInt(diasEjerS)>6){
                JOptionPane.showMessageDialog(null, "Dias a ejercitarse INVALIDO");
            }
        }
        diasEjerc=Integer.parseInt(diasEjerS);
        
        //------Tiempo descanso
        diasDesc=6-diasEjerc;
        
        //-----TIEMPO DE EJERCICIO-----
        //while(tiempoEjerc.isBlank() && tiempoEjerc.length()<){
            
        //}
        
        
        //---CREACION RUTINA----
        rutina.setEjercicios(Ejercicio);
        rutina.setDiasEjercicio(diasEjerc);
        rutina.setDiasDescanso(diasDesc);
        rutina.setTiempoEjercicio(tiempoEjerc);
    }
    
    
}//fin clsRutina

/*
    String rutina1 = "Dia 1 = Cuerpo completo\n"
            + "Sentadilla 4x12\n"
            + "Flexion plantar 4x15\n"
            + "Desplantes 3x10\n"
            + "Press banca 3x10\n"
            + "Dominadas 3x10\n"
            + "Curl bicep 3x10\n"
            + "Ext tricep 3x10";
    
    String rutina2 = "Dia 1 = Cuerpo completo         Dia 2 = Cuerpo completo\n"
            + "Sentadilla 4x12                         Sentadilla 4x12\n"
            + "Flexion plantar 4x15                 Flexion plantar 4x15\n"
            + "Desplantes 3x10                       Desplantes 3x10\n"
            + "Press banca 3x10                    Press banca 3x10\n"
            + "Dominadas 3x10                      Dominadas 3x10\n"
            + "Curl bicep 3x10                        Curl bicep 3x10\n"
            + "Ext tricep 3x10                         Ext tricep 3x10";
    String rutina3
            = "Dia 1 = Empuje                Dia 2 = Jalon                 Dia 3 = Pierna\n"
            + "Press Banca 3x10         Dominadas 3x10         Sentadilla 3x8\n"
            + "Press inclinado 3x12    Jalon al pecho 3x12    Ext de cuadriceps 3x15\n"
            + "Fondos 3x8                      Remo 3x15                    Bulgaras 3x10\n"
            + "Ext tricep 3x12               Curl Bicep 3x12            Curl femoral 4x12\n"
            + "Ext a una mano 4x10    Curl martillo 3x10         Extension Plantar 4x12\n"
            + "RompeCraneos 3x12    Curl inverso 3x12         Ext Plantar sentado 3x15";
    String rutina4 = "Dia 1 = Empuje                Dia 2 = Jalon                 Dia 3 = Pierna                      Dia 4 = Cuerpo Completo\n"
            + "Press Banca 3x10         Dominadas 3x10         Sentadilla 3x8                      Sentadilla 4x12\n"
            + "Press inclinado 3x12    Jalon al pecho 3x12    Ext de cuadriceps 3x15   Flexion plantar 4x15\n"
            + "Fondos 3x8                      Remo 3x15                    Bulgaras 3x10                    Desplantes 3x10\n"
            + "Ext tricep 3x12               Curl Bicep 3x12            Curl femoral 4x12              Press banca 3x10\n"
            + "Ext a una mano 4x10    Curl martillo 3x10        Extension Plantar 4x12    Dominadas 3x10\n"
            + "RompeCraneos 3x12    Curl inverso 3x12        Ext Plantar sentado           Curl bicep 3x10";
    String rutina5 = "Dia 1 = Empuje                Dia 2 = Jalon                 Dia 3 = Pierna                          Dia 4 = Torso                      Dia 5 = Pierna\n "
            + "Press Banca 3x10         Dominadas 3x10         Sentadilla 3x8                         Press banca 3x10            Sentadilla 3x10\n"
            + "Press inclinado 3x12    Jalon al pecho 3x12    Ext de cuadriceps 3x15        Dominadas 3x10              Ext de cuadriceps 3x15\n"
            + "Fondos 3x8                      Remo 3x15                    Bulgaras 3x10                          Ext tricep 3x12                 Bulgaras 3x10 \n"
            + "Ext tricep 3x12               Curl Bicep 3x12            Curl femoral 4x12                    Curl bicep 3x10                Curl femoral 4x12\n"
            + "Ext a una mano 4x10    Curl martillo 3x10         Extension Plantar 4x12          Hombro frontal 3x10       Extension Plantar 4x12\n"
            + "RompeCraneos 3x12    Curl inverso 3x12         Extension Plantar sentado    Hombro lateral 3x12        Ext Plantar sentado 3x15";
    String rutina6 = "Dia 1 = Empuje                Dia 2 = Jalon                 Dia 3 = Pierna                        Dia 1 = Empuje                Dia 2 = Jalon                 Dia 3 = Pierna\n"
            + "Press Banca 3x10         Dominadas 3x10         Sentadilla 3x8                        Press Banca 3x10         Dominadas 3x10         Sentadilla 3x8\n"
            + "Press inclinado 3x12    Jalon al pecho 3x12   Ext de cuadriceps 3x15      Press inclinado 3x12    Jalon al pecho 3x12    Ext de cuadriceps 3x15\n"
            + "Fondos 3x8                      Remo 3x15                   Bulgaras 3x10                        Fondos 3x8                      Remo 3x15                    Bulgaras 3x10\n"
            + "Ext tricep 3x12               Curl Bicep 3x12           Curl femoral 4x12                  Ext tricep 3x12               Curl Bicep 3x12            Curl femoral 4x12\n"
            + "Ext a una mano 4x10    Curl martillo 3x10        Extension Plantar 4x12       Ext a una mano 4x10    Curl martillo 3x10         Extension Plantar 4x12\n"
            + "RompeCraneos 3x12    Curl inverso 3x12        Ext Plantar sentado 3x15    RompeCraneos 3x12    Curl inverso 3x12         Ext Plantar sentado 3x15\n";
     */