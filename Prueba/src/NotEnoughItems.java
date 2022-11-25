public class NotEnoughItems extends Exception{
    NotEnoughItems(){
        super("El numero recibido excede la cantidad de elementos en la bolsa!");
    }
}
