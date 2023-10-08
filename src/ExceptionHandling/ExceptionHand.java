package ExceptionHandling;

public class ExceptionHand {
    public static void main(String[] args) {
        int num1 = 6;
//        int num2 = 2;
        int num2 = 0;
        int result = 0;
//        result = num1/num2;        //this will throw an exception and your  code will not run
         try{
             result = num1/num2;
             System.out.println("In try block");
         }
         catch(Exception obj){
             System.out.println("Something went wrong..");
//             System.out.println("Something went wrong.."+ obj);      //this will also tell about the error
         }

        System.out.println(result);
        System.out.println("Bye");
    }
}

