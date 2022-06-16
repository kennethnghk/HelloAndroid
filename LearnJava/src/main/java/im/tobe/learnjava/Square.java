package im.tobe.learnjava;

public class Square extends Rectangle {
    public Square(int length) {
        super(length, length);
    }

    public int getPerimeter() {
        return this.getWidth() * 4;
    }

    @Override
    public int getArea() {
        return super.getArea();
    }

    // overriding the Object class
    @Override
    public String toString() {
        return super.toString();
    }
}
