package chapter3.lecture3;

public class Box {
    double width;
    double height;
    double depth;

    // First Constructor we have created
//    public Box() {
//        System.out.println("Constructor is Created...");
//    }

    public Box() {
        this.width = 1;
        this.height = 1;
        this.depth = 1;
    }

    public Box(int width) {
        this.width = width;
        this.height = width;
        this.depth = width;
    }

    public Box(double width) {
        this.width = width;
        this.height = width;
        this.depth = width;
    }

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

//    public void setData(int width, int height, int depth) {
//        this.width = width;
//        this.height = height;
//        this.depth = depth;
//    }

    public void printBox() {
        System.out.println("Width = " + width + ", Height = " + height + ", Depth = " + depth + ", Volume = " + volume());

    }

    private double volume() {
        return width * height * depth;
    }
}
