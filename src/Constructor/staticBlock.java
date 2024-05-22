package Constructor;

//Write a program which has static block and constructor overloading, initialize variables using constructors and print it.

public class staticBlock {
    private static int staticVariable;
    private int instanceVariable;

    // Static block to initialize static variables
    static {
        staticVariable = 100;
    }

    // Constructor with no parameters
    public staticBlock() {
        this.instanceVariable = 0;
    }

    // Constructor with parameter to initialize instance variable
    public staticBlock(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    // Getter method to retrieve instance variable
    public int getInstanceVariable() {
        return instanceVariable;
    }

    public static void main(String[] args) {
        // Creating instances of MyClass with different constructors
        staticBlock obj1 = new staticBlock();
        staticBlock obj2 = new staticBlock(50);

        // Printing the values of static and instance variables
        System.out.println("Static variable: " + staticVariable);
        System.out.println("Instance variable of obj1: " + obj1.getInstanceVariable());
        System.out.println("Instance variable of obj2: " + obj2.getInstanceVariable());
    }
}
