代理模式（Proxy Pattern）定义：为其他对象提供一种代理以控制对这个对象的访问。（Provide a surrogate or placeholder for another object to control access to it.）

优点：
1、职责清晰：真实的角色就是实现实际的业务逻辑，不用关心其他非本职责的事务，通过后期的代理完成一件事务，附带的结果就是变成简洁清晰。
2、高扩展性：具体主题角色是随时都会发生变化的，只要它实现了接口，不管他如何变化，代理类都可以在不做任何修改的情况下使用。
3、智能化：比如Struts中用动态代理将表单元素映射到对象上。