OOPS

PreRequisite -
Comfortable with Stack and Heap diagram understanding (thats it, if not hum kis liye hai bhai !!)

what is OOPS ?
It is just a programming paradigm (way of programming, program likhne ka tarika ) to organize everything according to design and also helps to solve real
world problems .How does OOPS solves this problem ? - through classes(a bluePrint)

1. Classes and Objects -

Class - is just a "user made data Type" , just as we have (int , float , double , char , String) they are made inside the language , thats why they are known as Primitive  
class is a user made data Type which can contain these primitive data types(that are pre defined in the language ).
(or you can say its a blue print )

Object - is an instance of Class , means it follows the rules made in the class and eventually it can be called as a
part of the class , which makes class alive .
(without creating Object , class is a "dead code")
Without making object , what's the use of that class ? right .

Constructor -
It is a special function inside the class , which is called when the object is being made.

Types of constructor -

1. Default
2. Parametrized
3. Copy
4. Private

DeConstructor in Java -

In C++ , when we write a constructor , we tell to allocate memory and when we write deconstructor we de-allocate that memory.
But in Java , de-allocating memory happens automatically ? ----How ??
Through "Garbage Collector" , it removes the object which are no longer used in Heap .

So you cannot control destroying that object manually , but you can decide what to do when object will be destroyed for eg . displaying a message or triggering some other event

Default -(it is present , even if you have not written it , java has internally implemented that, it will be only needed when you have to explicitly give some default values)
if you just create the object and no constructor is being defined , it will simply return the default values of the dataTypes,
but if you have given values , then it will pick up those values.

Parametrized -

Copy -

"Calling a constructor from another constructor"

this keyword -

Wrapper Class -

final keyword -

Problem -

Car class
