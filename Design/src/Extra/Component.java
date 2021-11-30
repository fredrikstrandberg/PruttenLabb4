package Extra;

import java.util.ArrayList;
import java.util.Iterator;

abstract class Component {
    public String objectName;
    public int objectWeight;

    public Component(){}

    public ArrayList<Component> getChildren(){ return null; }

    public void printContent(Iterator<Component> iterator){ System.out.println(objectName); }

    public void add(Component newComponent){}

    public int getObjectWeight() { return objectWeight; }

    public String toString(){ return objectName; }

}
