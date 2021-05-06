import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		input = input.replaceAll("\\s+|\\D+", "");
		if (Pattern.matches("\\d{10}", input)) {
			input = "7" + input;
		}
		input = input.replaceFirst("([8])", "7");
		Pattern pattern = Pattern.compile("[7]\\d{10}");
		Matcher matcher = pattern.matcher(input);
		if (matcher.matches()) {
			System.out.println(input);
		}
		else {
			System.out.println("Неверный формат номера");
		}
	}
}
