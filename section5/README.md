# 來學 Java 趴5

## Section5

### Java 基本型別, 變數和常數

#### 何謂變數
    在數學上, 我們有聽過變數:
    以前老師會在黑版上寫下題目, x 是一個變數,
    要你籍由 "=" 左右兩邊相同的前提, 計算出 x 的數值。

    那現在, 程式語言裡, x 還是變數, 但不用思考 x 是多少。
    通常都是由我們直接給 x 某個數值, 請電腦做一些運算。

    人腦比較聰明, 計算數學時不需要事先告知變數的 "型別" 是屬於整數(integer)
    或是浮點數(floating)。
    但使用 Java 進行運算時, 因為不同 "型別" 的變數在電腦中將使用不同大小的記憶體空間,
    所以必須先在程式碼中透過 "宣告" 的方式明確告知電腦在程式中使用的變數的 "型別",
    這樣電腦才能有效率分配合適的記憶體空間進行計算。

> 變數宣告型別後, 可以一直 "改變" 數值, 故名 "變數"。

```java
// 範例:
public class TestVar {
    public static void main(String[] args) {
        // x 是變數名稱, 0 是賦予該變數的數值
        int x = 0;
        System.out.println("x = " + x);

        // 重新賦予該變數新的數值
        x = 1;
        System.out.println("x = " + x);
    }
}
```

> 在 Java 領域裡, 型別分二大類:
* 基本型別 (Primitive Type):
  變數用於數學基礎運算, 邏輯判斷, 字元處理等。
  將在本章節介紹。
* 參考型別 (Reference Type):
  變數用於物件導向程式設計裡的物件(objects) 儲存。
  將在之後章節介紹。

#### Java 的基本型別
> Java 的基本型別分為四類, 共八種, 如下:

|  類型           | 型別   |  位元組(bytes)   | 位元數(bits)  | 最小值 | 最大值 |
|  ----          | ----   | ----            | ----         |  ---- |  ---- |
| 整數 Integral   | byte   | 1               | 8            | -128  | 127   |
|                | short  | 2               | 16            | -2<sup>15</sup>  | 2<sup>15</sup>-1 |
|                | int    | 4               | 32            | -2<sup>31</sup>  | 2<sup>31</sup>-1 |
|                | long   | 8               | 64            | -2<sup>63</sup>  | 2<sup>63</sup>-1 |
| 浮點數          | float  | 單精確度, 32-bit 浮點數 |         | 依 IEEE 754 標準   |  |
| Floating point | double | 雙精確度, 64-bit 浮點數 |         | 依 IEEE 754 標準   |  |
| 字元 Textual    | char   | 2               | 16           | '\u0000'- '\uffff'|  |
| 布林值 Logical  | boolean | 1               | 8           | true, false        |  |

#### Java 字面常量
> 如果在程碼中直接寫下 " 1, 1.0, 3.14159, 'T' " 這樣的數值或文字,
> 未經過變數的宣告與初使化, 這類數值或文字就稱之為 "字面常量/常數" (Literal constant)
> 可以是:
* 字元
* 字串
* 整數: 預設 int, 若背後緊接 l 或 L, 表示 long 型別
* 浮點數: 預設 double, 若背後緊接 f 或 F, 表示 float 型別
* 符號
* true / false

    字面常量一旦執行生成, 因為無法反覆使用, 就只能等待被回收, 如:
```java
public class TestLiteralConstant {
    public static void main(String[] args) {
      System.out.println('A');
      System.out.println("Hello");
      System.out.println(123);
      System.out.println(3.14);
      System.out.println("+");
      System.out.println(true);
    }
}
```

#### 使用變數的目的
> 假設要寫一支程式來計算圓周長和圓面積, 暫時先不使用變數, 如:
```java
public class TestWithoutVar {
    public static void main(String[] args) {
        // 給一個半徑 (r = 5), 計算其圓周 => PI * 2r
        System.out.println("圓周 = " + 3.14159 * 2 * 5);
        // 給一個半徑 (r = 5), 計算其面積 => PI * r * r
        System.out.println("面積 = " + 3.14159 * 5 * 5);
        // 半徑變2倍, 計算其圓周
        System.out.println("圓周 = " + 3.14159 * 2 * (2*5));
        // 半徑變2倍, 計算其面積
        System.out.println("面積 = " + 3.14159 * (2*5) * (2*5));
    }
}
```
    可以發現一些問題:
        1. 程式裡有很多 "字面常量" 反覆出現
        2. PI = 3.14159, 打多次很容易打錯
        3. 半徑變2倍, 就程式架構看不太出來(如果沒有注解的話)
        4. 以後若要改半徑, 要改很多地方(有可能漏改, 錯改都會造成 bug)

> 改用變數後, 如:

```java
public class TestWithVar {
    public static void main(String[] args) {
        final double PI = 3.14159;
        int r = 5;
        // 給一個半徑 (r = 5), 計算其圓周 => PI * 2r
        System.out.println("圓周 = " + PI * 2 * r);
        // 給一個半徑 (r = 5), 計算其面積 => PI * r * r
        System.out.println("面積 = " + PI * r * r);

        // 半徑變2倍, 計算其圓周
        r = 10;
        System.out.println("圓周 = " + PI * 2 * r);
        // 半徑變2倍, 計算其面積
        System.out.println("面積 = " + PI * r * r);
    }
}
```

#### 變數與常數
> 字面常量 不需經過 "宣告" 即可在程式中使用, 但無法追踨及繼續使用。
    變數(Variable) 因為會隨程式執行而變動, 為了追踨及繼續使用, 需要經過 "宣告" 程序:
* 定義一個英文名稱代表該變數, 以小寫開頭。若是使用複合字, 為了清楚區隔每個單字,
  則第二個以後的單字都大寫開頭, 就是 "駝峰命名原則"。
* 定義其資料型別。
* 若變數是類別的欄位, 可以再加上修飾詞(modifiers)。
```java
int i; // 宣告一個整數變數
double d; // 宣告一個雙精度浮點數變數
float a = 1, b = 2; // 同時宣告多個變數屬同一型別, 型別不重複
```
> 經過宣告後, 系統就會配置一塊記憶體空間供其使用。

    有時候一旦將數值指定給變數之後, 就 "不允許再改變", 可以在宣告變數時使用
    final 關鍵字來限定。
    如果程式中有其他程式碼試圖改變這個變數, 編譯器會先檢查出這個, 例如:
```java
final double PI = 3.14159;
PI = 123.456; // compile error !
```

#### 使用運算子
##### 常用的運算子
> 使用算術運算子

|  運算子 | 運算子意義  | int a = 2, b = 1;  | 運算結果  |
|  ----  | ----      | ----               | ----     |
| +      | 加法       | a + b              | 3       |
| -      | 減法       | a - b              | 1       |
| *      | 乘法       | a * b              | 2       |
| /      | 除法       | a / b              | 1       |
| %      | 取餘數     | a % b              | 1       |

> 使用簡潔運算子

|  運算子 | 原式       | 簡潔運算式 |
|  ----  | ----      | ----      |
| +=     | a = a + b | a += b    |
| -=     | a = a - b | a -= b    |
| *=     | a = a * b | a *= b    |
| /=     | a = a / b | a /= b    |
| %=     | a = a % b | a %= b    |

> 使用遞增 / 遞減 運算子

|  運算子 | 意義       | int i = 3, j = 0;  | 結果  |
|  ----  | ----      | ----               | ----  |
| ++     | 變數值加 1 | i++                | i = 4, j = 0 |
| --     | 變數值減 1 | i--                | i = 2, j = 0 |
|        |           | j = i++            | i = 4, j = 3 |
|        |           | j = ++i            | i = 4, j = 4 |
|        |           | j = i--            | i = 2, j = 3 |
|        |           | j = --i            | i = 2, j = 2 |

### 今天就到這裡囉
###### 寫寫打家, 打家 bye bye