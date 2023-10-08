package Interface;
interface C{
    void show();
    default void config(){    //you can define a method in interface in Java8 using default keyword
        System.out.println("In config");
    }
    static void abc(){
        System.out.println("In abc");     //you can also define a method in interface in Java8 as static method
    }
    //you can also override default and static method as same as polymorphism
}
class D implements C{    //we will define here only abstract method
    public void show(){
        System.out.println("In show");
    }
}
public class java8Features {
    public static void main(String[] args) {
        C.abc();     //static method can call directly without creating Object
        C obj = new D();
        obj.show();    //to call non-static methods we have to create Objects
        obj.config();
    }
}
