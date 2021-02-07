import javax.lang.model.element.VariableElement;
public class Cat
{
    private double originWeight;
    private double weight;
    private double amountOfFood;
    private double foodEaten;
//    private static int count;


    private double minWeight;
    private double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
//        this.count++;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
       weight = weight + amount;
       foodEaten += amount; //сокращенная форма записи foodEaten = foodEaten + amount. По умолчанию foodEaten = 0,
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
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
        Double catWeightAfterToilet = getWeight() - (Math.pow(Math.random(),0.4));
        System.out.println("Cat pee " + (getWeight() - catWeightAfterToilet));
        weight = catWeightAfterToilet;
    }
//    public static int getCount()
//    {
//       return count;
//    }
//    public void catCount ()
//    {
//      if (!getStatus().equals("Dead"))
//      {
//          count--;
//
//      }
//      if (!getStatus().equals("Dead"))
//      {
//          count--;
//
//      }
//    }
}