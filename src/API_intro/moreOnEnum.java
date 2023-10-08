package API_intro;
enum Result{
    PASS, FAIL, NR;      //constants

    //Behind the scene - so no. of constants = no. of constructor call
    //public static final Result PASS = new Result();
    //public static final Result FAIL = new Result();
    // public static final Result NR = new Result();
    int marks;     //we can create variables in enum
    Result(){
        System.out.println("we can also create constructors in enum");
    }
    void setMarks(int marks){       //we can create also methods in enum
        this.marks = marks;
    }
    int getMarks(){
        return marks;
    }
}
public class moreOnEnum {
    public static void main(String[] args) {
        Result.PASS.setMarks(50);
        int m1 = Result.PASS.getMarks();
        System.out.println(m1);

        int m2 = Result.FAIL.getMarks();
        System.out.println(m2);     //by default 0

        Result.NR.setMarks(45);
        int m3 = Result.NR.getMarks();
        System.out.println(m3);
    }
}
