package oop.labor02;

public class DateUtil {
    private int year;
    private int month;
    private int day;
    public DateUtil(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }

    public boolean lapYear(){
        return (year%4==0 && year%100!=0) || year%400==0;
    }
    public boolean isTrueDate(){
        if(year<=0)return false;
        if(month > 12 || month <= 0) return false;
        if((month == 4 || month == 6 || month == 9 || month == 11) && (day <= 0 || day >30))return false;
        if (lapYear()==false && month == 2 && day>28)return false;
        if(month == 2 && day >29)return false;
        if(day>31 || day <=0)return false;
        return true;
    }
}