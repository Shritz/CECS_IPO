public class Sundae extends IceCream {

    private String toppingName;
    private int toppingCost;

    public Sundae(String nameIceCream, int costIceCream, String toppingName, int toppingCost) {
        super(nameIceCream, costIceCream);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    public int getCost() {
        return super.getCost() + toppingCost;
    }

    public String getToppingName() {
        return toppingName;
    }
}
