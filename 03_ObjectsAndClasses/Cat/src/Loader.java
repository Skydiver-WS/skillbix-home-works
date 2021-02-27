public class Loader
{
    public static void main(String[] args)
    {
//        Cat vasya = new Cat();
//        Cat luka = new Cat();
//        luka.catColor(CatColor.Sandy);
//        Cat timka = new Cat();
//        Cat gylka = new Cat();
//        Cat umka = new Cat();
//        double ammountOfFood = 0;
//
//        while (true)
//        {
//            luka.feed(ammountOfFood);
//            ammountOfFood++;
//            if (luka.getStatus().equals("Exploded")) {
//               System.out.println("Luka weight after eating" + "\t" + luka.getWeight() + "\n Luka status:" + "\t" + luka.getStatus());
//              break;
//           }
//        }
//        System.out.println("Количество съеденной еды: " + luka.amountOfFoodEaten());
//
//       while (!timka.getStatus().equals("Dead"))
//       {
//           timka.meow();
//       }
//       System.out.println("Timka status: " + timka.getStatus());

//       System.out.println("Timka eight: " + gylka.getWeight());
//       gylka.feed(150.0);
//       gylka.pee();
//       gylka.drink(250.0);
//       gylka.feed(100.0);
//       gylka.meow();
//       gylka.feed(100.0);
//
//       System.out.println("Gulka weight: " + gylka.getWeight());
//       System.out.println("Amount of food eaten: " + gylka.amountOfFoodEaten());
//       System.out.println("Gulka weight: " + gylka.getWeight());
//       gylka.pee();
//       gylka.pee();
//       System.out.println("Gulka weight: " + gylka.getWeight());

//        luka.feed(3000.0);
//        luka.feed(3000.0);
//        luka.feed(3000.0);
//        luka.feed(3000.0);
//        luka.feed(30000.0);
//        luka.feed(3000.0);
//        luka.feed(3000.0);
//        luka.feed(3000.0);
//        luka.feed(3000.0);
//        luka.feed(30000.0);
//        luka.feed(3000.0);
//        System.out.println("Количество съеденной еды: " + luka.amountOfFoodEaten());
//
//        System.out.println("Luka color " + luka.getCatColor() + "\n Luka weight after eating " + luka.getWeight() + "\n Luka status: " +  luka.getStatus());
//
//        System.out.println("Количество созданых котов: " + Cat.getCount());


        Cat a = new Cat("0",0.0, CatColor.White_black);
       System.out.println("Color " +  a.getName() + " " + a.getCatColor());
//        Cat b = new Cat("0",0.0);
//        System.out.println("Cat name: " + b.name() + "\n" + "Cat weight: " + b.getWeight());
//        Cat generate = getKitten();
//        System.out.println("Cat name: " + generate.name() + "\n" + "Cat weight: " + generate.getWeight());
//        System.out.println("Вывод значения с getCount: " + Cat.getCount());
        Cat c = new Cat(a);
        c.setName("efff");
        c.setCatColor(CatColor.Black);
        System.out.println("Weight cat C equals weight cat A " + "Weight cat C: " + c.getWeight() + "\nWeight cat A" + a.getWeight());
        a.feed(10000.0);
        System.out.println("Количество созданых котов: " + Cat.getCount());

    }
//    private static Cat getKitten()
//    {
//        return new Cat("0", 1100.0);
//    }
}