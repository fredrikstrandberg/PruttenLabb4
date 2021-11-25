package Uppgift1;

import java.util.ArrayList;

public class Container extends Component{
    String objectName;
    int objectWeight;

    ArrayList<Component> components = new ArrayList<>();

    public Container(String newObjectName, int newObjectWeight){
        objectName = newObjectName;
        objectWeight = newObjectWeight;
    }

    public void add(Component newComponent){
        components.add(newComponent);
    }
    public void remove(Component curComponent){
        components.remove(curComponent);
    }

    public int getObjectWeight() {
        int totalWeight = objectWeight;
        for (Component component : components) {
            totalWeight += component.getObjectWeight();
        }
        return totalWeight;
    }

    public String toString(){
        StringBuilder contentString = new StringBuilder();
        contentString.append(objectName).append("\n");
        for (Component component : components) {
            contentString.append("\t").append(component.toString()).append("\n");
        }
        return contentString.toString();
    }


}
