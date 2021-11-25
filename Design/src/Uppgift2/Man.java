package Uppgift2;

public class Man extends Human {
    public static Human create(String newName) {
        Human newHuman = new Man();

        newHuman.setName(newName);
        System.out.println("Making Man Human " + newName);
        return newHuman;
    }
    public String toString(){
        return "Jag är Man och heter " + getName();
    }
}
