package Uppgift2.Human;

public class NonBinary extends Human {
    String name;

    public NonBinary(String newName) {
        name = newName;
    }
    public String toString(){
        return "Jag är IckeBinär och heter " + name;
    }
}