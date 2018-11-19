
public class Cat
{
    private Double originWeight;
    private Double weight;

    private Double minWeight;
    private Double maxWeight;

    private static int count = 0;

    public Cat()
    {
        count++;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public Cat(Double weight)
    {
        this();
        this.weight = weight;
    }

    public Cat makeTwin()
    {
        Cat cat = new Cat();
        count++;
        cat.originWeight = originWeight;
        cat.weight = weight;
        return cat;
    }

    public void meow()
    {
        weight = weight - 10;
        System.out.println("Meow");
        if (weight < minWeight)
        {
            count--;
        }
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        if (weight > maxWeight)
        {
            count--;
        }
    }

    public Double getFeedAmount()
    {
        Double feedAmount = weight - originWeight;
        return feedAmount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
        if (weight > maxWeight)
        {
            count--;
        }
    }

    public void poops()
    {
        weight = weight - 200 * Math.random();
        System.out.println("Uffff");
    }

    public Double getWeight()
    {
        return weight;
    }

    public Double getMaxWeight()
    {
        return maxWeight;
    }

    public Double getMinWeight() {
        return minWeight;
    }

    public String getStatus()
    {
        if(weight < minWeight || this.weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight || this.weight > this.weight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public static int getCount()
    {
        return count;
    }
}
