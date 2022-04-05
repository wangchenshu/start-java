# 來學 Java 趴7

## Section7

### 使用選擇結構和相關運算子

#### 使用關係與條件運算子
##### 關係運算子
> Java 使用的關係(relational) 運算子及範例如下:

| 情境       | 運算子 | 範例                      |
| ----      | ----  | ----                      |
| 是否相等    | ==   | System.out.println(x == 3) |
| 是否不相等  | !=   | System.out.println(x != 3) |
| 是否小於    | <    | System.out.println(x < 3)  |
| 是否小於等於 | <=   | System.out.println(x <= 3) |
| 是否大於    | >    | System.out.println(x > 3)  |
| 是否大於等於 | >=   | System.out.println(x >= 3) |
##### 條件運算子
> Java 使用的條件(conditional) 運算子及範例如下:

| 情境    | 運算子 | 範例 (int x = 2, y = 5)                     |
| ----   | ----  | ----                      |
| 且(and) | &&   | System.out.println((x < 3) && (y > 1)) |
| 或(or)  | &#124;&#124;   | System.out.println((x < 1) &#124;&#124; (y > 3)) |
| 非(not) | !    | System.out.println(!(x < 1)) |

##### 字串比較
> 比較兩個字串是否相同時, 使用二種方式:
* 使用 "==" 比較字串是否 "指向相同記憶體位址"
* 使用 "equals()" 比較字串是否 "相同內容"

```java
// 範例:
public class TestEqual {
    public static void main(String[] args) {
        String name1 = "chance";
        String name2 = "chance";
        String name3 = new String("chance");

        // 使用 ==
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);

        // 使用 equals()
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
    }
}
// 以上會輸出:
     true
     false
     true
     true
```

### 使用 if 選擇結構
> if 選擇結構 有三種:

* 使用 if 關鍵字

```java
// 語法
if (boolean_expression) {
    code_block;
}
```

* 使用 if 關鍵字 + else 關鍵字

```java
// 語法
if (boolean_expression) {
    code_block;
} else {
    code_block;
}
```

* 使用 if 關鍵字 + else 關鍵字 + else if 關鍵字

```java
// 語法
if (boolean_expression) {
    code_block;
} else if (boolean_expression) {
    code_block;
} else {
    code_block;
}
```

```java
// 範例
public class TestIfElse {
    public static void main(String[] args) {
        int score = 80;

        if (score >= 90) {
            System.out.println("You got A.");
        } else if (score >= 80) {
            System.out.println("You got B.");
        } else if (score >= 70) {
            System.out.println("You got C.");
        } else if (score >= 60) {
            System.out.println("You got D.");
        } else  {
            System.out.println("You got F.");
        }
    }
}
```

### 使用三元運算子
> 三元(ternary) 運算子使用 "?" 和 ":" 等二個運算子將運算式切割為三個運算元,
> 故名三元運算子。

```java
// 語法
(boolean_expression) ? value if true : value if false
```

```java
// 範例
public class TestTernaryOperator {
    public static void main(String[] args) {
        int score = 90;

        // 使用三元運算子
        String grade = (score >= 90) ? "B" : "F";
        System.out.println("You got " + grade);

        // // 使用 if 選擇結構
        // if (score >= 90) {
        //     grade = "B";
        // } else {
        //     grade = "F";
        // }
        // System.out.println("You got " + grade);
    }
}
```

### 使用 switch 選擇結構
> 選擇結構除了使用 if 語法和三元運算子之外, switch 語法也是一個不錯的選擇。
> 相較於 if 選擇結構， switch 選擇結構的程式碼較工整, 一目了然。

```java
// 語法
switch (variable) {
    case literal_value:
        <code_block>
        [break;]
    case another_literal_value:
        <code_block>
        [break;]
    default:
        <code_block>
}
```

> 其中:
* variable: 準備要測試的變數。 變數型態可以是 byte, short, char, int 和 string。
  其中 String 是在 Java7 中新增的擴充。
* literal_value: 變數可能的值(字面常量)。
* defalut: 當 case 列舉的變數值都不滿足時, 則進入本程式區塊。 相當於 "if" 結構的 "else"。
* break: 非必要。 遇到 break 敘述將離開該 case 程式區塊。

> switch 選擇結構的執行方式是:
* 輸入 variable 後, 逐一比對每個 case 區塊的 literal_value。 若相同, 程式碼進入該 literal_value 所屬的 case 區塊。
* case 區塊內工作完成後, 預期應該要有 break 敘述, 讓程式碼跳出該 case 區塊。 若沒有 break 敘述,
  程式碼會往下開始逐行執行所有 case 區塊的程式碼, 直到遇到 break 敘述, 或是 switch 結構結束。

```java
// 範例
public class TestSwitch {
    public static void main(String[] args) {
        int score = 90;

        switch (score / 10) {
            case 9:
                System.out.println("You got A.");
                break;
            case 8:
                System.out.println("You got B.");
                break;
            case 7:
                System.out.println("You got C.");
                break;
            case 6:
                System.out.println("You got D.");
                break;
            default:
                System.out.println("You got F.");
       }
    }
}
```

### 今天就到這裡囉
###### 寫寫打家, 打家 bye bye