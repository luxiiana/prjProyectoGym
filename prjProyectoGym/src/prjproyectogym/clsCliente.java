package prjproyectogym;

import javax.swing.JOptionPane;

public class clsCliente {

    ///---------Info Personal------
    private String nombreC;
    private String origen;
    private String identificacion;
    private String telefono;
    private String sexo;
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
        Formula muj= Formula hom= ((10*kg)+(6.25*alturacm)-(5*edad)+161)*1.5
     */
    private float caloriasDiarias; //peso*altura
    private float pesoKg; //input
    private float estaturaCm; //input

    //private float pesoIdeal; FUTURA EMPLEMETACION
    //----------INSTANCIAS-------------------
    clsRutina rutina;
    //clsAlimentacion PlanAlimentacion;
    int contadorC = 0;
    clsCliente bdClientes[] = new clsCliente[9999999];

    public clsCliente(String nombreC, String origen, String identificacion, String telefono, String sexo, String somatotipo, String objetivo, String tipoDePase, float caloriasDiarias, float pago, float pesoKg, float estaturaCm, clsRutina rutina) {
        this.nombreC = nombreC;
        this.origen = origen;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.somatotipo = somatotipo;
        this.objetivo = objetivo;
        this.tipoDePase = tipoDePase;
        this.caloriasDiarias = caloriasDiarias;
        this.pago = pago;
        this.pesoKg = pesoKg;
        this.estaturaCm = estaturaCm;
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

    public float getEstaturaCm() {
        return estaturaCm;
    }

    public void setEstaturaCm(float estaturaCm) {
        this.estaturaCm = estaturaCm;
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

    public void agregarCliente() { // Derek
        String controlador = "";
        do {
            try {

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digi");
            }

        } while (!controlador.equals("Z"));
    }//fin agregar
    
    
    
    
    

}//fin clsClientes
