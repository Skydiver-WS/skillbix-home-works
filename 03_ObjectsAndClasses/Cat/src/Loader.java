
public class Loader
{
    public static void main(String[] args)
    {
        Cat vasya = new Cat();
        Cat luka = new Cat();
        Cat timka = new Cat();
        Cat gylka = new Cat();
        Cat umka = new Cat();

        double ammountOfFood = 0;




        System.out.println("Vasya weight:" + "\t" + vasya.getWeight());
        vasya.feed(2.0);
        System.out.println("Vasya ate" + "\t" + vasya.getWeight());

        System.out.println("Luka weight:" + "\t" + luka.getWeight());
        luka.feed(30.2);
        System.out.println("Luka ate" + "\t" + luka.getWeight());
        luka.drink(9.2);
        System.out.println("Luka ate" + "\t" + luka.getWeight());
        System.out.println("Timka weight:" + "\t" + timka.getWeight());
        System.out.println("Gulka weight:" + "\t" + gylka.getWeight());
        System.out.println("Umka weight:" + "\t" + umka.getWeight());

        while (true)
        {
            luka.feed(ammountOfFood);
            ammountOfFood++;
            if (luka.getStatus().equals("Exploded")) {
               System.out.println("Luka weight after eating" + "\t" + luka.getWeight() + "\n Luka status:" + "\t" + luka.getStatus());
              break;
           }
        }

       while (true)
       {
           timka.meow();
           if (timka.getStatus().equals("Dead"))
           {
               System.out.println("Timka status:" + "\t" + timka.getStatus());
               break;
           }
       }
    }
}