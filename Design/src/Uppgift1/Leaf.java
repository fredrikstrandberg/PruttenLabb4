package Uppgift1;

public class Leaf extends Component {

    public Leaf(String newObjectName, int newObjectWeight){
        objectName = newObjectName;
        objectWeight = newObjectWeight;
    }
    public int getObjectWeight() { return objectWeight; }

    public String toString(){ return objectName; }



}
