package prjproyectogym;

import java.awt.TextArea;
import javax.swing.JOptionPane;

public class clsCliente {

    ///---------Info Personal------
    private String nombreC;
    private String identificacion;
    private String sexo;
    private int edad;
    private String telefono;
    private String tipoDePase;
    private String entrenador;
    int contadorC = 0;
    private float pago;
    /*  
        Basico [] solo acceso a gym || no ucpa ningun calculo pago=10000
        Max [] pichudo pero ocupa entrenado ||  no ocupa ningun calculo pago=15000
        Ultra []  0 pichudo ocupa entrenar y rutina || si ocupatodo pago 20000    private float pago; //Predeterminado lee tipo de pase

    //----------INFO GYM---------------------
    private String somatotipo; //Eptomorfo-Mesomorfo-Endomorfo
    private String objetivo; //SubirPerso-bajarPeso-manternerPeso
    /*
        Formula hom= ((10*kg)+(6.25*alturacm)-(5*edad)+5)*1.5
        Formula muj= ((10*kg)+(6.25*alturacm)-(5*edad)+161)*1.5
     */
    private String somatotipo;
    private float caloriasDiarias;
    private float caloriasObjetivo;
    private float pesoKg; //input
    private float estaturaMts; //input
    private String objetivo;

    //private float pesoIdeal; FUTURA EMPLEMETACION
    //----------INSTANCIAS-------------------
    clsRutina rutina;
    clsEmpleados clsE = new clsEmpleados();
    //clsAlimentacion PlanAlimentacion;
    clsCalculos clsCalc = new clsCalculos();

    clsCliente bdClientes[] = new clsCliente[9999999];
    cls_funciones clsF = new cls_funciones();

    public clsCliente() {
    }

    public clsCliente(String nombreC, String identificacion, String sexo, int edad, String telefono, String tipoDePase, String entrenador, float pago, String somatotipo, String objetivo, float caloriasDiarias, float caloriasObjetivo, float pesoKg, float estaturaCm, clsRutina rutina) {
        this.nombreC = nombreC;
        this.identificacion = identificacion;
        this.sexo = sexo;
        this.edad = edad;
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

    ////------------------------GETTERS AND SETTER------------------------------------------
    
    public String getNombreC() { // return cliente1 nombre jJordan
        return nombreC;
    }
    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
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

    
    //----------------------METODOS------------------------------------------------------
    
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
            case "A": //----PASE BASICO-------
                tipoDePase = "Basico";
                pago = 10000;
                //---Se crea el cliente-----
                bdClientes[contadorC] = new clsCliente(nombre, identificacion, sexo, edad, telefono, tipoDePase, null, pago, null, null, 0, 0, 0, 0, null);

                JOptionPane.showMessageDialog(null, "USUARIO CREADO");
                break;
            case "B": //----PASE MAX---------
                tipoDePase = "Max";
                pago = 15000;
                /*------ASIGNACION DE ENTRENADOR-----------
                int cantE = clsE.contadorE;
                 */

                //----Se crea el cliente-----
                bdClientes[contadorC] = new clsCliente(nombre, identificacion, sexo, edad, telefono, tipoDePase, entrenador, pago, null, null, 0, 0, 0, 0, null);

                break;

            case "C": //--------PASE ULTRA------------
                tipoDePase = "Ultra";
                pago = 20000;
                //---------SOMATIPO------------------------------------
                while (somatotipo.equals("") || !somatotipo.equals("A") && !somatotipo.equals("B") && !somatotipo.equals("C")) {
                    somatotipo = clsF.cadena("Digite su tipo de Somatotipo"
                            + "\nA. Ectomorfo: Contextura delgada, extremidades largas, dificil ganar peso, poco porcentaje de grasa"
                            + "\nB. Mesomorfo: Cuerpo atletico, facil de ganar musculo, facil perder grasa(bendecido por los dioses) "
                            + "\nC. Endomorfo: Contextura gruesa, baja estatura, facil acumulamiento de grasa, dificil perder peso ").toUpperCase();
                    if (somatotipo.equals("") || !somatotipo.equals("A") && !somatotipo.equals("B") && !somatotipo.equals("C")) {
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                    }
                }
                switch (somatotipo) {
                    case "A":
                        somatotipo = "Ectomorfo";
                        break;
                    case "B":
                        somatotipo = "Mesomorfo";
                        break;
                    case "C":
                        somatotipo = "Endomorfo";
                        break;
                }

                //---------OBJETIVO------------------------------------
                while (objetivo.equals("") || !objetivo.equals("A") && !objetivo.equals("B") && !objetivo.equals("C")) {
                    objetivo = clsF.cadena("Digite el obejtivo"
                            + "\nA. Subir de peso"
                            + "\nB. Bajar de peso"
                            + "\nC. Mantener peso").toUpperCase();
                    if (objetivo.equals("") || !objetivo.equals("A") && !objetivo.equals("B") && !objetivo.equals("C")) {
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                    }
                }
                switch (objetivo) {
                    case "A":
                        objetivo = "Subir de peso";
                        break;
                    case "B":
                        objetivo = "Bajar de peso";
                        break;
                    case "C":
                        objetivo = "Mantener de peso";
                        break;
                }//----FIN OBJETIVO

                //-------PesoKg------------
                while (!clsF.esNumero(pesoKgS) || Float.parseFloat(pesoKgS) <= 0) {
                    pesoKgS = JOptionPane.showInputDialog("Digite su peso en Kg");
                    if (!clsF.esNumero(pesoKgS) || Float.parseFloat(pesoKgS) <= 0) {
                        JOptionPane.showMessageDialog(null, "Dato invalido");
                    }
                }
                pesoKg = Float.parseFloat(pesoKgS);
                //----------------------FIN PESO----

                //-------EstaturaCm------------
                while (!clsF.esNumero(estaturaCmS) || Float.parseFloat(estaturaCmS) <= 0 && Float.parseFloat(pesoKgS) >= 500) {
                    estaturaCmS = JOptionPane.showInputDialog("Digite su estatura en mts");
                    if (!clsF.esNumero(estaturaCmS) || Float.parseFloat(estaturaCmS) <= 0) {
                        JOptionPane.showMessageDialog(null, "Dato invalido");
                    }
                }
                estaturaCm = (Float.parseFloat(estaturaCmS));

                //-------------FIN ESTATURA CM------------
                //----------Calorias Diarias------------
                caloriasDiarias = clsCalc.CaloriasDiarias(pesoKg, estaturaCm, edad, sexo);
                //---------FIN CLAORIAS DIARIAS-----
                //--CALORIAS OBJETIVO
                bdClientes[contadorC] = new clsCliente(nombre, identificacion, sexo, edad, telefono, tipoDePase, entrenador, pago, somatotipo, objetivo, caloriasDiarias, caloriasObjetivo, pesoKg, estaturaCm, rutina);

                break;
        }///--------------FIN PASESE----------------

        //-------------CREACION DEL OBJETO CLIENTE--------------------
        //bdClientes[contadorC] = new clsCliente(nombre, identificacion, sexo, edad, telefono, tipoDePase, entrenador, pago, somatotipo, objetivo, caloriasDiarias, caloriasObjetivo, pesoKg, estaturaCm, rutina);
        /*mensaje para probar como se crear
        JOptionPane.showMessageDialog(null, "Nombre=" + bdClientes[contadorC].getNombreC()
                + "\nIdentificacion=" + bdClientes[contadorC].getIdentificacion()
                + "\nSexo=" + bdClientes[contadorC].getSexo()
                + "\nedad=" + bdClientes[contadorC].getEdad()
                + "\ntelefono=" + bdClientes[contadorC].getTelefono()
                + "\nTipo de Pase=" + bdClientes[contadorC].getTipoDePase()
                + "\nPago=" + bdClientes[contadorC].getPago()
                + "\nSomatipo=" + bdClientes[contadorC].getSomatotipo()
                + "\nObjetivo=" + bdClientes[contadorC].getObjetivo()
                + "\nCalorias Diarias=" + bdClientes[contadorC].getCaloriasDiarias()
                + "\nCalorias Objetivo=" + bdClientes[contadorC].getCaloriasObjetivo()
                + "\nPeso Kg=" + bdClientes[contadorC].getPesoKg()
                + "\nEstatura=" + bdClientes[contadorC].getEstaturaMts()
                + "\nRUTINA=" + bdClientes[contadorC].getRutina());
         */
        contadorC++;

    }//fin agregar

    public void editarCliente() { //Luciana
        //------Variables------
        String mensaje = "", entrenador = "", nombre = "", identificacion = "", sexo = "", edadS = "", telefono = "", tipoDePase = "", somatotipo = "", objetivo = "", caloriasDiariasS = "", pesoKgS = "", estaturaCmS = "", pagoS = "", controlador = "";
        int edad = 0, bandera = 0, clienteSeleccionado = 0;
        float pago = 0, caloriasDiarias = 0, pesoKg = 0, estaturaCm = 0, caloriasObjetivo = 0;

        //------------PROGRAMA---------------
        if (contadorC == 0) {
            JOptionPane.showMessageDialog(null, "NO HAY CLIENTES EXISTENTES");
        } else {
            
            //Meter un while para que solanmente seleccione un numero de '1' al numero maximo de cleintes que hay registrados y no puede aceptar letras hacer el m,ismo while de edad
            //clienteSeleccionado=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de cliente que desea editar"));
            //------Menú de opciones a editar------
            //en este menu debe aceptar en ves del contadorC debe ir el 'numero de cliente seleccionado'
            char opc = JOptionPane.showInputDialog("a. Nombre:" + bdClientes[contadorC].getNombreC()
                    + "\nb. Identificacion:" + bdClientes[contadorC].getIdentificacion()
                    + "\nc. Sexo:" + bdClientes[contadorC].getSexo()
                    + "\nd. Edad:" + bdClientes[contadorC].getEdad()
                    + "\ne. Teléfono:" + bdClientes[contadorC].getTelefono()
                    + "\nf. Tipo de Pase:" + bdClientes[contadorC].getTipoDePase()
                    + "\ng. Pago:" + bdClientes[contadorC].getPago()
                    + "\nh. Somatipo:" + bdClientes[contadorC].getSomatotipo()
                    + "\ni. Objetivo:" + bdClientes[contadorC].getObjetivo()
                    + "\nj. Calorias Diarias:" + bdClientes[contadorC].getCaloriasDiarias()
                    + "\nk. Calorias Objetivo:" + bdClientes[contadorC].getCaloriasObjetivo()
                    + "\nl. Peso Kg:" + bdClientes[contadorC].getPesoKg()
                    + "\nm. Estatura:" + bdClientes[contadorC].getEstaturaMts()
                    + "\nn. RUTINA:" + bdClientes[contadorC].getRutina()).charAt(0);

            switch (opc) {

                case 'a': //editar nombre

                    do {
                        //poner en el mismo input el nombre actual del cliente, simplificar codigo! notar errores en pasos ya que modifica sin haber hecho comprobacioens
                        //Pide nombre nuevo:
                        nombre = JOptionPane.showInputDialog("Digite el nuevo nombre, completo, del cliente: ");
                        bdClientes[contadorC].setNombreC(nombre);//aqui igualemente seleciona con contadorC y no se puede, tiene que ser con el numero de lciente que quiere editar
                        if (nombre.length() < 5 || nombre.equals("")) {
                            //Si el nombre que se introdujo es menor a 5 caracteres se le muestra el siguiente mensaje 
                            JOptionPane.showMessageDialog(null, "El nombre no pudo ser editado \nDigite un nombre valido");
                        } else {
                            //Muestra nombre actualizado:
                            JOptionPane.showMessageDialog(null, "Nombre correctamente editado \nNuevo nombre es: " + bdClientes[contadorC].getNombreC());
                        }
                    } while (nombre.length() < 5 || nombre.equals("")); //fin pedir nombre de Cliente
                    break;

                case 'b':
                    do {
                        controlador = " ";
                        controlador = JOptionPane.showInputDialog("Seleccione su nuevo tipo de Identificacion: "
                                + "\nA. Nacional\nB. Dimex\nC. Otro").toUpperCase();

                        if (controlador.equals("A") || controlador.equals("B")) {
                            switch (controlador) {
                                case "A": //Si es Nacional y usa cédula de nacional
                                    controlador = "";
                                    bandera = 0;
                                    do {
                                        do {
                                            identificacion = JOptionPane.showInputDialog("Digite el nuevo número de cédula de 9 dígitos del cliente:");
                                            bdClientes[contadorC].setIdentificacion(identificacion);
                                            if (identificacion.length() == 9 && ((int) identificacion.charAt(0) > 48 && (int) identificacion.charAt(0) < 58)) {
                                                for (int j = 1; j < identificacion.length(); j++) {
                                                    if (((int) identificacion.charAt(j) > 47 && (int) identificacion.charAt(j) < 58)) {
                                                        bandera = 1;
                                                    } else {
                                                        bandera = 0;
                                                        JOptionPane.showMessageDialog(null, "¡Número de cédula invalido!\nDigite un numero de cédula válido");
                                                        break;
                                                    }
                                                }

                                            } else {
                                                JOptionPane.showMessageDialog(null, "!Número de cédula inválido!\nDigite un número de cédula válido");
                                            }
                                            bdClientes[contadorC].getIdentificacion(); //obtiene el ID para mostrarla
                                            JOptionPane.showMessageDialog(null, "Su nueva identificación es: " + identificacion);
                                        } while (bandera != 1);
                                        if (contadorC == 0) {
                                            controlador = "Z";
                                        } else {
                                            for (int k = 0; k < contadorC; k++) {
                                                if (!identificacion.equals(bdClientes[k].getIdentificacion())) {
                                                    controlador = "Z";
                                                } else {
                                                    controlador = "";
                                                    JOptionPane.showMessageDialog(null, "¡El número de cédula ya fue registrado! \nVerifique e intente de nuevo");
                                                    bandera = 0;
                                                    break;
                                                }

                                            }
                                        }

                                    } while (!controlador.equals("Z"));
                                    break;
                                case "B": //si es extranjero y usa DIMEX
                                    controlador = "";
                                    bandera = 0;
                                    do {
                                        do {
                                            identificacion = JOptionPane.showInputDialog("Digite el nuevo número de cédula de 12 dígitos del empleado: ");
                                            bdClientes[contadorC].setIdentificacion(identificacion);
                                            if (identificacion.length() == 12 && ((int) identificacion.charAt(0) > 48 && (int) identificacion.charAt(0) < 58)) {
                                                for (int j = 1; j < identificacion.length(); j++) {
                                                    if (((int) identificacion.charAt(j) > 47 && (int) identificacion.charAt(j) < 58)) {
                                                        bandera = 1;
                                                    } else {
                                                        bandera = 0;
                                                        JOptionPane.showMessageDialog(null, "¡Número de cédula inválido!\nDigite un número de cédula válido");
                                                        break;
                                                    }
                                                }

                                            } else {
                                                JOptionPane.showMessageDialog(null, "¡Número de cédula inválido!\nDigite un número de cédula válido");
                                            }
                                            bdClientes[contadorC].getIdentificacion(); //obtiene el nuevo ID para mostrarla
                                            JOptionPane.showMessageDialog(null, "Su nueva identificación es: " + identificacion);

                                        } while (bandera != 1);
                                        if (contadorC == 0) {
                                            controlador = "Z";
                                        } else {
                                            for (int k = 0; k < contadorC; k++) {
                                                if (!identificacion.equals(bdClientes[k].getIdentificacion())) {
                                                    controlador = "Z";
                                                } else {
                                                    controlador = "";
                                                    JOptionPane.showMessageDialog(null, "¡El número de cédula ya fue registrado! \nVerifique eh intente de nuevo");
                                                    bandera = 0;
                                                    break;
                                                }

                                            }
                                        }

                                    } while (!controlador.equals("Z"));

                                    break;
                                case "C":
                                    identificacion = JOptionPane.showInputDialog("Digite el número de identificacion de 12 dígitos máximo del empleado");
                                    bdClientes[contadorC].setIdentificacion(identificacion);
                                    bdClientes[contadorC].getIdentificacion(); //obtiene el nuevo ID para mostrarla
                                    JOptionPane.showMessageDialog(null, "Su nueva identificación es: " + identificacion);
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opcion inválida");
                                    break;
                            }
                            controlador = "Z";
                        } else {
                            JOptionPane.showMessageDialog(null, "Opcion inválida");
                        }

                    } while (!controlador.equals("Z"));
                    break;

                case 'c':
                    do {
                        sexo = JOptionPane.showInputDialog("Digite el nuevo sexo del cliente:\nA. Masculino\nB. Femenino \nC.No binario").toUpperCase();
                        bdClientes[contadorC].setSexo(sexo);
                        switch (sexo) {
                            case "A":
                                sexo = "Masculino";
                                bdClientes[contadorC].getSexo();
                                JOptionPane.showMessageDialog(null, "El nuevo sexo es: " + sexo);
                                break;
                            case "B":
                                sexo = "Femenino";
                                bdClientes[contadorC].getSexo();
                                JOptionPane.showMessageDialog(null, "El nuevo sexo es: " + sexo);
                                break;
                            case "C":
                                sexo = "No binario";
                                bdClientes[contadorC].getSexo();
                                JOptionPane.showMessageDialog(null, "El nuevo sexo es: " + sexo);
                                break;
                        }
                        if (sexo.equals("") || !sexo.equals("A") && !sexo.equals("B") && !sexo.equals("C")) {// si es null o diferente  a A,B,C entonces da error
                            JOptionPane.showMessageDialog(null, "OPCIÓN INVÁLIDA");
                        }
                    } while (sexo.equals("") || !sexo.equals("A") && !sexo.equals("B") && !sexo.equals("C"));
                    break;

                case 'd':
                    do {
                        edadS = JOptionPane.showInputDialog("Digite la nueva edad del cliente: ");
                        if (!clsF.esNumero(edadS) || !(Integer.parseInt(edadS) >= 18 && Integer.parseInt(edadS) <= 100)) {
                            JOptionPane.showMessageDialog(null, "EDAD INVLIDA");
                        }
                    } while (!clsF.esNumero(edadS) || !(Integer.parseInt(edadS) >= 18 && Integer.parseInt(edadS) <= 100)); //Se comprueba si es número
                    edad = Integer.parseInt(edadS); //la edadS se convierta a numero
                    bdClientes[contadorC].setEdad(edad);
                    bdClientes[contadorC].getEdad();
                    JOptionPane.showMessageDialog(null, "La nueva edad del cliente es: " + edad);
                    break;

                case 'e':
                    controlador = "";
                    bandera = 0;
                    do {
                        do {
                            telefono = JOptionPane.showInputDialog("Digite el nuevo número de teléfono del cliente"
                                    + "\nDebe empezar con 6, 7 o 8 y un máximo de 8 dígitos: ");
                            bdClientes[contadorC].setTelefono(telefono);
                            if (telefono.length() == 8) { // Numero telefonico tiene que tener 8 digitos.
                                if ((int) telefono.charAt(0) == 56 || (int) telefono.charAt(0) == 55 || (int) telefono.charAt(0) == 54) { // Evaluando  que tiene  que empezar con 8, 7 o 6, de acuerdo a las compañias que hay en el pais.
                                    for (int j = 1; j < telefono.length(); j++) { // Ciclo para recorrer desde la posición 2
                                        if ((int) telefono.charAt(j) > 47 && (int) telefono.charAt(j) < 58) {// Evaluar que esten entre el 0 al 9, ya que se hizo con código ASCII.
                                            bandera = 1;
                                            bdClientes[contadorC].getTelefono();
                                            JOptionPane.showMessageDialog(null, "El nuevo número de teléfono es: "); //muestra nuevo número
                                        } else {
                                            bandera = 0;
                                            JOptionPane.showMessageDialog(null, "¡Teléfono inválido! \nDigite un número de teléfono válido");
                                            break;
                                        }
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "¡Teléfono invalido! \nDigite un número de telefono valido");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "¡Teléfono invalido! \nDigite un número de telefono valido");
                            }
                        } while (bandera != 1);
                        if (contadorC == 0) {
                            controlador = "Z";
                        } else {
                            for (int k = 0; k < contadorC; k++) { // Ciclo para recorrer las posiciones del arreglo.
                                if (!telefono.equals(bdClientes[k].getTelefono())) { //Evaluar si hay un numero telefonico igual en los empleados agregados.
                                    controlador = "Z";
                                } else {
                                    controlador = "";
                                    JOptionPane.showMessageDialog(null, "¡El número de teléfono ya fue registrado! \nVerifique e intente de nuevo");
                                    bandera = 0;
                                    break;
                                }

                            }
                        }
                    } while (!controlador.equals("Z"));
                    break;
                case 'f':
                    //aqui deben haber varios if's donde dependiendo del tipo de pase se puedan editar sus atributos, en caso de el tipo de pase sea basico y pase a max automaticamente se le piden los datos que hacen falta
                    //si pasa de max a basico automaticamente se le borran los datos que no ocupa y asi con las demas combinaciones
                    break;
                case 'g':
                    break;
                case 'h':
                    break;
                case 'i':
                    break;
                case 'j':
                    break;
                case 'k':
                    break;
                case 'l':
                    break;
                case 'm':
                    break;
                case 'n':
                    //rutina queda pendiente
                    break;

            }//fin switch
        }//fin else

    }//fin editar clientes

}//fin clsClientes
