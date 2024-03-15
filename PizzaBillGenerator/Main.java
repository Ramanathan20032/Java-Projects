package PizzaBillGenerator;

public class Main {
    public static void main(String[] args) {
        Pizza nonVegPizza = new Pizza(false);
        nonVegPizza.addExtraCheese();
        nonVegPizza.addExtraToppings();
        nonVegPizza.getBill();

        Pizza vegPizza = new Pizza(true);
        vegPizza.addExtraToppings();
        vegPizza.takeAway();
        vegPizza.getBill();

        DeluxPizza p1 = new DeluxPizza(true);
        p1.getBill();
    }
}
