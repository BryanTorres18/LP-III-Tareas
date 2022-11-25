public class Goodies implements Comparable<Goodies>{
    int id;
    String description;
    Float price;

    public Goodies(int id, String description, Float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }
    @Override
    public int compareTo(Goodies a){
        return this.price.compareTo(a.price);
    }
    @Override
    public boolean equals(Object a){
        if(a instanceof Goodies){
            if (this.id == ((Goodies)a).id){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return description;
    }
}
