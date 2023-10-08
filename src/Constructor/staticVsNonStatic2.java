package Constructor;
class Alpha{
    static int a;     //static variables
    static int b;

    int m;         //non-static variables/instance variables/object variables
    int n;

    static {          //static variables allocate memory (non-static block execute) only one time at the time of class loading
        System.out.println("Control in Static block");
        a=10;
        b=20;
    }
    {              //non-static variables allocate memory (non-static block execute) as many as object created
        System.out.println("Control in non-static block");
        m=30;
        n=40;
    }
}
public class staticVsNonStatic2 {
    public static void main(String[] args) {
       Alpha a1 = new Alpha();
       Alpha a2 = new Alpha();
       int p = Alpha.a;             //static variable can be called from class name also
       int k = a1.m;            //non-static variables cannot call from class name-object dependent
    }
}