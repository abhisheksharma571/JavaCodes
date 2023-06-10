package Arrays2D;

public class EnhancedForLoop {
    public static void main(String[] args) {
//        int nums[]={1,2,3,4};
//        for(int n:nums){
//            System.out.println(n);
//        }

        int nums[][] = {{5, 2, 3, 7}, {4, 1}, {6, 5, 9}};

        for(int a[]:nums){
            for(int b:a){
                System.out.print(b +" ");

            }
            System.out.println();
        }


    }
}