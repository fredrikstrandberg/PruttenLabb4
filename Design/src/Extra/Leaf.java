package Extra;

import java.util.ArrayList;

public class Leaf extends Component {

    public Leaf(String newObjectName, int newObjectWeight){
        objectName = newObjectName;
        objectWeight = newObjectWeight;
    }
    public int getObjectWeight() { return objectWeight; }

    public ArrayList<Component> getChildren(){
        return null;
    }
}
