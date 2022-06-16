package im.tobe.learnjava;

public class Rectangle {
    // instance variables / properties / fields
    private int width;
    private int height;

    // overloading constructor, have the flexibility to init without parameters
    public Rectangle() {}

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int length) {
        this.width = length;
        this.height = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        System.out.println("at getArea");
        return this.width*this.height;
    }
}
