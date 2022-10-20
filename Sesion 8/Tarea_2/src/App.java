import javax.swing.JFrame;
public class App
{
    public static void main(String[] args)
    {
        MarcoRastreadorRaton marcoRastreadorRaton = new MarcoRastreadorRaton();
        marcoRastreadorRaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoRastreadorRaton.setSize(500, 500);
        marcoRastreadorRaton.setVisible(true);
    }
}