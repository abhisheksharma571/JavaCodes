package Inheritance;
//constructor execution in case of inheritance
class Demo4{
    int a,b;
    public Demo4(){
        System.out.println("Parent class constructor");
    }
    public Demo4(int x, int y){
        System.out.println("Parameterized Parent class constructor");
        a=x;
        b=y;
    }
}
class Demo5 extends Demo4{
    int m,n;
    public Demo5(){
        //        this(10,20);       //it will call Parameterized Child class constructor
        //        super(10,20);     //it will call Parameterized parent class constructor
        super();     //by default super method is included - it calls the parent class constructor
        System.out.println("Child class constructor");
    }
    public Demo5(int x, int y){
        super();     //by default super method is included - it calls the parent class constructor
        System.out.println("Parameterized Child class constructor");
        m=x;
        n=y;
    }
}
public class constructor {
    public static void main(String[] args) {
        Demo5 d = new Demo5();         //constructor call
        Demo5 d2 = new Demo5(10,20);      //constructor call

    }
}
