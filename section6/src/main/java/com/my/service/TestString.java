package section6.src.main.java.com.my.service;

public class TestString {
    public static void main(String[] args) {
        // My name
        String name = "Chance Wang ";
        System.out.println("My name is " + name);

        // length()
        int length = name.length();
        System.out.println("length: " + length);

        // trim()
        name = name.trim();

        // toLowerCase()
        String lowerCaseName = (name + " Is My Name").toLowerCase();
        System.out.println(lowerCaseName);

        // substring()
        String lastName = name.substring(7);
        System.out.println(lastName);

        // endsWith()
        boolean end = name.endsWith("Wang");
        System.out.println(end);
    }
}
