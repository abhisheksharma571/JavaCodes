package Constructor;

public class staticMethod {
    // Static method that can be called without creating an object
    public static void myStaticMethod() {
        System.out.println("Hello from myStaticMethod!");
    }

    public static void main(String[] args) {
        // Calling the static method without creating an object
        staticMethod.myStaticMethod();
    }
}
