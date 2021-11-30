package Extra;

import java.util.Iterator;

public class Suitcase {

    public static void main(String[] args) {
        Container suitcase = new Container("Suitcase", 100);

        Container toiletBag = new Container("Toilet bag", 100);
        Container plasticBag = new Container("Plastic bag", 100);
        Container backpack = new Container("Backpack", 100);

        Container headphoneCase = new Container("Headphone case", 100);

        Leaf toothbrush = new Leaf("Toothbrush", 100);
        Leaf toothpaste = new Leaf("Toothpaste", 100);
        Leaf hairbrush = new Leaf("Hairbrush", 100);

        Leaf headphones = new Leaf("Headphones", 100);

        Leaf fruit = new Leaf("Fruit", 100);
        Leaf chocolate = new Leaf("Chocolate", 100);

        Leaf underwear = new Leaf("Underwear", 100);
        Leaf shirts = new Leaf("Shirts", 100);
        Leaf pants = new Leaf("Pants", 100);



        suitcase.add(toiletBag); suitcase.add(plasticBag); suitcase.add(backpack);  // add Containers to suitcase
        suitcase.add(underwear); suitcase.add(shirts); suitcase.add(pants);         // add Leafs to suitcase

        toiletBag.add(toothbrush); toiletBag.add(toothpaste); toiletBag.add(hairbrush); // add Leafs to toilet bag

        backpack.add(headphoneCase);    // add Container to backpack
        headphoneCase.add(headphones);  // add Leaf to headphone case

        plasticBag.add(fruit); plasticBag.add(chocolate); // add Leafs to plastic bag

        Iterator<Component> BF = new BFIterator(suitcase);
        System.out.println("\nBredden först:");
        suitcase.printContent(BF);

        Iterator<Component> DF = new DFIterator(suitcase);
        System.out.println("\nDjupet först:");
        suitcase.printContent(DF);
    }
}
