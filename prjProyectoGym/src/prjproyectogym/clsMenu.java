
package prjproyectogym;

import javax.swing.JOptionPane;

public class clsMenu {
    public void menuPrincipal(){
        String opcion = "";
        
        do{
            opcion = JOptionPane.showInputDialog("Digite la opción que desea: \nA. Administrar clientes \nB. Administrar empleados \nS. SALIR").toUpperCase();
            switch(opcion){
                case "A":
                    do{
                        opcion = JOptionPane.showInputDialog("Digite la opción que desea: \nA. Agregar cliente \nB. Editar cliente \nC. Eliminar cliente "
                                + "\nD. Buscar cliente \nE. Ver lista de clientes \nF.Volver al menú principal").toUpperCase();
                        switch (opcion){
                        case "A":
                            
                            break;
                        case "B":
                            
                            break;
                        case "C":
                            
                            break;
                        case "D":
                            
                            break;
                        case "E":
                            
                            break;
                        case "F":
                            opcion = ""; //para que salga de do while
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no válida");
                            break;
                    }//fin de switch 2
                    }while(!opcion.equals(""));
                    break;
                case "B":
                    do{
                        opcion = JOptionPane.showInputDialog("Digite la opción que desea: \nA. Agregar empleado \nB. Editar editar \nC. Eliminar empleado "
                                + "\nD. Buscar empleado \nE. Ver lista de empleados \nF.Volver al menú principal").toUpperCase();
                        switch (opcion){
                        case "A":
                            
                            break;
                        case "B":
                            
                            break;
                        case "C":
                            
                            break;
                        case "D":
                            
                            break;
                        case "E":
                            
                            break;
                        case "F":
                            opcion = ""; //para que salga de do while
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no válida");
                            break;
                    }//fin de switch 2
                    }while(!opcion.equals(""));
                    break;
                case "S":
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }//fin de switch1
            
        }while(!opcion.equals("S"));
        
    }//fin método
}
