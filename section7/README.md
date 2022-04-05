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