public class Item
{
    private String price;

    private String quanty;

    private String name;

    public String getPrice ()
    {
        return price;
    }

    public void setPrice (String price)
    {
        this.price = price;
    }

    public String getQuanty ()
    {
        return quanty;
    }

    public void setQuanty (String quanty)
    {
        this.quanty = quanty;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [price = "+price+", quanty = "+quanty+", name = "+name+"]";
    }
}