package Java_study.AbstractFactory;

import Java_study.Furniture.Chair;
import Java_study.Furniture.CoffeeTable;
import Java_study.Furniture.VictorianChair;
import Java_study.Furniture.VictorianCoffeeTable;

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
