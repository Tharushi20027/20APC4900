//Main class to demonstrate the Decorator Pattern.
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Create a simple coffee object.
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        // Decorate the simple coffee with milk.
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        // Decorate the coffee with milk and add sugar.
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}
