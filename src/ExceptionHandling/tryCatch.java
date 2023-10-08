package ExceptionHandling;

public class tryCatch {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;
        int result = 0;
        int values[] = {4,7,2,9};
        String name = null;
        try{
//            result = num1/num2;
            result = num1/name.length();
            System.out.println(values[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by 0"+ e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(values[values.length-1]);
            System.out.println("stay in your limits");
        }
        catch (Exception e){
            System.out.println("Something went wrong..");
        }
        System.out.println(result);
        System.out.println("Bye");
    }
}