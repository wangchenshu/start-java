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


##### 宣告類別:
> 使用關鍵字 class 宣告類別

```java
// 語法:
[modifiers] class class_identifier {
    class_code_block
}
// [modifiers] 是修飾詞, 非必要

// 範例:
public class Dog {

}
```

##### 宣告欄位:
> 類別內可以宣告欄位(fields), 但非必要
* 來自物件的屬性
* 屬性有值(value), 或狀態(state), 建立時必須宣告 "型別", 說明該欄位是何種型態。
  是整數? 浮點數? 或是其他?
* 宣告欄位時, 可以一併給值。

```java
// 範例:
public class Dog {
    // 名字
    private String name;
    // 年齡 (宣告時一併給值)
    private int age = 3;
    // 顏色
    private String color;
}
```

##### 宣告方法:
> 類別內可以宣告方法(methods), 但非必要
* 來自物件的行為
* 執行後, 結果可分成二種:
  * 有回傳 (return) 結果, 必須宣告其結果的 "型別"
  * 無回傳 (return) 結果, 必須宣告其結果為 "void"

```java
// 語法:
[modifiers] return_type method_identifier ([arguments]) {
    method_code_block
}

// 範例:
public class Dog {
    // 名字
    private String name;
    // 年齡
    private int age;
    // 顏色
    private String color;

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

##### 使用註解:
> 類別內可以使用註解(comments), 但非必要, 主要是用來說明程式內容,
> 讓其他程式人員可以了解前因後果或注意事項。程式執行時會自動略過。

```java
// 範例:
/**
 * 設定顏色
 * @param color
 */
public void setColor(String color) {
    // 設定顏色
    this.color = color;
}
```

##### 以下為完整, 程式碼範例:
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