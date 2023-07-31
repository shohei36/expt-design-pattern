package code.command.drawer;

import java.awt.*;
import code.command.command.MacroCommand;

public class DrawCanvas extends Canvas implements Drawable {

    // 描画色
    private Color color = Color.red;
    // 描画する点の半径
    private int radius = 6;
    // 履歴
    private MacroCommand history;

    // コンストラクタ
    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    /**
     * 履歴全体を再描画
     */
    @Override
    public void paint(Graphics g) {
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

}
