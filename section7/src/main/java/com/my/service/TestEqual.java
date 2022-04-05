package main.java.com.my.service;

public class TestEqual {
    public static void main(String[] args) {
        String name1 = "chance";
        String name2 = "chance";
        String name3 = new String("chance");

        // 使用 ==
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);

        // 使用 equals()
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
    }
}
