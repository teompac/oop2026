package lab10_2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static void main() {
        ArrayList<MyDate> dates = new ArrayList<>();
        dates.add( new MyDate(2026,4,28));
        dates.add( new MyDate(2026,1,1));
        dates.add( new MyDate(2026,1,5));
        dates.add( new MyDate(2026,2,28));
        dates.add( new MyDate(2025,1,1));
        Collections.sort(dates);
        System.out.println(dates);
    }
}
