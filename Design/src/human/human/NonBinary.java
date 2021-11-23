package human.human;

private class NonBinary extends Human {
    String personName;

    private NonBinary(String name){
        personName = name;
    }

    public String toString() {
        return "Jag är icke-binär och heter " + personName + '\'';
    }
}
