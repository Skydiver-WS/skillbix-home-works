import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
	
	}
	
	public static String searchAndReplaceDiamonds(String text, String placeholder) {
		// TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений
		return text.replaceAll("<.+?>", placeholder);
	}
}