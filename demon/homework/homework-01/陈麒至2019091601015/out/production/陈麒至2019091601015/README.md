# 第一次作业

> this  is written in UTF-8, with JDK15 on ideal
> read me first

```
//---------------------------------------------------
//  attention: 
//      if the JDK vision is JDK 14 or less, there
//      will be an error in ./MyClass/MyClass.java,
//      for text blocks is not available. Just IGNORE
//---------------------------------------------------
```
- **具体详见源代码（陈麒至2019091601015.zip）**
1. MyClass
- 存放消费者（子类为平面消费者faltCosumer和立体消费者three_dComsumer）
- 主函数MyClass。其中依据输入来判断启动的线程（0为平面产品，1为三维产品,其他退出）
- store表示仓库类
- flatThread和three_dThread表示平面和立体的线程

2. product
- 存放产品(平面和三维)
- 平面产品类为抽象父类，子类通过继承来实现具体的方法和拥有具体的性质
- 立体产品类似平面产品，不作赘述