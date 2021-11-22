package Uppgift1;

public class SuitCaseGenerator {
    public static void main(String[] args){
        BagComponent suitCase = new Container("resväska", 5000);
            BagComponent jeans = new Stuff("jeans", 800);
            BagComponent jumper = new Stuff("tröja", 400);


            BagComponent necessar = new Container("Necessär", 300);
                BagComponent tandborste = new Stuff("tandborste", 50);
                BagComponent soap = new Stuff("tvål", 150);
                BagComponent toothpaste = new Stuff("tandkräm", 150);
                BagComponent pouch = new Container("påse", 800);
                    BagComponent clips = new Stuff("hårspännen", 10);

            BagComponent wallet = new Container("plånbok", 150);
                BagComponent penny = new Stuff("mynt", 50);
                BagComponent cash = new Stuff("cash", 50);

        suitCase.add(jeans);
        suitCase.add(jumper);
        suitCase.add(necessar);
        suitCase.add(wallet);

        necessar.add(tandborste);
        necessar.add(soap);
        necessar.add(toothpaste);
        necessar.add(pouch);

        pouch.add(clips);

        wallet.add(penny);
        wallet.add(cash);

        System.out.println(suitCase);
        System.out.println(suitCase.getWeight());

    }
}
