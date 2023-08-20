package code.factorymethod;

import code.factorymethod.framework.Factory;
import code.factorymethod.framework.Product;
import code.factorymethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Jhon");
        Product card2 = factory.create("Alice");
        Product card3 = factory.create("Bob");
        card1.use();
        card2.use();
        card3.use();
    }
}
