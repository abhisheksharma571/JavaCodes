package Polymorphism_Abstraction;
//final class Animal{     //final class will not participate in inheritance
//    void sleep(){
//        System.out.println("Animal is sleeping");
//    }
//}

class Animal{
    final int age = 19;     //final variable cannot be modified
    final void sleep(){     //final method participate in inheritance but overridden is not possible
//        age = 20;
        System.out.println("Animal is sleeping");
    }
}
class Tiger extends Animal{
//    public void sleep(){
//
//    }
}
public class finalKeyword {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();
    }
}
