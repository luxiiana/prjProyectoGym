package prjproyectogym;

import java.awt.TextArea;
import javax.swing.JOptionPane;

public class clsEmpleados {

    // Atributos
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

    public clsEmpleados(String NombreC, String identificacion, String origen, String correoE, String telefono, String puesto, int edad, String sexo) {
        this.NombreC = NombreC;
        this.identificacion = identificacion;
        this.origen = origen;
        this.correoE = correoE;
        this.numeroTelefonico = telefono;
        this.puesto = puesto;
        this.edad = edad;
        this.sexo=sexo;

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
        String nombre = "";
        String identificacion = "";
        String sexo="";
        String origen = "";
        String correoE = "";
        String telefono = "";
        String puesto = "";
        int edad = 0;
        String controlador = "";
        do {
            nombre = JOptionPane.showInputDialog("Digite el nombre completo del empleado");
            if (nombre.length() > 5) {
                controlador = "Z";
            } else {
                JOptionPane.showInputDialog("! Nombre invalido ¡\nDigite un nombre valido");
            }
        } while (!controlador.equals("Z"));
        controlador = "";
        do {
            try {
                edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad el empleado"));
                if (edad >=18 && edad <= 100) {
                    controlador = "Z";
                } else {
                    JOptionPane.showMessageDialog(null, "!Edad Invalida¡");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor invalido");
            }

        } while (!controlador.equals("Z"));
        controlador="";
        do {
            controlador=JOptionPane.showInputDialog("Digite el sexo del empleado:\nA. Masculino\nB. Femenino\nC. Indefinido").toUpperCase();
            switch(controlador){
                case "A":
                    controlador="Z";
                    sexo="Masculino";
                    break;
                case "B":
                    controlador="Z";
                    sexo="Femenino";
                    break;
                case "C":
                    controlador="Z";
                    sexo="Indefinido";
                    break;
                default:
                     JOptionPane.showMessageDialog(null, "Opcion invalida");
                     break;
                    
            }
            
        } while (!controlador.equals("Z"));
        controlador = " ";
        do {
            controlador = JOptionPane.showInputDialog("A. Nacional\nB. Extranjero").toUpperCase();
            if (controlador.equals("A") || controlador.equals("B")) {
                switch (controlador) {
                    case "A":
                        origen = "Nacional";
                        controlador = "";
                        do {
                            identificacion = JOptionPane.showInputDialog("Digite el numero de cedula del empleado");
                            if (identificacion.length() == 9 && ((int) identificacion.charAt(0) > 48 && (int) identificacion.charAt(0) < 58)) {
                                for (int j = 1; j < identificacion.length(); j++) {
                                    if (((int) identificacion.charAt(j) > 47 && (int) identificacion.charAt(j) < 58)) {
                                        if (contadorE == 0) {
                                            controlador = "Z";
                                        } else {
                                            for (int k = 0; k < contadorE; k++) {
                                                if (!identificacion.equals(bdEmpleados[k].getIdentificacion())) {
                                                    controlador = "Z";
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "! El numero de cedula ya fue registrado ¡\nVerifique eh intente de nuevo");
                                                    break;
                                                }

                                            }

                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "!Numero de Cedula invalido!\nDigite un numero de cedula valido");
                                    }

                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "!Numero de Cedula invalido!\nDigite un numero de cedula valido");
                            }

                        } while (!controlador.equals("Z"));
                        break;
                    case "B":
                        origen = "Extranjero";
                        controlador = "";
                        do {
                            String identificacionn = JOptionPane.showInputDialog("Digite el numero de cedula del empleado");
                            if (identificacionn.length() > 0 && ((int) identificacionn.charAt(0) > 48 && (int) identificacionn.charAt(0) < 58)) {
                                for (int j = 1; j < identificacionn.length(); j++) {
                                    if (((int) identificacionn.charAt(j) > 47 && (int) identificacionn.charAt(j) < 58)) {
                                        if (contadorE == 0) {
                                            controlador = "Z";
                                        } else {
                                            for (int k = 0; k < contadorE; k++) {
                                                if (!identificacionn.equals(bdEmpleados[k].getIdentificacion())) {
                                                    controlador = "Z";
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "! El numero de cedula ya fue registrado ¡\nVerifique eh intente de nuevo");
                                                    break;
                                                }

                                            }

                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "!Numero de Cedula invalido!\nDigite un numero de cedula valido");
                                    }

                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "!Numero de Cedula invalido!\nDigite un numero de cedula valido");
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
        controlador = "";
        do {
             telefono = JOptionPane.showInputDialog("Digite el numero de telefono del empleado");
            if (telefono.length() == 8) { // Numero telefonico tiene que tener 8 digitos.
                if ((int) telefono.charAt(0) == 56 || (int) telefono.charAt(0) == 55 || (int) telefono.charAt(0) == 54) { // Evaluando  que tiene  que empezar con 8, 7 o 6, de acuerdo a las compañias que hay en el pais.
                    for (int j = 1; j < telefono.length(); j++) { // Ciclo para recorrer desde la posición 2
                        if ((int) telefono.charAt(j) > 47 && (int) telefono.charAt(j) < 58) { // Evaluar que esten entre el 0 al 9, ya que se hizo con código ASCII.
                            if (contadorE == 0) { // Iteración de  una sola vez, para que no entre a la evalucion si no hay empleados agregados.
                                controlador = "Z";
                            } else {
                                for (int k = 0; k < contadorE; k++) { // Ciclo para recorrer las posiciones del arreglo.
                                    if (!telefono.equals(bdEmpleados[k].getNumeroTelefonico())) { // Evaluar si hay un numero telefonico igual en los empleados agregados.
                                        controlador = "Z";
                                    } else {
                                        JOptionPane.showMessageDialog(null, "! El numero de telefono ya fue registrado ¡\nVerifique eh intente de nuevo");
                                        break;
                                    }

                                }

                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "!Telefono invalido¡\nDigite un numero de telefono valido");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "!Telefono invalido¡\nDigite un numero de telefono valido");
                }
            } else {
                JOptionPane.showMessageDialog(null, "!Telefono invalido¡\nDigite un numero de telefono valido");
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
        bdEmpleados[contadorE] = new clsEmpleados(nombre, identificacion, origen, correoE, telefono, puesto, edad,sexo);
        contadorE++;
        JOptionPane.showMessageDialog(null, "Empleado agregado correctamente");
    }
     public void ListaEmpleados() {
         if(contadorE>0){
            String imprimir = bdEmpleados[0].toString() + "\n";
        for (int i = 1; i < contadorE; i++) {
            imprimir += bdEmpleados[i].toString() + "\n";
        }
        JOptionPane.showMessageDialog(null,new TextArea(imprimir));
         }else{
             JOptionPane.showMessageDialog(null,"No hay empleados agregados");
         }
    }
      public void BuscarEmpleado() {
        String identificacion = "";
        String salir = "";
        int bandera = 0;

        if (contadorE > 0) {
            do {
                identificacion = JOptionPane.showInputDialog("Digite la identificacion del empleado");
                for (int j = 0; j < contadorE; j++) { //i =5
                    if (identificacion.equals(bdEmpleados[j].getIdentificacion())) {
                        bandera = 1;
                        JOptionPane.showMessageDialog(null,"Puesto de trabajo: "+bdEmpleados[j].getPuesto()+"\nNombre Completo: "+bdEmpleados[j].getNombreC()+"\nEdad: "+bdEmpleados[j].getEdad()+"\nSexo: "+bdEmpleados[j].getSexo()+"\nOrigen: "+bdEmpleados[j].getOrigen()+"\nIdentificacion: "+bdEmpleados[j].getIdentificacion()
                        +"\nCorreo Electronico: "+bdEmpleados[j].getCorreoE()+"\nNumero Telefonico: "+bdEmpleados[j].getNumeroTelefonico());
                    } else {
                            JOptionPane.showMessageDialog(null, "! Identificacion no encontrada ¡");
                            break;

                        

                    }
                }
                while (!salir.equals("NO") && !salir.equals("SI")) {
                    salir = JOptionPane.showInputDialog(" Desea buscar otro empleado:\nSi\nNo").toUpperCase();
                    if (salir.equals("NO") || salir.equals("SI")) {

                    } else {
                        JOptionPane.showMessageDialog(null, "! Opcion no valilda ¡\nDigite una opcion correcta");
                    }
                }
            } while (!salir.equals("NO"));
        } else {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados");
        }

    } // Finaliza el metodo de buscar empleado.

    @Override
    public String toString() {
        return     NombreC + "\t"+edad+"\t"+ identificacion + "\t" + origen + "\t" + correoE + "\t" + numeroTelefonico + "\t" + puesto  ;
    }
     
}
