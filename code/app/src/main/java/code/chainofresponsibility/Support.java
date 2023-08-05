package code.chainofresponsibility;

/**
 * トラブルを解決する連鎖を作るための抽象クラス
 */
public abstract class Support {
    // トラブルの解決者の名前
    private String name;
    // たらいまわし先
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    /**
     * たらい回し先を設定
     * 
     * @param next
     * @return
     */
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    /**
     * トラブル解決の手順
     * 
     * @param trouble
     */
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    public String toString() {
        return "[" + name + "]";
    }

    /**
     * 解決用メソッド
     * 
     * @param trouble
     * @return
     */
    protected abstract boolean resolve(Trouble trouble);

    /**
     * 解決
     * 
     * @param trouble
     */
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    /**
     * 未解決
     * 
     * @param trouble
     */
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
