# Introduction to Object-Oriented Programming (OOP): Note-taking

## Pillar 1:  Abstraction
Abstraction's main goal is to handle complexity by hiding unnecessary details from the user. That enables the user to implement more complex logic on top of the provided abstraction without understanding or even thinking about all the hidden complexity.

### Abstraction in the real world

I’m a coffee addict. So, when I wake up in the morning, I go into my kitchen, switch on the coffee machine and make coffee. Sounds familiar?

Making coffee with a coffee machine is a good example of abstraction.

You need to know how to use your coffee machine to make coffee. You need to provide water and coffee beans, switch it on and select the kind of coffee you want to get.

The thing you don’t need to know is how the coffee machine is working internally to brew a fresh cup of delicious coffee. You don’t need to know the ideal temperature of the water or the amount of ground coffee you need to use.

Someone else worried about that and created a coffee machine that now acts as an abstraction and hides all these details. You just interact with a simple interface that doesn’t require any knowledge about the internal implementation.

[CoffeeMachine Example](https://stackify.com/oop-concept-abstraction/)

## Pillar 2:  Encapsulation

Encapsulation describes the idea of bundling data and methods that work on that data within one unit, like a class in Java. This concept is also often used to hide the internal representation, or state of an object from the outside. This is called [information hiding](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming)#An_information-hiding_mechanism).

The general idea of this mechanism is simple. For example, you have an attribute that is not visible from the outside of an object. You bundle it with methods that provide read or write access. Encapsulation allows you to hide specific information and control access to the internal state of the object.

If you’re familiar with any object-oriented programming language, you probably know these methods as getter and setter methods. As the names indicate, a getter method retrieves an attribute and a setter method changes it. Depending on the methods that you implement, you can decide if an attribute can be read and changed. You may also control if the attribute is read-only or not visible at all. Later, we’ll show you how the setter method can also be used to implement additional validation rules to ensure that your object always has a valid state.

[CoffeeMachine Example](https://stackify.com/oop-concept-for-beginners-what-is-encapsulation/)

### **Information Hiding in Java**

As explained earlier, you can use the encapsulation concept to implement an information-hiding mechanism. Similar to the abstraction concept, this is one of the most commonly used mechanisms in Java. You can find examples of it in almost all well-implemented Java classes.

You implement an information-hiding mechanism by making your class attributes inaccessible from the outside. You can also provide getter and/or setter methods for attributes to be readable or updatable by other classes.

#### **Access Modifiers**

Java supports four  [access modifiers](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)  that you can use to define the visibility of classes, methods and attributes. Each modifier specifies a different level of accessibility, and you can only use one modifier per class, method or attribute. As a rule of thumb, you should always use the most restrictive modifier that still allows you to implement your business logic.

Starting from the most to the least restrictive, these modifiers are:

-   private
-   no modifier
-   protected
-   public

Let’s take a closer look at each of these modifiers and discuss when you should use them.

##### **Private**

The most restrictive and most commonly used access modifier, the  _private_  modifier makes an attribute or method only accessible within the same class. Subclasses or any other classes within the same or a different package can’t access this attribute or method.

For all attributes and internal methods that shouldn’t be called from external classes, choose the  _private_  modifier by default. You might need to make an exception to this rule when you’re using  [inheritance](https://stackify.com/oop-concept-inheritance/). Also, exempt some of the subclasses that need direct access to an attribute or internal method. In that case, you should use the  _protected_  modifier instead of  _private_.

##### **No Modifier**

No modifiers mean you can access attributes or methods within your class and from all classes within the same package. That’s why it’s often called package-private.

We use the  _private_  modifier to restrict access to all attributes and the  _brewEspresso_and  _brewFilterCoffee_  methods in the  _CoffeeMachine_  example. These attributes and methods should only be used within the  _CoffeeMachine_  class and are not part of the public API.

That might seem a bit confusing in the beginning. However, it’s very useful when the classes in your package implement a well-defined set of logic. It’s also practical if you want to control the API that’s available to classes outside of this package. You can then use package visibility to implement a method that can only be used by classes within this package. That allows you to create a package internal and an external API.

##### **Protected**

Attributes and methods with the access modifier  _protected_  can be accessed within your class, by all classes within the same package and by all subclasses within the same or other packages.

The  _protected_  modifier gets mostly used for internal methods that need to be called or overridden by subclasses. You can also use the  _protected_  modifier to allow subclasses to access internal attributes of a superclass directly.

##### **Public**

This is the least restrictive access modifier. Methods and attributes that use the  _public_modifier can be accessed within your current class and by all other classes.

__Public__ methods and attributes become part of the public API of your class and of any component in which you include them. That is almost never a good idea for any attribute, so you should think twice before using this modifier on a method.

When a method is publicly available, you need to ensure that it’s well documented and robustly handles any input values. Also keep in mind that this method will be used by some part of your application, which will make it hard to change or remove it.

Generally, your public API should be as lean as possible. Public APIs should only include the methods which are intended for other parts of the application or access by external clients.

#### **Accessibility Matrix**

Here you can see an overview of the different access modifiers and the accessibility of the attributes or methods.

![Here you can see an overview of the different access modifiers and the accessibility of the attributes or methods.](https://stackify.com/wp-content/uploads/2017/11/word-image-20.png " access modifiers and the accessibility of the attributes or methods")
