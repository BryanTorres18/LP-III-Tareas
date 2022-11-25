public class main {
    public static void main(String[] args) {
        Bag<Goodies> bolsaBag = new Bag<>(3);
        CandyBag<Goodies> bolsaGoodies = new CandyBag<Goodies>(3);
        Soda Inca3LT = new Soda(1,"Inca cola personal",2.5f,10000,"500ML");
        Biscuits TurronDoniaPepa = new Biscuits(2,"Doña pepa",1.5f,2650);
        Chocolates Chocman = new Chocolates(3,"Chocman",1.1f,"Baniado");

        try{
            bolsaGoodies.add(Inca3LT);
            bolsaGoodies.add(TurronDoniaPepa);
            bolsaGoodies.add(Chocman);
            System.out.println(bolsaGoodies);
            Goodies barataso = bolsaGoodies.cheapest();
            System.out.println(barataso);
            CandyBag<Goodies> bolsita = bolsaGoodies.mostExpensive(2);
            System.out.println(bolsita);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
