package PizzaBillGenerator;

public class DeluxPizza extends Pizza{
    DeluxPizza(boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {}
    @Override
    public void addExtraToppings() {}

}
