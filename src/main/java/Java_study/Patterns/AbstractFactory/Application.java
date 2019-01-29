package Java_study.Patterns.AbstractFactory;

public class Application {

    public static Room createModernRoom() {
        Room room = new Room();
        room.InitFurniture(new ModernFurnitureFactory());
        return room;
    }

    public static Room createVictorianRoom() {
        Room room = new Room();
        room.InitFurniture(new VictorianFurnitureFactory());
        return room;
    }

    public static void main(String[] args) {
        System.out.println("Application");
    }
}
