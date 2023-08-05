package code.mediator;

/**
 * 相談役
 */
public interface Mediator {
    public abstract void createColleagues();

    /**
     * 相談役への相談に相当する
     */
    public abstract void colleagueChanged();
}
