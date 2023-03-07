Java势力：以其强大的实力和庞大的生态系统著称，在阿塞坞内有着广泛的支持者。但也因为其庞大而有些难以控制和协调，存在一些复杂的派系和利益关系。

### 组织架构：

> java基础
> 基础篇 基础语法 面向对象 集合框架 异常处理 重点知识
> 进阶篇 并发编程 JVM
>
> 企业级开发
> 基础篇 Maven Git Nginx Docker Postman
> 工具篇 IntelliJ IDEA 辅助工具
> 框架篇 SSM Spring Boot MyBatis Spring Cloud
> 安全篇 认证授权
> 分布式 RPC ZooKeeper
> 高性能 消息队列 读写分离 分库分表 负载均衡
> 高可用 限流 降级 熔断
> 实战篇 开源项目 问题解析
>
> 数据库 MySQL Redis
> 计算机基础 操作系统 计算机网络 数据结构与算法 设计模式

### java基础
#### 基础语法
##### 关键字
- abstract:用于声明抽象类，以及抽象方法。
- extends:用于继承类。
- final:用于指示变量不可更改。
- implements：用于接口的实现
- interface：用于接口声明
- native：用于指定一个方法是通过本机接口调用的（非java）
- transient:修饰的字段不会被序列化
- volatile：保证不同线程对它修饰的变量进行操作时的可见性，即一个现成修改了某个变量的值，新值对其他线程是立马可见的。

##### 数组&字符串
数组
> 初始化
    int[] anArray = new int[10];
    int[] anArray = new int[]{1,2,3,4,5,6}; 
>遍历
    int[] anArray = new int[]{1,2,3,4,5};
    
    for (int i = 0; i < anArray.length; i++) {
        System.out.println(anArray[i]);
    }
    for (int i : anArray) {
        System.out.println(anArray[i]);
    }
>打印
    一维数组 使用toString方法。二维数组 deepToString
List
> 初始化

    //数组转List
    int[] anArray = new int[]{1,2,3,4,5};

    // List中不能方基本数据类型，需要将int[] anArray 转为Integer[] 包装类型。
    Integer[] interArray = Arrays.stream(anArray).boxed().toArray(Integer[]::new);//
    List<Integer> list = new ArrayList<>();
    
    //方式1 遍历
    for (int i : anArray) {
        list.add(anArray[i]);
    }
    //方式2 静态工厂方法
    List<Integer> list2 = Arrays.asList(anArray);
集合框架
- Collection,主要由List Set Queue组成。
  - List代表有序、可重复集合，就是封装了动态数组的ArrayList和封装了链表的LinkedList; 
  - Set代表无序、不可重复集合，典型就是HashSet、TreeSet；Set集合底层都是Map来实现的。 
  - Queue代表队列，典型代表就是双端队列ArrayDeque,以及优先级队列PriorityQueue
- Map，键值对，iOS中的Dictory一致，键要求保持唯一性，值可以重复。典型代表就是HashMap

字符串
> 在java中字符串是对象，不能用==来表示是否相等，因为==比较的是内存地址，需要使用 compareTo() 或者 equals() 是不可变的。
> 在iOS中字符串也是对象，跟java一样不能使用 == 需要使用 isEqualToString 是可变的。
> swift中虽然字符串也是对象，但是本质是结构体，可以使用==运算符比较2个字符串是否相等。 是不可变的。

equals()、append()、contains()、split()

##### 其他
数据类型（基本数据类型，引用数据类型_数组_接口_类）、类型转换、运算符（算数，关系，位，逻辑，赋值，三元）、流程控制语句

#### 面向对象

类、方法、构造方法、继承、接口(抽象类中所有方法都是抽象的)、抽象(抽象类 抽象方法)、多态、权限修饰符
>方法

    实例方法（创建对象后调用）
    静态方法（static修饰可以类名直接调用）
    抽象方法（atstract修饰，继承抽象类重写来实现）
>构造方法

>抽象类
    

>接口
    Java 原则上只支持单一继承，但通过接口可以实现多重继承的目的。
    使某些实现类具有我们想要的功能
    实现多态
    
    策略模式 一对多，雇用了一批工人装修，可以多实现
    适配器模式 就是小区门口的快递驿站，不管什么快递他也接收，跟适配器一样可以适配不同国家插头，接口对接驿站，驿站对接我
    工厂模式 一对一实现
>内部类
    
    成员内部类
    局部内部类
    匿名内部类
    静态内部类
    Lambda表达式



#### 集合框架

List：ArrayList LinkedList Vector 和 Stack

Set: HashSet LinkedHashSet TreeSet

Queue:ArrayDeque LinkedList PriorityQueue

Map：HashMap LinkedHashMap TreeMap

集合数组遍历中删除元素时要使用迭代器方式。不然可能会发生ConcurrentModificationException问题


#### IO
IO 类很多，但核心的就是 4 个抽象类：InputStream、OutputStream、Reader、Writer。

>操作对象划分
    
    文件，数组，管道，基本数据类型，缓冲，打印，对象序列化/反序列化，转换

    File Path Paths Files


#### 异常
Exception Error checked unchecked throw throws try-catch-finally

#### 常用工具类
- Arrays
  

    copyOf copyOfRange fill() equals() sort() binarySearch() stream() toString() asList() setAll() 
    parallelPrefix()
    

- Collections


    reverse() shuffle() sort() swap() binarySearch(List list, Object key)
    max(Collection coll)
    max(Collection coll, Comparator comp)：根据自定义比较器，返回最大元素
    min(Collection coll)：返回最小元素
    min(Collection coll, Comparator comp)：根据自定义比较器，返回最小元素
    fill(List list, Object obj)：使用指定对象填充    
    frequency(Collection c, Object o)：返回指定对象出现的次数

    synchronizedList()    
    emptyXxx()：制造一个空的不可变集合
    singletonXxx()：制造一个只有一个元素的不可变集合
    unmodifiableXxx()：为指定集合制作一个不可变集合

    addAll(Collection<? super T> c, T... elements)，往集合中添加元素
    disjoint(Collection<?> c1, Collection<?> c2)，判断两个集合是否没有交集
- Hutool工具类

    
    Convert
#### 重要知识点

#### 网络编程

#### NIO

#### 并发编程

#### JVM

### 企业开发
#### 框架
### 数据库







