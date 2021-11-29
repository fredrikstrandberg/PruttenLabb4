package Extra;

import java.util.ArrayList;
import java.util.Iterator;

public class BFIterator implements Iterator<Component> {

    ArrayList<Component> components = new ArrayList<>();

    BFIterator(Component startComp){
        components.add(startComp);
    }


    public boolean hasNext() {
        return !components.isEmpty();
    }

    public Component next() {
        if(this.hasNext()){
            Component next = components.get(0);
            components.remove(0);
            return next;
        }

        return null;
    }
}
