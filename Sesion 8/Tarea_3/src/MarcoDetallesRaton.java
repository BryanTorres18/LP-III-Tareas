import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class MarcoDetallesRaton extends JFrame
{
    private String detalles; // String que se muestra en barraEstado
    private JPanel panelRaton;

    public MarcoDetallesRaton()
    {
        super("Clics y cambio de color");
        panelRaton = new JPanel();
        add(panelRaton, BorderLayout.CENTER); // agrega el panel a JFrame
        addMouseListener(new ManejadorClicRaton()); // agrega el manejador
    }
    // clase interna para manejar los eventos del ratón
    private class ManejadorClicRaton extends MouseAdapter
    {
        // maneja evento de clic del ratón y determina cuál botón se oprimió
        @Override
        public void mouseClicked(MouseEvent evento)
        {
            panelRaton.setBackground(Color.green);
        } // fin de la clase MarcoDetallesRaton

        @Override
        public void mouseExited(MouseEvent evento)
        {
            panelRaton.setBackground(Color.white);
        }

    }
}