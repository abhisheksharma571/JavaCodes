package API_intro;
//whenever we have predefined named constants, then we can move into the concept of enum
enum Week{
    MON, TUE, WED, THU, FRI, SAT, SUN;    //recommended to define enum in Capital letters
                                          //can not create Object of enum class
                                          //we can define enum in outside the class or inside the class
}
public class enumIntro {
    enum Result{
        PASS, FAIL, NR;
    }
    public static void main(String[] args) {
        Week w = Week.MON;
        System.out.println(w);

        //gives index
        int index = Week.MON.ordinal();
        System.out.println(index);

        //gives all values with indices
        Week wr[] = Week.values();
        for(Week w1: wr){
            System.out.println(w1+" : "+w1.ordinal());
        }

        Result r = Result.PASS;
        System.out.println(r);
    }
}
