package Extra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Container extends Component implements Iterable<Component> {

    ArrayList<Component> components = new ArrayList<>();
    String iteratorType;

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
        if(Objects.equals(iteratorType, "BF")){
            return new BFIterator(this);
        }
        return new DFIterator(this);
    }

    public Iterator<Component> createBFIterator(){
        iteratorType = "BF";
        return iterator();
    }

    public Iterator<Component> createDFIterator(){
        iteratorType = "DF";
        return iterator();
    }

    public void printContent(Iterator<Component> iterator){
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
