// 接口
// public interface interfaceName {} 接口定义
// public class MyClass implements MyInterface{ } 接口实现

//一个抽象类中可以包含非抽象方法和字段，而接口中只能包含抽象方法和常量。接口用interface关键字修饰。
//接口跟抽象类一样，只有方法声明而没有实现，具体的实现是由实现该接口的类来完成的。
//在Java中，实现接口的类需要使用implements关键字来实现接口中的所有方法，实现的方法需要满足接口中定义的方法签名，即方法名、参数列表和返回类型都要与接口中的方法一致。
//与抽象类不同的是，一个类可以实现多个接口，但只能继承一个抽象类。另外，接口中的方法都是public的，不能有非public的方法。

public interface MyInterface {
    void name();//抽象方法 省略了public abstract的修饰
    default void sayHello(){ // 默认抽象方法
        System.out.println("hello everyBody");
    };
}