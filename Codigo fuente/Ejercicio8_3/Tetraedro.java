package Ejercicio8_3;

//Creación de la clase Tetraedro (un tetraedro regular), subclase de FiguraGeometrica.
public class Tetraedro extends FiguraGeometrica {

    //Sección para declaración de atributos.
    double Arista; //En centímetros.

    //Creamos el constructor que inicializa los atributos y calcula el volumen y la superficie.
    public Tetraedro(double Arista){

        //Asignamos los valores recibidos a los atributos.
        this.Arista = Arista;

        //Calculamos y guardamos el volumen y la superficie de la figura.
        SetVolumen(CalcularVolumen());
        SetSuperficie(CalcularSuperficie());
    }

    //Creamos un método get para la arista.
    public double GetArista(){

        //Retornamos la arista.
        return Arista;
    }

    //Creamos un método set para la arista (se vuelven a calcular el volumen y la superficie).
    public void SetArista(double Arista){

        //Asignamos el nuevo valor y recalculamos el volumen y la superficie.
        this.Arista = Arista;
        SetVolumen(CalcularVolumen());
        SetSuperficie(CalcularSuperficie());
    }

    //Creamos un método para calcular el volumen del tetraedro.
    public double CalcularVolumen(){

        //Inicializamos una variable para guardar el cálculo del volumen (arista al cubo / (6 * raíz de 2)).
        double Volumen = Math.pow(Arista, 3) / (6 * Math.sqrt(2));

        //Retornamos la variable.
        return Volumen;
    }

    //Creamos un método para calcular la superficie del tetraedro.
    public double CalcularSuperficie(){

        //Inicializamos una variable para guardar el cálculo de la superficie (raíz de 3 * arista al cuadrado, sus cuatro caras son triángulos equiláteros).
        double Superficie = Math.sqrt(3) * Math.pow(Arista, 2);

        //Retornamos la variable.
        return Superficie;
    }
}
