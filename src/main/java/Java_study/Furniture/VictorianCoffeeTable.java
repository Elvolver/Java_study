package Java_study.Furniture;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public Integer getComfortLevel() {
        return 4;
    }

    @Override
    public String getMaterial() {
        return "Wood and skin";
    }
}
