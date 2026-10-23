package Ejercicio8_3;

//Creación de la clase Esfera (una esfera), subclase de FiguraGeometrica.
public class Esfera extends FiguraGeometrica {

    //Sección para declaración de atributos.
    double Radio; //En centímetros.

    //Creamos el constructor que inicializa los atributos y calcula el volumen y la superficie.
    public Esfera(double Radio){

        //Asignamos los valores recibidos a los atributos.
        this.Radio = Radio;

        //Calculamos y guardamos el volumen y la superficie de la figura.
        SetVolumen(CalcularVolumen());
        SetSuperficie(CalcularSuperficie());
    }

    //Creamos un método get para el radio.
    public double GetRadio(){

        //Retornamos el radio.
        return Radio;
    }

    //Creamos un método set para el radio (se vuelven a calcular el volumen y la superficie).
    public void SetRadio(double Radio){

        //Asignamos el nuevo valor y recalculamos el volumen y la superficie.
        this.Radio = Radio;
        SetVolumen(CalcularVolumen());
        SetSuperficie(CalcularSuperficie());
    }

    //Creamos un método para calcular el volumen de la esfera.
    public double CalcularVolumen(){

        //Inicializamos una variable para guardar el cálculo del volumen (4 / 3 * pi * radio al cubo).
        double Volumen = (4.0 / 3.0) * Math.PI * Math.pow(Radio, 3);

        //Retornamos la variable.
        return Volumen;
    }

    //Creamos un método para calcular la superficie de la esfera.
    public double CalcularSuperficie(){

        //Inicializamos una variable para guardar el cálculo de la superficie (4 * pi * radio al cuadrado).
        double Superficie = 4 * Math.PI * Math.pow(Radio, 2);

        //Retornamos la variable.
        return Superficie;
    }
}
