import java.util.ArrayList;

public class DB {
    ArrayList<Automobiles> automobiles = new ArrayList<>();

    public void Additem(Automobiles item){
        automobiles.add(item);
    }
    ArrayList<Automobiles> getAutomobileByModel(String str) {
        ArrayList<Automobiles> newlist=new ArrayList<>();
        for ( Automobiles i : automobiles){
            if(i.getModel()==str) {
                newlist.add(i);
            }
        }
        return newlist;
    }


    @Override
    public String toString() {
        return "DB{" +
                "automobiles=" + automobiles +
                '}';
    }
}
