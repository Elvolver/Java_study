package Java_study.Furniture;

public class ModernChair extends Chair {
    @Override
    public boolean isSoft() {
        return false;
    }

    @Override
    public boolean hasArmrest() {
        return false;
    }

    @Override
    public Integer getComfortLevel() {
        return 3;
    }

    @Override
    public String getMaterial() {
        return "Still and plastic";
    }
}
