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
    /*  
        Basico [] solo acceso a gym || no ucpa ningun calculo
        Max [] pichudo pero ocupa entrenado ||  no ocupa ningun calculo
        Ultra []  0 pichudo ocupa entrenar y rutina || si ocupatodo 
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
    private float pesoKg; //input
    private float estaturaMts; //input

    //private float pesoIdeal; FUTURA EMPLEMETACION
    //----------INSTANCIAS-------------------
    clsRutina rutina;
    //clsAlimentacion PlanAlimentacion;
    int contadorC = 0;
    clsCliente bdClientes[] = new clsCliente[9999999];
    cls_funciones clsF = new cls_funciones();

    public clsCliente(String nombreC, String identificacion, String sexo, int edad, String origen, String telefono, String tipoDePase, float pago, String somatotipo, String objetivo, float caloriasDiarias, float pesoKg, float estaturaCm, clsRutina rutina) {
        this.nombreC = nombreC;
        this.identificacion = identificacion;
        this.sexo = sexo;
        this.edad = edad;
        this.origen = origen;
        this.telefono = telefono;
        this.tipoDePase = tipoDePase;
        this.pago = pago;
        this.somatotipo = somatotipo;
        this.objetivo = objetivo;
        this.caloriasDiarias = caloriasDiarias;
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

    public float getCaloriasDiarias() {
        return caloriasDiarias;
    }

    public void setCaloriasDiarias(float caloriasDiarias) {
        this.caloriasDiarias = caloriasDiarias;
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
        String nombre = "", identificacion = "", sexo = "", origen = "", edadS = "", telefono = "", tipoDePase = "", somatotipo = "", objetivo = "", caloriasDiariasS = "", pesoKgS = "", estaturaCmS = "", pagoS = "", controlador = "";
        int edad = 0;
        float pago = 0, caloriasDiarias = 0, pesoKg = 0, estaturaCm = 0;

        try {
            //-------Pide nombre del Cliente mientras sea menor que 5 caracteres--------
            while (nombre.length() < 5 || nombre.equals("")) {
                nombre = JOptionPane.showInputDialog("Digite el nombre completo del cliente");
                if (nombre.length() < 5 || nombre.equals("")) {
                    //Si el nombre que se introdujo es menor a 5 caracteres se le muestra el siguiente mensaje 
                    JOptionPane.showMessageDialog(null, "! Nombre invalido ¡\nDigite un nombre valido");
                }
            }//fin pedir nombre de Cliente

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
            while (sexo.equals("") || !sexo.equals("A") && !sexo.equals("B") && !sexo.equals("C")) { //pide edad empleado 
                sexo = JOptionPane.showInputDialog("Digite el sexo del empleado:\nA. Masculino\nB. Femenino\nC. Indefinido");
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

            //-------------CREACION DEL OBEJTO CLIENTE--------------------
            bdClientes[contadorC] = new clsCliente(nombre, identificacion, sexo, edad, origen, telefono, tipoDePase, pago, somatotipo, objetivo, caloriasDiarias, pesoKg, estaturaCm, rutina);
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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Registrar el Cliente");
        }

    }//fin agregar

}//fin clsClientes
