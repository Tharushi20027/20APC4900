//Decorator pattern: Adds behavior to objects dynamically without altering their structure.
// Define the Coffee interface with methods to get the description and cost of the coffee.
interface Coffee {
    String getDescription();
    double getCost();
}

// Implement the Coffee interface with a SimpleCoffee class that provides basic coffee.
class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 2.00;
    }
}

// Define an abstract decorator class that also implements the Coffee interface.
// This class will be extended by concrete decorators to add extra features.
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    // Constructor takes a Coffee object to decorate.
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    // Delegate the getDescription method to the decorated coffee object.
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    // Delegate the getCost method to the decorated coffee object.
    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}

// Concrete decorator class for adding milk to coffee.
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    // Override getDescription to include milk in the description.
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    // Override getCost to add the cost of milk to the original cost.
    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.50;
    }
}

// Concrete decorator class for adding sugar to coffee.
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    // Override getDescription to include sugar in the description.
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    // Override getCost to add the cost of sugar to the original cost.
    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.20;
    }
}

