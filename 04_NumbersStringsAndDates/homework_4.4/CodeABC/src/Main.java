import java.nio.charset.StandardCharsets;
public class Main {
	public static void main(String[] args) {
		String abc = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz" +
				"АаБбВвГгДдЕеЁёЖжЗзИийКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщыьъЭэЮюЯя" + "0123456789 ";
		for (int i = 0; i < abc.length(); i++)
		{
			System.out.println((int) abc.charAt(i) + " - " + abc.charAt(i));
		}
	}
}