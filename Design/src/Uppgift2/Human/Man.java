package Uppgift2.Human;

public class Man extends Human {
    String name;

    public Man(String newName) {
        name = newName;

    }
    public String toString(){
        return "Jag är Man och heter " + name;
    }
}
