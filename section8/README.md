# 來學 Java 趴8

## Section8

### 陣列

### 一維陣列與二維陣列
#### 陣列簡介
> 使用陣列之前, 必須先知道陣列的基本定義:
* 陣列(Array) 是一種 "容器物件(container object)", 可以裝載 多個 且 單一型態
  的基本型別 / 參考型別
* 陣列裡的內容物, 稱為成員(element)
* 建立陣列時, 必須指定長度, 亦即 "成員數量"; 一旦建立, 長度就不能改變
* 陣列的成員, 使用數字化的 "索引(index)" 存取; 第一個成員的 index 為 0
  根據陣列的定義, 可以知道陣列用於處理多個同種物件或基本型別變數

#### 認識並建立一維陣列
> Java 提供陣列將 "相同型態" 的 "物件或基本型別" 的變數集中一起管理
> 陣列建立時要指定長度(length), 一旦建立後就不能改變
> 建立完成後, 使用 index 存取陣列成員

    陣列也是物件, 因此建立陣列的完整程序也分成三部份:

##### 第一部份: 宣告 (Declaring)
```java
// 語法:
type [] array_identifier;
// type: 陣列的成員型別
// []: 表示宣告陣列
// array_identifier: 陣列名稱
```

如宣告成員為基本型別的陣列:
```java
char[] chars;
int[] ints;
```

##### 第二部份: 建構實例 (Instantiating)
```java
// 語法:
array_identifier = new type [length];
// array_identifier: 陣列名稱
// type: 陣列的成員型別
// length: 陣列長度
```
如:
```java
chars = new char[10];
ints = new int[5];
strings = new String[8];
shirts = new Shirt[4];
```

##### 第三部份: 初使化 (Initializing)
```java
// 語法:
array_identifier[index] = value;
// array_identifier: 陣列名稱
// index: 成員位置, 由 0 開始, 最大為 長度 - 1
// value: 值
```
如:
```java
ints[0] = 0;
ints[1] = 2;
ints[2] = 4;
ints[3] = 8;
ints[4] = 6;
```

也可以將前述三個部份, 即宣告, 實例化及初使化, 一起完成:
```java
// 語法:
type[] array_identifier = {成員以 "," 區隔}
```
如:
```java
int[] ints = {1, 3, 5, 7, 9};
String[] strings = {"Hi, ", "I", "am", "Chance"};
```

```java
// 範例:
public class TestArrayInit {
    public static void main(String[] args) {
        // 宣告 (Declaring)
        int[] ints;

        // 建構實例 (Instantiating)
        ints = new int[5];

        // 初使化 (Initializing)
        ints[0] = 0;
        ints[1] = 2;
        ints[2] = 4;
        ints[3] = 8;
        ints[4] = 6;

        // 宣告, 實例化及初使化, 一起完成
        int[] nums = {1, 3, 5, 7, 9};
        String[] strings = {"Hi", "I", "am", "Chance"};

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(strings));
    }
}
```