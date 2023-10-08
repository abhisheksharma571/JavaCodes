package Inheritance;
class Demo1{
   void disp(){
       System.out.println("Display written in Demo1 class");
   }
}
class Demo2 extends Demo1{

}
class Demo3 extends Demo2{  //multilevel inheritance

}
public class multilevel {
    public static void main(String[] args) {
        Demo3 s = new Demo3();
        s.disp();
    }
}
