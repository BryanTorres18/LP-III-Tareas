import java.util.Arrays;

public class CandyBag<T extends Goodies> extends Bag<T>{
    public CandyBag(int n) {
        super(n);
    }

    public T cheapest(){
        try{

            int cuenta = this.getCount();
            if (cuenta < 0){
                throw new IsEmpty();
            }
            // Goodies = Object[Soda,Biscuits,Chocolates]
            T menor = getObjectList(0);
            for(int i =0; i< cuenta ; i++){
                if (menor.compareTo(getObjectList(i)) > 0){
                    menor = getObjectList(i);
                }
            }
            return menor;
        }catch (IsEmpty e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void sortBag(int a,int b) throws IsEmpty{
        Arrays.sort(this.getObjects(),a,b);
    }

    public CandyBag<T> mostExpensive(int n){
        try{
            if (this.getCount()<n){
                throw new NotEnoughItems();
            }
            sortBag(0,this.getCount());
            CandyBag<T> listaDevolver = new CandyBag<>(n);
            for(int i = this.getCount()-n; i < getCount(); i++){
                listaDevolver.add(getObjectList(i));
            }
            return listaDevolver;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}