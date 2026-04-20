package oop.labor06;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Informatika info = new Informatika();
        Diak diak1 = new Diak("Mezei", "Mária", 7.56, 8.78);
        info.ujBeiratkozoDiak(diak1);
        Diak diak2 = new Diak("Asztalos", "Imre", 8.45, 7.25);
        info.ujBeiratkozoDiak(diak2);
        info.listazOsszes();
        System.out.println("****");
        ArrayList<Diak> diakok = readDiak("diak.txt");
        for (Diak d : diakok) {
            info.ujBeiratkozoDiak(d);
            if (d.atlag() > 8)
                System.out.println(d);
        }
        System.out.println("****");
        System.out.println("Felvetelizok szama: " + info.felvetelizokSzama() + " Atlag: " + info.felvetelizokAtlaga());
        for (Diak d:diakok){
            if(d.getKnev().equals("Anna")){
                System.out.println("helyes");
            }
        }
    }

    public static ArrayList<Diak> readDiak(String filename) {
        ArrayList<Diak> diakok = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {
                String vnev = scanner.next();
                String knev = scanner.next();
                double erettsegi = scanner.nextDouble();
                double matematika = scanner.nextDouble();
                diakok.add(new Diak(vnev, knev, erettsegi, matematika));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return diakok;
    }
}
