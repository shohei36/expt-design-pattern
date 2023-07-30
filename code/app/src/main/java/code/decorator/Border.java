package code.decorator;

/**
 * 「飾り枠」を表す抽象クラス
 */
public abstract class Border extends Display {
    /**
     * この飾り枠がくるんでいる「中身」を指す
     */
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
