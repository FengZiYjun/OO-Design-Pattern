# Object-oriented design patterns

： design_pattern

---

## Background
GoF: Gang of Four, four persons that bring the thought of patterns into software engineering. 
*Design patterns: elements of reusable object-oriented software*: a book that marks the beginning of design patterns. 
GRASP: general responsbility assignment software pattern. 
Rule of Three: A good solution should be applied successfully in at least three different fields. 

## Rules of object orientation 
Three policies: 

- encapsulatin 
- inhetitance
- polynorphism

### Basic Principles: S.O.L.I.D.
- Single resposibility principle
A responsibility means a reason for which a class may change. 
A class or module should have only one reason for which it can be change. 
This principle means to encapsulate different responsibilities into different classes.
So it involves responsibility division and granulation.
- Open closed principle
open to expansion, closed to modification.
A good-design program can be expanded without modification. 
The key is "Abstraction". 
- Liskov substitution principle 
A sub-class can substitute its parent class without any change in the clinet bahavior that calls the parent class.
- Interface segregation principle
small interface
high inner gregation.
specifically designed.
limited, small granulation.
- Dependency inversion principle
High modules should not rely on low modules. Both should rely on *Abstraction*.
Abstraction should not rely on details. Instead, details should rely on abstraction. 
Interface-oriented programming: 
1. low modules should have abtract class or interfaces. 
2. the declaration of variables should be abstract classes or interfaces. 
3. inheritance follows the Liskov principle.

### Factory Method Pattern
#### advantages
Clinets no necessarily know the exact product names.
Which product will be created is decided by the factory itself. 
No need to modify the interfaces of abstract factory and abstract products. 
#### drawback
A new factory as well as a new product has to be added which brings more complexity. 
The use of abstraction leads to difficulty of understanding. 
There can be only one abstract product. 

### Abstract Factory Pattern 
- product hierarchy
the inhetitance stracture of the products, such as an abstract TV and a concrete-brand TV.
- product group
a group of products from different product hierarchies that prduced by the same factory
such as TV, refrigerator and microwaver that have the same brand

#### when to use 
The products have more than one product groups and each time only one of them will be used. 
Products from the same group are designed to be used together. 


### Builder Pattern
#### advantages
- When constructing a complex object, the order of its components is stable but the they will encounter complicated changes. 
- The algorithm used to create the object is independent from its components. 
- the difference between builder pattern and factory pattern: the latter focuses on the construction of a single product while the former one emphesizes assembling various components accroding to the needs. 

###　Singleton Pattern 
There is only one instance of the class. 
Even if more than one object of this class is created, they are all actually the same instance.

### Decorator Pattern 
used to expand the functions of a class or add responsibilities to the class. 
when it is unrealistic to use inheritage.

### Proxy Pattern 
When the client does not want to directly access an object, a proxy is used to help the client to do things. 

### Observer Pattern 
This pattern is a mechenism of dependency relationship between an object and lots of observers. When the object changes, all observers will get noticed. And there is no connection among different observers. 

### Strategy Pattern 
define a series of algorithms and encapsulate all of them to make them replacable to each other
separate the actual algorithm from business logic

### Command Pattern 













