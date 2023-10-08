package ExceptionHandling;
//Handling vs Ducking the exception
class Demo{
    public void a() throws Exception{    //a() can handle exception, but we want that main() will handle it
        b();
    }
    public void b() throws Exception {     //means b() will not handle exception, who call it( a() ) will handle exception
        int num1 = 8;
        int num2 = 0;

        int result = num1/num2;
        System.out.println(result);
    }
}
public class throwsKeyword {
    public static void main(String[] args) {
        Demo obj = new Demo();       //to call anything from another class, we made Object
        try{
            obj.a();
        }
        catch (Exception e){
            System.out.println("error");
        }
    }
}
