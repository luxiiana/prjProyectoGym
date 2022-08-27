/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjproyectogym;

import javax.swing.JOptionPane;

/**
 *
 * @author XPC
 */
public class clsInfoGym {

    //----------Se crea la clase pública para la informaciónd el gimnacio--------------//
    public clsInfoGym() {
    }

    //--------Método Estadísticas Clientes--------//
    public static void estadisticasClientes() {
        clsCliente Ccliente = new clsCliente();
        JOptionPane.showMessageDialog(null, "La cantidad total de clientes es: " + Ccliente.contCC
                + "\n La cantidad total de clientes de sexo Masculino: " + Ccliente.contHombres
                + "\n La cantidad total de clientes de sexo Femenino: " + Ccliente.contMujeres
                + "\n La cantidad total de clientes de nacionales es: " + Ccliente.contNacionales
                + "\n La cantidad total de clientes de nacionales es: " + Ccliente.contExtranjeros
                + "\n La cantidad total de clientes que agregaron su estatura: " + Ccliente.contEstatura
                + "\n La cantidad total de clientes que agregaron su peso: " + Ccliente.contPeso
                + "\n La cantidad total de clientes con el Somatipo de Ectomorfo es : " + Ccliente.contEcto
                + "\n La cantidad total de clientes con el Somatipo de Mesomorfo es : " + Ccliente.contMeso
                + "\n La cantidad total de clientes con el Somatipo de Endomorfo es : " + Ccliente.contEndo
                + "\n La cantidad total de clientes desean subir de peso es : " + Ccliente.contSubir
                + "\n La cantidad total de clientes desean bajar de peso es : " + Ccliente.contBajar
                + "\n La cantidad total de clientes desean mantener el peso es : " + Ccliente.contMantener
                + "\n La cantidad total de clientes que eligieron pase basico: " + Ccliente.contBasico
                + "\n La cantidad total de clientes que eligieron pase Max: " + Ccliente.contMax
                + "\n La cantidad total de clientes que eligieron pase Ultra: " + Ccliente.contUltra);
        //-----Estadistícas según género------//
        JOptionPane.showMessageDialog(null, "Estadistícas según género");
        if (clsCliente.contHombres > clsCliente.contMujeres) {
            JOptionPane.showMessageDialog(null, "La mayoría de clientes son Hombres");
            JOptionPane.showMessageDialog(null, "La minoría de clientes son Mujeres");
        } else if (clsCliente.contMujeres > clsCliente.contHombres) {
            JOptionPane.showMessageDialog(null, "La mayoría de clientes son Mujeres");
            JOptionPane.showMessageDialog(null, "La minoría de clientes son Hombres");
            //-----Iguales cantidades de clientes hombres y mujeres--------------//
        } else if (clsCliente.contHombres == clsCliente.contMujeres) {
            JOptionPane.showMessageDialog(null, "La cantidad de clientes Hombres es igual al de la de Mujeres");
        }
//------Estadistícas según nacionalidad  ---------------------------//
        JOptionPane.showMessageDialog(null, "Estadistícas según nacionalidad");
        if (clsCliente.contNacionales > clsCliente.contExtranjeros) {
            JOptionPane.showMessageDialog(null, "La mayoría de clientes son Nacionales");
            JOptionPane.showMessageDialog(null, "La minoría de clientes son Extranjeros");
        } else if (clsCliente.contExtranjeros > clsCliente.contNacionales) {
            JOptionPane.showMessageDialog(null, "La mayoría de clientes son Extranjeros");
            JOptionPane.showMessageDialog(null, "La minoría de clientes son Nacionales");
            //----- La cantidad de clientes nacionales y extranjeros es igual ---------//
        } else if (clsCliente.contNacionales == clsCliente.contExtranjeros) {
            JOptionPane.showMessageDialog(null, "La cantidad de clientes nacionales es igual al de la de extranjeros");
        }
//-----------------------Somatotipos--------------------------------//
//-----Somatotipo más elegido------//
        JOptionPane.showMessageDialog(null, "Estadistícas según somatotipo");
        if (clsCliente.contEcto > clsCliente.contMeso && clsCliente.contEcto > clsCliente.contEndo) {
            JOptionPane.showMessageDialog(null, "El somatotipo más elegido es el Ectomorfo");
        } else if (clsCliente.contEndo > clsCliente.contEcto && clsCliente.contEndo > clsCliente.contMeso) {
            JOptionPane.showMessageDialog(null, "El somatotipo más elegido es el Endomorfo");
        } else if (clsCliente.contMeso > clsCliente.contEcto && clsCliente.contMeso > clsCliente.contEndo) {
            JOptionPane.showMessageDialog(null, "El somatotipo más elegido es el Mesomorfo");
        }
//-----Somatotipo menos elegido------//
        if (clsCliente.contEcto < clsCliente.contMeso && clsCliente.contEcto < clsCliente.contEndo) {
            JOptionPane.showMessageDialog(null, "El somatotipo menos elegido es el Ectomorfo");
        } else if (clsCliente.contEndo < clsCliente.contEcto && clsCliente.contEndo < clsCliente.contMeso) {
            JOptionPane.showMessageDialog(null, "El somatotipo menos elegido es el Endomorfo");
        } else if (clsCliente.contMeso < clsCliente.contEcto && clsCliente.contMeso < clsCliente.contEndo) {
            JOptionPane.showMessageDialog(null, "El somatotipo menos elegido es el Mesomorfo");

//-------Dos somatotipos iguales pero menores al tercero------//
        } else if (clsCliente.contEcto == clsCliente.contEndo
                && clsCliente.contEcto < clsCliente.contMeso
                && clsCliente.contEndo < clsCliente.contMeso) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el somatotipo Ectomorfo y Endomorfo"
                    + "estos a su vez son menores que la cantidad de clientes con el somatotipo Mesomorfo");

//------Dos somatotipos iguales pero mayores al tercero------//
        } else if (clsCliente.contEcto == clsCliente.contEndo
                && clsCliente.contEcto > clsCliente.contMeso
                && clsCliente.contEndo > clsCliente.contMeso) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el somatotipo Ectomorfo y Endomorfo"
                    + "estos a su vez son mayores que la cantidad de clientes con el somatotipo Mesomorfo");

//-------Dos somatotipos iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contEcto == clsCliente.contEndo
                && clsCliente.contEcto < clsCliente.contMeso
                && clsCliente.contEndo > clsCliente.contMeso) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el somatotipo Ectomorfo y Endomorfo"
                    + "donde el somatotipo Mesomorfo es mayor a Ectomorfo y menor a Endomorfo");

//------Dos somatotipos iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contEcto == clsCliente.contEndo
                && clsCliente.contEcto > clsCliente.contMeso
                && clsCliente.contEndo < clsCliente.contMeso) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el somatotipo Ectomorfo y Endomorfo"
                    + "donde el somatotipo Mesomorfo es menor a Ectomorfo y mayor a Endomorfo");
           
//-------Dos somatotipos iguales pero menores al tercero------//
        } else if (clsCliente.contEcto == clsCliente.contMeso
                && clsCliente.contEcto < clsCliente.contEndo
                && clsCliente.contMeso < clsCliente.contEndo) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el somatotipo Ectomorfo y Mesomorfo"
                    + "estos a su vez son menores que la cantidad de clientes con el somatotipo Endomorfo");

//------Dos somatotipos iguales pero mayores al tercero------//
        } else if (clsCliente.contEcto == clsCliente.contMeso
                && clsCliente.contEcto > clsCliente.contEndo
                && clsCliente.contMeso > clsCliente.contEndo) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el somatotipo Ectomorfo y Mesomorfo"
                    + "estos a su vez son mayores que la cantidad de clientes con el somatotipo Endomorfo");

//-------Dos somatotipos iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contEcto == clsCliente.contMeso
                && clsCliente.contEcto < clsCliente.contEndo
                && clsCliente.contMeso > clsCliente.contEndo) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el somatotipo Ectomorfo y Mesomorfo"
                    + "donde el somatotipo Endomorfo es mayor a Ectomorfo y menor a Mesomorfo");

//------Dos somatotipos iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contEcto == clsCliente.contMeso
                && clsCliente.contEcto > clsCliente.contEndo
                && clsCliente.contMeso < clsCliente.contEndo) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el somatotipo Ectomorfo y Mesomorfo"
                    + "donde el somatotipo Mesomorfo es menor a Endomorfo y menor a Ectomorfo");

//-------Dos somatotipos iguales pero menores al tercero------//
        } else if (clsCliente.contEndo == clsCliente.contMeso
                && clsCliente.contEndo < clsCliente.contEcto
                && clsCliente.contMeso < clsCliente.contEcto) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el somatotipo Endomorfo y Mesomorfo"
                    + "estos a su vez son menores que la cantidad de clientes con el somatotipo Ectomorfo");

//------Dos somatotipos iguales pero mayores al tercero------//
        } else if (clsCliente.contEndo == clsCliente.contMeso
                && clsCliente.contEndo > clsCliente.contEcto
                && clsCliente.contMeso > clsCliente.contEcto) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el somatotipo Endomorfo y Mesomorfo"
                    + "estos a su vez son mayores que la cantidad de clientes con el somatotipo Ectomorfo");

//-------Dos somatotipos iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contEndo == clsCliente.contMeso
                && clsCliente.contEndo < clsCliente.contEcto
                && clsCliente.contMeso > clsCliente.contEcto) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el somatotipo Endomorfo y Mesomorfo"
                    + "donde el somatotipo Ectomorfo es mayor a Endomorfo y menor a Mesomorfo");

//------Dos somatotipos iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contEndo == clsCliente.contMeso
                && clsCliente.contEndo > clsCliente.contEcto
                && clsCliente.contMeso < clsCliente.contEcto) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el somatotipo Endomorfo y Mesomorfo"
                    + "donde el somatotipo Mesomorfo es menor a Ectomorfo y menor a Endomorfo");
        }

           //------La cantidad de clientes de los somatotipos son iguales-------// 
        if (clsCliente.contEcto == clsCliente.contEndo
                && clsCliente.contEcto == clsCliente.contMeso
                && clsCliente.contEndo == clsCliente.contMeso) {
            JOptionPane.showMessageDialog(null, "La cantidad de clientes por somatotipo es igual");
        }
    }
}
