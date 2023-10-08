package OOPsBasic;

public class constructor {
    String name;
    int rno;
    double percent;
    final String schoolName ="MDCS";              //final keyword
    private static int noOfStudents;               //static keyword
    public static int getNoOfStudents(){      //static function--> used if we want to access a function in the class through just classname.functionname without creating object
        return noOfStudents;
    }
    public constructor(String name, int roll, double per){           //constructor
        //it is not necessary to pass all attributes
        this.name = name;
        rno = roll;
        percent = per;
        noOfStudents++;
    }
}
