public class Biscuits extends Goodies {
    double AzucarMg;

    public Biscuits(int id, String description, Float price, double azucarMg) {
        super(id, description, price);
        AzucarMg = azucarMg;
    }
}
