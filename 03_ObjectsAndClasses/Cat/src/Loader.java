
public class Loader
{
    public static void main(String[] args)
    {
        Cat vasya = new Cat();
        Cat luka = new Cat();
//        luka.catColor(CatColor.Sandy);
        Cat timka = new Cat();
        Cat gylka = new Cat();
        Cat umka = new Cat();
        double ammountOfFood = 0;

        System.out.println("Vasya weight:" + "\t" + vasya.getWeight());
        System.out.println("Luka weight:" + "\t" + luka.getWeight());
        luka.feed(2.2);
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

       while (!timka.getStatus().equals("Dead"))
       {
           timka.meow();
       }

       System.out.println("Timka status: " + timka.getStatus());

       System.out.println("Timka eight: " + gylka.getWeight());
       gylka.feed(150.0);
       gylka.pee();
       gylka.drink(250.0);
       gylka.feed(100.0);
       gylka.meow();
       gylka.feed(100.0);

       System.out.println("Gulka weight: " + gylka.getWeight());
       System.out.println("Amount of food eaten: " + gylka.amountOfFoodEaten());
       System.out.println("Gulka weight: " + gylka.getWeight());
       gylka.pee();
       gylka.feed(100.0);
       gylka.pee();
       System.out.println("Gulka weight: " + gylka.getWeight());



        luka.feed(3000.0);
        luka.feed(3000.0);
        luka.feed(3000.0);
        luka.feed(3000.0);
        luka.feed(30000.0);
        luka.feed(3000.0);
        luka.feed(3000.0);
        luka.feed(3000.0);
        luka.feed(3000.0);
        luka.feed(30000.0);
        luka.feed(3000.0);

        System.out.println("Luka color " + CatColor.Red + "\n Luka weight after eating " + luka.getWeight() + "\n Luka status: " +  luka.getStatus());

        vasya.feed(300.0);

        System.out.println("Vasya weight after eating " + vasya.getWeight() + "\n Vasya status: " +  vasya.getStatus());


        Cat a = new Cat("sdf",0.0);
        System.out.println("Cat name: " + a.name() + "\n" +  "Cat weight: " + a.getWeight());
        Cat b = new Cat("0",1322.0);
        System.out.println("Cat name: " + b.name() + "\n" + "Cat weight: " + b.getWeight());
        Cat generate = getKitten();
        System.out.println("Cat name: " + generate.name() + "\n" + "Cat weight: " + generate.getWeight());
        Cat generate2 = getKitten();
        System.out.println("Cat name: " + generate2.name() + "\n" + "Cat weight: " + generate2.getWeight());
        Cat generate3 = getKitten();
        System.out.println("Cat name: " + generate3.name() + "\n" + "Cat weight: " + generate3.getWeight());

//        System.out.println("Вывод значения с getCount: " + Cat.getCount());
        System.out.println("Количество созданых котов: " + Cat.getCount());

    }
    private static Cat getKitten()
    {
        return new Cat("0", 1100.0);
    }
}