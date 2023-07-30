package code.decorator;

public class SideBorder extends Border {
    /**
     * 飾りとなる文字
     */
    private char borderChar;

    /**
     * コンストラクタでDisplayと飾り文字を指定
     * 
     * @param display
     * @param ch
     */
    public SideBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

}
