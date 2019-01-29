package Java_study.Patterns.AbstractFactory;

import Java_study.Patterns.AbstractFactory.Furniture.Chair;
import Java_study.Patterns.AbstractFactory.Furniture.CoffeeTable;
import Java_study.Patterns.AbstractFactory.Furniture.ModernChair;
import Java_study.Patterns.AbstractFactory.Furniture.ModernCoffeeTable;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCofeeTable() {
        return new ModernCoffeeTable();
    }
}
