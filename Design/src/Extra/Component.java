package Extra;

abstract class Component {
    public String objectName;
    public int objectWeight;

    public Component(){}

    public void getContent(){} //vet ej om vi kan ha denna här

    public void add(Component newComponent){}
    public void remove(Component curComponent){}

    public int getObjectWeight() { return objectWeight; }

    public String toString(){ return objectName; }

}
