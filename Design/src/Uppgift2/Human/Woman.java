package Uppgift2.Human;

public class Woman extends Human{
    String name;

    public Woman(String newName) {
        name = newName;

    }

    public String toString(){
        return "Jag är Kvinna och heter " + name;
    }
}
