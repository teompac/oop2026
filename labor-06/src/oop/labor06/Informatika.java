package oop.labor06;

import java.util.ArrayList;

public class Informatika {
    private ArrayList<Diak> felvetelizok = new ArrayList<>();

    public void ujBeiratkozoDiak(Diak diak) {
        this.felvetelizok.add(diak);
    }

    public void listazOsszes(){
        for (Diak f:felvetelizok){
            System.out.println(f);
        }
    }
    public int felvetelizokSzama() {
        return this.felvetelizok.size();
    }

    public double felvetelizokAtlaga() {
        double sum=0;
        if(felvetelizokSzama()==0)
            return 0;

        for (Diak f:felvetelizok){
            sum+=f.atlag();
        }
        return sum/felvetelizokSzama();
    }
}