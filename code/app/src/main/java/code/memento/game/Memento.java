package code.memento.game;

import java.util.ArrayList;
import java.util.List;

/**
 * 主人公の内部状態を表す
 */
public class Memento {
    // 所持金
    int money;
    // フルーツ
    ArrayList fruits;

    /**
     * 所持金を得る(narrow interface)
     * 
     * @return
     */
    public int getMoney() {
        return money;
    }

    /**
     * コンストラクタ(wide interface)
     * 
     * @param money
     */
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    /**
     * フルーツを追加する(wide interface)
     * 
     * @param fruit
     */
    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    /**
     * フルーツを得る(wide interface)
     * 
     * @return
     */
    List getFruits() {
        return (List) fruits.clone();
    }
}
