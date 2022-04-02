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
[可以參考這裡](https://zh.m.wikibooks.org/zh-tw/Java/%E5%85%B3%E9%94%AE%E5%AD%97)

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