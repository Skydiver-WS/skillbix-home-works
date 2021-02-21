import java.lang.invoke.VarHandle;
import java.util.Scanner;

public class Cat
{
    private double originWeight;
    private double weight;
    private double foodEaten;
    private static int count;
    private String name;

    private static final double MIN_WEIGHT = 1000.0;
    private static final double MAX_WEIGHT = 9000.0;
    private static final int NUBMER_OF_EYES = 2;
    private double minWeight;
    private double maxWeight;



    boolean catAlive = getStatus().equals("Sleeping") || getStatus().equals("Playing");
    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = MIN_WEIGHT;
        maxWeight = MAX_WEIGHT;
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
        if (catAlive)
        {
            weight = weight - 1;
            System.out.println("Meow");
            catNotAlive();
        }

    }

    public void feed(Double amount)
    {
        if (catAlive)
        {
            weight = weight + amount;
            foodEaten += amount; //сокращенная форма записи foodEaten = foodEaten + amount. По умолчанию foodEaten = 0
            catNotAlive();
        }
    }

    public void drink(Double amount)
    {
        if (catAlive)
        {
            weight = weight + amount;
            catNotAlive();
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
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
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
        if(catAlive)
        {
            Double catWeightAfterToilet = getWeight() - (Math.pow(Math.random(), 0.4));
            System.out.println("Cat pee " + (getWeight() - catWeightAfterToilet));
            weight = catWeightAfterToilet;
            catNotAlive();
        }
    }
    public static int getCount()
    {
       return count;
    }
    private void catNotAlive ()
    {
        if (getStatus().equals("Exploded") || getStatus().equals("Dead"))
        {
            catAlive = false;
            count --;
//            System.out.println("Cat dead " + count); //просто для понимания процесса расчета
        }
    }
    public void catColor (CatColor type)
    {
        System.out.println(type);
    }

    public void nameInput()
    {
        System.out.println("Create a cat name. Cat number: " + count);
        Scanner scName = new Scanner(System.in);//ввод имени кота чере сканер.
        name = scName.nextLine();/* .nextline() ввод через сканер параметром String.
                                 В целом можно преобразовать в Int или Double.
                                 Преобразовать вышло, но в с if не получилось подружить. Может позже попробую */
    }
    public void weigthInput()
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
    public void weigthComparison() /*
                                   сравнение веса, если они больше или меньше минимального, то на этапе генерации кота,
                                   количесво котов не увеличивается, т.е. создаём три кота, а у одного из них вес вешел за пределы,
                                   тогда финальный результат количества котов будет равен 2 */
     {
         boolean minWeightCat = weight < MIN_WEIGHT;
         boolean maxWightCat = weight > MAX_WEIGHT;
         if (maxWightCat || minWeightCat)
         {
         catNotAlive();
         System.out.println(minWeightCat ? name + " " + getStatus() + "." + " Entered weight is less than the minimum":
         name + " " + getStatus() + "." + " Entered weight is higher than the maximum");
         }
     }
}