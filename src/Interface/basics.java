package Interface;
interface A{
    int num = 6;     //by-default it is public static final
    void show();     //you can only declare method, not define
}
interface X{
    void abc();      //every method in interface is public and abstract
}
class  B implements A,X{     //we can implement multiple interface but all methods should be defined in class
    public void show(){
        System.out.println("show method defines here");
    }
    public void abc() {
        System.out.println("abc method defines here");
    }
}
public class basics {
    public static void main(String[] args) {
        System.out.println(A.num);
//        A obj = new A();     //Object cannot be created for interface

//        B obj = new B();
        A obj = new B();        //we can also take reference type A(interface)
        obj.show();
//        obj.abc();             //we cannot call abc() method here because reference in of A type here, if it is of B type them we can call abc()

    }
}
