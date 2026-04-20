package oop.labor02;

public class Rectangle {
    private double lenght = 2;
    private double width = 1;

    public Rectangle(double l, double w){
        if(l > 0 && w>0) {
            lenght = l;
            width = w;
        }
    }

    public double getWidth(){
        return width;
    }

    public double getLenght(){
        return lenght;
    }
    public double area(){
        return lenght * width;
    }
    public double perimeter(){
        return 2*lenght+2*width;
    }
}
