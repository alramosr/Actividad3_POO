package Ejercicio8_3;

//Creación de la clase Prisma (un prisma rectangular), subclase de FiguraGeometrica.
public class Prisma extends FiguraGeometrica {

    //Sección para declaración de atributos.
    double Largo; //En centímetros.
    double Ancho; //En centímetros.
    double Altura; //En centímetros.

    //Creamos el constructor que inicializa los atributos y calcula el volumen y la superficie.
    public Prisma(double Largo, double Ancho, double Altura){

        //Asignamos los valores recibidos a los atributos.
        this.Largo = Largo;
        this.Ancho = Ancho;
        this.Altura = Altura;

        //Calculamos y guardamos el volumen y la superficie de la figura.
        SetVolumen(CalcularVolumen());
        SetSuperficie(CalcularSuperficie());
    }

    //Creamos un método get para el largo.
    public double GetLargo(){

        //Retornamos el largo.
        return Largo;
    }

    //Creamos un método get para el ancho.
    public double GetAncho(){

        //Retornamos el ancho.
        return Ancho;
    }

    //Creamos un método get para la altura.
    public double GetAltura(){

        //Retornamos la altura.
        return Altura;
    }

    //Creamos un método set para el largo (se vuelven a calcular el volumen y la superficie).
    public void SetLargo(double Largo){

        //Asignamos el nuevo valor y recalculamos el volumen y la superficie.
        this.Largo = Largo;
        SetVolumen(CalcularVolumen());
        SetSuperficie(CalcularSuperficie());
    }

    //Creamos un método set para el ancho (se vuelven a calcular el volumen y la superficie).
    public void SetAncho(double Ancho){

        //Asignamos el nuevo valor y recalculamos el volumen y la superficie.
        this.Ancho = Ancho;
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

    //Creamos un método para calcular el volumen del prisma.
    public double CalcularVolumen(){

        //Inicializamos una variable para guardar el cálculo del volumen (largo * ancho * altura).
        double Volumen = Largo * Ancho * Altura;

        //Retornamos la variable.
        return Volumen;
    }

    //Creamos un método para calcular la superficie del prisma.
    public double CalcularSuperficie(){

        //Inicializamos una variable para guardar el cálculo de la superficie (2 * (largo * ancho + largo * altura + ancho * altura)).
        double Superficie = 2 * (Largo * Ancho + Largo * Altura + Ancho * Altura);

        //Retornamos la variable.
        return Superficie;
    }
}
