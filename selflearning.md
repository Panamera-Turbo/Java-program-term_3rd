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
- 用static{‘’代码‘’}修饰
- 在声明时就会开始运行
- 只运行一次
- 非静态代码块会在每次new对象的时候先于构造方法运行




# o 面向对象核心技术

- 类来实现封装和隐藏

## 继承：
```
 child extend parents
```

- 继承后可以调用父类的方法等

- 方法的重写（覆盖）：
  - 在子类中保留父类成员方法，重新编写其实现内容，更改成员方法的存储权限，或是修改返回值类型
  
  - 重构是一种特殊的重写，只改变实现方法，其他不变

  - 修改方法的权限只能从小到大，方法的返回值只能是父类方法返回值的子类

  - super关键字：指代父类

- Object类：
  - java.lang.Object，所有类的父类

  - 包括equals(), toString(), clone(), finalize()等方法

  - 除final类型的方法（getClass(),notify(), notifyAll(), wait()等），其他方法都能被重写

  - 重要方法：
    - getClass():<br>返回对象执行时的class示例。常常联合getName()使用取得类的名称。也可与toString()连用
      ```
      getClass().getName()
      ```

    - toString():
      <br>返回String实例。常常重写toString()，为子类提供特定的输出模式。当这个类转换为字符串或与字符串连接时，将自动调用重写后的toString方法

    - equals():
      <br>比较两个对象的实际内容，即引用地址。要比较内容，需要重写该方法。

## 多态
- 一种定义，多种实现

- 方法的重载：
  <br>在一个类中多个同名方法，他们的参数个数或类型不同

- 向上转型：
  - 把子类对象赋值给父类类型的变量
  
  - 从较具体的类转换为较抽象的类，所以是安全的
  
  - 父类对象无法调用子类独有的属性或方法

- 向下转型：
  - 较抽象的类转换成较具体的类

  - 往往会出错

  - 为此需要将父类对象强制转换为子类对象，称为显式类型转换

- instanceof关键字
  - 当程序向下转型时，若父类不是子类对象的示例，就会发生CastException异常，故应用instanceof操作符完成。

  - instanceof判断一个类是否实现了某个接口，也可以用来判断一个示例对象是否是某个类
    ```
    my_object instanceof Example_Class
    ```
    my_object：某个类的对象引用
    <br>Example_Class
    <br>返回值为boolean类型，true说明my_object是Example_Class的实例对象


## 抽象类与接口
- 实际中，成将父类定义为抽象类，需要使用这个父类进行继承与多态处理。继承时，越是父类越抽象，抽象类可以不实例化，在具体的子类中再实例化

- 修饰：abstract关键字

- 构造方法不能定义为抽象方法

### 接口的声明及实现
- 接口是抽象类的延伸，可以视为纯粹的抽象类，接口中的所有方法都没有方法体。

- 使用interface关键字进行定义
  ```
  [修饰符] interface 接口名 [extends 父接口名列表]{
      [public] [static] [final] 常量;
      [public] [abstract] 方法;
  }

  //[ ]内为默认修饰符
  ```
  修饰符：可选，用于指定接口的访问权限，可选值为public或缺省（默认）
  <br>接口名：一般大写首字母

- 接口中定义的变量默认public static final的，故必须初始化并且不能被子类修改
  
- 接口中的方法都是抽象的，所有子类实现接口时必须实现接口中的所有方法
  
- 接口不能被实例化，没有构造方法

- 一个类实现一个接口可以用implements关键字
  ```
  public class my_class extends super_class implements Myinterface
  ```
  
- 接口也可以实现向上转型

- 多重继承
  - 利用接口可以实现多重继承
    ```
    public class my_class extends super_class implements Myinterface01, Myinterface02, Myinterface03{
      ···
    }
    ```

  - 若出现变量冲突：明确指定变量的接口，“接口名.变量”
    <br>若方法冲突，只需要实现一个方法即可

## 访问控制
- 访问控制符：
  - 主要有public。protected、private、default（缺省）等
    |     | public | protected | default | private |
    | --- | --- | --- | --- | --- |
    | 本类 | 可见 | 可见 | 可见 | 可见 | 
    |本类所在的包 | 可见 | 可见 | 可见 | 不可见
    | 其他包中的子类 | 可见 | 可见 | 不可见 | 不可见
    | 其他包中的非子类 | 可见 | 不可见 | 不可见 | 不可见 |

- **final**:
  - final class:class不能再派生子类
  - final int：数据不可改
  - final int method：方法不可覆盖

    - 空白的final可以且仅可以被构造函数赋值（没有被初始化的）



- **abstract**
  - 抽象类不可实例化，即不可new出来；但可以有构造函数（子类使用）
  - 只有抽象类才能有抽象方法
  - 抽象类里也可以有非抽象方法
  - 抽象方法没有具体的实现，要依靠子类对其补齐（可理解为覆盖，覆盖时不需要abstract）
  - static和abstract矛盾
  - private和abstract矛盾


- **Object**
  - java内置的类
  - Object类处于Java开发环境的类层次树的根部，处于Java类层的最高层的一个类，是所有类的超类。
  - 其它所有的类都直接或间接地为它的子类。
  - 该类定义了一些所有对象的最基本的状态和行为，包括与同类对象相比较，转化为字符串等

- 只有父类->子类可以强制类型转换，子类->父类不需要
  - 使用原则：
    1. 大部分顶级用public

    2. 若某个类只想被其子类重写，则用protected修饰

    3. 类中的大部分属性都应该用private修饰，除非设计static或类似全局变量的属性才考虑用public

    4. 只在本类中的方法用private


### 包


<br><br><br>

# 异常
- 分类：
  - Error：致命的
  - Exception：非致命，可以捕获处理使程序继续运行，可分为运行时异常和非运行时异常

## Exception
- 运行时异常：<br>
  RuntimeException类及其子类，一般由程序逻辑错误引起
  | 异常类 | 含义 |
  | --- | --- |
  | ArrayIndexOutOfBoundsException | 数组下标越界 |
  | ArithmeticException | 算数异常 |
  | ArrayStoreException | 数组包含不兼容的值的抛出异常 |
  | ClassCastException | 类型转换异常 |
  | FileSystemNotFoundException | 文件系统未找到异常 |
  | IllegalArgumentException | 非法参数 |
  | IndexOutOfBoundsException | |
  | NullPointerException | 空指针|
  //--------------------------------------------
  <br>// 书P192，待补充<br>
  //--------------------------------------------

- 非运行时异常：不处理就没法编译
  | 异常类 | 含义 |
  | --- | --- |
  | ClassNotFoundException | 未找到类 |
  | FileNotFoundException | 文件未找到 |
  | IOException | 输入输出流异常 |
  | TimeoutException | 操作超时 |
  | SQLException | 操作数据库异常 |

  - 对于非运行时异常，必须使用try···catch代码块处理或使用throw关键字抛出


## 异常捕获
1. try···catch代码块
    ```
    try{
      //程序代码块
    }
    catch(ExceptionType e1){
      //对e1的处理
    }
    catch(ExceptionType e){
      //对e的处理，常见有：
      //e.getMessage();     //有关异常的信息
      //e.toString();       //有关异常的类型与性质
      //e.printStackTrace() //获取异常发生时执行堆栈的内容
    }
    finally{
      //代码，可选。不论程序是否异常都会执行
      //常常放置一些诸如释放资源、关闭对象的代码
    }
    ```
    - 注意：使用多个catch时，父类异常必须在子类异常后
    - Exception是try块传给catch的类型，e是对象
    - 除非含有以下三种情况，否则finally都会执行
      1. finally里有异常
      2. 前面的代码使用了System.exit()推出程序
      3. 所在的线程死亡

2. 抛出异常
  - throws
    <br>通常在方法被声明时用来指定方法可能抛出的异常，多个异常可用逗号分隔
    ```
    [返回值类型] [方法名](参数表) throws [异常类型名] {
        //方法
    } 
    ```
    - 使用throws为方法抛出异常时，若子类继承父类，子类重写方法抛出的异常应是父类异常（或其子类），除非throws异常是RuntimeException

    - 若某方法抛出了异常，在调用时必须处理异常。若不想处理，可继续向上一级抛出，但最终必须处理

  - throw
    <br>通常在方法中制造一个异常，执行到throw时立即终止
    ```
    throw new [异常类型名](异常信息)
    ```

    - 通常用于在某种逻辑错误时人为抛出并终止

    - throw常常用来抛出自定义异常

  - throws和throw关键字的区别
     - throws用在方法声明后面，表示抛出异常，由方法调用者处理；throw用在方法体内，用来制造异常
     - throws声明抛出异常的类型，throw直接抛出异常实例
     - throws表示表现异常的可能，throw一定有异常


## 自定义异常
- 通过继承Exception类自定义异常
  1. 创建自定义类
  2. throw出异常对象
  3. 若在当前抛出异常的方法中处理异常，使用try···catch，否则在方法的声明处用throws关键字指明熬抛给方法调用者的异常，继续下一步
  4. 在出现异常方法的调用者中捕获、处理异常

###
- 不要过多使用异常
- 自定义异常可更详细的显示错误
- 避免使用catch(Exception e)，防止所有异常都采用相同的处理方式
- try···catch不能太大