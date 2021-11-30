package Uppgift2.Human;

public class NonBinary extends Human {
    String name;

    NonBinary(String newName) {
        name = newName;
    }
    public String toString(){
        return "Jag är IckeBinär och heter " + name;
    }
}