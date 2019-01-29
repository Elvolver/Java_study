package Java_study.Patterns.AbstractFactory;

import Java_study.Patterns.AbstractFactory.Furniture.Chair;
import Java_study.Patterns.AbstractFactory.Furniture.CoffeeTable;
import Java_study.Patterns.AbstractFactory.Furniture.VictorianChair;
import Java_study.Patterns.AbstractFactory.Furniture.VictorianCoffeeTable;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCofeeTable() {
        return new VictorianCoffeeTable();
    }
}
