package Array;

public class changeArray {
//    static void printArray(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
    static void change_val(int a){
        a=0;
    }
    static void change_array(int arr[]){
        for(int i=0;i< arr.length;i++){
            arr[i]=0;
        }
    }
    public static void main(String[] args) {
        int a=5;
        int arr[]=new int[3];
        arr[0]=2;
        arr[1]=4;
        arr[2]=6;
        change_array(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
//        printArray(arr);
        change_val(a);
        System.out.println(a);
    }
}
