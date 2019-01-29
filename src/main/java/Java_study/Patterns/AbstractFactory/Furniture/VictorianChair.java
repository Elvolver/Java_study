package Java_study.Patterns.AbstractFactory.Furniture;

public class VictorianChair extends Chair {

    @Override
    public boolean isSoft() {
        return true;
    }

    @Override
    public boolean hasArmrest() {
        return true;
    }

    @Override
    public Integer getComfortLevel() {
        return 5;
    }

    @Override
    public String getMaterial() {
        return "Wood and skin";
    }
}
