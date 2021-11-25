package human.human;

public class Woman extends Human {
    String personName;

    Woman(String name){
        personName = name;
    }

    public String toString() {
        return "Jag är kvinna och heter " + personName + '\n';
    }
}
