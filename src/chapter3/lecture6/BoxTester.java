package chapter3.lecture6;

public class BoxTester {
    public static void main(String[] args) {

        Box box = new Box(4, 5, 6);
        Box box1 = new Box();

        box.print();
        box1.print();
        System.out.println("Total Volume = " + (box.getVolume() + box1.getVolume()));

        box1.setWidth(3);
        box1.setHeight(4);
        box1.setDepth(2);
        box1.print(true);
        System.out.println("Total Volume = " + (box.getVolume() + box1.getVolume()));
    }
}
