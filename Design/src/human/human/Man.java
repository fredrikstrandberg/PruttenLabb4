package human.human;

public class Man extends Human {
    String personName;

    Man(String name){
        personName = name;
    }

    public String toString() {
        return "Jag är man och heter " + personName + '\n';
    }
}
