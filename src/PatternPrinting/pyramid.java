package PatternPrinting;
import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int r=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<r-i;j++){
                System.out.print("  ");
            }
            for(int k=0;k<(2*i-1);k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
