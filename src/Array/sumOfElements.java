package Array;

public class sumOfElements {
    static class ArrayExample {
        public static int SumOfArray() {
            int arr[] = {2, 3, 4, 5};
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
            }
            System.out.println(sum);
            return sum;
        }
    }
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.SumOfArray();

    }
}
