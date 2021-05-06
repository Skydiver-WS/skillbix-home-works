import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
	
	}
	
	public static String searchAndReplaceDiamonds(String text, String placeholder) {
		// TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений
		while (true) {
			Pattern pattern = Pattern.compile("<.+?>");
			Matcher matcher = pattern.matcher(text);
			if (matcher.find()) {
				int start = matcher.start();
				int end = matcher.end();
				text = text.replace(text.substring(start, end), placeholder);
			}
			else {
				break;
			}
		}
		return text;
	}
}