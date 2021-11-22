package Uppgift1;
//comment
public class Stuff extends BagComponent{
    String stuffName;
    int stuffWeight;

    public Stuff(String name, int weight){
        stuffName = name;
        stuffWeight = weight;
    }

    public int getWeight() {
        return stuffWeight;
    }

    @Override
    public String toString() {
        return  "\n" + stuffName;
    }
}

