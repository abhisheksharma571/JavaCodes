package Inheritance;
//rules to override method in child class
class Animal1{
    public void eat(){
        System.out.println("Animal eats everyday");
    }
    public void age(int x){
        System.out.println("Animal age is: ");
    }
}
class Tiger1 extends Animal1{
//    private void eat(){    //you can not decrease visibility in child class while overriding
//        System.out.println("Tiger hunts and eat");
//    }

//    public int age(){       //you also can not change the return type while overriding
//        return 10;
//    }

    public void age(){      //this is not overridden method, it is considered as new method, following the concept of method overloading because it has not same parameters

    }
}
public class overrideMethodInChildClass {
    public static void main(String[] args) {
        Tiger1 t = new Tiger1();
        t.eat();
    }
}
