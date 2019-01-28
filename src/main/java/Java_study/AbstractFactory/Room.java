package Java_study.AbstractFactory;

import Java_study.Furniture.Chair;
import Java_study.Furniture.CoffeeTable;

public class Room {
    private Chair chair;
    private CoffeeTable coffeeTable;

    public void InitFurniture(FurnitureFactory factory) {
        chair = factory.createChair();
        coffeeTable = factory.createCofeeTable();
    }

    public Chair getChair() {
        return chair;
    }

    public CoffeeTable getCoffeeTable() {
        return coffeeTable;
    }

}
