package API_intro;
enum Result1{
    PASS, FAIL, NR;
}
public class enumWithSwitch {
    public static void main(String[] args) {
        Result1 res =Result1.PASS;
        switch (res){
            case PASS:
                System.out.println("Passed");
                break;
            case FAIL:
                System.out.println("Failed");
                break;
            case NR:
                System.out.println("No result");
        }

    }
}
