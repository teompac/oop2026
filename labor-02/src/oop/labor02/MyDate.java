package oop.labor02;

public class MyDate {
    public int year,month,day;
    public MyDate(int y,int m,int d){
        year=y;
        month=m;
        day=d;
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
