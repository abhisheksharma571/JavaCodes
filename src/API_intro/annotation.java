package API_intro;
@FunctionalInterface
interface Demo{
    void disp();
//    void disp2();     //it will give compile time error when you add another abstract method because of annotation
}
@Deprecated
class Plane{
    public void planeFliesAtGoodHeight(){
        System.out.println("Plane is flying");
    }
}
class CargoPlane extends Plane{
        //overridden method from parent class
    @Override              //annotation - code information for you as well as compiler unlike in comment, it is only for you
    public void planeFliesAtGoodHeight(){
        System.out.println("CargoPlane flies at good height");
    }
}
public class annotation {
    public static void main(String[] args) {
        //Object of child class
        Plane cp= new CargoPlane();
        cp.planeFliesAtGoodHeight();
    }
}
