package Interface;
interface Car{
    void drive();
}
//class WagonR implements Car{
//    public void drive(){
//        System.out.println("Driving...");
//    }
//}
public class anonymousInnerClass {
    public static void main(String[] args) {
        Car obj = new Car(){     //Anonymous inner class - if you have to use class only one time 
            public void drive(){
                System.out.println("Driving...");
            }
        };
        obj.drive();
    }
}
