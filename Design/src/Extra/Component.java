package Extra;

import javax.swing.text.AbstractDocument;
import java.util.ArrayList;
import java.util.Iterator;

abstract class Component {
    public String objectName;
    public int objectWeight;
    private ArrayList<Component> components = new ArrayList<>();

    public Component(){}

    public void printContent(Iterator<Component> iterator) {
    }

    //public void getContent(){} //vet ej om vi kan ha denna här

    public void add(Component newComponent){}
    public void remove(Component curComponent){}

    public int getObjectWeight() { return objectWeight; }
    public ArrayList<Component> getChildren (){
        return components;
    }
    public String toString(){ return objectName; }


}
