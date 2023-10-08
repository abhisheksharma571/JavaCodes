package Array;

public class missingNo {
    public static void main(String[] args) {
        int []arr = {1,2,4,7,6,5};
        int n= arr.length;
        //sum of natural numbers
        int sumNaturalNo = ((n+1)*(n+2))/2;
        int sum = 0;
        //sum of current elements present in an array
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int missingElement = 0;
        missingElement = sumNaturalNo - sum;
        System.out.println("Missing element in an array is: "+missingElement);
    }
}
