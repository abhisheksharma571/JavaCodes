package Polymorphism_Abstraction;

class Calculator {
    // Method overloading
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum of integers: " + calculator.add(5, 10)); // Calls the first add() method
        System.out.println("Sum of doubles: " + calculator.add(3.5, 2.5)); // Calls the second add() method
    }
}
