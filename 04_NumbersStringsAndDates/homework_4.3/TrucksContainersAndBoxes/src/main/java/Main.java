import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int MAX_BOX = 27;
		int MAX_CONTAINERS_IN_A_TRUCK = 12;
		int boxCount = 0;
		int containersCount = 0;
		int trucksCount = 0;
		
		Scanner inputOfTheNumberOfBox = new Scanner(System.in);
		int box = inputOfTheNumberOfBox.nextInt();
		boxCount = Math.max(box, 0); //выбирает максимальное значение
		int numberOfBoxesEntered = boxCount; // переменная для установления предела цикла, оно равно количеству введённых коробок
		for (int i = 1; i <= numberOfBoxesEntered; i++)
		{
			if ((boxCount % MAX_BOX) == 0 || i == 1)
			{
				if ((containersCount % MAX_CONTAINERS_IN_A_TRUCK) == 0)
				{
					trucksCount += 1;
					System.out.println("Грузовик: " + trucksCount);
				}
				containersCount += 1;
				System.out.println("\t" + "Контейнер: " + containersCount);
			}
			boxCount = i;
			System.out.println("\t\t" + "Ящик: " + boxCount);
		}
		System.out.println("Необходимо:" + "\n" + "грузовиков - " + trucksCount + " шт." + "\n" + "контейнеров - " + containersCount + " шт.");
	}
}
