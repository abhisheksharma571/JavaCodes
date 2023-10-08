package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//unchecked exception and checked exception
public class checkedException {
    public static void main(String[] args) {
//        int result = 7/0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();     //checked exception
        try{
            String str = br.readLine();
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
