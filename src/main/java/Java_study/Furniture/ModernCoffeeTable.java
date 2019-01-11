package Java_study.Furniture;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public Integer getComfortLevel() {
        return 4;
    }

    @Override
    public String getMaterial() {
        return "Still and plastic";
    }
}
