package Inheritance;
class Animal //extends Object class(inbuilt class - parent of all classes in java) by default
{
    void sleep(){
        System.out.println("Animal need sleep");
    }
}
                //hierarchical inheritance (but one class cannot inherit from multiple parents)
class Tiger extends Animal{

}
class Monkey extends Animal{

}
class Deer extends Animal{

}
public class hierarchical {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        Monkey m = new Monkey();
        Deer d = new Deer();
        t.sleep();
        m.sleep();
        d.sleep();
    }
}
