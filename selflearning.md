# o 数据类型
| 分类     | 类型                                         |
| -------- | -------------------------------------------- |
| 整数     | byte, short, int（默认）, long（l）          |
| 小数     | double（d，默认） ，float（f）               | 、 |
| 字符     | char                                         |
| 转义字符 | \ddd，\uxxxx, \', \", \\, \t, \n, \r, \f, \b |
| 布尔     | true false                                   |

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

# o 字符串
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
  - 返回都是boolean类型
  
  - 判断开头是否含有指定前缀startWith(String prefic)
    ```
    str.startWith(prefix);
    // str：任意字符串
    // prefix：前缀字符串
    ```

  - 判断从指定位置开始有无指定前缀startWith(String prefix, int toffset)
    ```
    str.startWith(prefix, index);
    // str：任意字符串
    // prefix：前缀字符串
    // index: 开始位置
    ```

  - 判断结尾是否含有指定前缀endWith(String suffix)
    ```
    str.endWith(suffix);
    // str：任意字符串
    // suffix：后缀字符串
    ```

- 获取字符数组（从101页开始看）

















# o 面向对象基础
## 类与对象
### 成员变量：
   > 数据类型 变量名 (= 值);
  
### 成员方法
  > [ 权限修饰符 ] [ 返回值类型 ] 方法名 ( [参数类型 参数名 ] ) [throw 异常类型] {<br>
  >    函数体    
  >    return 返回值 ;<br>
  > }

  - 权限修饰符：public，private， protected 或缺省
     
  - 参数：
    1. 值参数：<br>实参与形参之间传值调用，对形参的计算不改变实参
    2. 引用参数：<br>实参是数组或其他引用类型，方法中对参数的修改会影响原有的数组或引用类型
    3. 不定长参数：<br>若在声明方法时有若干同类型参数，可定义为不定长参数：<br>
        > 权限修饰符 返回值类型 方法名(参数类型... 参数名)<br>//注意：参数类型后面是三个点和一个空格，如 int... x

### 构造方法
  - 构造方法是与类同名的方法 ，对象的创建通过构造方法完成。每当类实例化一个对象，类都会自动调用构造方法

  - 特点：
     1. 没有返回类型，也不能定义为void
     2. 名称和类相同
     3. 作用：完成对象的初始化，把定义对象的参数传给对象成员
     4. 可有参数

   - 如果没有明确定义构造方法，编译器会自动创建一个不带参数的默认构造方法

   - 可以用public或private修饰。用private时，不能用new创建对象，需要创建静态public方法return new类的对象

### 局部变量：略

### 对象销毁：
  - 自动识别：由new产生的，当超过作用范围或被置为null
   
  - finalize()：Object类，protected。可以自己定义，在垃圾回收时会被首先调用。在下一次垃圾回收时才会真正回收被对象占用的内存
     
  - 垃圾回收不受人为控制，具体事件也不确定，甚至可能不发生。因此，Java提供了System.gc()强制回收垃圾


### this关键字
  - 引用本类的对象
     
  - 调用类的成员变量和成员方法
     
  - 调用类中的构造方法
     
  - 作方法的返回值


## static关键字
- 修饰类的静态成员

### 静态变量
- 共享的变量用static修饰，即静态变量

- 同一个类的不同实例对象若共用同一个静态变量，则一个类将其改变，另一个类静态变量也随之改变

- 当类首次被加载时，静态变量就被分配到内存中，知道程序结束才释放

### 静态常量
- 用final static修饰
- 可以被多个类共享

### 静态方法
- 无法或不想创建类的对象时，使用静态方法
- 调用类的静态方法，无需创建类的对象

### 静态代码块
- 用static{$代码$}修饰
- 在声明时就会开始运行
- 只运行一次
- 非静态代码块会在每次new对象的时候先于构造方法运行




# 面向对象核心技术

