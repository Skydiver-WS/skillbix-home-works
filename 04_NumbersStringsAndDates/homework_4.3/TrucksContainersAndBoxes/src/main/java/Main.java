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
		for (int i = 0; i < boxCount; i++)
		{
			if (i % MAX_BOX == 0)
			{
				if ((containersCount % MAX_CONTAINERS_IN_A_TRUCK) == 0)
				{
					trucksCount += 1;
					System.out.println("Грузовик: " + trucksCount);
				}
				containersCount += 1;
				System.out.println("\t" + "Контейнер: " + containersCount);
			}
			System.out.println("\t\t" + "Ящик: " + (i+1));
		}
		System.out.println("Необходимо:" + "\n" + "грузовиков - " + trucksCount + " шт." + "\n" + "контейнеров - " + containersCount + " шт.");
	}
}
