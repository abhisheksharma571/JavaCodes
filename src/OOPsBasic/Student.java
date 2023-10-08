package OOPsBasic;

public  class Student{
    String name;                    //by default-->default: can access in same package only
    private int rollNo;             // can access in same class only
    public double percent;           //can access in different packages also

    public int getRollNo(){           //getter
        return rollNo;
    }

    public int setRollNo(int rollNo){            //setter
        this.rollNo = rollNo;                    //this keyword-->tells that we are using attributes of this class
        return rollNo;
    }
}
