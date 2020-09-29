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
    > for(循环变量x : 遍历对象obj)
    > {
    >    ....    
    > }

- break只能跳出一层循环

<br>

# o 数组
## 初始化
- > eg: int[] array, int array[], double array[9]
- 分配空间 <br>
> int[] array = new int[19]<br>
> int[] array = new int[] { q, w, f}<br>
> int[][] array = new int[2][] ----(可以不写列)<br>
> int[][] array = new int[][] {{1,2,3}, {1,2,3}}
## 性质
- 长度：array.length

- 填充和替换<br>
    > // Array是java.util.Arrays类
    <br>**Array.fill(int[] array, int value)** 
    <br>// 批量填充
    <br>
    <br>**Array.fill(int[] array, int fromIndex, int toIndex, int value)**
    <br>// array:待填充数组
    <br>// fromIndex：要填充给的第一个元素索引
    <br>// toIndex：要填充给的最后一个元素索引（不含）
    <br>value：值

- 复制：<br>
    > **Array.copyOf(array, int newlength)**
    <br>// newlength:复制后新数组的长度。若大于原数组，用0（整形数组）或null（char数组）填充; 若小于原数组，多余部分被舍去
    <br>
    <br>**Array.copyOfRange(arr, int fromIndex, int toIndex)**
    <br>// arr:复制的对象
    <br>// fromIndex: 开始复制的位置，注意范围
    <br>// toIndex: 结束复制的位置，可以大于arr的长度。新数组不含toIndex位置的元素

- 排序：<br>
    > **Array.sort(arr)**
    <br>// 对arr静态排序


# 字符串
- 声明：双引号赋值