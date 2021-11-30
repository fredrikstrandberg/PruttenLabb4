package Extra;

import java.util.ArrayList;
import java.util.Iterator;

public class Container extends Component implements Iterable<Component> {

    ArrayList<Component> components = new ArrayList<>();

    public Container(String newObjectName, int newObjectWeight){
        objectName = newObjectName;
        objectWeight = newObjectWeight;
    }
    public ArrayList<Component> getChildren(){
        return components;
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

    public Iterator<Component> iterator() {
        return new BFIterator(this);
    }

    public void printContent(Iterator<Component> iterator){
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
