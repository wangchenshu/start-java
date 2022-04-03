package section4.src.main.java.com.my.service;

public class MyClass {
    public static void main(String[] args) {
        // 建立一個狗的實例
        Dog dog = new Dog();

        /** 以下設置屬性 */
        /** 名字屬性 */
        dog.setName("漢堡");
        /** 年齡屬性 */
        dog.setAge(3);
        /** 顏色屬性 */
        dog.setColor("白色");

        System.out.println("我的名字: " + dog.getName());
        System.out.println("我的年齡: " + dog.getAge() + " 歲");
        System.out.println("我的顏色: " + dog.getColor());
    }    
}
