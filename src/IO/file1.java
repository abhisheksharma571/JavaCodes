package IO;
import java.io.*;
public class file1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("pw.txt");    //refer to that file
        System.out.println(file1.exists());     //checks whether files exist or not
        file1.createNewFile();      //creates new file
        System.out.println(file1.exists());
        File dir = new File("PWJava");   //refer to that directory
//        System.out.println(dir.exists());
        System.out.println(dir.isDirectory());
        dir.mkdir();    //creates directory
        System.out.println(dir.exists());

        File file2 = new File(dir,"pwskills.txt");       //refers to that file in PWJava directory
        file2.createNewFile();    //creates new file in PWJava directory
        System.out.println(file2.isFile());    //checks whether files exist or not
    }
}
