package human.human;

public abstract class Human {
    public static Human create(String name, String pnr) {
        char decidingChar = pnr.charAt(9);
        int decidingNumber = Character.getNumericValue(decidingChar);

        if (decidingNumber == 0) {
            return new NonBinary(name);
        } else if (decidingNumber % 2 == 0) {
            return new Woman(name);
        } else {
            return new Man(name);
        }
    }
}
