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
//-----Estadisiticas de los objetivos de los clientes-------------------//
        JOptionPane.showMessageDialog(null, "Estadistícas según objetivo");
        //-----El objetivo más elegidos por los clientes------//
        if (clsCliente.contSubir > clsCliente.contBajar && clsCliente.contSubir > clsCliente.contMantener) {
            JOptionPane.showMessageDialog(null, "El objetivo más elegido es Subir de Peso");
        } else if (clsCliente.contBajar > clsCliente.contSubir && clsCliente.contBajar > clsCliente.contMantener) {
            JOptionPane.showMessageDialog(null, "El objetivo más elegido es Bajar de Peso");
        } else if (clsCliente.contMantener > clsCliente.contSubir && clsCliente.contMantener > clsCliente.contBajar) {
            JOptionPane.showMessageDialog(null, "El objetivo más elegido es Mantener de Peso");
        }
        //-----El objetivo menos elegidos por los clientes------//
        if (clsCliente.contSubir < clsCliente.contBajar && clsCliente.contSubir < clsCliente.contMantener) {
            JOptionPane.showMessageDialog(null, "El objetivo menos elegido es Subir de Peso");
        } else if (clsCliente.contBajar < clsCliente.contSubir && clsCliente.contBajar < clsCliente.contMantener) {
            JOptionPane.showMessageDialog(null, "El objetivo menos elegido es Bajar de Peso");
        } else if (clsCliente.contMantener < clsCliente.contSubir && clsCliente.contMantener < clsCliente.contBajar) {
            JOptionPane.showMessageDialog(null, "El objetivo menos elegido es Mantener de Peso");
        }
//-------Dos objetivos iguales pero menores al tercero------//
        if (clsCliente.contSubir == clsCliente.contBajar
                && clsCliente.contSubir < clsCliente.contMantener
                && clsCliente.contBajar < clsCliente.contMantener) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el objetivo Subir de peso  y Bajar de peso"
                    + " estos a su vez son menores que la cantidad de clientes con el objetivo Mantener el peso");

//------Dos objetivos iguales pero mayores al tercero------//
        } else if (clsCliente.contSubir == clsCliente.contBajar
                && clsCliente.contSubir > clsCliente.contMantener
                && clsCliente.contBajar > clsCliente.contMantener) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el objetivo Subir de peso  y Bajar de peso"
                    + " estos a su vez son mayores que la cantidad de clientes con el objetivo Mantener el peso");

//-------Dos objetivos iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contSubir == clsCliente.contBajar
                && clsCliente.contSubir < clsCliente.contMantener
                && clsCliente.contBajar > clsCliente.contMantener) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el objetivo Subir de peso y Bajar de peso"
                    + " donde la cantidad de clientes del objetivo Mantener el peso es mayor a subir de peso y menor a Bajar de peso");

//------Dos objetivos iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contSubir == clsCliente.contBajar
                && clsCliente.contSubir > clsCliente.contMantener
                && clsCliente.contBajar < clsCliente.contMantener) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el objetivo Subir de peso y Bajar de peso"
                    + " donde la cantidad de clientes de mantener el peso es menor a subir de peso y mayor a Bajar de peso");

//-------Dos objetivos iguales pero menores al tercero------//
        } else if (clsCliente.contSubir == clsCliente.contMantener
                && clsCliente.contSubir < clsCliente.contBajar
                && clsCliente.contMantener < clsCliente.contBajar) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el objetivo Subir de peso y Mantener el peso"
                    + " estos a su vez son menores que la cantidad de clientes con el objetivo Bajar de peso");

//------Dos objetivos iguales pero mayores al tercero------//
        } else if (clsCliente.contSubir == clsCliente.contMantener
                && clsCliente.contSubir > clsCliente.contBajar
                && clsCliente.contMantener > clsCliente.contBajar) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el objetivo Subir de peso y mantener el peso"
                    + " estos a su vez son mayores que la cantidad de clientes con el objetivo Bajar de peso");

//-------Dos objetivos iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contSubir == clsCliente.contMantener
                && clsCliente.contSubir < clsCliente.contBajar
                && clsCliente.contMantener > clsCliente.contBajar) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el objetivo Subir de peso y Mantener el peso"
                    + " donde el objetivo Bajar de peso es mayor a Subir de peso y menor a Mantener el peso");

//------Dos objetivos iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contSubir == clsCliente.contMantener
                && clsCliente.contSubir > clsCliente.contBajar
                && clsCliente.contMantener < clsCliente.contBajar) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el objetivo Subir depeso y mantener el peso"
                    + " donde el objetivo Bajar de peso es menor a Subir de peso y mayor a Mantener el Peso");

//-------Dos objetivos iguales pero menores al tercero------//
        } else if (clsCliente.contBajar == clsCliente.contMantener
                && clsCliente.contBajar < clsCliente.contSubir
                && clsCliente.contMantener < clsCliente.contSubir) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el objetivo Bajar de peso y mantener el peso"
                    + " estos a su vez son menores que la cantidad de clientes con el objetivo Subir de Peso");

//------Dos objetivos iguales pero mayores al tercero------//
        } else if (clsCliente.contBajar == clsCliente.contMantener
                && clsCliente.contBajar > clsCliente.contSubir
                && clsCliente.contMantener > clsCliente.contSubir) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el objetivo Bajar de peso y Mantener el peso"
                    + " estos a su vez son mayores que la cantidad de clientes con el objetivo Subir de peso");

//-------Dos objetivos iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contBajar == clsCliente.contMantener
                && clsCliente.contBajar < clsCliente.contSubir
                && clsCliente.contMantener > clsCliente.contSubir) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el objetivo Bajar de peso y Mantener el peso"
                    + " donde el objetivo Subir de peso es mayor a Bajar de peso y menor a Mantener el peso");

//------Dos objetivos iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contBajar == clsCliente.contMantener
                && clsCliente.contBajar > clsCliente.contSubir
                && clsCliente.contMantener < clsCliente.contSubir) {
            JOptionPane.showMessageDialog(null, "Existe la misma cantidad de clientes con el objetivo Bajar de peso y Mantener el peso"
                    + " donde el objetivo Subir de peso es menor a Bajar de peso y mayor a Mantener el peso");

//------La cantidad de clientes con los objetivos son iguales-------// 
        } else if (clsCliente.contSubir == clsCliente.contBajar
                && clsCliente.contSubir == clsCliente.contMantener
                && clsCliente.contBajar == clsCliente.contMantener) {
            JOptionPane.showMessageDialog(null, "La cantidad de clientes por objetivo es igual");
        }
//------Tipos de Planes-----------------------------------------------------------------------------//        
        JOptionPane.showMessageDialog(null, "Estadisticas según tipo de pase");
//-----Plan más elegido por los Clientes-----//       
        if (clsCliente.contBasico > clsCliente.contMax && clsCliente.contBasico > clsCliente.contUltra) {
            JOptionPane.showMessageDialog(null, "El plan más elegido es el Básico");
        } else if (clsCliente.contMax > clsCliente.contBasico && clsCliente.contMax > clsCliente.contUltra) {
            JOptionPane.showMessageDialog(null, "El plan más elegido es el Máx");
        } else if (clsCliente.contUltra > clsCliente.contBasico && clsCliente.contUltra > clsCliente.contMax) {
            JOptionPane.showMessageDialog(null, "El plan más elegido es el Ultra");
        }
//-----Plan menos elegido por los Clientes-----//   
        if (clsCliente.contBasico < clsCliente.contMax && clsCliente.contBasico < clsCliente.contUltra) {
            JOptionPane.showMessageDialog(null, "El plan menos elegido es el Básico");
        } else if (clsCliente.contMax < clsCliente.contBasico && clsCliente.contMax < clsCliente.contUltra) {
            JOptionPane.showMessageDialog(null, "El plan menos elegido es el Máx");
        } else if (clsCliente.contUltra < clsCliente.contBasico && clsCliente.contUltra < clsCliente.contMax) {
            JOptionPane.showMessageDialog(null, "El plan menos elegido es el Ultra");
        }
//------Básico igual a Ultra--------------------------------------------------------------
//-------Dos planes iguales pero menores al tercero------//
        if (clsCliente.contBasico == clsCliente.contUltra
                && clsCliente.contBasico < clsCliente.contMax
                && clsCliente.contUltra < clsCliente.contMax) {
            JOptionPane.showMessageDialog(null, "La cantidad de clientes con el tipo de pase Básico y Ultra es el mismo"
                    + " estos a su vez son menores que la cantidad de clientes con el tipo de pase Max");
//-------Dos planes iguales pero mayores al tercero------//
        } else if (clsCliente.contBasico == clsCliente.contUltra
                && clsCliente.contBasico > clsCliente.contMax
                && clsCliente.contMax > clsCliente.contMax) {
            JOptionPane.showMessageDialog(null, "La cantidad de clientes con el tipo de pase Básico y Ultra es el mismo"
                    + " estos a su vez son menores que la cantidad de clientes con el tipo de pase Max");
//-------Dos planes iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contBasico == clsCliente.contUltra
                && clsCliente.contBasico < clsCliente.contMax
                && clsCliente.contUltra > clsCliente.contMax) {
            JOptionPane.showMessageDialog(null, "La cantidad de clientes con el tipo de pase Básico y Ultra es el mismo"
                    + " donde los clientes con el tipo de pase Básico son menores a los Max  y estos son menores a los Ultra");

//------Dos planes iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contBasico == clsCliente.contUltra
                && clsCliente.contBasico > clsCliente.contMax
                && clsCliente.contUltra < clsCliente.contMax) {
            JOptionPane.showMessageDialog(null, "La cantidad de clientes con el tipo de pase Básico y Ultra es el mismo"
                    + " donde los clientes con el tipo de pase Básico son mayores a los Max  y estos son mayores a los Ultra");
//-------Max igual a Ultra  -----------------------------------------------------------------------------------------------------//           
//-------Dos planes iguales pero menores al tercero------//
        } else if (clsCliente.contMax == clsCliente.contUltra
                && clsCliente.contMax < clsCliente.contBasico
                && clsCliente.contUltra < clsCliente.contBasico) {
            JOptionPane.showMessageDialog(null, "La cantidad de clientes con el tipo de pase Max y Ultra es el mismo"
                    + " estos a su vez son menores que la cantidad de clientes con el tipo de pase Básico");
//------Dos planes iguales pero mayores al tercero------//
        } else if (clsCliente.contMax == clsCliente.contUltra
                && clsCliente.contMax > clsCliente.contBasico
                && clsCliente.contUltra > clsCliente.contBasico) {
            JOptionPane.showMessageDialog(null, "La cantidad de clientes con el tipo de pase Max y Ultra es el mismo"
                    + " estos a su vez son mayores que la cantidad de clientes con el tipo de pase Básico");
//-------Dos planes iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contMax == clsCliente.contUltra
                && clsCliente.contMax < clsCliente.contBasico
                && clsCliente.contUltra > clsCliente.contBasico) {
            JOptionPane.showMessageDialog(null, "La cantidad de clientes con el tipo de pase Max y Ultra es el mismo"
                    + " donde los clientes con el tipo de pase Max son menores a los Básicos  y estos son menores a los Ultra");
//------Dos planes iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contMax == clsCliente.contUltra
                && clsCliente.contMax > clsCliente.contBasico
                && clsCliente.contUltra < clsCliente.contBasico) {
            JOptionPane.showMessageDialog(null, "La cantidad de clientes con el tipo de pase Max y Ultra es el mismo"
                    + " donde los clientes con el tipo de pase Max son mayores a los Básicos  y estos son menores a los Ultra");
//------Básico igual a Max ----------------------------------------------------------------------------------------------------------//
//-------Dos planes iguales pero menores al tercero------//
        } else if (clsCliente.contBasico == clsCliente.contMax
                && clsCliente.contBasico < clsCliente.contUltra
                && clsCliente.contMax < clsCliente.contUltra) {
            JOptionPane.showMessageDialog(null, "La cantidad de clientes con el tipo de pase Básico y Max es el mismo"
                    + " estos a su vez son menores que la cantidad de clientes con el tipo de pase Ultra");

//------Dos planes iguales pero mayores al tercero------//
        } else if (clsCliente.contBasico == clsCliente.contMax
                && clsCliente.contBasico > clsCliente.contUltra
                && clsCliente.contMax > clsCliente.contUltra) {
            JOptionPane.showMessageDialog(null, "La cantidad de clientes con el tipo de pase Básico y Max es el mismo"
                    + " estos a su vez son mayores que la cantidad de clientes con el tipo de pase Ultra");

//-------Dos planes iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contBasico == clsCliente.contMax
                && clsCliente.contBasico < clsCliente.contUltra
                && clsCliente.contMax > clsCliente.contUltra) {
            JOptionPane.showMessageDialog(null, "La cantidad de clientes con el tipo de pase Basico y Max es el mismo"
                    + " donde los clientes con el tipo de pase Básicos son menores a los Ultra  y estos son menores a los Max");

//------Dos planes iguales pero uno menor y otro mayor al tercero------//
        } else if (clsCliente.contBasico == clsCliente.contMax
                && clsCliente.contBasico > clsCliente.contUltra
                && clsCliente.contMax < clsCliente.contUltra) {
            JOptionPane.showMessageDialog(null, "La cantidad de clientes con el tipo de pase Basico y Max es el mismo"
                    + " donde los clientes con el tipo de pase Básicos son mayores a los Ultra  y estos son menores a los Max");

//------La cantidad de clientes de los tipos de pase son iguales-------// 
        } else if (clsCliente.contBasico == clsCliente.contMax
                && clsCliente.contBasico == clsCliente.contUltra
                && clsCliente.contUltra == clsCliente.contMax) {
            JOptionPane.showMessageDialog(null, "La cantidad de clientes por tipo de pase es igual");
        }
//----------Estadistíca ingresos--------//
//----------Ganancias del Gimnasio--------//
        JOptionPane.showMessageDialog(null, "Estadistícas de ganancias del gimnasio");
        int ingresos = (clsCliente.contBasico * 10000) + (clsCliente.contMax * 15000) + (clsCliente.contUltra * 20000);
        JOptionPane.showMessageDialog(null, "La ganancia total del gimnasio es: " + ingresos);
    }
}
