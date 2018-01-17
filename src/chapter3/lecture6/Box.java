package chapter3.lecture6;

public class Box {

    private double width;
    private double height;
    private double depth;
    private double volume;

    // Empty Constructor
    public Box() {
        width = height = depth = 1;
        volume = volume();
    }

    // Cube Constructor
    public Box(double data) {
        width = height = depth = data;
        volume = volume();
    }

    // Main Constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        volume = volume();
    }

    public void print() {
        System.out.println("Width = " + width + ", Height = " + height + ", Depth = " + depth);
    }

    public void print(boolean isShow) {
        if (isShow) {
            System.out.println("Width = " + width + ", Height = " + height + ", Depth = " + depth + ", Volume = " + volume);
        }
    }

    private double volume() {
        return width * height * depth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public double getVolume() {
        return volume;
    }

    public void setWidth(double width) {
        this.width = width;
        volume = volume();
    }

    public void setHeight(double height) {
        this.height = height;
        volume = volume();
    }

    public void setDepth(double depth) {
        this.depth = depth;
        volume = volume();
    }
}
