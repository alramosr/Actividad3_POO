package Ejercicio8_3;

//Creación de la clase Cono (un cono), subclase de FiguraGeometrica.
public class Cono extends FiguraGeometrica {

    //Sección para declaración de atributos.
    double Radio; //En centímetros.
    double Altura; //En centímetros.

    //Creamos el constructor que inicializa los atributos y calcula el volumen y la superficie.
    public Cono(double Radio, double Altura){

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

    //Creamos un método para calcular el volumen del cono.
    public double CalcularVolumen(){

        //Inicializamos una variable para guardar el cálculo del volumen (pi * radio al cuadrado * altura / 3).
        double Volumen = (Math.PI * Math.pow(Radio, 2) * Altura) / 3;

        //Retornamos la variable.
        return Volumen;
    }

    //Creamos un método para calcular la superficie del cono.
    public double CalcularSuperficie(){

        //Calculamos la generatriz con el teorema de Pitágoras (raíz de radio al cuadrado + altura al cuadrado).
        double Generatriz = Math.sqrt(Math.pow(Radio, 2) + Math.pow(Altura, 2));

        //Inicializamos una variable para guardar el cálculo de la superficie (área de la base + área lateral).
        double Superficie = Math.PI * Math.pow(Radio, 2) + Math.PI * Radio * Generatriz;

        //Retornamos la variable.
        return Superficie;
    }
}
