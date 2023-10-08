package IO;
import java.io.*;
//to count the no. of files and list their names
public class file2 {
    public static void main(String[] args) {
        int count = 0;
        File f = new File("PWJava");     //you can give address of any directory
        String str[] = f.list();

        for(String name: str){
            count++;
            System.out.println(name);
        }
        System.out.println("No of files are: "+count);
    }
}
