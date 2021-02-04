public class Cat
{
    private double originWeight;
    private double weight;
    private double foodEaten;
    private double amountWater;
//    private static double count;

    private double minWeight;
    private double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        foodEaten = weight - originWeight;
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
        Double catWeightAfterToilet = getWeight() - (Math.pow(Math.random(),5));
        System.out.println("Cat pee " + (getWeight() - catWeightAfterToilet));
    }
    /*public static void testCound ()
    {
       count++;
       System.out.println("Test count" + count);
    }*/
}