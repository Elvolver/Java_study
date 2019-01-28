package Java_study.AbstractFactory;

import Java_study.Furniture.Chair;
import Java_study.Furniture.CoffeeTable;
import Java_study.Furniture.ModernChair;
import Java_study.Furniture.ModernCoffeeTable;

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
