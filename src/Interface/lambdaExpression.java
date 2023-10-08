package Interface;
@FunctionalInterface       //this is optional
interface Car1{
//    void drive();
//    void drive(int avg);
    void drive(int avg , int topSpeed);

}
public class lambdaExpression {
    public static void main(String[] args) {
//        Car1 obj = () -> System.out.println("Driving...");   //this is lambda expression without parameter
        //        obj.drive();
//        Car1 obj = avg -> System.out.println("Driving..."+ avg);   //this is lambda expression with single parameter
//        obj.drive(45);
        Car1 obj = (avg,topSpeed) -> System.out.println("Driving..."+ avg +" "+ topSpeed);   //this is lambda expression with double parameters
        obj.drive(45,140);
    }
}
