package Java_study.AbstractFactory;

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
