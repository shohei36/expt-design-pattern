package code.command.drawer;

import java.awt.*;
import code.command.command.Command;

/**
 * 点の描画命令
 */
public class DrawCommand implements Command {
    // 描画対象
    protected Drawable drawable;
    // 描画位置
    protected Point position;

    // コンストラクタ
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }

}
