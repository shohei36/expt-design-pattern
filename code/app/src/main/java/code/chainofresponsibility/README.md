# Chain of Responsibility Pattern
- 「要求する側」と「処理する側」の結びつきを弱めることができる
- 「処理する側」のそれぞれの部品を独立させることができる
- 状況によって要求を処理するオブジェクトが変化するようなプログラムにも対応できる
- ウィンドウシステムでよく使われるパターン

# UML Diagram
```mermaid
---
title: Chain of Responsibility Pattern
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

