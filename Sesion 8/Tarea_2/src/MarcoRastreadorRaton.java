import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class MarcoRastreadorRaton extends JFrame {
    private JLabel etiqueta_1;

    private JTextField campoTexto;

    public MarcoRastreadorRaton()
    {
        super("Demostracion de los eventos de raton");
        setLayout(new FlowLayout());
        //Imagenes
        Icon pato_1 = new ImageIcon(getClass().getResource( "pato_1.jpg"));
        etiqueta_1 = new JLabel("Pato", pato_1, SwingConstants.LEFT);
        add(etiqueta_1);

        //Cuadro de Texto
        campoTexto = new JTextField("No editable", 21);
        campoTexto.setBackground(Color.gray);
        campoTexto.setEditable(false);
        add(campoTexto);


        ManejadorRaton manejador = new ManejadorRaton();
        campoTexto.addMouseListener(manejador);
        etiqueta_1.addMouseListener(manejador);

    }
    private class ManejadorRaton implements MouseListener, MouseMotionListener
    {
        int contador = 0;
        Icon pato_1 = new ImageIcon(getClass().getResource( "pato_1.jpg"));
        Icon pato_2 = new ImageIcon(getClass().getResource( "pato_2.jpg"));

        @Override
        public void mouseClicked(MouseEvent evento)
        {
            contador += 1;
            etiqueta_1.setIcon(pato_2);
            if(contador == 2)
            {
                etiqueta_1.setIcon(pato_1);
                contador = 0;
            }
        }

        // maneja evento cuando se oprime el ratón
        @Override
        public void mousePressed(MouseEvent evento)
        {
        }

        // maneja evento cuando se suelta el botón del ratón
        @Override
        public void mouseReleased(MouseEvent evento)
        {

        }

        // maneja evento cuando el ratón entra al área
        @Override
        public void mouseEntered(MouseEvent evento)
        {
            campoTexto.setBackground(Color.white);
            campoTexto.setEditable(true);

        }
        // maneja evento cuando el ratón sale del área
        @Override
        public void mouseExited(MouseEvent evento)
        {
            campoTexto.setBackground(Color.gray);
            campoTexto.setEditable(false);
        }

        @Override
        public void mouseDragged(MouseEvent evento)
        {

        }
        // maneja evento cuando el usuario mueve el ratón
        @Override
        public void mouseMoved(MouseEvent evento)
        {

        }
    } // fin de la clase interna ManejadorRaton
} // fin de la clase MarcoRastreadorRaton
