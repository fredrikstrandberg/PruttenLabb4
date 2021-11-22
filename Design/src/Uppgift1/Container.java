package Uppgift1;

import java.util.ArrayList;
import java.util.Objects;

public class Container extends Component{
    String objectName;
    int objectWeight;
    int totalWeight;
    ArrayList<Component> components = new ArrayList<>();


    public Container(String newObjectName, int newObjectWeight){
        objectName = newObjectName;
        objectWeight = newObjectWeight;
    }

    public String getObjectName() { return objectName; }
    public int getObjectWeight() { return objectWeight; }

    public void add(Component newComponent){
        components.add(newComponent);
    }

    public void showContent(){

        for (Component component : components) {

            totalWeight += getObjectWeight();

            if(component.getClass() == Container.class){
                System.out.println(component.getObjectName());
                component.showContent();
                totalWeight += component.getObjectWeight();
            }
            else{
                System.out.println(component.getObjectName());
                //totalWeight += component.getObjectWeight();
            }
            totalWeight += getObjectWeight();

        }
        System.out.println("Total weight of " + getObjectName() + ": " + totalWeight);

    }

}
