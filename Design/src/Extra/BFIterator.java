package Extra;

import java.util.Iterator;
import java.util.Stack;

public class BFIterator implements Iterator<Component> {
    Stack<Component> compStack = new Stack<>();

    BFIterator(Container startComp){
        addChildren(startComp);
    }

    public boolean hasNext() {
        return !compStack.isEmpty();
    }

    public Component next() {
        if(this.hasNext()){
            return compStack.pop();
        }
        return null;
    }

    public void addChildren(Container curComp){
        for (Component component : curComp) {
            compStack.push(component);
        }
    }
}
