package Ejercicio8_3;

//Creación de la clase Cilindro (un cilindro), subclase de FiguraGeometrica.
public class Cilindro extends FiguraGeometrica {

    //Sección para declaración de atributos.
    double Radio; //En centímetros.
    double Altura; //En centímetros.

    //Creamos el constructor que inicializa los atributos y calcula el volumen y la superficie.
    public Cilindro(double Radio, double Altura){

        //Asignamos los valores recibidos a los atributos.
        this.Radio = Radio;
        this.Altura = Altura;

        //Calculamos y guardamos el volumen y la superficie de la figura.
        SetVolumen(CalcularVolumen());
        SetSuperficie(CalcularSuperficie());
    }

    //Creamos un método get para el radio.
    public double GetRadio(){

        //Retornamos el radio.
        return Radio;
    }

    //Creamos un método get para la altura.
    public double GetAltura(){

        //Retornamos la altura.
        return Altura;
    }

    //Creamos un método set para el radio (se vuelven a calcular el volumen y la superficie).
    public void SetRadio(double Radio){

        //Asignamos el nuevo valor y recalculamos el volumen y la superficie.
        this.Radio = Radio;
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

    //Creamos un método para calcular el volumen del cilindro.
    public double CalcularVolumen(){

        //Inicializamos una variable para guardar el cálculo del volumen (pi * radio al cuadrado * altura).
        double Volumen = Math.PI * Math.pow(Radio, 2) * Altura;

        //Retornamos la variable.
        return Volumen;
    }

    //Creamos un método para calcular la superficie del cilindro.
    public double CalcularSuperficie(){

        //Calculamos el área lateral y el área de las dos bases.
        double AreaLateral = 2 * Math.PI * Radio * Altura;
        double AreaBases = 2 * Math.PI * Math.pow(Radio, 2);

        //Inicializamos una variable para guardar el cálculo de la superficie (2 * pi * radio * altura + 2 * pi * radio al cuadrado).
        double Superficie = AreaLateral + AreaBases;

        //Retornamos la variable.
        return Superficie;
    }
}
