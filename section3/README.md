# 來學 Java 趴3

## Section3
### 不來了解些名詞, 怎麼學啊。

### Java 標識符
> Java 所有的組成部分都需要名字。類名、變量名以及方法名都被稱為標識符。

#### 關於 Java 標識符，有以下幾點需要注意：
* 所有的標識符都應該以字母（A-Z 或者 a-z）,美元符（$）、或者下劃線（_）開始
* 首字符之後可以是字母（A-Z 或者 a-z）,美元符（$）、下劃線（_）或數字的任何字符組合
* 關鍵字不能用作標識符
* 標識符是大小寫敏感的
* 合法標識符舉例：name、$age、_gender、__2_good
* 非法標識符舉例：888whoami、-whoru

```java
public class HelloNaming {
    public static void main(String[] args) {
        /** 變數命名 */
        String name = "Chance";
        System.out.println("My name: " + name);

        /** 變數命名 */
        int $age = 1;
        System.out.println("My age: " + $age);

        /** 變數命名 */
        char _gender = 'M';
        System.out.println("My gender: " + _gender);
    }
}
/**
 * 以上程式, 會輸出:
 * My name: Chance
 * My age: 1
 * My gender: M
 */
```
### Java修飾符
> 像其他語言一樣，Java可以使用修飾符來修飾類中方法和屬性。主要有兩類修飾符：

* 訪問控制修飾符:
> default, public , protected, private

* 非訪問控制修飾符:
> final, abstract, static, synchronized

### Java 變量
> Java 中主要有如下幾種類型的變量

* 局部變量
* 類變量（靜態變量）
* 成員變量（非靜態變量）

### Java 關鍵字
|  類別     | 關鍵字  |  說明   |
|  ----    | ----   | ----    |
| 訪問控制            | private       | 私有的   |
|                    | protected    | 受保護的  |
|                    | public       | 公共的    |
|                    | default      | 默認      |
| 類、方法和變量修飾符  | abstract     | 聲明抽象   |
|                    | class        | 類別      |
|                    | extends      | 擴充, 繼承 |
|                    | final        | 最終值, 不可改變的 |
|                    | implements   | 實現 (介面) |
|                    | interface    | 介面 |
|                    | native       | 本地, 原生方法（非 Java 實現）|
|                    | new          | 新, 創建 |
|                    | static       | 靜態 |
|                    | strictfp     | 嚴格, 精準 |
|                    | synchronized | 線程, 同步 |
|                    | transient    | 短暫, 瞬態 |
|                    | volatile     | 同步機制 |
| 程序控制語句         | break        | 跳出循環 |
|                    | case         | 定義一個值以供 switch 選擇 |
|                    | continue     | 繼續 |
|                    | default      | 默認 |
|                    | do           | 運行 |
|                    | else         | 否則 |
|                    | for          | 循環 |
|                    | if           | 如果 |
|                    | instanceof   | 實例 |
|                    | return       | 返回 |
|                    | switch       | 根據值選擇執行 |
|                    | while        | 循環 |
| 錯誤處理            | assert       | 斷言表達式是否為真 |
|                    | catch        | 捕捉異常 |
|                    | finally      | 有沒有異常都執行 |
|                    | throw        | 拋出一個異常對象 |
|                    | throws       | 聲明一個異常可能被拋出 |
|                    | try          | 捕獲異常 |
| 包相關              | import       | 引入 |
|                    | package      | 包   |
| 基本類型            | boolean      | 布林型   |
|                    | byte         | 字節型   |
|                    | char         | 字符型   |
|                    | double       | 雙精度浮點數   |
|                    | float        | 單精度浮點數   |
|                    | int          | 整數      |
|                    | long         | 長整數    |
|                    | short        | 短整數    |
| 變數引用            | super        | 父類, 超類 |
|                    | this         | 本類      |
|                    | void         | 無返回值   |
| 保留關鍵字           | goto         | 是關鍵字, 但不能使用 |
|                    | const        | 是關鍵字, 但不能使用  |

[也可以參考這裡](https://zh.m.wikibooks.org/zh-tw/Java/%E5%85%B3%E9%94%AE%E5%AD%97)

### Java 註釋
> 類似於 C/C++、Java 也支持單行以及多行註釋。註釋中的字符將被 Java 編譯器忽略。

```java
public class HelloWorld {
    public static void main(String[] args) {
        /**
         * 這是一個多行註釋
         * 這樣有了解嗎?
         */
       System.out.println("Hello, 123");

       // 這是一個單行註釋
       /** 這也是一個單行註釋 */
       System.out.println("Hello, 456");
    }
}
```

### 今天就到這裡囉
###### 寫寫打家, 打家 bye bye