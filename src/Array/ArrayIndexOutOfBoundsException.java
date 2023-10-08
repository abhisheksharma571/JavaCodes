package Array;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int num[]={4,5,6,7};
//        System.out.println(num[4]);    //ArrayIndexOutOfBoundsException
        System.out.println(num[num.length-1]);
        System.out.println("Bye");

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        for(int n :num){
            System.out.print(n +" ");
        }
    }
}
