package oop.labor07;

    public class Auto extends Jarmu {
        public int utasszam;

        public Auto(String rendszam, String marka, int utasszam) {
            super(rendszam, marka);
            this.utasszam = utasszam;
        }

        @Override
        public String toString() {
            return "Auto{" +
                    "utasszam=" + utasszam +
                    ", rendszam='" + rendszam + '\'' +
                    ", marka='" + marka + '\'' +
                    ", kolcsonzott=" + kolcsonzott +
                    '}';
        }
    }
