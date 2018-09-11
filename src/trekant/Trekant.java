package trekant;

public class Trekant {

    private double height;
    private double width;
    private double length;

    public Trekant(double h, double w, double l){
        this.height = h;
        this.width = w;
        this.length = l;
    }

    public Trekant(double h, double w){
        this.height = h;
        this.width = w;

    }

    public double getArea(){
        double area;
        if (length == 0){
            area = height * width;
            area = area/2;

            return area;
        } else {
            area = length * width * height;
            area = area/3;
            return area;
        }
    }
}
