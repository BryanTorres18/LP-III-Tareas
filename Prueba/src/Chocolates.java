public class Chocolates extends Goodies {
    String SaborChocolate;

    public Chocolates(int id, String description, Float price, String saborChocolate) {
        super(id, description, price);
        SaborChocolate = saborChocolate;
    }
}
