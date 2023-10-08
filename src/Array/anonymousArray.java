package Array;
class annony{
    public int add(int num[]){
        int result=0;
        for(int n:num){
            result+=n;
        }
        return result;
    }
}
public class anonymousArray {
    public static void main(String[] args) {
        annony obj = new annony();
        int result = obj.add(new int[]{3,5,6,8});     //anonymous array-->used only once
        System.out.println(result);

    }
}
