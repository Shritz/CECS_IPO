public class Cookie extends DessertItem {

    private int numberOfCookies;
    private int pricePerDozen;

    public Cookie (String name, int numberOfCookies, int pricePerDozen) {
        super(name);
        this.numberOfCookies = numberOfCookies;
        this.pricePerDozen = pricePerDozen;
    }

    public int getCost() {
        int cost = (int)Math.round(numberOfCookies * pricePerDozen / 12);
        return cost;
    }

    public int getNumberOfCookies() {
        return numberOfCookies;
    }

    public int getPricePerDozen() {
        return pricePerDozen;
    }
}
