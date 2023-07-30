package code.decorator;

// 1行の文字列を表示するクラス
public class StringDisplay extends Display {
    private String string; // 表示文字列

    // 引数で表示文字列を指定
    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        }
        return null;
    }

    @Override
    public int getRows() {
        return 1;
    }

}
