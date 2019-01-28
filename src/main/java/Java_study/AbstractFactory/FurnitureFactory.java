package Java_study.AbstractFactory;

import Java_study.Furniture.Chair;
import Java_study.Furniture.CoffeeTable;

public interface FurnitureFactory {
    public Chair createChair();
    public CoffeeTable createCofeeTable();
}
