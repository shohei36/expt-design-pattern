# Abstract Factory
- aaa

# UML Diagram
```mermaid
---
title: Abstract Factory
---
classDiagram
    class Client {
    }
    class Handler {
        <<abstract>>
        next
        request()
    }
    class ConcreteHandler1 {
        request()
    }
    class ConcreteHandler2{
        request()
    }

    Client --> Handler: Request
    Handler o--> Handler: 
    ConcreteHandler1 --|> Handler: 
    ConcreteHandler2 --|> Handler: 
```

```mermaid
---
title: Sample Program
---
classDiagram
    class Main {
    }
    class Support {
        <<abstract>>
        -name
        -next
        +support()
        +setNext()
        #resolve()
    }
    class NoSupport {
        #resolve()
    }
    class LimitSupport {
        -limit
        #resolve()
    }
    class OddSupport {
        #resolve()
    }
    class SpecialSupport {
        -number
        #resolve()
    }

    Main --> Support: Request
    Support o-->Support: 
    NoSupport --|> Support: 
    LimitSupport --|> Support: 
    OddSupport --|> Support: 
    SpecialSupport --|> Support: 
```

