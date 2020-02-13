public class TestCheckout {
    public static void main(String args[]) {
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("CANDY TEST: ");
        Candy candy = new Candy("", 0.0, 0);
        System.out.println(candy.getWeight() + " lbs. @ " + (candy.getPricePerPound() / 100.0) + " /lb.");
        System.out.println("                         " + candy.getPricePerPound() / 100.0);
        candy.setWeight(1.5);
        candy.setPricePerPound(725);
        candy.setName("Corn(Candy)");
        candy.setCalories(500);
        System.out.println(candy.getWeight() + " lbs. @ " + (candy.getPricePerPound() / 100.0) + " /lb");
        System.out.println(candy.getName() + "              " +  (candy.getCost() / 100.0));
        System.out.println();
        System.out.print(candy.getName() + "  calories:" + candy.getCalories());
    }
}
