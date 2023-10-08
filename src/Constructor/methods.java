package Constructor;

class Demo2{
    static void disp1(){
        System.out.println("Static method disp1");
    }
    void disp2(){
        System.out.println("Non-static disp2");
    }
}
public class methods {
    public static void main(String[] args) {
        Demo2.disp1();      //static method can be called from class name directly also
        Demo2 d1 = new Demo2();
        d1.disp1();
        d1.disp2();            //it is mandatory to create object to call non-static method
    }
}
