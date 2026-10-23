package Ejercicio8_3;

//Creación de la clase FiguraGeometrica (clase padre de todas las figuras).
public class FiguraGeometrica {

    //Sección para declaración de atributos.
    double Volumen; //En centímetros cúbicos.
    double Superficie; //En centímetros cuadrados.

    //Creamos un método get para el volumen.
    public double GetVolumen(){

        //Retornamos el volumen.
        return Volumen;
    }

    //Creamos un método get para la superficie.
    public double GetSuperficie(){

        //Retornamos la superficie.
        return Superficie;
    }

    //Creamos un método set para el volumen.
    public void SetVolumen(double Volumen){

        //Asignamos el nuevo volumen.
        this.Volumen = Volumen;
    }

    //Creamos un método set para la superficie.
    public void SetSuperficie(double Superficie){

        //Asignamos la nueva superficie.
        this.Superficie = Superficie;
    }
}
