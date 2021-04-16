public class Main {
    public static String sum = " ";
    
    public static void main(String[] args) {
        
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        //TODO: напишите ваш код, результат вывести в консоль
        //int earningsVasya1 = text.indexOf(' ', 14);
       // int earningsVasya2 = text.lastIndexOf("рублей,");
       // int earningsPetya1 = text.indexOf(' ', 34);
       // int earningsPetya2 = text.lastIndexOf("рубля");
       // int earningMasha1 = text.indexOf(' ', 54);
        //int earningMasha2 = text.lastIndexOf("рублей");
       // System.out.println(Integer.parseInt(text.substring(earningsVasya1, earningsVasya2).trim()) +
       //         Integer.parseInt(text.substring(earningsPetya1, earningsPetya2).trim())+
       //         Integer.parseInt(text.substring(earningMasha1, earningMasha2).trim()));
       for (int i = 0; i < text.length(); i++)
        {
            if (Character.isDigit(text.charAt(i)) || Character.isSpaceChar(text.charAt(i)))
           {
                sum = sum.concat(String.valueOf(text.charAt(i)));// метод concat объединяет строки из разных класов String. Обязательное условие в первой строке, в моём случае sum должен быть символ, кавычек хватает.
           System.out.println(sum);
           }
        }
       //for (String testText: sum.split(" "))
       // {
        //    System.out.println(testText);
        //}
    }
}