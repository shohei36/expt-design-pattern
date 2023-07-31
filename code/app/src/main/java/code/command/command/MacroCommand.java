package code.command.command;

import java.util.Iterator;
import java.util.Stack;

/**
 * 複数の命令をまとめた命令
 */
public class MacroCommand implements Command {

    /**
     * 命令の集合
     */
    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        Iterator<Command> it = commands.iterator();
        while (it.hasNext()) {
            it.next().execute();
        }
    }

    /**
     * 追加
     * 
     * @param cmd
     */
    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    /**
     * 最後の命令を削除
     */
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    /**
     * 全部削除
     */
    public void clear() {
        commands.clear();
    }
}
