package Java_study.Furniture;

public class VictorianChair implements Chair {

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
