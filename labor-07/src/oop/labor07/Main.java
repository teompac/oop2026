package oop.labor07;

public class Main {
    public static void main(String[] args) {
        JarmuPark park = new JarmuPark("jarmuvek.txt");
//        park.listaz();
        park.keres("EFG666");
        park.kolcsonzes("EFG666");
        park.keres("EFG666");
        park.visszavitel("EFG666");
        park.keres("EFG666");
        System.out.println("Autok szama:"+ park.autokSzama());

    }

}
