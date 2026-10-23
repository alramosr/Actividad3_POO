package Ejercicio8_2;

//Creación de la clase Notas.
public class Notas {

    //Sección para declaración de atributos.
    double[] ListaNotas;

    //Creamos el constructor que crea el array con las cinco notas.
    public Notas(){

        //Creamos el array de cinco notas.
        ListaNotas = new double[5];
    }

    //Creamos un método get para la lista de notas.
    public double[] GetListaNotas(){

        //Retornamos la lista de notas.
        return ListaNotas;
    }

    //Creamos un método set para la lista de notas.
    public void SetListaNotas(double[] ListaNotas){

        //Asignamos la nueva lista de notas.
        this.ListaNotas = ListaNotas;
    }

    //Creamos un método para calcular el promedio de las notas.
    public double CalcularPromedio(){

        //Inicializamos una variable para guardar la suma de las notas.
        double Suma = 0;

        //Recorremos el array sumando cada una de las notas.
        for (int i = 0; i < ListaNotas.length; i++){
            Suma = Suma + ListaNotas[i];
        }

        //Inicializamos una variable para guardar el promedio (suma / cantidad de notas).
        double Promedio = Suma / ListaNotas.length;

        //Retornamos la variable.
        return Promedio;
    }

    //Creamos un método para calcular la desviación estándar de las notas.
    public double CalcularDesviacion(){

        //Calculamos el promedio de las notas.
        double Promedio = CalcularPromedio();

        //Inicializamos una variable para guardar la suma de las diferencias al cuadrado.
        double Suma = 0;

        //Recorremos el array sumando el cuadrado de la diferencia entre cada nota y el promedio.
        for (int i = 0; i < ListaNotas.length; i++){
            Suma = Suma + Math.pow(ListaNotas[i] - Promedio, 2);
        }

        //Inicializamos una variable para guardar la desviación (raíz de la suma / cantidad de notas).
        double Desviacion = Math.sqrt(Suma / ListaNotas.length);

        //Retornamos la variable.
        return Desviacion;
    }

    //Creamos un método para calcular la menor nota.
    public double CalcularMenor(){

        //Tomamos la primera nota como la menor.
        double Menor = ListaNotas[0];

        //Recorremos el array, si una nota es menor que la menor actual se actualiza su valor.
        for (int i = 0; i < ListaNotas.length; i++){
            if (ListaNotas[i] < Menor){
                Menor = ListaNotas[i];
            }
        }

        //Retornamos la variable.
        return Menor;
    }

    //Creamos un método para calcular la mayor nota.
    public double CalcularMayor(){

        //Tomamos la primera nota como la mayor.
        double Mayor = ListaNotas[0];

        //Recorremos el array, si una nota es mayor que la mayor actual se actualiza su valor.
        for (int i = 0; i < ListaNotas.length; i++){
            if (ListaNotas[i] > Mayor){
                Mayor = ListaNotas[i];
            }
        }

        //Retornamos la variable.
        return Mayor;
    }
}
