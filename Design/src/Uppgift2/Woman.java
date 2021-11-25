package Uppgift2;

public class Woman extends Human{
    public static Human create(String newName) {
        Human newHuman = new Woman();
        newHuman.setName(newName);
        System.out.println("Making NonBinary Human " + newName);

        return newHuman;
    }
    public String toString(){
        return "Jag är Kvinna och heter " + getName();
    }
}
