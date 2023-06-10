package Arrays2D;

public class JaggedArray {
    public static void main(String[] args) {
        int nums[][]={{5,2,3,7},{4,1},{6,5,9}};

        //OR
//        int nums[][]= new int[3][];
//        nums[0]=new int[4];
//        nums[1]=new int[2];
//        nums[2]=new int[3];


        for(int i=0;i<=2;i++){
            for(int j=0;j<nums[i].length;j++){    //gives length of rows
                System.out.print(nums[i][j] +" ");
            }
            System.out.println();
        }
    }
}
