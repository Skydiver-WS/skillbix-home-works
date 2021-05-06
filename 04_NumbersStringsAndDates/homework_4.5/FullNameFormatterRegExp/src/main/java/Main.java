import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String input = scanner.nextLine();
			int spaceCount = 0;
			boolean chekText = Pattern.matches("\\D+", input); /* сокращенная форма записи Pattern pattern = Pattern.compile("\\D+"); Matcher matcher = pattern.matcher(input.trim());
			                                                      но при условии, что шаблон Pattern используется, только один раз. P.S. из официальной документации */
			Pattern patternSpace = Pattern.compile("\\s");
			Matcher matcherSpace = patternSpace.matcher(input);
			while (matcherSpace.find()) {
				if (! chekText) {
					break;
				}
				spaceCount++;
			}
			if (spaceCount == 2) {
				String[] splitText = input.split("\\s");
				boolean fullName = true;
				String textFinal = "";
				for (String s : splitText) {
					if (fullName) {
						textFinal = textFinal.replace("", "Фамилия: ");
						fullName = false;
					}
					else if (spaceCount == 3) {
						textFinal = textFinal.replace("Фамилия: ", "Имя: ");
					}
					else {
						textFinal = textFinal.replace("Имя: ", "Отчество: ");
					}
					spaceCount++;
					System.out.println(textFinal + s);
				}
				break;
			}
			else {
				System.out.println("Введенная строка не является ФИО");
				break;
			}
		}
	}
}