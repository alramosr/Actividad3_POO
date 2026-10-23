package Ejercicio8_3;

//Importamos las clases necesarias para la interfaz gráfica y los eventos.
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//Creación de la clase VentanaPiramide (ventana para calcular el volumen y la superficie de una pirámide).
public class VentanaPiramide extends JFrame implements ActionListener {

    //Sección para declaración de atributos.
    Container Contenedor; //Contenedor de los elementos gráficos.
    JLabel Base, Altura, Apotema; //Etiquetas de los datos a ingresar.
    JLabel Volumen, Superficie; //Etiquetas de los resultados.
    JLabel Imagen; //Etiqueta con la imagen de la figura.
    JTextField CampoBase, CampoAltura, CampoApotema; //Campos de ingreso de los datos.
    JButton Calcular; //Botón para calcular el volumen y la superficie.

    //Creamos el constructor de la ventana.
    public VentanaPiramide(){

        //Creamos los componentes gráficos de la ventana.
        Inicio();

        //Establecemos el título, el tamaño y la posición de la ventana.
        setTitle("Pirámide");
        setSize(440, 243);
        setLocationRelativeTo(null);

        //Establecemos que el tamaño de la ventana no se puede cambiar.
        setResizable(false);
    }

    //Creamos un método para crear la ventana con sus componentes gráficos.
    private void Inicio(){

        //Obtenemos el panel de contenidos de la ventana y le quitamos el layout.
        Contenedor = getContentPane();
        Contenedor.setLayout(null);

        //Establecemos la etiqueta y el campo de texto para la base.
        Base = new JLabel();
        Base.setText("Base (cms):");
        Base.setBounds(20, 20, 135, 23);
        CampoBase = new JTextField();
        CampoBase.setBounds(120, 20, 135, 23);

        //Establecemos la etiqueta y el campo de texto para la altura.
        Altura = new JLabel();
        Altura.setText("Altura (cms):");
        Altura.setBounds(20, 50, 135, 23);
        CampoAltura = new JTextField();
        CampoAltura.setBounds(120, 50, 135, 23);

        //Establecemos la etiqueta y el campo de texto para el apotema.
        Apotema = new JLabel();
        Apotema.setText("Apotema (cms):");
        Apotema.setBounds(20, 80, 135, 23);
        CampoApotema = new JTextField();
        CampoApotema.setBounds(120, 80, 135, 23);

        //Establecemos el botón Calcular y le agregamos el oyente de eventos.
        Calcular = new JButton();
        Calcular.setText("Calcular");
        Calcular.setBounds(120, 110, 135, 23);
        Calcular.addActionListener(this);

        //Establecemos las etiquetas del volumen y de la superficie.
        Volumen = new JLabel();
        Volumen.setText("Volumen (cm3):");
        Volumen.setBounds(20, 140, 230, 23);
        Superficie = new JLabel();
        Superficie.setText("Superficie (cm2):");
        Superficie.setBounds(20, 170, 230, 23);

        //Establecemos la imagen de la figura.
        Imagen = new JLabel();
        Imagen.setIcon(new ImageIcon(getClass().getResource("Imagenes/Piramide.png")));
        Imagen.setBounds(275, 20, 150, 150);

        //Añadimos cada componente gráfico al contenedor de la ventana.
        Contenedor.add(Base);
        Contenedor.add(CampoBase);
        Contenedor.add(Altura);
        Contenedor.add(CampoAltura);
        Contenedor.add(Apotema);
        Contenedor.add(CampoApotema);
        Contenedor.add(Calcular);
        Contenedor.add(Volumen);
        Contenedor.add(Superficie);
        Contenedor.add(Imagen);
    }

    //Creamos un método para gestionar los eventos generados en la ventana.
    @Override
    public void actionPerformed(ActionEvent Evento){

        //Si se pulsa el botón Calcular se leen los datos y se muestran los resultados.
        if (Evento.getSource() == Calcular){
            try {
                //Obtenemos y convertimos los valores numéricos ingresados.
                double ValorBase = Double.parseDouble(CampoBase.getText());
                double ValorAltura = Double.parseDouble(CampoAltura.getText());
                double ValorApotema = Double.parseDouble(CampoApotema.getText());

                //Revisamos que los valores sean mayores que cero.
                if (ValorBase <= 0 || ValorAltura <= 0 || ValorApotema <= 0){
                    JOptionPane.showMessageDialog(this, "Los valores deben ser mayores que cero.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                //Creamos el objeto Piramide.
                Piramide MiPiramide = new Piramide(ValorBase, ValorAltura, ValorApotema);

                //Mostramos el volumen y la superficie con dos decimales.
                Volumen.setText("Volumen (cm3): " + String.format("%.2f", MiPiramide.GetVolumen()));
                Superficie.setText("Superficie (cm2): " + String.format("%.2f", MiPiramide.GetSuperficie()));
            } catch (NumberFormatException Error){
                //Si un campo está vacío o no es un número se muestra un mensaje de error.
                JOptionPane.showMessageDialog(this, "Campo nulo o error en formato de número", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
