package prjproyectogym;

import java.awt.TextArea;
import javax.swing.JOptionPane;
import vistas.JF_inicioSesion;

public class main {

    public static void main(String[] args) {

        //---INICIAR DIRECTAMENTE EL PROGRAMA
        //clsMenu clsM = new clsMenu();
        //clsM.menuPrincipal();
        //---INCIAR PROGRAMA CON INCIO SESION
        //JF_inicioSesion JFIS = new JF_inicioSesion();
        //JFIS.setVisible(true);
       clsRutina clsr= new clsRutina();
       JOptionPane.showMessageDialog(null, clsr.rutina6);

    }


}
