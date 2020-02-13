import java.util.ArrayList;

public class Checkout {

    protected ArrayList<DessertItem> dessertItems;
    protected double taxRate;

    public Checkout() {
        this.dessertItems = new ArrayList<DessertItem>();

    }

    /**
     *
     * @return tax rate for the purchase
     */
    public double getTaxRate() {
        return this.taxRate;
    }

    /**
     * change tax rate for this purchase
     */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     *
     * @return the number of DessertItem's in the item list
     */
    public int numberOfItems() {
        return this.dessertItems.size();

    }

    /**
     * A DessertItem is added to the end of the list of items
     * @param item
     */
    public void enterItem(DessertItem item) {
        this.dessertItems.add(item);

    }

    /**
     * clears the checkout to begin checking out a new set of items
     */
    public void clear() {
        this.dessertItems.clear();

    }

    /**
     *
     * @returns the total cost of items in cents (without tax)
     */
    public int totalCost() {
        int total = 0;
        for (int i = 0; i < this.dessertItems.size(); i++) {
            total = total + this.dessertItems.get(i).getCost();
        }
        return total;
    }

    /**
     *
     * @return total on items in cents
     */
    public int totalTax() {
        return (int)Math.round(this.taxRate * this.totalCost());
    }

    /**
     *
     * @return a String representing a receipt for the current list of
     * DessertItem's with the name of the Dessert store, the items
     * purchased, the tax, and the total cost, for example
     */
    public java.lang.String toString() {
        String output = "";

        output = output + "Dessert Shoppe%n--------------%n";

        for (int i = 0; i < this.dessertItems.size(); i++) {
            output = output + this.dessertItems.get(i).getName() + "%n";
            double dollars = this.dessertItems.get(i).getCost() / 100.0;
            output = output + "$" + dollars + "%n";
        }

        double taxDollars = this.totalTax() / 100.0;
        output = output + "Tax: $" + taxDollars + "%n";
        double costDollars = (this.totalTax() + this.totalCost()) / 100.0;
        output = output + "Total cost: $" + costDollars + "%n";

        return output;
    }

}
