package encapsulation;

public class Rectangle {

    int length;
    int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void getAria(){
        System.out.println("1. Aria: " + length*width);
    }

    public  int getAria1(){
        return length*width;
    }




}
