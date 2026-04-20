public class AUTO {
    public int motor,lo;
    public String marka;

    public AUTO(int motor,int lo,String marka){
        this.motor=motor;
        this.lo=lo;
        this.marka=marka;
    }
    public int getMotor(int motor){
        return motor;
    }

    public int getLo() {
        return lo;
    }

    public String getMarka() {
        return marka;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public void setLo(int lo) {
        this.lo = lo;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return marka + " " + motor + " " + lo;

    }
}