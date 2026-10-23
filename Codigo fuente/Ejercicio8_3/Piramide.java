package Ejercicio8_3;

//Creación de la clase Piramide (una pirámide de base cuadrada), subclase de FiguraGeometrica.
public class Piramide extends FiguraGeometrica {

    //Sección para declaración de atributos.
    double Base; //En centímetros.
    double Altura; //En centímetros.
    double Apotema; //En centímetros.

    //Creamos el constructor que inicializa los atributos y calcula el volumen y la superficie.
    public Piramide(double Base, double Altura, double Apotema){

        //Asignamos los valores recibidos a los atributos.
        this.Base = Base;
        this.Altura = Altura;
        this.Apotema = Apotema;

        //Calculamos y guardamos el volumen y la superficie de la figura.
        SetVolumen(CalcularVolumen());
        SetSuperficie(CalcularSuperficie());
    }

    //Creamos un método get para el lado de la base.
    public double GetBase(){

        //Retornamos el lado de la base.
        return Base;
    }

    //Creamos un método get para la altura.
    public double GetAltura(){

        //Retornamos la altura.
        return Altura;
    }

    //Creamos un método get para el apotema.
    public double GetApotema(){

        //Retornamos el apotema.
        return Apotema;
    }

    //Creamos un método set para el lado de la base (se vuelven a calcular el volumen y la superficie).
    public void SetBase(double Base){

        //Asignamos el nuevo valor y recalculamos el volumen y la superficie.
        this.Base = Base;
        SetVolumen(CalcularVolumen());
        SetSuperficie(CalcularSuperficie());
    }

    //Creamos un método set para la altura (se vuelven a calcular el volumen y la superficie).
    public void SetAltura(double Altura){

        //Asignamos el nuevo valor y recalculamos el volumen y la superficie.
        this.Altura = Altura;
        SetVolumen(CalcularVolumen());
        SetSuperficie(CalcularSuperficie());
    }

    //Creamos un método set para el apotema (se vuelven a calcular el volumen y la superficie).
    public void SetApotema(double Apotema){

        //Asignamos el nuevo valor y recalculamos el volumen y la superficie.
        this.Apotema = Apotema;
        SetVolumen(CalcularVolumen());
        SetSuperficie(CalcularSuperficie());
    }

    //Creamos un método para calcular el volumen de la pirámide.
    public double CalcularVolumen(){

        //Inicializamos una variable para guardar el cálculo del volumen (base al cuadrado * altura / 3).
        double Volumen = (Math.pow(Base, 2) * Altura) / 3;

        //Retornamos la variable.
        return Volumen;
    }

    //Creamos un método para calcular la superficie de la pirámide.
    public double CalcularSuperficie(){

        //Inicializamos una variable para guardar el cálculo de la superficie (área de la base + área de las cuatro caras (base al cuadrado + 2 * base * apotema)).
        double Superficie = Math.pow(Base, 2) + 2 * Base * Apotema;

        //Retornamos la variable.
        return Superficie;
    }
}
