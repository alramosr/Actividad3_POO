package Ejercicio8_2;

//Importamos las clases necesarias para la interfaz gráfica y los eventos.
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//Creación de la clase VentanaPrincipal (ventana para ingresar las cinco notas).
public class VentanaPrincipal extends JFrame implements ActionListener {

    //Sección para declaración de atributos.
    Container Contenedor; //Contenedor de los elementos gráficos.
    JLabel Nota1, Nota2, Nota3, Nota4, Nota5; //Etiquetas de cada nota.
    JLabel Promedio, Desviacion, Mayor, Menor; //Etiquetas de los resultados.
    JTextField CampoNota1, CampoNota2, CampoNota3, CampoNota4, CampoNota5; //Campos de ingreso de cada nota.
    JButton Calcular, Limpiar; //Botones para calcular y para borrar las notas.

    //Creamos el constructor de la ventana.
    public VentanaPrincipal(){

        //Creamos los componentes gráficos de la ventana.
        Inicio();

        //Establecemos el título, el tamaño y la posición de la ventana.
        setTitle("Notas");
        setSize(280, 380);
        setLocationRelativeTo(null);

        //Establecemos que el botón de cerrar termina la aplicación y que el tamaño no se puede cambiar.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    //Creamos un método para crear la ventana con sus componentes gráficos.
    private void Inicio(){

        //Obtenemos el panel de contenidos de la ventana y le quitamos el layout.
        Contenedor = getContentPane();
        Contenedor.setLayout(null);

        //Establecemos la etiqueta y el campo de texto de la nota 1.
        Nota1 = new JLabel();
        Nota1.setText("Nota 1:");
        Nota1.setBounds(20, 20, 135, 23);
        CampoNota1 = new JTextField();
        CampoNota1.setBounds(105, 20, 135, 23);

        //Establecemos la etiqueta y el campo de texto de la nota 2.
        Nota2 = new JLabel();
        Nota2.setText("Nota 2:");
        Nota2.setBounds(20, 50, 135, 23);
        CampoNota2 = new JTextField();
        CampoNota2.setBounds(105, 50, 135, 23);

        //Establecemos la etiqueta y el campo de texto de la nota 3.
        Nota3 = new JLabel();
        Nota3.setText("Nota 3:");
        Nota3.setBounds(20, 80, 135, 23);
        CampoNota3 = new JTextField();
        CampoNota3.setBounds(105, 80, 135, 23);

        //Establecemos la etiqueta y el campo de texto de la nota 4.
        Nota4 = new JLabel();
        Nota4.setText("Nota 4:");
        Nota4.setBounds(20, 110, 135, 23);
        CampoNota4 = new JTextField();
        CampoNota4.setBounds(105, 110, 135, 23);

        //Establecemos la etiqueta y el campo de texto de la nota 5.
        Nota5 = new JLabel();
        Nota5.setText("Nota 5:");
        Nota5.setBounds(20, 140, 135, 23);
        CampoNota5 = new JTextField();
        CampoNota5.setBounds(105, 140, 135, 23);

        //Establecemos el botón Calcular y le agregamos el oyente de eventos.
        Calcular = new JButton();
        Calcular.setText("Calcular");
        Calcular.setBounds(20, 170, 100, 23);
        Calcular.addActionListener(this);

        //Establecemos el botón Limpiar y le agregamos el oyente de eventos.
        Limpiar = new JButton();
        Limpiar.setText("Limpiar");
        Limpiar.setBounds(125, 170, 80, 23);
        Limpiar.addActionListener(this);

        //Establecemos las etiquetas de los resultados.
        Promedio = new JLabel();
        Promedio.setText("Promedio = ");
        Promedio.setBounds(20, 210, 220, 23);
        Desviacion = new JLabel();
        Desviacion.setText("Desviación = ");
        Desviacion.setBounds(20, 240, 220, 23);
        Mayor = new JLabel();
        Mayor.setText("Nota mayor = ");
        Mayor.setBounds(20, 270, 220, 23);
        Menor = new JLabel();
        Menor.setText("Nota menor = ");
        Menor.setBounds(20, 300, 220, 23);

        //Añadimos cada componente gráfico al contenedor de la ventana.
        Contenedor.add(Nota1);
        Contenedor.add(CampoNota1);
        Contenedor.add(Nota2);
        Contenedor.add(CampoNota2);
        Contenedor.add(Nota3);
        Contenedor.add(CampoNota3);
        Contenedor.add(Nota4);
        Contenedor.add(CampoNota4);
        Contenedor.add(Nota5);
        Contenedor.add(CampoNota5);
        Contenedor.add(Calcular);
        Contenedor.add(Limpiar);
        Contenedor.add(Promedio);
        Contenedor.add(Desviacion);
        Contenedor.add(Mayor);
        Contenedor.add(Menor);
    }

    //Creamos un método para gestionar los eventos generados en la ventana.
    @Override
    public void actionPerformed(ActionEvent Evento){

        //Si se pulsa el botón Calcular se leen las notas y se muestran los resultados.
        if (Evento.getSource() == Calcular){

            //Creamos el objeto Notas y agrupamos los campos de texto para recorrerlos.
            Notas MisNotas = new Notas();
            JTextField[] Campos = {CampoNota1, CampoNota2, CampoNota3, CampoNota4, CampoNota5};

            //Recorremos los campos validando y guardando cada nota.
            for (int i = 0; i < Campos.length; i++){

                //Obtenemos el texto ingresado en el campo, sin espacios a los lados.
                String Texto = Campos[i].getText().trim();

                //Es obligatorio ingresar las cinco notas, si falta una se genera un mensaje de alerta.
                if (Texto.isEmpty()){
                    JOptionPane.showMessageDialog(this, "La nota " + (i + 1) + " no ha sido ingresada. Es obligatorio ingresar las cinco notas.", "Nota faltante", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                //Si el dato no es numérico se genera un mensaje de alerta.
                try {
                    MisNotas.ListaNotas[i] = Double.parseDouble(Texto);
                } catch (NumberFormatException Error){
                    JOptionPane.showMessageDialog(this, "La nota " + (i + 1) + " no es un valor numérico: \"" + Texto + "\"", "Dato no numérico", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            //Mostramos los resultados con dos decimales.
            Promedio.setText("Promedio = " + String.format("%.2f", MisNotas.CalcularPromedio()));
            Desviacion.setText("Desviación estándar = " + String.format("%.2f", MisNotas.CalcularDesviacion()));
            Mayor.setText("Valor mayor = " + MisNotas.CalcularMayor());
            Menor.setText("Valor menor = " + MisNotas.CalcularMenor());
        }

        //Si se pulsa el botón Limpiar se dejan en blanco los campos de las notas y los resultados.
        if (Evento.getSource() == Limpiar){
            CampoNota1.setText("");
            CampoNota2.setText("");
            CampoNota3.setText("");
            CampoNota4.setText("");
            CampoNota5.setText("");
            Promedio.setText("Promedio = ");
            Desviacion.setText("Desviación = ");
            Mayor.setText("Nota mayor = ");
            Menor.setText("Nota menor = ");
        }
    }
}
