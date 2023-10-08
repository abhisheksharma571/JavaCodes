package API_intro;
//import java.util.Date;
//import java.util.ArrayList;
public class dateTime {
    public static void main(String[] args) {
        java.util.Date dt = new java.util.Date();
        System.out.println(dt);
        long timeInMs = dt.getTime();

        //Date-Time is also available in sql package- but this is not zero parameterised constructor, you have to pass parameters
        //there is different class for different information, we can access all information by using Date class
        java.sql.Date dt1 = new java.sql.Date(timeInMs);
        System.out.println(dt1);

//        java.util.ArrayList al = new java.util.ArrayList<>();

    }
}
