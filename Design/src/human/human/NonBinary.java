package human.human;

public class NonBinary extends Human {
    String personName;

    NonBinary(String name){
        personName = name;
    }

    public String toString() {
        return "Jag är icke-binär och heter " + personName + '\n';
    }
}
