package Uppgift2.Human;

public abstract class Human {

    Human(){};

    public static Human create(String newName, String s) {
        String[] characters = s.split("");
        int genderNumber = Integer.parseInt(characters[9]);
        if(genderNumber == 0){  //NonBinary
            return new NonBinary(newName);
        }
        else
            if(genderNumber % 2 == 0){  //Woman
                return new Woman(newName);
            }
            else{   //Man
                return new Man(newName);
            }

    }

}


