package Polymorphism_Abstraction;
abstract class AeroPlane2{      //abstract class - class which has at least one abstract method
//    abstract int age;     //variable cannot be abstract and also constructor cannot be abstract
    abstract public void takeoff();    //abstract method - means method which do not have body, only have implementation
    abstract public void fly();
    public void landing(){
        System.out.println("AeroPlane is landing");
    }
}
class CargoPlane2 extends AeroPlane2{
    public void takeoff(){    //override
        System.out.println("CargoPlane requires longer runway");
    }
    public void fly(){    //override
        System.out.println("CargoPlane flies at lower height");
    }
    public void alert(){
        System.out.println("Alert...");
    }
}
class PassengerPlane2 extends AeroPlane2{
    public void takeoff() {    //override
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly() {      //override
        System.out.println("PassengerPlane flies at medium height");
    }
}
public class abstraction {
    public static void main(String[] args) {
        AeroPlane2 cp = new CargoPlane2();
        cp.takeoff();   //you can call override method by using parent type reference
        cp.fly();
        cp.landing();   //you can call inherited method by using parent type reference
//        cp.alert();     //you cannot call specialized method by using parent type reference
        ((CargoPlane2) cp).alert();    //you can call specialized method by typecasting(down-casting) whenever you have parent type reference

        AeroPlane2 pp = new PassengerPlane2();
        pp.takeoff();
        pp.fly();
        pp.landing();

//        AeroPlane2 ref = new AeroPlane2();     //you cannot create Object of abstract class

    }
}
