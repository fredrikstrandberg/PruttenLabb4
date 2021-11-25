package Uppgift2;

public class NonBinary extends Human {
    public static Human create(String newName) {
        Human newHuman = new NonBinary();
        newHuman.setName(newName);

        System.out.println("Making NonBinary Human " + newName);
        return newHuman;
    }
    public String toString(){
        return "Jag är IckeBinär och heter " + getName();
    }
}