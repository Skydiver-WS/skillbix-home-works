import java.util.Scanner;

public class Cat
{
    private double originWeight;
    private double weight;
    private double foodEaten;
    private static int count;

    private static final double MIN_WEIGHT = 1000.0;
    private static final double MAX_WEIGHT = 9000.0;
    private static final int NUBMER_OF_EYES = 2;


    boolean catAlive = getStatus().equals("Sleeping") || getStatus().equals("Playing");
    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
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

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
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
            System.out.println("Cat dead " + count); //просто для понимания процесса расчета
        }
    }
    public void catColor (CatColor type)
    {
        System.out.println(type);
    }

}