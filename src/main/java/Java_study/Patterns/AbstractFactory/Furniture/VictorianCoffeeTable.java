package Java_study.Patterns.AbstractFactory.Furniture;

public class VictorianCoffeeTable extends CoffeeTable {
    @Override
    public Integer getComfortLevel() {
        return 4;
    }

    @Override
    public String getMaterial() {
        return "Wood and skin";
    }
}
