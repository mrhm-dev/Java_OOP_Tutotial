package chapter2.lecture6;

public class WhyStringBuffer {

    public static void main(String[] args) {

//        String str = "I Love Bangladesh. ";
//        String result = "";
//
//        long start = System.currentTimeMillis();
//        for (int i=0; i<50000; i++) {
//            result += str;
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);

        StringBuffer buffer = new StringBuffer();
        String str = "I Love Bangladesh. ";

        long startB = System.currentTimeMillis();
        for (int i=0; i<500000; i++) {
            buffer.append(str);
        }
        long endB = System.currentTimeMillis();

        System.out.println(endB - startB);
        System.out.println(buffer);

    }
}
