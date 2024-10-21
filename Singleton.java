/*OO Design Patterns are General reusable solutions to common problems in software design
 Each pattern is like a blueprint that can be customized to solve a particular design problem in your code.*/


/*Categories of Design Patterns
Creational Patterns: Deal with object creation mechanisms, Examples: Singleton, Factory, Builder
Structural Patterns: Deal with object composition and structure, Examples: Adapter, Composite, Decorator
Behavioral Patterns: Deal with object interaction and responsibility, Examples: Observer, Strategy, Command*/

//Singleton pattern: Ensures that a class has only one instance and provides a global point of access to it.
public class Singleton {
    // The single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {

        System.out.println("Hello World from Singleton!");
    }

    public static void main(String[] args) {
        // Get the only object available
        Singleton singleton = Singleton.getInstance();

        // Show the message
        singleton.showMessage();

}
}
