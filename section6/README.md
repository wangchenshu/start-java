# 來學 Java 趴6

## Section6

### Java 參考型別與操作物件

#### 使用物件參考
##### 建立遙控器的概念
> 要使用 "物件" 必須使用該物件的 "物件參考(object reference)變數" 或簡稱 "物件參考"
> 或 "參考變數"。
>
> 概念上類似我們使用 遙控器 由遠端操控 "電子產品"。

##### 由類別建構物件
> 建構物件有三個程序:
* 宣告
```java
// 語法:
Classname reference (物件參考名稱);
```
> 如:
```java
// Dog 為類別名稱, dog 為物件參考變數
Dog dog;
```
* 實例化
```java
// 語法:
new Classname();
```
> 如:
```java
// Dog 為類別名稱, 將使用該類別產生物件實例
new Dog();
```
* 將實例指定給物件參考, 完成初使化
```java
// 語法:
reference = new Classname();
```
> 如:
```java
// 因無法直接碰觸記憶體的 Dog 物件, 故使用物件參考 dog 來控制
dog = new Dog();
```
> 取得物件參考(object reference)後, 等同取得遙控器, 可以控制實例化時在記憶體產生的物件。
```java
int dogAge = dog.getAge();
dog.jump();
```
> Java 是重視型別的程式語言, 任何變數都需要宣告型別。

##### JVM 記憶體分類
> Java 記憶體分三大區塊
* Global(全域)
> 保存 static 的類別成員變數的地方
* Stack(堆疊)
  * 保存基本型別的變數和變數內容的地方
  * 保存參考型別的變數的地方
* Heap(堆積)
  * 保存參考型別的變數內容的地方

#### 使用 String 類別
> Java 的基本型別已經有字元(char), 但 char 只能使用單一字元,
> 相對於我們日常生活的使用, 如文章段落, 句子, 單字等, 都是至少2個以上字元組成,
> 有相當的落差。
> 基於這些原因, Java 特別提供 String 類別供程式設計師使用。
> 又因為 String 類別實在太常被使用, Java 更提供了一些特殊方式讓程式碼撰寫時使用
> String 更方便, 效能更好。

##### String 類別支援非標準的語法
> String 類別屬於參考型別, 使用時會產生物件。
> 為避免相同字串物件產生太多而造成記憶體空間浪費,
> Java 內建字串的快取(cache)機制, 將字串存在於 "字串池(String Pool)中,
> 讓相同字串可以在大部份情況下直接由字串池中重復取用且用畢返還,
> 避免內容相同的字串物件一再產生。
>
> String 物件可以不需要使用 "new" 關鍵字進行實例化, 改直接以類似宣告和初使 char
> 變數的方式進行, 這也是比較建議的方式。
> 若以這樣的方式生成字串物件, 則 Java 可以直接將變數指向字串池內相同內容的字串,
> 避免物件生成。如:
```java
char a = 'A';
String name1 = "Jack 這真是太神奇了!";
String name2 = "Jack 這真是太神奇了!";
```
> 在初使化 name1 變數時, Java 會先進行 String 物件的實例化, 即便沒有 "new" 關鍵字。
> 但初使化 name2 變數時, 因為字串池中已經有 "Jack 這真是太神奇了!" 字串的存在, 會直接
> 讓 name2 指向該已經生成的 "Jack 這真是太神奇了!" 字串, 不再新產生, 避免記憶體浪費。

##### String 類別是 immutable
> 要將字串相連, 是在使用字串時很常見的一個需求, 有兩種方式:
```java
// 範例:
String name1 = "Chance";
String name2 = name1 + " is my name";
String name3 = name1.concat(" is my name")
```

|         | 說明       |
|  ----   | ----      |
| 1 | 使用字面常量(String literal)時, 將自動生成 String Object |
| 2 | 使用運算子 "+" 讓字串相連  |
| 3 | 也可以使用 String 類別的內建方法 "concat" 讓字串相連 |

    必須注意的是, 因為字串是 "immutable(不可改變)", 字串相連並非讓 "原字串物件"
    連接新字串, 而是 將原字串複制一份 後再加上要相連的字串。
    所以 name2 和 name3 將參照到不同於 name1 的一個新記憶體位址。

##### String 類別的其他方法
> 另外, String 類別經常被使用, 它常用的內建方法也必須知道。
> 除了已知可以使用運算整 "+" 和方法 "concat" 讓字串相連外, 還有:
* 使用 length() 取得字串長度
* 使用 toUpperCase() 或 toLowerCase() 將字串內的字元轉換為全部大寫或全部小寫。
* 使用 trim() 去除字串前後空白
* 使用 substring() 由字串內取出部分字串
* 使用 endsWith() 判斷字串結尾

```java
// 範例:
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
// 以上會輸出:
//   My name is Chance Wang 
//   length: 12
//   chance wang is my name
//   Wang
//   true
```

#### 基本型別的包覆類別
##### 包覆類別的由來與使用
> 因為 Java 是物件導向的程式語言, 以參考型別為主:
> 因此, 在 java.lang 的套件下, 建立一套和八種基本型別對應的八個參考型別,
> 提供了基本型別常見的加減乘除四則運算, 比較等操作的替代方案。
> 因為特色在於將各自對應的基本型別視為核心, 將之以物件型態 "包覆",
> 也稱為基本型別的 "包覆類別(wrapper class)。 對應關係如下:

|  基本型別| 包覆型別   |
|  ----   | ----      |
| byte    | Byte      |
| short   | Short     |
| int     | Integer   |
| long    | Long      |
| float   | Float     |
| double  | Double    |
| char    | Character |
| boolean | Boolean   |

### 今天就到這裡囉
###### 寫寫打家, 打家 bye bye