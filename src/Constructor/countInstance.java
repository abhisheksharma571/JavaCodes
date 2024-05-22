package Constructor;

public class countInstance {
    // Static variable to keep track of the number of instances created
    private static int instanceCount = 0;

    // Constructor increments the instance count each time an object is created
    public countInstance() {
        instanceCount++;
    }

    // Static method to get the total number of instances created
    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        // Create multiple instances of InstanceCounter
        countInstance obj1 = new countInstance();
        countInstance obj2 = new countInstance();
        countInstance obj3 = new countInstance();

        System.out.println("Total number of instances created: " + countInstance.getInstanceCount());
    }
}
