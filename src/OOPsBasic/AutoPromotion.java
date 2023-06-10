package OOPsBasic;
//Auto promotion in overloading: (byte-->short)/char-->int-->long-->float-->double
class abhi{
//    public void show(byte n){
//        System.out.println("byte "+n);
//    }
//    public void show(short n){
//        System.out.println("short "+n);
//    }
    public void show(char n){
        System.out.println("char "+n);
    }
    public void show(int n){
        System.out.println("int "+n);
    }
    public void show(double n){
        System.out.println("double "+n);
    }
}
public class AutoPromotion {
    public static void main(String[] args) {
        abhi obj = new abhi();
        byte b=2;
//        short b=2;
        obj.show(b);
    }
}
