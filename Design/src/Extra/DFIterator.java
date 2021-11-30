package Extra;

import java.util.Iterator;
import java.util.Stack;

public class DFIterator implements Iterator<Component> {
    Stack<Component> compStack = new Stack<>();

    public DFIterator(Component startComp) {
        compStack.push(startComp);
    }

    public boolean hasNext() {
        return !compStack.isEmpty();
    }

    public Component next() {
        if (this.hasNext()) {
            Component next = compStack.pop();
            addChildren(next);
            return next;
        }
        return null;
    }

    public void addChildren(Component curComp) {
        if (curComp.getChildren() != null) {
            compStack.addAll(curComp.getChildren());
        }
    }
}
