package Array;
//calculate the maximum value out of all the elements in the array
class maxArray {
    void maxOfArray(){
        int arr[]={2,8,4,5};
        int ans =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println(ans);

    }
}
public class maxValue {
    public static void main(String[] args) {
        maxArray obj = new maxArray();
        obj.maxOfArray();

    }
}