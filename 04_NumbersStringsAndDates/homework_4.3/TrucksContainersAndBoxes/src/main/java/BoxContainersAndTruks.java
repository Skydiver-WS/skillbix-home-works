import java.util.Scanner;

public class BoxContainersAndTruks {
    private final static int MAX_BOX = 27;
    private final static int MAX_CONTAINERS_IN_A_TRUCK = 12;
    private int boxCount;
    private int containersCount;
    private int trucksCount;

    public BoxContainersAndTruks()
    {
        //System.out.println("Введите количество коробок:");
        Scanner inputOfTheNumberOfBox = new Scanner(System.in);
        int box = inputOfTheNumberOfBox.nextInt();
        boxCount = Math.max(box, 0); //выбирает максимальное значение
    }
    public void boxCounter ()
    {
        int numberOfBoxesEntered = boxCount;
        for (int i = 1; i <= numberOfBoxesEntered; i++)
        {
            containersCounter(i);
            boxCount = i;
            System.out.println("\t" + "\t" + "Ящик: " + boxCount);
        }
        System.out.println("Необходимо:" + "\n" + "грузовиков - " + trucksCount + " шт." + "\n" + "контейнеров - " + containersCount + " шт." );
    }
    private void containersCounter(Integer number) // ввел параметр number для вывода номера первого контейнера, далее он не используется
    {
        if ((boxCount % MAX_BOX) == 0 || number == 1)
        {
            truckCounters();
            containersCount += 1;
            System.out.println("\t" + "Контейнер: " + containersCount);
        }
    }
    private void truckCounters ()
    {
        if ((containersCount % MAX_CONTAINERS_IN_A_TRUCK) == 0)
        {
            trucksCount += 1;
            System.out.println("Грузовик: " + trucksCount);
        }
    }
}
