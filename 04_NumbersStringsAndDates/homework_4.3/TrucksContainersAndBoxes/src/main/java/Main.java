import java.util.Scanner;

public class Main {
    private final static int MAX_BOX = 27;
    private final static int MAX_CONTAINERS_IN_A_TRUCK = 12;
    private static int boxCount = 7853360;
    private static int containersCount;
    private static int trucksCount;


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String boxes = scanner.nextLine();
        BoxContainersAndTruks convoy = new BoxContainersAndTruks();
        convoy.boxCounter();
        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }
}
