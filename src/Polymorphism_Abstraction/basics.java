package Polymorphism_Abstraction;
class AeroPlane{
    public void takeoff(){
        System.out.println("AeroPlane is taking off");
    }
    public void fly(){
        System.out.println("AeroPlane is flying");
    }
}
class CargoPlane extends AeroPlane{
    public void takeoff(){    //override
        System.out.println("CargoPlane requires longer runway");
    }
    public void fly(){    //override
        System.out.println("CargoPlane flies at lower height");
    }
}
class PassengerPlane extends AeroPlane{
    public void takeoff() {    //override
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly() {      //override
        System.out.println("PassengerPlane flies at medium height");
    }
}
public class basics {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();

        PassengerPlane pp = new PassengerPlane();

        AeroPlane ref;      //making parent class reference
        //pp=cp;    //pp cannot holds address of cp because both are of different type(CargoPlane and PassengerPlane)
        ref=cp;   //parent class reference can hold the address of child class Object
        ref.takeoff();
        ref.fly();
        System.out.println("-----------------------------------------");
        ref=pp;
        ref.takeoff();
        ref.fly();
        //Polymorphism- same thing exists in multiple forms
    }
}
