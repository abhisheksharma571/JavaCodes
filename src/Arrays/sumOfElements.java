package Arrays;
class ArrayExample{
    void SumOfArray(){
        int arr[]={2,3,4,5};
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}
public class sumOfElements {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.SumOfArray();

    }
}
