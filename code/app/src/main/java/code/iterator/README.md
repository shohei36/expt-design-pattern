# Iterator Pattern
- 実装とは切り離して、数え上げを行うことができる

# UML Diagram
```mermaid
---
title: Iterator Pattern
---
classDiagram
    class Aggregate {
        <<interface>>
        iterator()
    }
    class ConcreteAggregate {
        iterator()
    }
    class Iterator {
        <<interface>>
        hasNext()
        next()
    }
    class ConcreteIterator {
        aggregate
        hasNext()
        next()
    }
    Aggregate-->Iterator: Creates
    ConcreteAggregate --|> Aggregate: implements
    ConcreteIterator --|> Iterator: implements
    ConcreteIterator o--|> ConcreteAggregate: 
```

```mermaid
---
title: Sample Program
---
classDiagram
    class Aggregate {
        <<interface>>
        iterator()
    }
    class BookShelf {
        books
        last
        getBookAt()
        appendBook()
        getLength()
        iterator()
    }
    class Book {
        name
        getName()
    }
    class Iterator {
        <<interface>>
        hasNext()
        next()
    }
    class BookShelfIterator {
        bookShelf
        index
        hasNext()
        next()
    }
    Aggregate-->Iterator: Creates
    BookShelf --|> Aggregate: implements
    BookShelf o--> Book
    BookShelfIterator --|> Iterator: implements
    BookShelfIterator o--|> BookShelf: 
```