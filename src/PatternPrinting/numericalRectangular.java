package PatternPrinting;
import java.util.Scanner;

public class numericalRectangular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int r=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=i+1;j<r+1;j++){
                System.out.print(j);
            }
            for(int k=0;k<i;k++){
                System.out.print(k+1);
            }
            System.out.println();
        }

    }
}