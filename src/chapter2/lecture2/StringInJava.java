package chapter2.lecture2;

public class StringInJava {
    public static void main(String[] args) {

//        char[] name = {'N', 'A', 'Y', 'E', 'M'};
//        String name3 = new String(name);
//        String name2 = name3;

//        byte[] bt = {65, 66, 67};
//        String str = new String(bt);
//        System.out.println(str);
        String str = "Java is Awesome";
        String str3 = "Java is Awesome";

        String str2 = new String("java is awesome");
        String str4 = new String("Java is Awesome");

        System.out.println(str2.equalsIgnoreCase(str));
    }
}
