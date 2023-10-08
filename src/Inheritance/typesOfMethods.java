package Inheritance;
class Aeroplane{
    public void takeoff(){    //inherited method
        System.out.println("Aeroplane is taking off");
    }
    public void fly(){   //overridden method
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane extends Aeroplane{
    public void fly(){    //overriding method
        System.out.println("CargoPlane flies at lower height");
    }
    public void carryGoods(){   //specialized method
        System.out.println("CargoPlane carries goods");
    }
}
class PassengerPlane extends Aeroplane{
    public void fly(){    //overriding method
        System.out.println("PassengerPlane flies at medium height");
    }
    public void carryPassengers(){  //specialized method
        System.out.println("PassengerPlane carries passengers");
    }
}
public class typesOfMethods {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeoff();
        cp.fly();
        cp.carryGoods();

        PassengerPlane pp = new PassengerPlane();
        pp.takeoff();
        pp.fly();
        pp.carryPassengers();
    }
}
