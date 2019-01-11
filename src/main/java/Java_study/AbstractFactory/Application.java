package Java_study.AbstractFactory;

public class Application {
    public static void main(String[] args) {
        Room victorianRoom = new Room();
        victorianRoom.InitFurniture(new VictorianFurnitureFactory());
        Room modernRoom = new Room();
        modernRoom.InitFurniture(new ModernFurnitureFactory());

        System.out.println(victorianRoom.getChair().getMaterial());
        System.out.println(modernRoom.getChair().getMaterial());
    }
}
