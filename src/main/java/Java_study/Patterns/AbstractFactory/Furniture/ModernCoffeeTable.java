package Java_study.Patterns.AbstractFactory.Furniture;

public class ModernCoffeeTable extends CoffeeTable {
    @Override
    public Integer getComfortLevel() {
        return 4;
    }

    @Override
    public String getMaterial() {
        return "Still and plastic";
    }
}
