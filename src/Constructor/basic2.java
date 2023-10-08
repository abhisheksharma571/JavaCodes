package Constructor;
class Demo{
    private int a;
    private int b;
//    public Demo(){ //default Constructor:by default a constructor is created by compiler, that's why there is no error when we create an object(because as we know that constructor is called when we create object)
//    }
    public Demo(){
        System.out.println("Zero parameterized constructor by programmer");
    }
    public Demo(int a, int b){
        this.a = a;
        this.b = b;
    }
    void disp(){
        System.out.println(a);
        System.out.println(b);
    }
}
public class basic2 {
    public static void main(String[] args) {
        Demo d = new Demo();  //this is the call of constructor, it is not parameterized so default constructor is created
        //but whenever if we create any constructor then that default constructor is not included, we have to create another constructor again for another call
        d.disp();
        Demo d2 = new Demo(10,20);    //this is parameterized constructor call, so we have to create constructor by ourselves
        d2.disp();
    }
}
