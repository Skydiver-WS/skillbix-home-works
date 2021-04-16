public class Main {
	
	public static void main(String[] args) {
	
	}
	
	public static String searchAndReplaceDiamonds(String text, String placeholder) {
		// TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений
		while (true)
		{
			int diamondsFirst = text.indexOf('<');
			int diamondsLast = text.indexOf('>');
			if (diamondsFirst != -1 && diamondsLast != -1)
			{
				text = text.replaceAll(text.substring(diamondsFirst, diamondsLast + 1), placeholder);
			}
			else
			{
				break;
			}
		}
		return text;
	}
}