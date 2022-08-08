package prjproyectogym;

import java.awt.TextArea;
import javax.swing.JOptionPane;
import vistas.JF_inicioSesion;

public class main {

    public static void main(String[] args) {
        
        

        //---INICIAR DIRECTAMENTE EL PROGRAMA
        clsCalculos c = new clsCalculos();
        float calorias =c.CaloriasDiarias(93, 1.83f, 19,"Masculino");
        System.out.println(calorias);
        clsMenu clsM = new clsMenu();
        clsM.menuPrincipal();
        
        //---INCIAR PROGRAMA CON INCIO SESION
        //JF_inicioSesion JFIS = new JF_inicioSesion();
        //JFIS.setVisible(true);
        
        //---------RUTINAS----------
        //clsRutina clsr = new clsRutina();
        //JOptionPane.showMessageDialog(null, clsr.rutina6);
        

    }

}
