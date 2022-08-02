package prjproyectogym;

import java.awt.TextArea;
import javax.swing.JOptionPane;

public class clsEmpleados {

    //----------------INSTANCIAS-----
    cls_funciones clsF = new cls_funciones();

    //-----------------Atributos-------------------
    private String NombreC;
    private String identificacion;
    private String sexo;
    private String origen;
    private String correoE;
    private String numeroTelefonico;
    private String puesto;
    private int edad;
    int contadorE = 0;
    clsEmpleados bdEmpleados[] = new clsEmpleados[99999];

    //---------CONSTRUCTOR---------------------------
    public clsEmpleados(String NombreC, String identificacion, String origen, String correoE, String telefono, String puesto, int edad, String sexo) {
        this.NombreC = NombreC;
        this.identificacion = identificacion;
        this.origen = origen;
        this.correoE = correoE;
        this.numeroTelefonico = telefono;
        this.puesto = puesto;
        this.edad = edad;
        this.sexo = sexo;

    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public clsEmpleados() {
    }

    public String getNombreC() {
        return NombreC;
    }

    public void setNombreC(String NombreC) {
        this.NombreC = NombreC;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void AgregarEmpleado() {

        //------------------------VARIABLES-----------------------
        String nombre = "", identificacion = "", sexo = "", origen = "", correoE = "", telefono = "", puesto = "", controlador = "", edadS = "";
        int edad = 0;
        int bandera = 0;
        boolean igual=false;

        //-----------------------PROGRAM PRINCIPAL--------------------------
        do {
            try {
                //-------Pide nombre del Empleado mientras sea menor que 5 caracteres--------
                while (nombre.length() < 5 || nombre.equals("")) {
                    nombre = JOptionPane.showInputDialog("Digite el nombre completo del empleado");
                    if (nombre.length() < 5 || nombre.equals("")) {
                        //Si el nombre que se introdujo es menor a 5 caracteres se le muestra el siguiente mensaje 
                        JOptionPane.showMessageDialog(null, "! Nombre invalido ¡\nDigite un nombre valido");
                    }
                }//fin pedir nombre de empleado
                /*
                do {
                    nombre = JOptionPane.showInputDialog("Digite el nombre completo del empleado");
                    if (nombre.length() > 5) {
                        controlador = "Z";
                    } else {
                        JOptionPane.showInputDialog("! Nombre invalido ¡\nDigite un nombre valido");
                    }
                } while (!controlador.equals("Z"));
                //Fin ciclo Nombre-------------*/

                //--------------------Pedir edad del empleado--------------------------
                while (!clsF.esNumero(edadS) || !(Integer.parseInt(edadS) >= 18 && Integer.parseInt(edadS) <= 100)) { //Se comprueba si es numero
                    edadS = JOptionPane.showInputDialog("Digite su edad:");
                    if (!clsF.esNumero(edadS) || !(Integer.parseInt(edadS) >= 18 && Integer.parseInt(edadS) <= 100)) {
                        JOptionPane.showMessageDialog(null, "EDAD INVALIDA");
                    }
                }
                edad = Integer.parseInt(edadS); //la edadS se convierta a numero
                //------------------FIN edad-------------------------------------------

                /*
                do {
                    controlador = "";
                    try {
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad el empleado"));
                        if (edad >= 18 && edad <= 100) {
                            controlador = "Z";
                        } else {
                            JOptionPane.showMessageDialog(null, "!Edad Invalida¡");
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Valor invalido");
                    }

                } while (!controlador.equals("Z"));
                //Fin ciclo de edad---*/
                //------------------SEXO DEL EMPLEADO-------------------------
                while (sexo.equals("") || !sexo.equals("A") && !sexo.equals("B") && !sexo.equals("C")) { //pide edad empleado 
                    sexo = JOptionPane.showInputDialog("Digite el sexo del empleado:\nA. Masculino\nB. Femenino\nC. Indefinido").toUpperCase();
                    if (sexo.equals("") || !sexo.equals("A") && !sexo.equals("B") && !sexo.equals("C")) {// si es null o diferente  a A,B,C entonces da error
                        JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
                    }

                }
                switch (sexo) {
                    case "A":
                        sexo = "Masculino";
                        break;
                    case "B":
                        sexo = "Femenino";
                        break;
                    case "C":
                        sexo = "Indefinido";
                        break;

                }
                //-----------------FIN SEXO EMPLEADO--------------------------
                /*
                do {
                    controlador = "";
                    controlador = JOptionPane.showInputDialog("Digite el sexo del empleado:\nA. Masculino\nB. Femenino\nC. Indefinido").toUpperCase();
                    switch (controlador) {
                        case "A":
                            controlador = "Z";
                            sexo = "Masculino";
                            break;
                        case "B":
                            controlador = "Z";
                            sexo = "Femenino";
                            break;
                        case "C":
                            controlador = "Z";
                            sexo = "Indefinido";
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                            break;

                    }

                } while (!controlador.equals("Z"));*/

                //-----------------------INICIO CEDULA EMPL2EADO---------------------
                while (origen.equals("") || !origen.equals("A") && !origen.equals("B")) {
                    origen = JOptionPane.showInputDialog("Seleccion su tipo de Cedula:"
                            + "\nA. Nacional"
                            + "\nB. Extrangero").toUpperCase();
                    if (origen.equals("") || !origen.equals("A") && !origen.equals("B")) {
                        JOptionPane.showMessageDialog(null, "Tipo de cedula invalda");
                    }
                }
                switch (origen) {
                    case "A":
                        origen = "Nacional";

                        while (!clsF.esNumero(identificacion) || identificacion.length()!=9 || identificacion.charAt(0)=='0' || igual==true) {
                            identificacion=JOptionPane.showInputDialog("Digite su numero de identificacion");
                            
                            for (int i = 0; i < bdEmpleados.length; i++) {
                                if (identificacion.equals(bdEmpleados[i].getIdentificacion())) {
                                    igual=false;
                                }else{
                                    JOptionPane.showMessageDialog(null, "Ya exite un empleado con ete numero de identificacion!");
                                    igual=true;
                                }
                            }//fin for buscar igualdades
                        }

                        break;

                    case "B":
                        
                        origen = "Extrangero";

                        while (!clsF.esNumero(identificacion) || identificacion.length()!=12 || identificacion.charAt(0)=='0' || igual==true) {
                            identificacion=JOptionPane.showInputDialog("Digite su numero de identificacion");
                            
                            for (int i = 0; i < bdEmpleados.length; i++) {
                                if (identificacion.equals(bdEmpleados[i].getIdentificacion())) {
                                    igual=false;
                                }else{
                                    JOptionPane.showMessageDialog(null, "Ya exite un empleado con ete numero de identificacion!");
                                    igual=true;
                                }
                            }//fin for buscar igualdades
                        }
                        
                        break;

                }
                //------------------------FIN CEDULA EMPLEADO--------------------------

                /*//-INCIO CEDULA EMPLEADO
                do {
                    controlador = " ";
                    controlador = JOptionPane.showInputDialog("A. Nacional\nB. Extranjero").toUpperCase();
                    if (controlador.equals("A") || controlador.equals("B")) {
                        switch (controlador) {
                            case "A":
                                origen = "Nacional";
                                controlador = "";
                                bandera = 0;
                                do {
                                    do {
                                        identificacion = JOptionPane.showInputDialog("Digite el numero de cedula del empleado");
                                        if (identificacion.length() == 9 && ((int) identificacion.charAt(0) > 48 && (int) identificacion.charAt(0) < 58)) {
                                            for (int j = 1; j < identificacion.length(); j++) {
                                                if (((int) identificacion.charAt(j) > 47 && (int) identificacion.charAt(j) < 58)) {
                                                    bandera = 1;
                                                } else {
                                                    bandera = 0;
                                                    JOptionPane.showMessageDialog(null, "!Numero de Cedula invalido!\nDigite un numero de cedula valido");
                                                    break;
                                                }
                                            }

                                        } else {
                                            JOptionPane.showMessageDialog(null, "!Numero de Cedula invalido!\nDigite un numero de cedula valido");
                                        }

                                    } while (bandera != 1);
                                    if (contadorE == 0) {
                                        controlador = "Z";
                                    } else {
                                        for (int k = 0; k < contadorE; k++) {
                                            if (!identificacion.equals(bdEmpleados[k].getIdentificacion())) {
                                                controlador = "Z";
                                            } else {
                                                controlador = "";
                                                JOptionPane.showMessageDialog(null, "! El numero de cedula ya fue registrado ¡\nVerifique eh intente de nuevo");
                                                bandera = 0;
                                                break;
                                            }

                                        }
                                    }

                                } while (!controlador.equals("Z"));
                                break;
                            case "B":
                                origen = "Extranjero";
                                controlador = "";
                                bandera = 0;
                                do {
                                    do {
                                        identificacion = JOptionPane.showInputDialog("Digite el numero de cedula del empleado");
                                        if (identificacion.length() == 12 && ((int) identificacion.charAt(0) > 48 && (int) identificacion.charAt(0) < 58)) {
                                            for (int j = 1; j < identificacion.length(); j++) {
                                                if (((int) identificacion.charAt(j) > 47 && (int) identificacion.charAt(j) < 58)) {
                                                    bandera = 1;
                                                } else {
                                                    bandera = 0;
                                                    JOptionPane.showMessageDialog(null, "!Numero de Cedula invalido!\nDigite un numero de cedula valido");
                                                    break;
                                                }
                                            }

                                        } else {
                                            JOptionPane.showMessageDialog(null, "!Numero de Cedula invalido!\nDigite un numero de cedula valido");
                                        }

                                    } while (bandera != 1);
                                    if (contadorE == 0) {
                                        controlador = "Z";
                                    } else {
                                        for (int k = 0; k < contadorE; k++) {
                                            if (!identificacion.equals(bdEmpleados[k].getIdentificacion())) {
                                                controlador = "Z";
                                            } else {
                                                controlador = "";
                                                JOptionPane.showMessageDialog(null, "! El numero de cedula ya fue registrado ¡\nVerifique eh intente de nuevo");
                                                bandera = 0;
                                                break;
                                            }

                                        }
                                    }

                                } while (!controlador.equals("Z"));

                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion invalida");
                                break;
                        }
                        controlador = "Z";
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                    }

                } while (!controlador.equals("Z"));
                //--fin cedula empleado*/
                controlador = "";
                bandera = 0;
                do {
                    do {
                        telefono = JOptionPane.showInputDialog("Digite el numero de telefono del empleado");
                        if (telefono.length() == 8) { // Numero telefonico tiene que tener 8 digitos.
                            if ((int) telefono.charAt(0) == 56 || (int) telefono.charAt(0) == 55 || (int) telefono.charAt(0) == 54) { // Evaluando  que tiene  que empezar con 8, 7 o 6, de acuerdo a las compañias que hay en el pais.
                                for (int j = 1; j < telefono.length(); j++) { // Ciclo para recorrer desde la posición 2
                                    if ((int) telefono.charAt(j) > 47 && (int) telefono.charAt(j) < 58) {// Evaluar que esten entre el 0 al 9, ya que se hizo con código ASCII.
                                        bandera = 1;
                                    } else {
                                        bandera = 0;
                                        JOptionPane.showMessageDialog(null, "!Telefono invalido¡\nDigite un numero de telefono valido");
                                        break;
                                    }
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "!Telefono invalido¡\nDigite un numero de telefono valido");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "!Telefono invalido¡\nDigite un numero de telefono valido");
                        }
                    } while (bandera != 1);
                    if (contadorE == 0) {
                        controlador = "Z";
                    } else {
                        for (int k = 0; k < contadorE; k++) { // Ciclo para recorrer las posiciones del arreglo.
                            if (!telefono.equals(bdEmpleados[k].getNumeroTelefonico())) { // Evaluar si hay un numero telefonico igual en los empleados agregados.
                                controlador = "Z";
                            } else {
                                controlador = "";
                                JOptionPane.showMessageDialog(null, "! El numero de telefono ya fue registrado ¡\nVerifique eh intente de nuevo");
                                bandera = 0;
                                break;
                            }

                        }
                    }
                } while (!controlador.equals("Z"));
                controlador = "";
                do {
                    controlador = JOptionPane.showInputDialog("Seleccione el puesto de trabajo:\nA. Administrador(a)\nB. Instructor(a)\nC. Entrenador(a) personal\nD. Nutriologo(a)\nE. Conserje").toUpperCase();
                    switch (controlador) {
                        case "A":
                            controlador = "Z";
                            puesto = "Administrador";
                            break;
                        case "B":
                            controlador = "Z";
                            puesto = "Instructor";
                            break;
                        case "C":
                            controlador = "Z";
                            puesto = "Entrenador Personal";

                            break;
                        case "D":
                            controlador = "Z";
                            puesto = "Nutriologo";
                            break;
                        case "E":
                            controlador = "Z";
                            puesto = "Conserje";
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                            break;
                    }

                } while (!controlador.equals("Z"));
                bdEmpleados[contadorE] = new clsEmpleados(nombre, identificacion, origen, correoE, telefono, puesto, edad, sexo);
                contadorE++;
                JOptionPane.showMessageDialog(null, "Empleado agregado correctamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Opcion invalida");
            }
        } while (bandera != 1);
    }//--------fin CREAR EMPLEADO-----------

    public void ListaEmpleados() {
        if (contadorE > 0) {
            String imprimir = bdEmpleados[0].toString() + "\n";
            for (int i = 1; i < contadorE; i++) {
                imprimir += bdEmpleados[i].toString() + "\n";
            }
            JOptionPane.showMessageDialog(null, imprimir);
        } else {
            JOptionPane.showMessageDialog(null, "No hay empleados agregados");
        }
    }

    public void BuscarEmpleado() {
        String identificacion = "";
        String salir = "";
        int bandera = 0;
        int j = 0;

        if (contadorE > 0) {
            do {
                identificacion = JOptionPane.showInputDialog("Digite la identificacion del empleado");
                for (int i = 0; i < contadorE; i++) {
                    if (bdEmpleados[i].getIdentificacion().equals(identificacion)) {
                        bandera = 1;
                        j = i;
                    }
                }
                if (bandera == 1) {
                    JOptionPane.showMessageDialog(null, "Puesto de trabajo: " + bdEmpleados[j].getPuesto() + "\nNombre Completo: " + bdEmpleados[j].getNombreC() + "\nEdad: " + bdEmpleados[j].getEdad() + "\nSexo: " + bdEmpleados[j].getSexo() + "\nOrigen: " + bdEmpleados[j].getOrigen() + "\nIdentificacion: " + bdEmpleados[j].getIdentificacion()
                            + "\nCorreo Electronico: " + bdEmpleados[j].getCorreoE() + "\nNumero Telefonico: " + bdEmpleados[j].getNumeroTelefonico());
                } else {
                    JOptionPane.showMessageDialog(null, "! Identificacion no encontrada ¡");
                }

                do {
                    salir = JOptionPane.showInputDialog(" Desea buscar otro empleado:\nSi\nNo").toUpperCase();
                    if (salir.equals("NO") || salir.equals("SI")) {

                    } else {
                        JOptionPane.showMessageDialog(null, "! Opcion no valilda ¡\nDigite una opcion correcta");
                    }
                } while (!salir.equals("NO") && !salir.equals("SI"));

            } while (!salir.equals("NO"));
        } else {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados");
        }

    } // Finaliza el metodo de buscar empleado.

    @Override
    public String toString() {
        return puesto + "  " + NombreC + " || " + edad + " || " + sexo + " || " + origen + " || " + identificacion + " || " + correoE + " || " + numeroTelefonico;
    }

}
