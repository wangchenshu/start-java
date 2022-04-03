package section4.src.main.java.com.my.service;

public class Dog {
    // 名字
    private String name;
    // 年齡 
    private int age;
    // 顏色
    private String color;

    // 無參數建構子
    public Dog() {}

    // 全參數建構子
    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    /**
     * 取得名字
     * @return 名字
     */
    public String getName() {
        return name;
    }

    /**
     * 設定名字
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 取得年齡
     * @return 年齡
     */
    public int getAge() {
        return age;
    }

    /**
     * 設定年齡
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 取得顏色
     * @return 顏色
     */
    public String getColor() {
        return color;
    }

    /**
     * 設定顏色
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
}
