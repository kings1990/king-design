# 设计模式

[![Build Status](https://travis-ci.com/kings1990/king-design.svg?branch=master)](https://travis-ci.com/kings1990/king-design) ![](https://img.shields.io/badge/language-java-orange.svg)

## 0.目录

- 创建型模式(creational)
  * 简单工厂(simplefactory)
  * 动态工厂(dynamic)
  * 抽象工厂(abstract)
  * 单例模式(singleton)
  * 建造者模式(builder)
  * 原型模式(prototype)


- 结构型模式(structure)
  * 适配器模式(adaptor)
  * 桥接模式(bridge)
  * 组合模式(composite)
  * 装饰器模式(decorate)
  * 外观模式(facecade)
  * 享元模式(flyweight)
  * 代理模式(proxy)


- 行为型模式(behaviour)
  * 责任链模式(chainrespon)
  * 命令模式(commond)
  * 解释器模式(interpreter)
  * 迭代器模式(iterator)
  * 中介者模式(mediator)
  * 备忘录模式(memento)
  * 观察者模式(observer)
  * 状态模式(state)
  * 空对象模式(null object)
  * 策略模式(strategy)
  * 模板模式(template)
  * 访问者模式(visitor)


## 1.介绍

### 1.1 创建型模式(creational)

> 简单工厂模式/静态工厂模式(factory/simplefactory)

```

优点：
1.将创建实例的工作与使用实例的工作分开，使用者不必关心类对象如何创建，实现了解耦
2.把初始化实例时的工作放到工厂里进行，使代码更容易维护。 更符合面向对象的原则 & 面向接口编程，而不是面向实现编程
3.通过引入配置文件，可以在不修改任何客户端代码的情况下更换和增加新的产品类，在一定程度下提高了灵活性

缺点：
1.工厂类集中了所有实例(产品)的创建逻辑，一旦这个工厂不能正常工作，整个系统都会受到影响；
2.违背“开放 - 关闭原则”，一旦添加新产品就不得不修改工厂类的逻辑，这样就会造成工厂逻辑过于复杂。
3.简单工厂模式由于使用了静态工厂方法，静态方法不能被继承和重写，会造成工厂角色无法形成基于继承的等级结构。

使用场景：客户如果只知道传入工厂类的参数，对于如何创建对象的逻辑不关心时；
当工厂类负责创建的对象(具体产品)比较少时
```

> 工厂模式(factory/dynamic)

让实例化推迟到子类

```
优点： 

1.一个调用者想创建一个对象，只要知道其名称就可以了。 
2.扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。 
3.屏蔽产品的具体实现，调用者只关心产品的接口。

缺点：
1每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。

使用场景： 

1.日志记录器：记录可能记录到本地硬盘.系统事件.远程服务器等，用户可以选择记录日志到什么地方。 
2.数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。 
3.设计一个连接服务器的框架，需要三个协议，"POP3"."IMAP"."HTTP"，可以把这三个作为产品类，共同实现一个接口。

注意事项：作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。
```

> 抽象工厂(factory/abstract)

**将压力分配到具体的工厂**

```
优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。

缺点：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码
```

> 单例模式(singleton)

```
优点：
1.在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例(比如管理学院首页页面缓存)。
2.避免对资源的多重占用(比如写文件操作)。
缺点：没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化。

使用场景：
1.要求生产唯一序列号。
2.WEB 中的计数器，不用每次刷新都在数据库里加一次，用单例先缓存起来。
3.创建的一个对象需要消耗的资源过多，比如 I/O 与数据库的连接等。

注意事项：getInstance() 方法中需要使用同步锁 synchronized (Singleton.class) 防止多线程同时进入造成 instance 被多次实例化
```

> 建造者模式(builder)

**相比工厂模式更加关注构建的细节**

lombok @Builder使用的就是建造者模式

```
优点： 

1.建造者独立，易扩展。 
2.便于控制细节风险。
缺点： 

1.产品必须有共同点，范围有限制。 
2.如内部变化复杂，会有很多的建造类。

使用场景： 

1.需要生成的对象具有复杂的内部结构。 
2.需要生成的对象内部属性本身相互依赖。

注意事项：与工厂模式的区别是：建造者模式更加关注与零件装配的顺序
```

> 原型模式(prototype)

```
优点： 

1.性能提高。 
2.逃避构造函数的约束。
缺点： 

1.配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类不是很难，但对于已有的类不一定很容易，特别当一个类引用不支持序列化的间接对象，或者引用含有循环结构的时候。

使用场景： 
1.资源优化场景。 
2.类初始化需要消化非常多的资源，这个资源包括数据.硬件资源等。 
3.性能和安全要求的场景。 
4.通过 new 产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。
5.一个对象多个修改者的场景。
6.一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以考虑使用原型模式拷贝多个对象供调用者使用。 
7.在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过 clone 的方法创建一个对象，然后由工厂方法提供给调用者。原型模式已经与 Java 融为浑然一体，大家可以随手拿来使用。

注意事项：与通过对一个类进行实例化来构造新对象不同的是，原型模式是通过拷贝一个现有对象生成新对象的。浅拷贝实现 Cloneable，重写，深拷贝是通过实现 Serializable 读取二进制流。
```


### 1.2 结构型模式(structure)

#### 总结

```
适配器:接口兼容问题
桥接:桥接属性，构建不同维度的对象
组合:忽略整体-细节部分，创建层次分明的对象
装饰:动态地未已有接口添加新行为
外观:一键啥啥啥
享元:共享对象的部分相似特效，优化内存，高度重用
代理:让自己的亲兄弟为自己办事
```

> 适配器模式(adaptor)

```
优点： 

1.可以让任何两个没有关联的类一起运行。 
2.提高了类的复用。 
3.增加了类的透明度。 
4.灵活性好。

使用场景：有动机地修改一个正常运行的系统的接口，这时应该考虑使用适配器模式。

注意事项：适配器不是在详细设计时添加的，而是解决正在服役的项目的问题
```

源码参考
**RequestMappingHandlerAdapter.handleInternal(464)->invokeHandlerMethod(543)->  
ServletInvocableHandlerMethod.invokeAndHandle(52)->InvocableHandlerMethod.invokeForRequest(54)-->getMethodArgumentValues(62)**


> 桥接模式(bridge)

```
优点： 

1.抽象和实现的分离。 
2.优秀的扩展能力。 
3.实现细节对客户透明。

缺点：桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。

使用场景： 

1.如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系。 
2.对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。 
3.一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。

注意事项：对于两个独立变化的维度，使用桥接模式再适合不过了。
```

个人理解：

```
适配器模式是已有2个的两个接口，让他们相容
桥接模式是分离抽象化和实现，使两者的接口可以不同，目的是分离
桥接是先有桥，才有两端的东西
适配是先有两边的东西，才有适配器
```

> 组合模式(composite)

```
应用实例： 
1.算术表达式包括操作数.操作符和另一个操作数，其中，另一个操作符也可以是操作数.操作符和另一个操作数。 
2.在 JAVA AWT 和 SWING 中，对于 Button 和 Checkbox 是树叶，Container 是树枝。

优点： 

1.高层模块调用简单。
2.节点自由增加。

缺点：在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。

使用场景：部分.整体场景，如树形菜单，文件.文件夹的管理。

注意事项：定义时为具体类。
```

> 装饰器模式(decorate)

```
应用实例： 
1.孙悟空有 72 变，当他变成"庙宇"后，他的根本还是一只猴子，但是他又有了庙宇的功能。 
2.不论一幅画有没有画框都可以挂在墙上，但是通常都是有画框的，并且实际上是画框被挂在墙上。在挂在墙上之前，画可以被蒙上玻璃，装到框子里；这时画.玻璃和画框形成了一个物体。

优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。

缺点：多层装饰比较复杂。

使用场景： 

1.扩展一个类的功能。 
2.动态增加功能，动态撤销。

注意事项：可代替继承
```

> 外观模式(facecade)

```
应用实例： 
1.去医院看病，可能要去挂号.门诊.划价.取药，让患者或患者家属觉得很复杂，如果有提供接待人员，只让接待人员来处理，就很方便。
2.JAVA 的三层开发模式。

优点： 

1.减少系统相互依赖。 
2.提高灵活性。 
3.提高了安全性。

缺点：不符合开闭原则，如果要改东西很麻烦，继承重写都不合适。

使用场景： 

1.为复杂的模块或子系统提供外界访问的模块。
2.子系统相对独立。 
3.预防低水平人员带来的风险。

注意事项：在层次化结构中，可以使用外观模式定义系统中每一层的入口。
```

> 享元模式(flyweight)

```
应用实例： 
1.JAVA 中的 String，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池里面。 
2.数据库的数据池。

优点：大大减少对象的创建，降低系统的内存，使效率提高。

缺点：提高了系统的复杂度，需要分离出外部状态和内部状态，而且外部状态具有固有化的性质，不应该随着内部状态的变化而变化，否则会造成系统的混乱。

使用场景： 
1.系统有大量相似对象。 2.需要缓冲池的场景。

注意事项： 
1.注意划分外部状态和内部状态，否则可能会引起线程安全问题。 2.这些类必须有一个工厂对象加以控制。
```

> 代理模式proxy

```
应用实例：  
1.Windows 里面的快捷方式。  
2.猪八戒去找高翠兰结果是孙悟空变的，可以这样理解：把高翠兰的外貌抽象出来，高翠兰本人和孙悟空都实现了这个接口，猪八戒访问高翠兰的时候看不出来这个是孙悟空，所以说孙悟空是高翠兰代理类。 
3.买火车票不一定在火车站买，也可以去代售点。 
4.一张支票或银行存单是账户中资金的代理。支票在市场交易中用来代替现金，并提供对签发人账号上资金的控制。 
5.spring aop。

优点： 

1.职责清晰。 
2.高扩展性。 
3.智能化。

缺点： 

1.由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢。 
2.实现代理模式需要额外的工作，有些代理模式的实现非常复杂。

使用场景：按职责来划分，通常有以下使用场景： 

1.远程代理。 
2.虚拟代理。 
3.Copy-on-Write 代理。 
4.保护(Protect or Access)代理。 
5.Cache代理。 
6.防火墙(Firewall)代理。 
7.同步化(Synchronization)代理。 
8.智能引用(Smart Reference)代理。

注意事项： 
1.和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。 2.和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制。
```

### 1.3 行为型模式(behaviour)

> 责任链模式(chainrespon)

```
应用实例： 
1.红楼梦中的"击鼓传花"。 
2.JS 中的事件冒泡。 
3.JAVA WEB 中 Apache Tomcat 对 Encoding 的处理，Struts2 的拦截器，jsp servlet 的 Filter。

优点： 

1.降低耦合度。它将请求的发送者和接收者解耦。 
2.简化了对象。使得对象不需要知道链的结构。 
3.增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任。 
4.增加新的请求处理类很方便。

缺点： 

1.不能保证请求一定被接收。 
2.系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用。 
3.可能不容易观察运行时的特征，有碍于除错。

使用场景： 

1.有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定。 
2.在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。 
3.可动态指定一组对象处理请求。

注意事项：在 JAVA WEB 中遇到很多应用。
```

> 命令模式(command)

```
应用实例：struts 1 中的 action 核心控制器 ActionServlet 只有一个，相当于 Invoker，而模型层的类会随着不同的应用有不同的模型类，相当于具体的 Command。

优点： 
1.降低了系统耦合度。 
2.新的命令可以很容易添加到系统中去。

缺点：使用命令模式可能会导致某些系统有过多的具体命令类。

使用场景：认为是命令的地方都可以使用命令模式，比如： 
1.GUI 中每一个按钮都是一条命令。 
2.模拟 CMD。

注意事项：系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作，也可以考虑使用命令模式，见命令模式的扩展。
```

> 解释器模式(Interpreter)

```
应用实例：编译器.运算表达式计算。

优点： 
1.可扩展性比较好，灵活。 
2.增加了新的解释表达式的方式。 
3.易于实现简单文法。

缺点： 
1.可利用场景比较少。 
2.对于复杂的文法比较难维护。 
3.解释器模式会引起类膨胀。 
4.解释器模式采用递归调用方法。

使用场景： 
1.可以将一个需要解释执行的语言中的句子表示为一个抽象语法树。 
2.一些重复出现的问题可以用一种简单的语言来进行表达。 
3.一个简单语法需要解释的场景。

注意事项：可利用场景比较少，JAVA 中如果碰到可以用 expression4J 代替。
```

> 迭代器模式(Iterator)

```
应用实例：JAVA 中的 iterator。

优点： 
1.它支持以不同的方式遍历一个聚合对象。 
2.迭代器简化了聚合类。 
3.在同一个聚合上可以有多个遍历。 
4.在迭代器模式中，增加新的聚合类和迭代器类都很方便，无须修改原有代码。

缺点：由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性。

使用场景： 
1.访问一个聚合对象的内容而无须暴露它的内部表示。 
2.需要为聚合对象提供多种遍历方式。 
3.为遍历不同的聚合结构提供一个统一的接口。

注意事项：迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器类来负责，这样既可以做到不暴露集合的内部结构，又可让外部代码透明地访问集合内部的数据
```

> 中介者模式(Mediator)

```
应用实例： 
1.中国加入 WTO 之前是各个国家相互贸易，结构复杂，现在是各个国家通过 WTO 来互相贸易。 
2.机场调度系统。 3.MVC 框架，其中C(控制器)就是 M(模型)和 V(视图)的中介者。

优点： 
1.降低了类的复杂度，将一对多转化成了一对一。 
2.各个类之间的解耦。 
3.符合迪米特原则。

缺点：中介者会庞大，变得复杂难以维护。

使用场景： 
1.系统中对象之间存在比较复杂的引用关系，导致它们之间的依赖关系结构混乱而且难以复用该对象。 2.想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类。

注意事项：不应当在职责混乱的时候使用。
```

> 备忘录模式(Memento)

```
应用实例： 
1.后悔药。 
2.打游戏时的存档。 
3.Windows 里的 ctri + z。 
4.IE 中的后退。 
4.数据库的事务管理。

优点： 
1.给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态。 
2.实现了信息的封装，使得用户不需要关心状态的保存细节。

缺点：消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。

使用场景： 
1.需要保存/恢复数据的相关状态场景。 
2.提供一个可回滚的操作。

注意事项： 
1.为了符合迪米特原则，还要增加一个管理备忘录的类。 
2.为了节约内存，可使用原型模式+备忘录模式。
```

> 观察者模式(Observer)

```
应用实例： 
1.拍卖的时候，拍卖师观察最高标价，然后通知给其他竞价者竞价。 
2.西游记里面悟空请求菩萨降服红孩儿，菩萨洒了一地水招来一个老乌龟，这个乌龟就是观察者，他观察菩萨洒水这个动作。

优点： 
1.观察者和被观察者是抽象耦合的。 
2.建立一套触发机制。

缺点： 
1.如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。 
2.如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。 
3.观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。
```

> 状态模式(State)

```
优点：
1.封装了转换规则。 
2.枚举可能的状态，在枚举状态之前需要确定状态种类。 
3.将所有与某个状态有关的行为放到一个类中，并且可以方便地增加新的状态，只需要改变对象状态即可改变对象的行为。 
4.允许状态转换逻辑与状态对象合成一体，而不是某一个巨大的条件语句块。 
5.可以让多个环境对象共享一个状态对象，从而减少系统中对象的个数。

缺点：
1.状态模式的使用必然会增加系统类和对象的个数。 
2.状态模式的结构与实现都较为复杂，如果使用不当将导致程序结构和代码的混乱。 
3.状态模式对"开闭原则"的支持并不太好，对于可以切换状态的状态模式，增加新的状态类需要修改那些负责状态转换的源代码，否则无法切换到新增状态，而且修改某个状态类的行为也需修改对应类的源代码。

使用场景:
1.行为随状态改变而改变的场景。
2.条件.分支语句的代替者。

注意事项：在行为受状态约束的时候使用状态模式，而且状态不超过 5 个。
```

> 空对象模式(Null Object)

```
在空对象模式(Null Object Pattern)中，一个空对象取代 NULL 对象实例的检查。Null 对象不是检查空值，而是反应一个不做任何动作的关系。这样的 Null 对象也可以在数据不可用的时候提供默认的行为。

在空对象模式中，我们创建一个指定各种要执行的操作的抽象类和扩展该类的实体类，还创建一个未对该类做任何实现的空对象类，该空对象类将无缝地使用在需要检查空值的地方
```

> 策略模式(Strategy)

```
应用实例： 
1.诸葛亮的锦囊妙计，每一个锦囊就是一个策略。 
2.旅行的出游方式，选择骑自行车.坐汽车，每一种旅行方式都是一个策略。 
3.JAVA AWT 中的 LayoutManager。

优点： 
1.算法可以自由切换。 
2.避免使用多重条件判断。 
3.扩展性良好。

缺点： 
1.策略类会增多。 
2.所有策略类都需要对外暴露。

使用场景： 
1.如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为。 
2.一个系统需要动态地在几种算法中选择一种。 3.如果一个对象有很多的行为，如果不用恰当的模式，这些行为就只好使用多重的条件选择语句来实现。

注意事项：如果一个系统的策略多于四个，就需要考虑使用混合模式，解决策略类膨胀的问题。
```

> 模板模式(Template)

```
应用实例： 1.在造房子的时候，地基.走线.水管都一样，只有在建筑的后期才有加壁橱加栅栏等差异。 2.西游记里面菩萨定好的 81 难，这就是一个顶层的逻辑骨架。 3.spring 中对 Hibernate 的支持，将一些已经定好的方法封装起来，比如开启事务.获取 Session.关闭 Session 等，程序员不重复写那些已经规范好的代码，直接丢一个实体就可以保存。

优点： 
1.封装不变部分，扩展可变部分。 
2.提取公共代码，便于维护。 
3.行为由父类控制，子类实现。

缺点：每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。

使用场景： 
1.有多个子类共有的方法，且逻辑相同。 
2.重要的.复杂的方法，可以考虑作为模板方法。

注意事项：为防止恶意操作，一般模板方法都加上 final 关键词。
```

> 访问者模式(Visitor)

```
应用实例：您在朋友家做客，您是访问者，朋友接受您的访问，您通过朋友的描述，然后对朋友的描述做出一个判断，这就是访问者模式。

优点： 
1.符合单一职责原则。 
2.优秀的扩展性。 
3.灵活性。

缺点： 
1.具体元素对访问者公布细节，违反了迪米特原则。 
2.具体元素变更比较困难。 
3.违反了依赖倒置原则，依赖了具体类，没有依赖抽象。

使用场景： 
1.对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作。 
2.需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，也不希望在增加新操作时修改这些类。

注意事项：访问者可以对功能进行统一，可以做报表.UI.拦截器与过滤器。
```

# 2.UML解读

```
1.继承：实线三角形箭头，指向父类

2.接口实现：虚线三角形箭头，指向父类

3.依赖：虚线普通箭头，指向被调用者，其中带有create的虚线是指创建(new)被调用者

4.关联(Association).聚合(Aggregation).组合(Composition)

> 区别
三者在代码上的表现相同，只是语意上有所差别。

组合：整体和部分同生共死，部分无法离开整体单独存在

聚合：部分可以离开整体单独存在

关联：代表一种拥有关系

三种类型在IntelliJ IDEA均以实线+菱形箭头+普通箭头表示，菱形箭头指向整体，普通箭头指向部分，箭头两端的数字表示实例的个数

```

# 3.UML时序图

推荐插件: [**Plantuml**](https://plantuml.com/zh/sequence-diagram)
