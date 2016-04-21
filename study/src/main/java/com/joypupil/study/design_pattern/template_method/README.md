模板方法模式（Template Method Pattern）定义：定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改变一个算法的结构即可重定义改算法的某些特定步骤。(Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.)

注意：抽象模板中的基本方法尽量设计为protected类型，符合迪米特法则，不需要暴露的属性或方法尽量不要设置为public类型。实现类若非必要，尽量不要扩大父类中的访问权限。

优点：
1、封装不便部分，扩展可变部分（易于扩展）
2、提取公共部分代码，便于维护
3、行为由父类控制，子类实现

缺点：
按照设计习惯，抽象类负责声明最抽象、最一般的事务属性和方法，实现类完全具体的事务属性和方法。但是模板方法模式的抽象类定义了部分抽象方法，由子类实现，子类的执行的结果会影响父类的结果，也就是子类对父类产生了影响，这在复杂的项目中，会带来代码阅读的难度，而且也会让新手产生不适感。

使用场景：
多个子类有公有的方法，并且逻辑基本相同；
重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现；
重构时，模板方法模式时一个经常使用的模式，把相同的代码抽取到父类中，然后通过钩子函数约束其行为。