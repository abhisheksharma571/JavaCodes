package Interface;
//inner class has 3 types - member, static and Anonymous
class E{
    public void show(){
        System.out.println("In show");
    }
    class F{    //member inner class
        public void display(){
            System.out.println("In display");
        }
    }
    static class G{    //static inner class - inner class can be static but not outer class
        public void config(){
            System.out.println("In config");
        }
    }
}
public class innerClasses {
    public static void main(String[] args) {
        E obj = new E();
        E.F obj1 = obj.new F();    //Object creation of member inner class with the help of Object of outer class
        E.G obj2 = new E.G();      //Object creation of static inner class with the help of Object of outer class
        obj.show();
        obj1.display();
        obj2.config();
    }
}
