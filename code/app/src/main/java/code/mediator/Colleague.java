package code.mediator;

/**
 * 相談役に相談を持ちかけるメンバー
 */
public interface Colleague {
    public abstract void setMediator(Mediator mediator);

    /**
     * 相談役からやってくる指示に相当
     * 
     * @param enabled
     */
    public abstract void setColleagueEnabled(boolean enabled);
}
