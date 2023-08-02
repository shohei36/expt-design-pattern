# Prototype Pattern
- クラスからインスタンスを生成するのではなく、インスタンスから別のインスタンスを作り出す
- ユースケース
    - 種類が多すぎてクラスがまとめられない時
    - クラスからのインスタンス生成が難しい場合 ex) ユーザーが操作を行って作った図形を表すインスタンス
    - フレームワークと生成するインスタンスを分けたい場合

# UML Diagram
```mermaid
---
title: Prototype Pattern
---
classDiagram
    class Client {
    }
    class Prototype {
        <<interface>>
        createClone()
    }
    class ConcretePrototype {
        createClone()
    }

    Client --> Prototype: Uses 
    ConcretePrototype --|> Prototype: 
```

```mermaid
---
title: Sample Program
---
classDiagram
    class Manager {
        showcase
        register()
        create()
    }
    class Product {
        <<interface>>
        use()
        createClone()
    }
    class UnderlinePen {
        ulchar
        use()
        createClone()
    }
    class MessageBox {
        decochar
        use()
        createClone()
    }

    Manager --> Product: Uses
    UnderlinePen --|> Product: 
    MessageBox --|> Product: 
```