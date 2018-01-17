package chapter3.lecture2;

public class Box {
    int width;
    int height;
    int depth;

    // Field
    // Constructor
    // Method



    public void setData(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void printBox() {
        System.out.println("Width = " + width + ", Height = " + height + ", Depth = " + depth + ", Volume = " + volume());

    }

    public int volume() {
        return width * height * depth;
    }
}
