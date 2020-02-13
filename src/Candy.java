public class Candy extends DessertItem {

    private double weight;
    private int pricePerPound;

    public Candy (String name, double weight, int pricePerPound) {
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public int getCost() {
        return (int)Math.round(this.pricePerPound * this.weight);
    }

    public double getWeight() {
        return weight;
    }

    public int getPricePerPound() {
        return pricePerPound;
    }

    public void setPricePerPound(int pricePerPound) {
        this.pricePerPound = pricePerPound;
    }



}
