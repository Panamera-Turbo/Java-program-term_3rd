package com.testPackage;

class  MyClass{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public MyClass(int age, String name) {
        this.age = age;
        this.name = name;
    }


}

public class test {
    public static void main(String[] args) {
        System.out.println("hello");
        String a = "test";
        System.out.println(a);
        MyClass m = new MyClass(1, "Jhon");
        if (true) {
            for (int i = 0; i < 100; i++) {
            }
        }
    }
}