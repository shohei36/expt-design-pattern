package code.decorator;

/**
 * 上下左右に飾り付け
 */
public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        }
        return "|" + display.getRowText(row - 1) + "|";
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    /**
     * 文字chをcount個連続させた文字列を作る
     * 
     * @param ch
     * @param count
     * @return
     */
    private String makeLine(char ch, int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
