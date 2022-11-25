public class Sweet extends Biscuits {
    String SaborCaramelo;

    public Sweet(int id, String description, Float price, double azucarMg, String saborCaramelo) {
        super(id, description, price, azucarMg);
        SaborCaramelo = saborCaramelo;
    }
}
