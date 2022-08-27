package prjproyectogym;

import javax.swing.JOptionPane;
import vistas.JF_inicioSesion;
import vistas.JF_menuPrincipal;

public class clsMenu {

    //------INSTANCIAS-------
    clsCliente clsC = new clsCliente();
    clsEmpleados clsE = new clsEmpleados();

    /*
        añadir comprobar si usario tiene acceso al gym
     */
    public void menuPrincipal(String opcion) { //Luciana

        if (opcion == "A") {
            do {
                opcion = JOptionPane.showInputDialog("Digite la opción que desea: \nA. Añadir cliente \nB. Editar cliente \nC. Eliminar cliente "
                        + "\nD. Buscar cliente \nE. Ver lista de clientes \nF.Ver estadistícas de los clientes \nG.Volver al menú principal ").toUpperCase();
                switch (opcion) {
                    case "A":
                        clsC.agregarCliente();
                        break;
                    case "B":
                        clsC.editarCliente();
                        break;
                    case "C":
                        clsC.eliminarCliente();
                        break;
                    case "D":
                        clsC.BuscarCliente();
                        break;
                    case "E":
                        clsC.listarClientes();
                        break;
                    case "F":
                        clsInfoGym clsI = new clsInfoGym();
                        clsI.estadisticasClientes();
                        break;
                    case "G":
                        JF_menuPrincipal JFMP = new JF_menuPrincipal();
                        JFMP.setVisible(true);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                        break;
                }//fin de switch Clientes
            } while (!opcion.equals("F"));
        } else {//----empleados
            do {
                opcion = JOptionPane.showInputDialog("Digite la opción que desea: \nA. Agregar empleado \nB. Editar editar \nC. Eliminar empleado "
                        + "\nD. Buscar empleado \nE. Ver lista de empleados \nF. Volver al menú principal").toUpperCase();
                switch (opcion) {

                    case "A":
                        clsE.AgregarEmpleado();
                        break;
                    case "B":
                        clsE.editarEmpleado();

                        break;
                    case "C":
                        clsE.eliminarEmpleado();
                        break;
                    case "D":
                        clsE.BuscarEmpleado();

                        break;
                    case "E":
                        clsE.ListaEmpleados();

                        break;
                    case "F":
                        JF_menuPrincipal JFMP = new JF_menuPrincipal();
                        JFMP.setVisible(true);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                        break;
                }//fin de switch Empleados
            } while (!opcion.equals("F"));
        }//fin else

    }//fin método
}
