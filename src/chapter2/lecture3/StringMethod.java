package chapter2.lecture3;

public class StringMethod {

    public static void main(String[] args) {

        String firstName = "Hasan Mahmud";
        String lastName = "Nayem";
        String lastname2 = "Nayem";
        int age = 22;
        String name = firstName + " " + lastName + " " + age;

        String str =  age + "";
        System.out.println(str);
        System.out.println(name);

        for (int i=0; i<firstName.length(); i++) {
            char ch = firstName.charAt(i);
            if (ch == 'a') {
                System.out.print(ch + " ");
            }
        }

        System.out.println(firstName.compareTo(lastName));
        System.out.println(lastName.compareTo(firstName));
        System.out.println(lastName.compareTo(lastname2));

        String fullName = firstName.concat(lastName);

        System.out.println(firstName.contains("san"));
        System.out.println(firstName.contains("HM"));
        System.out.println(firstName.contains("n M"));

        System.out.println(firstName.startsWith("Ha"));
        System.out.println(firstName.endsWith("du"));

        System.out.println(firstName.indexOf('a'));
        System.out.println(firstName.indexOf('a', 2));
        System.out.println(firstName.lastIndexOf('a'));

        String middleName = firstName.substring(6);
        System.out.println(middleName);

        char[] names = firstName.toCharArray();
        for (int i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println(firstName.toLowerCase());
        System.out.println(firstName.toUpperCase());

        String str2 = new String("Java");
        str2 = "Javascript";
        System.out.println(str);
    }
}
