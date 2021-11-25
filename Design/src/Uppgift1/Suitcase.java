package Uppgift1;

public class Suitcase {

    public static void main(String[] args) {
        Component suitcase = new Container("Suitcase", 100);

        Component toiletBag = new Container("Toilet bag", 100);
        Component plasticBag = new Container("Plastic bag", 100);
        Component backpack = new Container("Backpack", 100);

        Component headphoneCase = new Container("Headphone case", 100);

        Component toothbrush = new Leaf("Toothbrush", 100);
        Component toothpaste = new Leaf("Toothpaste", 100);
        Component hairbrush = new Leaf("Hairbrush", 100);

        Component headphones = new Leaf("Headphones", 100);

        Component fruit = new Leaf("Fruit", 100);
        Component chocolate = new Leaf("Chocolate", 100);

        Component underwear = new Leaf("Underwear", 100);
        Component shirts = new Leaf("Shirts", 100);
        Component pants = new Leaf("Pants", 100);



        suitcase.add(toiletBag); suitcase.add(plasticBag); suitcase.add(backpack);  // add Containers to suitcase
        suitcase.add(underwear); suitcase.add(shirts); suitcase.add(pants);         // add Leafs to suitcase

        toiletBag.add(toothbrush); toiletBag.add(toothpaste); toiletBag.add(hairbrush); // add Leafs to toilet bag

        backpack.add(headphoneCase);    // add Container to backpack
        headphoneCase.add(headphones);  // add Leaf to headphone case

        plasticBag.add(fruit); plasticBag.add(chocolate); // add Leafs to plastic bag


        System.out.println(suitcase);
        System.out.println(suitcase.getObjectWeight());
        headphoneCase.remove(headphones);
        System.out.println(suitcase);
        System.out.println(suitcase.getObjectWeight());
    }
}
