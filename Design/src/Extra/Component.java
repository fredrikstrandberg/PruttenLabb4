package Extra;

import java.util.ArrayList;

abstract class Component {
    public String objectName;
    public int objectWeight;
    ArrayList<Component> components = new ArrayList<>();


    public Component(){}

    public ArrayList<Component> getChildren(){
        return components;
    }

    public void add(Component newComponent){}
    public void remove(Component curComponent){}

    public int getObjectWeight() { return objectWeight; }

    public String toString(){ return objectName; }

}
