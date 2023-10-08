package Constructor;
class Demo1{
    static int a;     //static variables
    static int b;

    int m;         //non-static variables/instance variables
    int n;

    static {          //static block
        System.out.println("Control in Static block");
        a=10;
        b=20;
    }
    {              //non-static block
        System.out.println("Control in non-static block");
        m=30;
        n=40;
    }
    static void disp1(){     //static method
        System.out.println("Value of static variable a: "+ a);
        System.out.println("Value of static variable b: "+ b);
    }
    void disp2(){               //non-static method
        System.out.println("Value of non-static variable m: "+ m);
        System.out.println("Value of non-static variable n: "+ n);
    }
}
public class staticVsNonStatic {
    public static void main(String[] args) {
        Demo1 d= new Demo1();
        Demo1.disp1();
        d.disp2();
    }
}
