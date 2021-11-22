package Uppgift1;

public class Leaf extends Component {
    String objectName;
    int objectWeight;

    public Leaf(String newObjectName, int newObjectWeight){
        objectName = newObjectName;
        objectWeight = newObjectWeight;
    }
    public String getObjectName() { return objectName; }
    public int getObjectWeight() { return objectWeight; }
}
