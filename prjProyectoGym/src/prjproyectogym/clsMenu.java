package prjproyectogym;

import javax.swing.JOptionPane;

public class clsMenu {
    clsEmpleados clsE = new clsEmpleados();

    public void menuPrincipal() {
        
       
        String opcion = "";
        do {
            try {
            opcion = JOptionPane.showInputDialog("Digite la opción que desea: \nB. Administrar empleados \nS. SALIR").toUpperCase();
            switch (opcion) {
                case "A":
                    do {
                        opcion = JOptionPane.showInputDialog("Digite la opción que desea: \nA. Añadir cliente \nB. Editar cliente \nC. Eliminar cliente "
                                + "\nD. Buscar cliente \nE. Ver lista de clientes \nF.Volver al menú principal").toUpperCase();
                        switch (opcion) {
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
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción no válida");
                                break;
                        }//fin de switch 2
                    } while (!opcion.equals("F"));
                    break;
                case "B":
                    do {
                        opcion = JOptionPane.showInputDialog("Digite la opción que desea: \nA. Agregar empleado \nB. Editar editar \nC. Eliminar empleado "
                                + "\nD. Buscar empleado \nE. Ver lista de empleados \nF. Volver al menú principal").toUpperCase();
                        switch (opcion) {
                            
                                
                                
                            case "A":
                               clsE.AgregarEmpleado();
                                break;
                            case "B":

                                break;
                            case "C":

                                break;
                            case "D":
                                clsE.BuscarEmpleado();

                                break;
                            case "E":
                                clsE.ListaEmpleados();

                                break;
                            case "F":
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción no válida");
                                break;
                        }//fin de switch 2
                    } while (!opcion.equals("F"));
                    break;
                case "S":
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }//fin de switch1

       }catch(Exception w){
    JOptionPane.showMessageDialog(null,"Opcion invalida");
    
       }
        } while (!opcion.equals("S"));

    }//fin método
}
