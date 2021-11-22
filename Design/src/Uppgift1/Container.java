package Uppgift1;

import java.util.ArrayList;

public class Container extends BagComponent {
    int containerWeight;
    String containerName;

    ArrayList<BagComponent> bagComponents = new ArrayList<>();

    public Container(String name, int weight){
        containerName = name;
        containerWeight = weight;

    }

    public void add(BagComponent newBagComponent) {
        bagComponents.add(newBagComponent);
    }

    public void remove(BagComponent newBagComponent) {
        bagComponents.remove(newBagComponent);
    }

    public int getWeight() {
        int totalWeight = containerWeight;

        for (BagComponent bagComponent : bagComponents) {
            totalWeight += bagComponent.getWeight();
        }
        return totalWeight;
    }

    public String toString() {

        StringBuilder outStr;

        outStr = new StringBuilder("\n" + containerName);

        for (BagComponent bagComponent : bagComponents) {
            outStr.append(bagComponent.toString());

        }
        return outStr.toString();
    }

}
