package Java_study.Patterns.AbstractFactory;

import Java_study.Patterns.AbstractFactory.Furniture.Chair;
import Java_study.Patterns.AbstractFactory.Furniture.CoffeeTable;

public interface FurnitureFactory {
    public Chair createChair();
    public CoffeeTable createCofeeTable();
}
