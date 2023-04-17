public class Chokolate extends Product
{
    private final String color;
    private final Integer mass;

    public Chokolate(String name, Integer cost, String color, Integer mass) 
    {
        super(name, cost);
        this.color = color;
        this.mass =mass;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + color + ", " + mass;
    }
    
}