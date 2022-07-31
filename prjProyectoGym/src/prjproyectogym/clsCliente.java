package prjproyectogym;

import javax.swing.JOptionPane;

public class clsCliente {
    private String nombreC;
    private String origen;
    private String identificacion;
    private String telefono;
    private String somatotipo;
    private String objetivo;
    private String tipoDePase;
    private String meta;
    private float caloriasDiarias;
    private float pago;
    private float pesoKg;
    private float estaturaCm;
    clsRutina rutina;
    clsAlimentacion PlanAlimentacion;
    int contadorC=0;
    clsCliente bdClientes[]= new clsCliente[9999999];

    public clsCliente(String nombreC, String origen, String identificacion, String telefono, String somatotipo, String objetivo, String tipoDePase, String meta, float caloriasDiarias, float pago, float pesoKg, float estaturaCm, clsRutina rutina, clsAlimentacion PlanAlimentacion) {
        this.nombreC = nombreC;
        this.origen = origen;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.somatotipo = somatotipo;
        this.objetivo = objetivo;
        this.tipoDePase = tipoDePase;
        this.meta = meta;
        this.caloriasDiarias = caloriasDiarias;
        this.pago = pago;
        this.pesoKg = pesoKg;
        this.estaturaCm = estaturaCm;
        this.rutina = rutina;
        this.PlanAlimentacion = PlanAlimentacion;
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

    public String getmeta() {
        return meta;
    }

    public void meta(String meta) {
        this.meta = meta;
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

    public clsAlimentacion getPlanAlimentacion() {
        return PlanAlimentacion;
    }

    public void setPlanAlimentacion(clsAlimentacion PlanAlimentacion) {
        this.PlanAlimentacion = PlanAlimentacion;
    }
    public void agregarCliente(){
        String controlador="";
        do{
           try{
               
           }catch(Exception e ){
               JOptionPane.showMessageDialog(null,"Digi");
           }
            
        }while(!controlador.equals("Z"));
    }
    
        
    
    
    
}
