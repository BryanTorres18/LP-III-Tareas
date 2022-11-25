public class Soda extends Biscuits {
    String CapacidadBotella;

    public Soda(int id, String description, Float price, double azucarMg, String capacidadBotella) {
        super(id, description, price, azucarMg);
        CapacidadBotella = capacidadBotella;
    }
}
