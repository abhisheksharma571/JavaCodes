package Polymorphism_Abstraction;
class AeroPlane1{
    public void takeoff(){
        System.out.println("AeroPlane is taking off");
    }
    public void fly(){
        System.out.println("AeroPlane is flying");
    }
}
class CargoPlane1 extends AeroPlane1{
    public void takeoff(){    //override
        System.out.println("CargoPlane requires longer runway");
    }
    public void fly(){    //override
        System.out.println("CargoPlane flies at lower height");
    }
}
class PassengerPlane1 extends AeroPlane1{
    public void takeoff() {    //override
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly() {      //override
        System.out.println("PassengerPlane flies at medium height");
    }
}
class FighterPlane1 extends AeroPlane1{
    public void takeoff() {    //override
        System.out.println("FighterPlane requires small size runway");
    }
    public void fly() {      //override
        System.out.println("FighterPlane flies at high height");
    }
}
class Airport{
    public void poly(AeroPlane1 ref){
        ref.takeoff();
        ref.fly();
        System.out.println("---------------------------------------");
    }
}
public class basics2 {
    public static void main(String[] args) {
        CargoPlane1 cp = new CargoPlane1();
//        AeroPlane1 cp = new AeroPlane1();       //you can write parent type also

        PassengerPlane1 pp = new PassengerPlane1();

        FighterPlane1 fp = new FighterPlane1();

        Airport a = new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);

    }
}
