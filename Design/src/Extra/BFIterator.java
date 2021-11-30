package Extra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class BFIterator implements Iterator<Component> {

    Stack<Component> compStack = new Stack<>();

    BFIterator(Component startComp){

        compStack.push(startComp);
    }

    public boolean hasNext() {
        return !compStack.isEmpty();
    }

    public Component next() {

        if (compStack.isEmpty()) {
            throw new NoSuchElementException();
        }
        Component node = compStack.pop();
        if (node != null) { //only if Composite.children has null
            if (node instanceof Container curComp) {
//                ArrayList<Component> components = node.getChildren();
//                compStack.addAll(components);
                addChildren(curComp);
            }
        }
        return node;
    }

    public void addChildren(Container curComp){
        for (Component component : curComp) {
            compStack.push(component);
        }
    }
}
