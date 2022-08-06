package prjproyectogym;

import javax.swing.JOptionPane;

public class clsCliente {

    ///---------Info Personal------
    private String nombreC;
    private String identificacion;
    private String sexo;
    private int edad;
    private String origen;
    private String telefono;
    private String tipoDePase;
    private String entrenador;
    int contadorC = 0;
    /*  
        Basico [] solo acceso a gym || no ucpa ningun calculo pago=1000
        Max [] pichudo pero ocupa entrenado ||  no ocupa ningun calculo pago=2000
        Ultra []  0 pichudo ocupa entrenar y rutina || si ocupatodo pago=3000
     */
    private float pago; //Predeterminado lee tipo de pase

    //----------INFO GYM---------------------
    private String somatotipo; //Eptomorfo-Mesomorfo-Endomorfo
    private String objetivo; //SubirPerso-bajarPeso-manternerPeso
    /*
        Formula hom= ((10*kg)+(6.25*alturacm)-(5*edad)+5)*1.5
        Formula muj= ((10*kg)+(6.25*alturacm)-(5*edad)+161)*1.5
     */
    private float caloriasDiarias;
    private float caloriasObjetivo;
    private float pesoKg; //input
    private float estaturaMts; //input

    //private float pesoIdeal; FUTURA EMPLEMETACION
    //----------INSTANCIAS-------------------
    clsRutina rutina;
    clsEmpleados clsE = new clsEmpleados();
    //clsAlimentacion PlanAlimentacion;

    clsCliente bdClientes[] = new clsCliente[9999999];
    cls_funciones clsF = new cls_funciones();

    public clsCliente() {
    }

    public clsCliente(String nombreC, String identificacion, String sexo, int edad, String origen, String telefono, String tipoDePase, String entrenador, float pago, String somatotipo, String objetivo, float caloriasDiarias, float caloriasObjetivo, float pesoKg, float estaturaCm, clsRutina rutina) {
        this.nombreC = nombreC;
        this.identificacion = identificacion;
        this.sexo = sexo;
        this.edad = edad;
        this.origen = origen;
        this.telefono = telefono;
        this.tipoDePase = tipoDePase;
        this.entrenador = entrenador;
        this.pago = pago;
        this.somatotipo = somatotipo;
        this.objetivo = objetivo;
        this.caloriasDiarias = caloriasDiarias;
        this.caloriasObjetivo = caloriasObjetivo;
        this.pesoKg = pesoKg;
        this.estaturaMts = estaturaCm;
        this.rutina = rutina;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSomatotipo() {
        return somatotipo;
    }

    public void setSomatotipo(String somatotipo) {
        this.somatotipo = somatotipo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getTipoDePase() {
        return tipoDePase;
    }

    public void setTipoDePase(String tipoDePase) {
        this.tipoDePase = tipoDePase;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public float getCaloriasDiarias() {
        return caloriasDiarias;
    }

    public void setCaloriasDiarias(float caloriasDiarias) {
        this.caloriasDiarias = caloriasDiarias;
    }

    public float getCaloriasObjetivo() {
        return caloriasObjetivo;
    }

    public void setCaloriasObjetivo(float caloriasObjetivo) {
        this.caloriasObjetivo = caloriasObjetivo;
    }

    public float getPago() {
        return pago;
    }

    public void setPago(float pago) {
        this.pago = pago;
    }

    public float getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(float pesoKg) {
        this.pesoKg = pesoKg;
    }

    public float getEstaturaMts() {
        return estaturaMts;
    }

    public void setEstaturaCm(float estaturaCm) {
        this.estaturaMts = estaturaCm;
    }

    public clsRutina getRutina() {
        return rutina;
    }

    public void setRutina(clsRutina rutina) {
        this.rutina = rutina;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void agregarCliente() { // Derek

        //--------------------------Variables--------------------------
        String entrenador = "", nombre = "", identificacion = "", sexo = "", origen = "", edadS = "", telefono = "", tipoDePase = "", somatotipo = "", objetivo = "", caloriasDiariasS = "", pesoKgS = "", estaturaCmS = "", pagoS = "", controlador = "";
        int edad = 0, bandera = 0;
        float pago = 0, caloriasDiarias = 0, pesoKg = 0, estaturaCm = 0, caloriasObjetivo = 0;

        //-------Pide nombre del Cliente mientras sea menor que 5 caracteres--------
        while (nombre.length() < 5 || nombre.equals("")) {
            nombre = JOptionPane.showInputDialog("Digite el nombre completo del cliente");
            if (nombre.length() < 5 || nombre.equals("")) {
                //Si el nombre que se introdujo es menor a 5 caracteres se le muestra el siguiente mensaje 
                JOptionPane.showMessageDialog(null, "! Nombre invalido ¡\nDigite un nombre valido");
            }
        }//fin pedir nombre de Cliente

        //-INCIO CEDULA EMPLEADO  
        /*
                    Nacional[]
                    DIMEX []
                    OTRO []
         */
        do {
            controlador = " ";
            controlador = JOptionPane.showInputDialog("Seleccione su tipo de Identificacion"
                    + "\nA. Nacional\nB. Dimex\nC. otro").toUpperCase();
            if (controlador.equals("A") || controlador.equals("B")) {
                switch (controlador) {
                    case "A":
                        origen = "Nacional";
                        controlador = "";
                        bandera = 0;
                        do {
                            do {
                                identificacion = JOptionPane.showInputDialog("Digite el numero de cedula del Cliente");
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
                            if (contadorC == 0) {
                                controlador = "Z";
                            } else {
                                for (int k = 0; k < contadorC; k++) {
                                    if (!identificacion.equals(bdClientes[k].getIdentificacion())) {
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
                            if (contadorC == 0) {
                                controlador = "Z";
                            } else {
                                for (int k = 0; k < contadorC; k++) {
                                    if (!identificacion.equals(bdClientes[k].getIdentificacion())) {
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
                    case "C":
                        origen = "Extranjero";
                        identificacion = JOptionPane.showInputDialog("Digite el numero de identificacion del empleado");
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                        break;
                }
                controlador = "Z";
            } else {
                JOptionPane.showMessageDialog(null, "Opcion invalida");
            }

        } while (!controlador.equals("Z"));
        //--fin cedula empleado

        //--------------------Pedir edad del empleado--------------------------
        while (!clsF.esNumero(edadS) || !(Integer.parseInt(edadS) >= 18 && Integer.parseInt(edadS) <= 100)) { //Se comprueba si es numero
            edadS = JOptionPane.showInputDialog("Digite su edad:");
            if (!clsF.esNumero(edadS) || !(Integer.parseInt(edadS) >= 18 && Integer.parseInt(edadS) <= 100)) {
                JOptionPane.showMessageDialog(null, "EDAD INVALIDA");
            }
        }
        edad = Integer.parseInt(edadS); //la edadS se convierta a numero
        //------------------FIN edad-------------------------------------------

        //------------------SEXO DEL EMPLEADO-------------------------
        while (sexo.equals("") || !sexo.equals("A") && !sexo.equals("B")) { //pide edad empleado 
            sexo = JOptionPane.showInputDialog("Digite el sexo del Cliente:\nA. Masculino\nB. Femenino").toUpperCase();
            if (sexo.equals("") || !sexo.equals("A") && !sexo.equals("B")) {// si es null o diferente  a A,B,C entonces da error
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

        }

        //-----------------FIN SEXO EMPLEADO--------------------------
        //------------------NUMERO TELEFONICO
        controlador = "";
        bandera = 0;
        do {
            do {
                telefono = JOptionPane.showInputDialog("Digite el numero de telefono del cliente");
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
            if (contadorC == 0) {
                controlador = "Z";
            } else {
                for (int k = 0; k < contadorC; k++) { // Ciclo para recorrer las posiciones del arreglo.
                    if (!telefono.equals(bdClientes[k].getTelefono())) { // Evaluar si hay un numero telefonico igual en los empleados agregados.
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
        //fin numero telefonico

        //---------------TIPO DE PASE-----------------------
        while (tipoDePase.equals("") || !tipoDePase.equals("A") && !tipoDePase.equals("B") && !tipoDePase.equals("C")) {
            tipoDePase = JOptionPane.showInputDialog("Selecciones su tipo de pase:"
                    + "\nA. Basico"
                    + "\nB. Max"
                    + "\nC. Ultra").toUpperCase();
        }

        switch (tipoDePase) {
            case "A":
                tipoDePase = "Basico";
                pago = 1000;
                JOptionPane.showMessageDialog(null, "USUARIO CREADO");
                break;
            case "B":
                tipoDePase = "Max";
                pago = 2000;
                //---
                int cantE = clsE.contadorE;
              
                break;

            case "C":
                tipoDePase = "Ultra";
                pago = 3000;
                //---------SOMATIPO------------------------------------
                while (somatotipo.equals("") || !somatotipo.equals("A") && !somatotipo.equals("B") && !somatotipo.equals("C")) {
                    somatotipo = clsF.cadena("Digite su tipo de Somatotipo"
                            + "\nA. Eptomorfo"
                            + "\nB. Mesomorfo"
                            + "\nC. Endomorfo");
                    if (somatotipo.equals("") || !somatotipo.equals("A") && !somatotipo.equals("B") && !somatotipo.equals("C")) {
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                    }
                }
                switch (somatotipo) {
                    case "A":
                        somatotipo = "Eptomorfo";
                        break;
                    case "B":
                        somatotipo = "Mesomorfo";
                        break;
                    case "C":
                        somatotipo = "Endomorfo";
                        break;
                }

                //-------------------------------------------------------
                //---------OBJETIVO------------------------------------
                while (objetivo.equals("") || !objetivo.equals("A") && !objetivo.equals("B") && !objetivo.equals("C")) {
                    objetivo = clsF.cadena("Digite el obejtivo"
                            + "\nA. Subir de peso"
                            + "\nB. Bajar de peso"
                            + "\nC. Mantener peso");
                    if (objetivo.equals("") || !objetivo.equals("A") && !objetivo.equals("B") && !objetivo.equals("C")) {
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                    }
                }
                switch (objetivo) {
                    case "A":
                        objetivo = "Eptomorfo";
                        break;
                    case "B":
                        objetivo = "Mesomorfo";
                        break;
                    case "C":
                        objetivo = "Endomorfo";
                        break;
                }
                
                break;
        }
        //-----------------------------------------------------
        //-------------CREACION DEL OBEJTO CLIENTE--------------------
        bdClientes[contadorC] = new clsCliente(nombre, identificacion, sexo, edad, origen, telefono, tipoDePase, entrenador, pago, somatotipo, objetivo, caloriasDiarias, caloriasObjetivo, pesoKg, estaturaCm, rutina);
        JOptionPane.showMessageDialog(null, "Nombre=" + bdClientes[contadorC].getNombreC()
                + "Identificacion=" + bdClientes[contadorC].getIdentificacion()
                + "Sexo=" + bdClientes[contadorC].getSexo()
                + "edad=" + bdClientes[contadorC].getEdad()
                + "Origen=" + bdClientes[contadorC].getOrigen()
                + "telefono=" + bdClientes[contadorC].getTelefono()
                + "Tipo de Pase=" + bdClientes[contadorC].getTipoDePase()
                + "Pago=" + bdClientes[contadorC].getPago()
                + "Somatipo=" + bdClientes[contadorC].getSomatotipo()
                + "Objetivo=" + bdClientes[contadorC].getObjetivo()
                + "CaloriasDiarias=" + bdClientes[contadorC].getCaloriasDiarias()
                + "Peso Kg=" + bdClientes[contadorC].getPesoKg()
                + "Estatura=" + bdClientes[contadorC].getEstaturaMts());
        contadorC++;

    }//fin agregar

}//fin clsClientes
