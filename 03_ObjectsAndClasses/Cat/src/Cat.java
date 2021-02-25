import java.util.Random;
import java.util.Scanner;

public class Cat
{
    private double originWeight;
    private double weight;
    private double foodEaten;
    private static int count;
    private String name;
    private CatColor color;
    private boolean isCatAlive = true; // получилось обойтись без булеана просто присвоив значение true

    private static final double MIN_WEIGHT = 1000.0;
    private static final double MAX_WEIGHT = 9000.0;
    private static final int NUBMER_OF_EYES = 2;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
    }

    public Cat (String name, Double weight)
    {
        this();
        this.name = name;
        if (name.equals("0"))
        {
            nameInput();
        }
        if (weight <= 0.0)
        {
            weigthInput();
        }
        else
        {
            this.weight = weight; //введённый вес в параметре Double weight
            weigthComparison();
        }
    }

    public void meow()
    {
        if (isCatAlive)
        {
            weight = weight - 1;
            System.out.println("Meow");
            isCatNotAlive();
        }

    }

    public void feed(Double amount)
    {
        if (isCatAlive)
        {
            weight = weight + amount;
            foodEaten += amount; //сокращенная форма записи foodEaten = foodEaten + amount. По умолчанию foodEaten = 0
            isCatNotAlive();
        }
    }

    public void drink(Double amount)
    {
        if (isCatAlive)
        {
            weight = weight + amount;
            isCatNotAlive();
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public String name()
    {
        return name;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT)
             {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT)
            {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
    public Double amountOfFoodEaten ()
    {
        return Math.ceil(foodEaten);
    }

    public void pee ()
    {
        if(isCatAlive)
        {
            Double catWeightAfterToilet = getWeight() - (Math.pow(Math.random(), 0.4));
            System.out.println("Cat pee " + (getWeight() - catWeightAfterToilet));
            weight = catWeightAfterToilet;
            isCatNotAlive();
        }
    }

    public static int getCount()
    {
       return count;
    }

    private void isCatNotAlive ()
    {
        if (getStatus().equals("Exploded") || getStatus().equals("Dead"))
        {
            isCatAlive = false;
            count --;
//            System.out.println("Cat dead " + count); //просто для понимания процесса расчета
        }
    }

    public void setCatColor (CatColor color)
    {
        if (isCatAlive)
        {
            this.color = color;
        }
    }
    public CatColor getCatColor()
    {
        return color;
    }

    private void nameInput()
    {
        System.out.println("Create a cat name. Cat number: " + count);
        Scanner scName = new Scanner(System.in);//ввод имени кота чере сканер.
        name = scName.nextLine();/* .nextline() ввод через сканер параметром String.
                                 В целом можно преобразовать в Int или Double.
                                 Преобразовать вышло, но в с if не получилось подружить. Может позже попробую */
    }

    private void weigthInput()
    {
        System.out.println("Create a cat weight. Cat number: " + count);
        Scanner scWeight = new Scanner(System.in);
        if (scWeight.hasNextInt()) {
            weight = scWeight.nextDouble();// .nextDouble() ввод через сканер параметром Double можно задать Int и другие.
            weigthComparison();
        } else {
            System.out.println("You can't enter the weight of the cat in letters. The weight of the cat is create automatically");
        }
    }

    private void weigthComparison() /*
                                   сравнение веса, если они больше или меньше минимального, то на этапе генерации кота,
                                   количесво котов не увеличивается, т.е. создаём три кота, а у одного из них вес вешел за пределы,
                                   тогда финальный результат количества котов будет равен 2 */
     {
         boolean minWeightCat = weight < MIN_WEIGHT;
         boolean maxWightCat = weight > MAX_WEIGHT;
         if (maxWightCat || minWeightCat)
         {
         isCatNotAlive();
         System.out.println(minWeightCat ? name + " " + getStatus() + "." + " Entered weight is less than the minimum":
         name + " " + getStatus() + "." + " Entered weight is higher than the maximum");
         }
     }
}