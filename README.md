成员变量的构造函数更改，需要带着依赖方的代码也跟着改
```java
class B{
    int value;

    public B(int value) {
        this.value = value;
    }

}

class C{
    int d;
    String e;
    public C (int index,String value) {
        this.d = index;
        this.e = value;
    }
}


class A {
    B b;
    C c;

    public A() {
        b = new B(110);
//      b = new B();
        //c = new C(3);
//      c = new C("hello");
        c = new C(12,"hello");
    }
}
```
只要 B 或者 C 变动一次，A 就可能需要修改自己的代码，用专业术语描绘就是A 与依赖模块太过于耦合，