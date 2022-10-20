
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MarcoBorderLayout extends JFrame implements ActionListener {

    private final JButton botones[]; // arreglo de botones para ocultar porciones
    private static final String nombres[] = {"Verde", "Azul",
        "Rojo", "Amarillo", "Negro"};
    private final BorderLayout esquema;

    // establece la GUI y el manejo de eventos
    public MarcoBorderLayout() {
        super("Demostracion de BorderLayout");

        esquema = new BorderLayout(5, 5); // espacios de 5 píxeles 
        setLayout(esquema);
        botones = new JButton[nombres.length];
        

        // crea objetos JButton y registra componentes de escucha para ellos
        for (int cuenta = 0; cuenta < nombres.length; cuenta++) {
            botones[cuenta] = new JButton(nombres[cuenta]);
            botones[cuenta].addActionListener(this);
        }
        add(botones[0], BorderLayout.NORTH);
        add(botones[1], BorderLayout.SOUTH);
        add(botones[2], BorderLayout.EAST);
        add(botones[3], BorderLayout.WEST);
        add(botones[4], BorderLayout.CENTER);
    }
    // maneja los eventos de botón

    @Override
    public void actionPerformed(ActionEvent evento) {
        // comprueba el origen del evento y distribuye el panel de contenido de manera acorde
        if (evento.getSource() == botones[0]) {
            getContentPane().setBackground(Color.green);
            botones[0] botones[4];
        }
        if (evento.getSource() == botones[1]) {
            getContentPane().setBackground(Color.blue);
        }
        if (evento.getSource() == botones[2]) {
            getContentPane().setBackground(Color.red);
        }
        if (evento.getSource() == botones[3]) {
            getContentPane().setBackground(Color.yellow);
        }
        if (evento.getSource() == botones[4]) {
            getContentPane().setBackground(Color.black);
        }

        esquema.layoutContainer(getContentPane()); // distribuye el panel de contenido 
    }
} // fin de la clase MarcoBorderLayout

