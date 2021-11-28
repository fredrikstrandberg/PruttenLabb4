package Extra;

import java.util.*;

abstract class Component {
    public String objectName;
    public int objectWeight;

    public Component(){}

    public void add(Component newComponent){}
    public void remove(Component curComponent){}

    public int getObjectWeight() { return objectWeight; }

    public String toString(){ return objectName; }

}
