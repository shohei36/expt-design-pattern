# Factory Method Pattern
- インスタンス生成のための枠組みと、実際のインスタンス生成のクラスを分けて考える

# UML Diagram
```mermaid
---
title: Factory Method Pattern
---
classDiagram
    class Creator {
        <<abstract>>
        create()
        factoryMethod()
    }
    class Product {
        <<abstract>>
        method1()
        method2()
        method3()
    }
    class ConcreteCreator {
        factoryMethod()
    }
    class ConcreteProduct {
        method1()
        method2()
        method3()
    }

    Creator --> Product: Creates
    ConcreteCreator --> ConcreteProduct: Creates
    ConcreteCreator --|> Creator: 
    ConcreteProduct --|> Product: 
```

```mermaid
---
title: Sample Program
---
classDiagram
    class Factory {
        <<abstract>>
        create()
        createProduct()
        registerProduct()
    }
    class Product {
        <<abstract>>
        use()
    }
    class IDCardFactory {
        owners
        createProduct()
        registerProduct()
        getOwners()
    }
    class IDCard {
        owner
        use()
        getOwner()
    }

    Factory --> Product: Creates
    IDCardFactory --> IDCard: Creates
    IDCardFactory --|> Factory: 
    IDCard --|> Product:  
```