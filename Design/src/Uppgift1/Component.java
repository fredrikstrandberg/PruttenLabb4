package Uppgift1;

abstract class Component {
    public String objectName;
    public int objectWeight;

    public void add(Component newComponent){}
    public void remove(Component curComponent){}

    public int getObjectWeight() { return objectWeight; }

    public String toString(){ return objectName; }

}
