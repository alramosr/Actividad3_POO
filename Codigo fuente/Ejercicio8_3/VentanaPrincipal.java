package Ejercicio8_3;

//Importamos las clases necesarias para la interfaz gráfica y los eventos.
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

//Creación de la clase VentanaPrincipal (menú principal con las figuras geométricas).
public class VentanaPrincipal extends JFrame implements ActionListener {

    //Sección para declaración de atributos.
    Container Contenedor; //Contenedor de los elementos gráficos.
    JButton BotonCilindro, BotonEsfera, BotonPiramide, BotonCubo, BotonPrisma, BotonCono, BotonSemiesfera, BotonTetraedro; //Botones para seleccionar una figura geométrica.

    //Creamos el constructor de la ventana.
    public VentanaPrincipal(){

        //Creamos los componentes gráficos de la ventana.
        Inicio();

        //Establecemos el título, el tamaño y la posición de la ventana.
        setTitle("Figuras");
        setSize(500, 190);
        setLocationRelativeTo(null);

        //Establecemos que el botón de cerrar termina la aplicación.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Creamos un método para crear la ventana con sus componentes gráficos.
    private void Inicio(){

        //Obtenemos el panel de contenidos de la ventana y le quitamos el layout.
        Contenedor = getContentPane();
        Contenedor.setLayout(null);

        //Establecemos el botón del cilindro y le agregamos el oyente de eventos.
        BotonCilindro = new JButton();
        BotonCilindro.setText("Cilindro");
        BotonCilindro.setBounds(20, 30, 105, 23);
        BotonCilindro.addActionListener(this);

        //Establecemos el botón de la esfera y le agregamos el oyente de eventos.
        BotonEsfera = new JButton();
        BotonEsfera.setText("Esfera");
        BotonEsfera.setBounds(135, 30, 105, 23);
        BotonEsfera.addActionListener(this);

        //Establecemos el botón de la pirámide y le agregamos el oyente de eventos.
        BotonPiramide = new JButton();
        BotonPiramide.setText("Pirámide");
        BotonPiramide.setBounds(250, 30, 105, 23);
        BotonPiramide.addActionListener(this);

        //Establecemos el botón del cubo y le agregamos el oyente de eventos.
        BotonCubo = new JButton();
        BotonCubo.setText("Cubo");
        BotonCubo.setBounds(365, 30, 105, 23);
        BotonCubo.addActionListener(this);

        //Establecemos el botón del prisma y le agregamos el oyente de eventos.
        BotonPrisma = new JButton();
        BotonPrisma.setText("Prisma");
        BotonPrisma.setBounds(20, 70, 105, 23);
        BotonPrisma.addActionListener(this);

        //Establecemos el botón del cono y le agregamos el oyente de eventos.
        BotonCono = new JButton();
        BotonCono.setText("Cono");
        BotonCono.setBounds(135, 70, 105, 23);
        BotonCono.addActionListener(this);

        //Establecemos el botón de la semiesfera y le agregamos el oyente de eventos.
        BotonSemiesfera = new JButton();
        BotonSemiesfera.setText("Semiesfera");
        BotonSemiesfera.setBounds(250, 70, 105, 23);
        BotonSemiesfera.addActionListener(this);

        //Establecemos el botón del tetraedro y le agregamos el oyente de eventos.
        BotonTetraedro = new JButton();
        BotonTetraedro.setText("Tetraedro");
        BotonTetraedro.setBounds(365, 70, 105, 23);
        BotonTetraedro.addActionListener(this);

        //Añadimos cada componente gráfico al contenedor de la ventana.
        Contenedor.add(BotonCilindro);
        Contenedor.add(BotonEsfera);
        Contenedor.add(BotonPiramide);
        Contenedor.add(BotonCubo);
        Contenedor.add(BotonPrisma);
        Contenedor.add(BotonCono);
        Contenedor.add(BotonSemiesfera);
        Contenedor.add(BotonTetraedro);
    }

    //Creamos un método para gestionar los eventos generados en la ventana.
    @Override
    public void actionPerformed(ActionEvent Evento){

        //Si se pulsa el botón del cilindro se abre la ventana del cilindro.
        if (Evento.getSource() == BotonCilindro){
            VentanaCilindro MiVentanaCilindro = new VentanaCilindro();
            MiVentanaCilindro.setVisible(true);
        }

        //Si se pulsa el botón de la esfera se abre la ventana de la esfera.
        if (Evento.getSource() == BotonEsfera){
            VentanaEsfera MiVentanaEsfera = new VentanaEsfera();
            MiVentanaEsfera.setVisible(true);
        }

        //Si se pulsa el botón de la pirámide se abre la ventana de la pirámide.
        if (Evento.getSource() == BotonPiramide){
            VentanaPiramide MiVentanaPiramide = new VentanaPiramide();
            MiVentanaPiramide.setVisible(true);
        }

        //Si se pulsa el botón del cubo se abre la ventana del cubo.
        if (Evento.getSource() == BotonCubo){
            VentanaCubo MiVentanaCubo = new VentanaCubo();
            MiVentanaCubo.setVisible(true);
        }

        //Si se pulsa el botón del prisma se abre la ventana del prisma.
        if (Evento.getSource() == BotonPrisma){
            VentanaPrisma MiVentanaPrisma = new VentanaPrisma();
            MiVentanaPrisma.setVisible(true);
        }

        //Si se pulsa el botón del cono se abre la ventana del cono.
        if (Evento.getSource() == BotonCono){
            VentanaCono MiVentanaCono = new VentanaCono();
            MiVentanaCono.setVisible(true);
        }

        //Si se pulsa el botón de la semiesfera se abre la ventana de la semiesfera.
        if (Evento.getSource() == BotonSemiesfera){
            VentanaSemiesfera MiVentanaSemiesfera = new VentanaSemiesfera();
            MiVentanaSemiesfera.setVisible(true);
        }

        //Si se pulsa el botón del tetraedro se abre la ventana del tetraedro.
        if (Evento.getSource() == BotonTetraedro){
            VentanaTetraedro MiVentanaTetraedro = new VentanaTetraedro();
            MiVentanaTetraedro.setVisible(true);
        }
    }
}
