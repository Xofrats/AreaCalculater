package firkant;

public class Firkant {

    private int height;
    private int width;
    private int length;

    public Firkant(int h, int w, int l){
        this.height = h;
        this.width = w;
        this.length = l;
    }

    public Firkant(int h, int w){
        this.height = h;
        this.width = w;

    }

    public int getArea(){
        if (length == 0){
            return height*width;
        } else {
            return height*width*length;
        }
    }
}
