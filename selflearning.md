# o 数据类型
| 分类 | 类型 |
| ---- | ---- |
| 整数 | byte, short, int（默认）, long（l） |
| 小数| double（d，默认） ，float（f） |、
|字符 | char |
| 转义字符 | \ddd，\uxxxx, \', \", \\, \t, \n, \r, \f, \b |
| 布尔 | true false |

- 转换：
  - 隐式
  - 显示：如（类型名）要转换的值

<br>

# o 运算符
- 位运算符：& , | , ~(取反) , ^(异或) , <<(左移) , >>(右移) , >>>(无符号右移)
- 复合运算符：略。注意如'>>=' 、 '<<='

<br>

# o 流程控制
- switch现在可以支持int和string
- foreach：简化的for，但是不能取代for
  - 语法：
    ``` 
    for(循环变量x : 遍历对象obj)
    {
        ....    
    }
    ```

- break只能跳出一层循环

<br>

# o 数组
## 初始化
- eg: int[] array, int array[], double array[9]
- 分配空间
  ```
  int[] array = new int[19]
  int[] array = new int[] { q, w, f}
  int[][] array = new int[2][] ----(可以不写列)
  int[][] array = new int[][] {{1,2,3}, {1,2,3}}
  ```
## 性质
- 长度：array.length

- 填充和替换<br>
    ```
    // Array是java.util.Arrays类
    Array.fill(int[] array, int value)
    // 批量填充
    
    Array.fill(int[] array, int fromIndex, int toIndex, int value)
    // array:待填充数组
    // fromIndex：要填充给的第一个元素索引
    // toIndex：要填充给的最后一个元素索引（不含）
    // value：值
    ```

- 复制：
    ```
    Array.copyOf(array, int newlength)
    // newlength:复制后新数组的长度。若大于原数组，用0（整形数组）或null（char数组）填充; 若小于原数组，多余部分被舍去

    Array.copyOfRange(arr, int fromIndex, int toIndex)
    // arr:复制的对象
    // fromIndex: 开始复制的位置，注意范围
    // toIndex: 结束复制的位置，可以大于arr的长度。新数组不含toIndex位置的元素
    ```
- 排序：
    ```
    Array.sort(arr)
    // 对arr静态排序
    ```

# 字符串
- 双引号

- 引用常量：直接赋值
- new：
  ```
  String a = new String("abcdef");
  ```
- 利用字符数组创建
  ```
  charp[] arr = {'a', 'b', 'c'} ;
  String a = new String(arr);
  ```

## 连接字符串：
- “ + ” ， “ += ”
- concat()
    ```
    old_str.concat(new_str);
    //old_str: 原字符串
    //new_str: 新拼接的字符串
    ```

- 字符串被拼接后，原字符串不会消失，而是产生新的拼接串

- 连接其他类型（例如int、float等）会自动调用方法toString()

## 字符串信息
- 长度：str.length()  
  - //注意这里有括号

- 获取指定字符：
  ```
  str.charAt(index)
  //str：字符串对象
  //index：char值的索引
  ```

- 获取子字符串索引位置
  1. indexOf(String str)：返回参数字符串首次出现的位置。若没有，返回-1
      ```
      str.indexOf(substr);
      ```

  2. indexOf(String str, int fromIndex)：从fromIndex开始搜索，返回参数字符串首次出现的位置。若没有，返回-1
      ```
      str.indexOf(substr, fromIndex);
      ``` 

  3. public int lastIndexOf(String str)：返回指定子串在此字符串最右边出现处的索引
      ```
      str.lastIndexOf(substr);
      ```

  4. lastIndexOf(String str, int fromIndex)：返回子串在此字符串的中最后一次出现的索引，从fromIndex开始**反向搜索**
      ``` 
      str.lastIndexOf(substr, fromIndex);
      ```

- 判断字符串首尾内容