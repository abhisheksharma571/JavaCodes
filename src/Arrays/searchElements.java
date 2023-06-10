package Arrays;
//search the given elemets x in the array, If present then return the index else return -1
class searchArray {
    void ArrayElement(){
        int arr[]={2,8,4,5,2,2};
        int x =2;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x) {
                ans = i;
                break;
            }
        }
        System.out.println("Found at Index is "+ans);
    }
}
public class searchElements {
    public static void main(String[] args) {
        searchArray obj = new searchArray();
        obj.ArrayElement();

    }
}
