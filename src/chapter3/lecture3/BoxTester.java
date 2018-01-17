package chapter3.lecture3;

public class BoxTester {
    public static void main(String[] args) {
//        Box box = new Box();

//        new Box();

        Box box = new Box(10, 5, 3);
        Box box1 = new Box(5.6);
        Box box2 = new Box(5);
        box.printBox();
        box.depth = 5;


        box.printBox();
    }
}
