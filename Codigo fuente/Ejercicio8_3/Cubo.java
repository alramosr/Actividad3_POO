package Ejercicio8_3;

//Creación de la clase Cubo (un cubo), subclase de FiguraGeometrica.
public class Cubo extends FiguraGeometrica {

    //Sección para declaración de atributos.
    double Lado; //En centímetros.

    //Creamos el constructor que inicializa los atributos y calcula el volumen y la superficie.
    public Cubo(double Lado){

        //Asignamos los valores recibidos a los atributos.
        this.Lado = Lado;

        //Calculamos y guardamos el volumen y la superficie de la figura.
        SetVolumen(CalcularVolumen());
        SetSuperficie(CalcularSuperficie());
    }

    //Creamos un método get para el lado.
    public double GetLado(){

        //Retornamos el lado.
        return Lado;
    }

    //Creamos un método set para el lado (se vuelven a calcular el volumen y la superficie).
    public void SetLado(double Lado){

        //Asignamos el nuevo valor y recalculamos el volumen y la superficie.
        this.Lado = Lado;
        SetVolumen(CalcularVolumen());
        SetSuperficie(CalcularSuperficie());
    }

    //Creamos un método para calcular el volumen del cubo.
    public double CalcularVolumen(){

        //Inicializamos una variable para guardar el cálculo del volumen (lado al cubo).
        double Volumen = Math.pow(Lado, 3);

        //Retornamos la variable.
        return Volumen;
    }

    //Creamos un método para calcular la superficie del cubo.
    public double CalcularSuperficie(){

        //Inicializamos una variable para guardar el cálculo de la superficie (6 * lado al cuadrado).
        double Superficie = 6 * Math.pow(Lado, 2);

        //Retornamos la variable.
        return Superficie;
    }
}
