package oop.labor07;

public class Jarmu {
    public String rendszam,marka;
    public boolean kolcsonzott;
    public Jarmu(String rendszam, String marka){
        this.rendszam=rendszam;
        this.marka=marka;
        this.kolcsonzott=false;
    }

    public boolean isKolcsonzott() {
        return kolcsonzott;
    }

    public String getRendszam() {
        return rendszam;
    }

    public String getMarka() {
        return marka;
    }

    @Override
    public String toString() {
        return "Jarmu{" +
                "rendszam='" + rendszam + '\'' +
                ", marka='" + marka + '\'' +
                ", kolcsonzott=" + kolcsonzott +
                '}';
    }
}

