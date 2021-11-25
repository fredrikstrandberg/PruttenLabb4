package Uppgift2;

import java.util.Objects;

public abstract class Human {

    private String name;

    public String getName() { return name; }
    public void setName(String newName) { name = newName; }

    static Human create(String newName, String s) {
        String[] characters = s.split("");
        for(int i = 0; i < characters.length; i++) {
            String curChar = characters[i];
            if (i == 6 && !Objects.equals(curChar, "-")) {
                System.out.println("Incorrect personal number!");
            }
        }
        int genderNumber = Integer.parseInt(characters[9]);
        if(genderNumber == 0){  //NonBinary
            System.out.println("NonBinary " + characters[9]);
            return NonBinary.create(newName);
        }
        else
            if(genderNumber % 2 == 0){  //Woman
                System.out.println("Woman " + characters[9]);
                return Woman.create(newName);
            }
            else{   //Man
                System.out.println("Man " + characters[9]);
                return Man.create(newName);
            }

    }
    public String toString(){
        return "";
    }

}


