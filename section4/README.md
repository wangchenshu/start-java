# 來學 Java 趴4

## Section4

### Java 類別與物件

#### Java 作為一種面向對象語言, 支持以下基本概念:
* 多型
* 封装
* 繼承
* 抽象
* 類
* 對象
* 實例
* 方法
* 重載

#### 那什麼是物件?
> 物件, 其實和我們日常生活常見的 "東西" 意思雷同。
> 例如: 你問某人說, 你今天帶什麼東西來參加聚會呢?
> 當使用 "東西" 這個詞時, 幾乎無所不指。
> 萬物皆可使用這個名詞帶過, 不管是抽象還是實體的。

* 物件可以是實體或是抽象的
* 物件具備 屬性(特性)
* 物件具備 行為(方法)

> 例如: 動物(class), 具體的狗或貓可以是動物的對象(object)

#### Java 中的對象
> 如果以狗來舉例的話, 它會有:
* 屬性: 名字, 年齡, 品種, 顏色
* 行為: 叫, 跑, 跳

    狗(類):
        博美狗(對象):
            名字: 小美
            年齡: 3歲
            品種: 博美
            顏色: 白色

```java
// Dog.java 狗的類
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
```

```java
// 主方法 MyClass.java
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
// 以上會輸出:
//   我的名字: 漢堡
//   我的年齡: 3 歲
//   我的顏色: 白色
```

    這樣, 大家對於物件, 對象比較有概念了嗎?
    說沒有的, 去跑個 3 圈, 再回來。

### 今天就到這裡囉
###### 寫寫打家, 打家 bye bye