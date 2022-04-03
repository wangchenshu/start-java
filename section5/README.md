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