package Extra;

import java.util.Iterator;
import java.util.LinkedList;

public class BFIterator implements Iterator<Component> {
    LinkedList<Component> compList = new LinkedList<>();

    public BFIterator(Component startComp) {
        compList.push(startComp);
    }

    public boolean hasNext() {
        return !compList.isEmpty();
    }

    public Component next() {
        if (this.hasNext()) {
            Component next = compList.pop();
            addChildren(next);
            return next;
        }
        return null;
    }

    public void addChildren(Component curComp) {
        if (curComp.getChildren() != null) {
            compList.addAll(curComp.getChildren());
        }
    }
}
