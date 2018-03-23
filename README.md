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

@Component和@Inject只能写在自己的package中，无法通过这两种方式引入第三方library
第三方library的module需要提供一个


```
Error:(24, 8) 错误: dagger.internal.codegen.ComponentProcessor was unable to process this class because not all of its dependencies could be resolved. Check for compilation errors or a circular dependency with generated code.
```
这是最经常出现的错误

在MainActivity中将某个成员变量添加@Inject修饰，那么所有调用XXXComponent.inject(MainActivity)的component都需要具有提供这种成员变量的能力
假如该Component不具备这种能力，可以在该Component的头部添加
> @Component(dependencies = HttpComponent.class,modules = HttpModule.class)  //这样的注解，类似于告诉Annotation Processor去dependencies所描述的那个class里面去获取依赖



class的构造函数可以有很多，但同时只能有一个打上@Inject的标识.
比如这样就会编译不通过
```java
public class Customer {

    String name;
    int Id;

    @Inject
    public Customer(String name,int id) {
        this.name = name;
        this.Id = id;
    }

    @Inject
    public Customer() {
    }
}
```
Error:(22, 12) 错误: Types may only contain one @Inject constructor.

通常我们希望达到的效果是在Activity中调用XXXComonent.inject(this)方法，像这样
```java

@Inject
OkHttpClient mClient

oncCreate(){
    MyComponent component = DaggerMyComponnet.inject(this);
    //这样mClient就不为Null了
}
```
Dependency inject的一个好处就是把需要的一些资源的创建从Activity或者我们需要使用的地方，丢到其他地方


```java
@Component(modules = CustomerModule.class)
public interface CustomerComponet {
    void Inject(SecondActivity activity);
     void inject(Customer message); //可以Component的接口中添加返回值void，入参为Module提供的对象的方法
     Customer emitCustomer(); //外部调用component.emitCustomer就能获得一个初始化好了的Customer;
}

```

同时有Inject的构造函数和Provide的module的时候，优先使用provide提供的