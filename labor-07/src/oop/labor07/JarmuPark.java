package oop.labor07;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class JarmuPark {
    private ArrayList<Jarmu> jarmuvek = new ArrayList<>();

    public JarmuPark(String filename) {
        readJarmu(filename);
    }
    public void ujJarmu (Jarmu jarmu){
        this.jarmuvek.add(jarmu);
    }
    public void listaz(){
        for(Jarmu d:jarmuvek){
            System.out.println(d);
        }
    }
    public Jarmu keres(String rendszam){
        for(Jarmu d:jarmuvek){
            if(d.rendszam.equals(rendszam)){
                System.out.println(d);
            }
        }
        return null;
    }
    public Jarmu kolcsonzes(String rendszam){
        for(Jarmu d:jarmuvek){
            if(d.rendszam.equals(rendszam)){
                d.kolcsonzott=true;
            }
        }
        return null;
    }
    public void visszavitel(String rendszam){
        for(Jarmu d:jarmuvek){
            if(d.rendszam.equals(rendszam)){
                d.kolcsonzott=false;
            }
        }
    }
    public int autokSzama(){
        int db=0;
        for(Jarmu d:jarmuvek){
            if(d instanceof Auto){
                db++;
            }
        }
        return db;
    }
    public int motorokSzama(){
        int db=0;
        for(Jarmu d:jarmuvek){
            if(d instanceof Motorbicikli){
                db++;
            }
        }
        return db;
    }

    public void readJarmu(String filename) {

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String tipus = items[0].trim();
                String rendszam = items[1].trim();
                String marka = items[2].trim();
                if (tipus.equalsIgnoreCase("Auto")) {
                    int utasszam = Integer.parseInt(items[3].trim());
                    jarmuvek.add(new Auto(rendszam, marka, utasszam));
                } else {
                    String mtip = items[3].trim();

                    jarmuvek.add(new Motorbicikli(rendszam, marka, mtip));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
