package cirkle;

public class Cirkle {
    private double radius;

    public Cirkle (double r){
        this.radius = r;
    }

    public double getAreaCirkle(){
        return Math.PI*Math.pow(radius,2);
    }

    public double getAreaSphere(){
        double area = 4*Math.PI*Math.pow(radius,3);
        area = area / 3;
        return area;
    }
}
