package prjproyectogym;

public class clsCalculos {

    int PesoIdeal(float altura, String sexo) {
        float p = 0;
        int pesoIdeal = 0;
        if (sexo.equalsIgnoreCase("Masculino")) {
            p = (altura * altura) * (float) 22.5;
            pesoIdeal = (int) Math.floor(p);
        } else if (sexo.equalsIgnoreCase("Femenino")) {
            p = (altura * altura) * (float) 21.5;
            pesoIdeal = (int) Math.floor(p);
        }
        return pesoIdeal;
    }

    int CaloriasDiarias(float peso, float altura, int edad, String sexo) {
        int caloriasDiarias = 0;
        if (sexo.equalsIgnoreCase("Masculino")) {
            caloriasDiarias = (int) (((10 * peso) + (6.25 * (altura * 100)) - (5 * edad) + 5) * 1.55);
        } else if (sexo.equalsIgnoreCase("Femenino")) {
            caloriasDiarias = (int) (((10 * peso) + (6.25 * (altura * 100)) - (5 * edad) - 161) * 1.55);
        }
        return caloriasDiarias;
    }

    int CaloriasObjetivo(String objetivo, int caloriasDiarias) {
        int caloriasObjetivo = 0;
        if (objetivo.equalsIgnoreCase("Subir de peso")) {
            caloriasObjetivo = caloriasDiarias + 250;
        } else if (objetivo.equalsIgnoreCase("Bajar de peso")) {
            caloriasObjetivo = caloriasDiarias - 250;
        } else if(objetivo.equalsIgnoreCase("Mantener peso")){
            caloriasObjetivo=caloriasDiarias;
        }
        return caloriasObjetivo;
    }
    float IMC(float altura, float peso){
        float IMC=0;
        IMC= (float) (Math.pow(altura, 2)/peso);
        return IMC;
    } 
} 
    
