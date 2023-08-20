package code.factorymethod.idcard;

import java.util.ArrayList;
import java.util.List;
import code.factorymethod.framework.Factory;
import code.factorymethod.framework.Product;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
