# Command Pattern
- 実装とは切り離して、数え上げを行うことができる

# UML Diagram
```mermaid
---
title: Command Pattern
---
classDiagram
    class Invoker {
    }
    class Command {
        <<interface>>
        execute()
    }
    class ConcreteCommand {
        receiver
        execute()
    }
    class Client {
    }
    class Receiver {
        action()
    }
    Invoker o--> Command
    ConcreteCommand --|> Command
    ConcreteCommand o--> Receiver
    Client --> ConcreteCommand: Creates
```

```mermaid
---
title: Sample Program
---
classDiagram
    class Main {
        history
        canvas
        clearButton
    }
    class Command {
        <<interface>>
        execute()
    }
    class MacroCommand {
        commands
        execute()
        append()
        undo()
        clear()
    }
    class DrawCommand {
        drawable
        execute()
    }
    class Drawable {
        <<interface>>
        draw()
    }
    class DrawCanvas {
        history
        color
        radius
        draw()
        paint()
    }
    DrawCommand --|> Command
    DrawCommand o--> Drawable
    MacroCommand --|> Command
    MacroCommand o--> Command
    DrawCanvas --|> Drawable
    DrawCanvas o--> MacroCommand
    Main o--> DrawCanvas
    Main o--> MacroCommand
```

# Sequence Diagram
```mermaid
---
title: Command Pattern
---
sequenceDiagram
    participant Invoker as :Invoker
    participant Client as :Client
    participant ConcreteCommand as :ConcreteCommand
    participant Receiver as :Receiver

    activate Invoker
    activate Client
    Client ->> ConcreteCommand: new
    Invoker ->> ConcreteCommand: execute
    activate ConcreteCommand
    ConcreteCommand ->> Receiver: action
    activate Receiver
    Receiver ->> Receiver: 
    deactivate Receiver
    Receiver -->> ConcreteCommand: 
    deactivate ConcreteCommand
    ConcreteCommand -->> Invoker: 
    deactivate Client
    deactivate Invoker
```
```mermaid
---
title: Sample Program
---
sequenceDiagram
    participant Invoker as framework of java.awt
    participant Main as :Main
    participant DrawCommand as :DrawCommand
    participant DrawCanvas as :DrawCanvas
    participant MacroCommand as :MacroCommand
    
    activate Invoker
    Invoker ->> Main: mouseDragged
    activate Main
    Main ->> DrawCommand: new
    Main ->> DrawCommand: execute
    activate DrawCommand
    DrawCommand ->> DrawCanvas: draw
    activate DrawCanvas
    DrawCanvas ->> DrawCanvas: 
    deactivate DrawCanvas
    DrawCanvas -->> DrawCommand: 
    DrawCommand -->> Main: 
    deactivate DrawCommand
    Main -->> Invoker: 
    deactivate Main
    Invoker ->> DrawCanvas: paint
    activate DrawCanvas
    DrawCanvas ->> MacroCommand: execute
    activate MacroCommand
    MacroCommand ->> DrawCommand: execute
    activate DrawCommand
    DrawCommand ->> DrawCanvas: draw
    activate DrawCanvas
    DrawCanvas ->> DrawCanvas: 
    deactivate DrawCanvas
    DrawCanvas -->> DrawCommand: 
    DrawCommand -->> MacroCommand: 
    deactivate DrawCommand
    MacroCommand -->> DrawCanvas: 
    deactivate MacroCommand
    DrawCanvas -->> Invoker: 
    deactivate DrawCanvas
    deactivate Invoker
```

# Windowns11 + WSL2 Ubuntu 20.04 でGUIアプリを起動する
次の作業が必要

### Windowsで動作するXサーバー(VcXsrv)のインストール・セットアップ
参考：
- https://rin-ka.net/windows-x-server/
- https://rin-ka.net/windows-x-server-wsl/

### アプリを実行する前に環境変数「DISPLAY」にnameserverのIPアドレス&ディスプレイ番号をセットする
```
$ export DISPLAY="`grep nameserver /etc/resolv.conf | sed 's/nameserver //'`:0"
```
参考：
- https://rin-ka.net/windows-x-server-wsl/
- http://www.ep.sci.hokudai.ac.jp/~inex/y2017/0630/practical/01_x.html